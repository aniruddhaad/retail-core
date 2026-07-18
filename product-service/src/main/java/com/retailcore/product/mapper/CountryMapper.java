package com.retailcore.product.mapper;
import com.retailcore.product.dto.request.CountryRequest;
import com.retailcore.product.dto.response.CountryResponse;
import com.retailcore.product.entity.Country;
import org.springframework.stereotype.Component;

@Component
public class CountryMapper {
    public Country toEntity(CountryRequest request) {
        Country country = new Country();
        country.setId(request.getId());
        country.setName(request.getName());
        country.setIsoCode(request.getIsoCode());
        return country;
    }

    public CountryResponse toResponse(Country country) {
        CountryResponse response = new CountryResponse();
        response.setId(country.getId());
        response.setName(country.getName());
        response.setIsoCode(country.getIsoCode());
        return response;
    }
}