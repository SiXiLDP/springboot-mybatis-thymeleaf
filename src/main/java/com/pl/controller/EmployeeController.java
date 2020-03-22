package com.pl.controller;

import com.pl.pojo.Department;
import com.pl.pojo.Employee;
import com.pl.service.DepartmentService;
import com.pl.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @Autowired
    DepartmentService departmentService;
    //查询所有员工
    @RequestMapping("/emps")
    public String queryAll(Model model){
        List<Employee> list=employeeService.queryEmployee();
        model.addAttribute("emps",list);
        return "emp/tables";
    }

    //跳转到新增员工页面
    @GetMapping("/emp")
    public String toAddPage(Model model){
        List<Department> department=departmentService.queryDepartment();
        System.out.println("data=>"+department);
        model.addAttribute("depts",department);
        return "emp/add";

    }

    //新增员工操作
    @PostMapping("/emp")
    public String add(Employee employee){
        employeeService.addEmployee(employee);
        return "redirect:/emps";
    }

    //跳转编辑页面
    @RequestMapping("/emp/{id}")
    public String toUpdate(@PathVariable("id") Integer id,Model model){
        //通过id获取员工和部门信息，以便实现跳转页面时能把现有数据带到编辑页面，没有信息就相当于新增了
        Employee employee=employeeService.queryEmployeeById(id);
        model.addAttribute("emps",employee);
        //查部门是为了部门选项里只有部门的信息，同时能通过三元运算符结合thymeleaf语法，使得部门焦点停留在要编辑的员工部门上
        List<Department> department=departmentService.queryDepartment();
        model.addAttribute("depts",department);
        return "emp/update";
    }

    //修改操作
    @RequestMapping("/updateEmp")
    public String update(Employee employee){
        employeeService.updateEmployee(employee);
        return "redirect:/emps";
    }

    //删除操作
    @GetMapping("/del/{id}")
    public String deleteEmp(@PathVariable("id") Integer id){
        employeeService.deleteEmployeeById(id);
        return "redirect:/emps";
    }
}
