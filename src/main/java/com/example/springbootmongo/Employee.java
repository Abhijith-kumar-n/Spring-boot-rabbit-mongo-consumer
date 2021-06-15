package com.example.springbootmongo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Getter
@Setter
@ToString

@Document(collection = "employee")
public class Employee implements Serializable {
    @Id
    private int id;
    private String EmpName;
    private String EmpDept;
    private String EmpBGrp;
    /*
    public Employee(String empId, String empName, String empDept, String empBGrp) {
        EmpId = empId;
        EmpName = empName;
        EmpDept = empDept;
        EmpBGrp = empBGrp;
    }

    public String getEmpId() {
        return EmpId;
    }

    public void setEmpId(String empId) {
        EmpId = empId;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public String getEmpDept() {
        return EmpDept;
    }

    public void setEmpDept(String empDept) {
        EmpDept = empDept;
    }

    public String getEmpBGrp() {
        return EmpBGrp;
    }

    public void setEmpBGrp(String empBGrp) {
        EmpBGrp = empBGrp;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmpId='" + EmpId + '\'' +
                ", EmpName='" + EmpName + '\'' +
                ", EmpDept='" + EmpDept + '\'' +
                ", EmpBGrp='" + EmpBGrp + '\'' +
                '}';
    }

     */
}
