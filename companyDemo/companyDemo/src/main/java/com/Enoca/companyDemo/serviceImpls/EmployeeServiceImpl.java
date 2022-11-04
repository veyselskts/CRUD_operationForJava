package com.Enoca.companyDemo.serviceImpls;

import com.Enoca.companyDemo.dtos.EmployeeDto;
import com.Enoca.companyDemo.entities.Employee;
import com.Enoca.companyDemo.repositories.EmployeeRepo;
import com.Enoca.companyDemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private final EmployeeRepo employeeRepo;

    public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public void create(EmployeeDto employeeDto) {
        Employee employee= new Employee();
        employee.setFirstName(employeeDto.getFirst_name());
        employee.setLastName(employeeDto.getLast_name());
        employee.setEmail(employeeDto.getEmail());
    employeeRepo.save(employee);
    }

    @Override
    public void delete(Long id) {
    employeeRepo.deleteById(id);
    }

    @Override
    public void update(EmployeeDto employeeDto, Long id) {
    Employee employee=employeeRepo.findById(id).get();
    employee.setFirstName(employeeDto.getFirst_name());
    employee.setLastName(employeeDto.getLast_name());
    employee.setEmail(employeeDto.getEmail());
    employeeRepo.save(employee);
    }

    @Override
    public List<EmployeeDto> getAll( ) {
        List<Employee> employees=employeeRepo.findAll();
        List<EmployeeDto> employeeDtos=new ArrayList<>();
        employees.forEach(it ->{
            EmployeeDto employeeDto= new EmployeeDto();
            employeeDto.getFirst_name();
            employeeDto.getLast_name();
            employeeDto.getEmail();
            employeeDtos.add(employeeDto);
                } );
        return employeeDtos;
    }

}

