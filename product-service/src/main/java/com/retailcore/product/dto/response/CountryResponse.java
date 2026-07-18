package com.retailcore.product.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CountryResponse {
    private Long id;
    private String name;
    private String isoCode;
}
