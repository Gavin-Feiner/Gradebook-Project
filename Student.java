/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grademanagementproject;

/**
 *
 * @author Gavin Feiner
 */
public class Student {
    String studentName;
    String studentClass;
    Student(){
        studentName = "";
        studentClass = "";
    }
    
    public void setStudentName(String name)
    {
        studentName = name;
    }
    
    public String getStudentName()
    {
        return studentName;
    }
    
    public void setStudentClass(String className)
    {
        studentClass = className;
    }
    
    public String getStudentClass()
    {
        return studentClass;
    }
}
