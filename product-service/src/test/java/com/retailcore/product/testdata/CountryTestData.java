package com.retailcore.product.testdata;

import com.retailcore.product.dto.request.CountryRequest;
import com.retailcore.product.dto.response.CountryResponse;
import com.retailcore.product.entity.Country;

public final class CountryTestData {
    private CountryTestData() {

    }

    public static CountryRequest countryRequest() {
        CountryRequest request = new CountryRequest();
        request.setName("India");
        request.setIsoCode("IN");
        return request;
    } 

    public static Country country() {
        Country country = new Country();
        country.setId(1L);
        country.setName("India");
        country.setIsoCode("IN");
        return country;
    }

    public static CountryResponse countryResponse() {
        CountryResponse response = new CountryResponse();
        response.setId(1L);
        response.setName("India");
        response.setIsoCode("IN");
        return response;
    }
}
