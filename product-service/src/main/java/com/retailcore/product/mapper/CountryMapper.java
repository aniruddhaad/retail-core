package com.retailcore.product.mapper;
import com.retailcore.product.dto.CountryDto;
import com.retailcore.product.entity.Country;
import org.springframework.stereotype.Component;

@Component
public class CountryMapper {
    public CountryDto toDto(Country country) {
        CountryDto dto = new CountryDto();
        dto.setId(country.getId());
        dto.setName(country.getName());
        dto.setIsoCode(country.getIsoCode());
        return dto;
    }
}