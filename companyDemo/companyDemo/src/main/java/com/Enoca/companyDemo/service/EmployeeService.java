package com.Enoca.companyDemo.service;

import com.Enoca.companyDemo.dtos.EmployeeDto;


import java.util.List;

public interface EmployeeService {
    void create(EmployeeDto employeeDto);
    void delete(Long id);
    void update(EmployeeDto employeeDto, Long id);
    List<EmployeeDto> getAll();


}
