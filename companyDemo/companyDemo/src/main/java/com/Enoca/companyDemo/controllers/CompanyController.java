package com.Enoca.companyDemo.controllers;

import com.Enoca.companyDemo.dtos.CompanyDto;
import com.Enoca.companyDemo.serviceImpls.CompanyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@EnableAutoConfiguration
@RequestMapping(value ="/company", consumes = MediaType.ALL_VALUE)
public class CompanyController {
    @Autowired
    private CompanyServiceImpl companyService;

    public CompanyController(CompanyServiceImpl companyService) {
        this.companyService = companyService;
    }

    @PostMapping("/create")
    public void create(@RequestBody CompanyDto companyDto) {
        companyService.create(companyDto);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(Long id) {
        companyService.delete(id);
    }
    @PostMapping("/update/{id}")
    public void update(@RequestBody CompanyDto companyDto, Long id) {
        companyService.update(companyDto,id);
    }

}

