package com.pl.service;

import com.pl.mapper.EmployeeMapper;
import com.pl.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public List<Employee> queryEmployee() {
        return employeeMapper.queryEmployee();
    }

    @Override
    public Employee queryEmployeeById(Integer id) {
        return employeeMapper.queryEmployeeById(id);
    }

    @Override
    public int addEmployee(Employee employee) {
        return employeeMapper.addEmployee(employee);
    }

    @Override
    public int updateEmployee(Employee employee) {
        return employeeMapper.updateEmployee(employee);
    }

    @Override
    public int deleteEmployeeById(Integer id) {
        return employeeMapper.deleteEmployeeById(id);
    }
}
