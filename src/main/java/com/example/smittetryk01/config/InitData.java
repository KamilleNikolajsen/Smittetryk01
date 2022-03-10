package com.example.smittetryk01.config;

import com.example.smittetryk01.model.County;
import com.example.smittetryk01.model.Region;
import com.example.smittetryk01.repository.CountyRepository;
import com.example.smittetryk01.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//Ved at fjerne annotationen bruges klassen ikk i sprigprojektet
//@Component
public class InitData implements CommandLineRunner {

    @Autowired
    CountyRepository countyRepository;

    @Autowired
  RegionRepository regionRepository;

    @Override
    public void run(String... args) throws Exception {
      Region region = new Region();
      region.setRegionCode("1085");
      region.setName("Region Sjælland");
      region.setHref("http://api.dataforsyningen.dk/regioner/1085");
      regionRepository.save(region);

        County county = new County();
        county.setName("Roskilde");
        county.setCountyCode("0265");
        county.setHref("http://localhost:8080/county/0265");
        county.setRegion(region);
        countyRepository.save(county);

        county.setName("Køgexx");
        county.setCountyCode("0259");
        county.setHref("http://localhost:8080/county/0259");
        county.setRegion(region);
        countyRepository.save(county);


    }
}


