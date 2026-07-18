package com.retailcore.product.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CountryRequest {
    private Long id;
    @NotBlank(message = "Country name is required")
    private String name;

    @NotBlank(message = "ISO code is required")
    @Size(min = 2, max = 2, message = "ISO code must be exactly 2 characters")
    private String isoCode;
}
