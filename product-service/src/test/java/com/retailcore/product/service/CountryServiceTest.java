package com.retailcore.product.service;

import com.retailcore.product.testdata.CountryTestData;
import com.retailcore.product.mapper.CountryMapper;
import com.retailcore.product.repository.CountryRepository;
import com.retailcore.product.dto.request.CountryRequest;
import com.retailcore.product.dto.response.CountryResponse;
import com.retailcore.product.entity.Country;

import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class CountryServiceTest {
    @Mock
    private CountryRepository countryRepository;

    @Mock
    private CountryMapper countryMapper;

    @InjectMocks
    private CountryService countryService;

    @Test
    void shouldCreateCountrySuccessfully() {
        //Arrage
        CountryRequest request = CountryTestData.countryRequest();
        Country country = CountryTestData.country();
        CountryResponse response = CountryTestData.countryResponse();

        when(countryRepository.findByIsoCode("IN")).thenReturn(Optional.empty());
        when(countryMapper.toEntity(request)).thenReturn(country);
        when(countryRepository.save(country)).thenReturn(country);
        when(countryMapper.toResponse(country)).thenReturn(response);

        CountryResponse result = countryService.createCountry(request);

        assertEquals("India", result.getName());
        assertEquals("IN", result.getIsoCode());

        verify(countryRepository).findByIsoCode("IN");
        verify(countryMapper).toEntity(request);
        verify(countryRepository).save(country);
        verify(countryMapper).toResponse(country);

    }
}