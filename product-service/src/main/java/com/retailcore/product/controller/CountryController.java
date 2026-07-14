package com.retailcore.product.controller;

import com.retailcore.product.service.CountryService;
import com.retailcore.product.dto.CountryRequest;
import com.retailcore.product.dto.CountryResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import java.util.ArrayList;
import java.lang.*;

import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/api/v1/countries")
@RequiredArgsConstructor
public class CountryController {
    private final CountryService countryService;

    @PostMapping
    public ResponseEntity<CountryResponse> createCountry(
        @Valid @RequestBody  CountryRequest request
    ) {
        CountryResponse response = countryService.createCountry(request);
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(response);
    }
    
    @GetMapping
    public ResponseEntity<List<CountryResponse>> getAllCountries() {
        return ResponseEntity.ok(countryService.getAllCountries());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CountryResponse> getCountryById(@PathVariable Long id) {

        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        list.parallelStream()
            .map(n -> n * 2)
            .forEachOrdered(System.out::println);

        return ResponseEntity.ok(countryService.getCountryById(id));
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<CountryResponse> updateCountry(@PathVariable Long id, @Valid @RequestBody CountryRequest request) {
        return ResponseEntity.ok(countryService.updateCountry(id, request));
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCountry(@PathVariable Long id) {
        countryService.deleteCountry(id);
        return ResponseEntity.noContent().build();
    }

}
