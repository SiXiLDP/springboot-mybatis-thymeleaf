package com.pl.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
    private Integer id;
    private String name;
    private String email;
    private Integer gender;//0为女，1为男
    private String department;
    private String birth;
}
