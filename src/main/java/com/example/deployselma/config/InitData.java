package com.example.deployselma.config;

import com.example.deployselma.model.County;
import com.example.deployselma.repository.CountyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    CountyRepository countyRepository;

    @Override
    public void run(String... args) throws Exception {
        County county = new County();
        county.setName("Glostrup");
        county.setCountyCode("0161");
        county.setHref("http://localhost:8080/county/0161");
        countyRepository.save(county);
    }
}

