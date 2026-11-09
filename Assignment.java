/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grademanagementproject;
import java.text.NumberFormat;

/**
 *
 * @author Gavin Feiner
 */
public class Assignment {
    private float totalPoints;
    private float correctPoints;
    private float percentCorrect;
    private String assignmentName;
    
    public Assignment(){
        totalPoints = 0;
        correctPoints = 0;
    }
    
    public float calculateGrade(){
        percentCorrect = (correctPoints / totalPoints);
        return percentCorrect;
    }
    
    public String getGrade(){
        NumberFormat fmt = NumberFormat.getPercentInstance();
        return fmt.format(percentCorrect);
    }
    
    public void setCorrectPoints(float points){
        correctPoints = points;
    }
    
    public void setTotalPoints(float points){
        totalPoints = points;
    }
    
    public void setAssignmentName(String name)
    {
        assignmentName = name;
    }
    
    public String getAssignmentName()
    {
        return assignmentName;
    }
    
    public float getTotalPoints()
    {
        return totalPoints;
    }
    
    public float getCorrectPoints()
    {
        return correctPoints;
    }
}
