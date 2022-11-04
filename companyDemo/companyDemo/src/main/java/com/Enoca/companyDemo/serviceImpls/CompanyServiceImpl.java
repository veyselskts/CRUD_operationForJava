package com.Enoca.companyDemo.serviceImpls;

import com.Enoca.companyDemo.dtos.CompanyDto;
import com.Enoca.companyDemo.entities.Company;
import com.Enoca.companyDemo.repositories.CompanyRepo;
import com.Enoca.companyDemo.service.CompanyService;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {
   private CompanyRepo companyRepo;

    public CompanyServiceImpl(CompanyRepo companyRepo) {
        this.companyRepo = companyRepo;
    }

    @Override
    public void create(CompanyDto companyDto) {
        Company company=new Company();
        company.setName(companyDto.getName());
        company.setAddress(companyDto.getAddress());
        company.setPhone(companyDto.getPhone());
        companyRepo.save(company);
    }

    @Override
    public void delete(Long id) {
        companyRepo.deleteById(id);
    }

    @Override
    public void update(CompanyDto companyDto, Long id) {
    Company company=new Company();
    company.setName(companyDto.getName());
    company.setAddress(companyDto.getAddress());
    company.setPhone(companyDto.getPhone());
    companyRepo.save(company);
    }


}
