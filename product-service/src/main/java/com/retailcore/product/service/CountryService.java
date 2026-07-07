package com.retailcore.product.service;

import com.retailcore.product.dto.CountryDto;
import com.retailcore.product.mapper.CountryMapper;
import com.retailcore.product.repository.CountryRepository;
import java.util.List;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CountryService {
    private final CountryRepository countryRepository;
    private final CountryMapper countryMapper;

    public List<CountryDto> getAllCountries() {
        return countryRepository.findAll()
                .stream()
                .map(countryMapper::toDto)
                .toList();
    }

    public CountryDto getCountryById(Long id) {
        return countryRepository.findById(id)
                .map(countryMapper::toDto)
                .orElseThrow(() -> new RuntimeException("Country not found"));
    }
}
