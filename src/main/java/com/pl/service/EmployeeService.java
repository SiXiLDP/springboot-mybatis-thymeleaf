package com.pl.service;

import com.pl.pojo.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface EmployeeService {
    // 获取所有员工信息
    List<Employee> queryEmployee();

    // 通过id获得员工
    Employee queryEmployeeById(Integer id);

    //增加员工
    int addEmployee(Employee employee);

    //修改员工
    int updateEmployee(Employee employee);

    //删除员工
    int deleteEmployeeById(Integer id);
}
