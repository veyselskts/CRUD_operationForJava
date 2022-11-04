package com.Enoca.companyDemo.service;


import com.Enoca.companyDemo.dtos.CompanyDto;

public interface CompanyService {
    void create(CompanyDto companyDto);
    void delete(Long id);
    void update(CompanyDto companyDto, Long id);
}
