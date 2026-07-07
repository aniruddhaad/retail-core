package com.retailcore.product.repository;

import com.retailcore.product.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long>{
    
}
