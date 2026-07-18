package com.retailcore.product.service;

import com.retailcore.product.entity.Country;
import com.retailcore.product.dto.request.CountryRequest;
import com.retailcore.product.dto.response.CountryResponse;
import com.retailcore.product.mapper.CountryMapper;
import com.retailcore.product.repository.CountryRepository;
import com.retailcore.product.exception.DuplicateResourceException;
import com.retailcore.product.exception.ResourceNotFoundException;

import jakarta.transaction.Transactional;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CountryService {
    private final CountryRepository countryRepository;
    private final CountryMapper countryMapper;

    public List<CountryResponse> getAllCountries() {
        return countryRepository.findAll()
                .stream()
                .map(countryMapper::toResponse)
                .toList();
    }

    public CountryResponse getCountryById(Long id) {
        return countryRepository.findById(id)
                .map(countryMapper::toResponse)
                .orElseThrow(() -> new ResourceNotFoundException("Country not found with id: " + id));
    }

    @Transactional
    public CountryResponse createCountry(CountryRequest request) {
        countryRepository.findByIsoCode(request.getIsoCode())
            .ifPresent(existingCountry -> { 
                    throw new DuplicateResourceException("Country with ISO code '" + request.getIsoCode() + "' already exists.");
                }
            );
        Country country = countryMapper.toEntity(request);
        Country savedCountry = countryRepository.save(country);
        return countryMapper.toResponse(savedCountry);
    }

    @Transactional
    public CountryResponse updateCountry(Long id, CountryRequest request) {
        Country country = countryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Country not found with id: " + id));
        country.setName(request.getName());
        country.setIsoCode(request.getIsoCode());
        return countryMapper.toResponse(country);
    }

    @Transactional
    public void deleteCountry(Long id) {
        Country country = countryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Country not found with id: " + id) );
        countryRepository.delete(country);
    }
}
