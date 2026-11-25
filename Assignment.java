/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grademanagementproject;
import java.text.NumberFormat;
import java.text.DecimalFormat;

/**
 *
 * @author Gavin Feiner
 */
public class Assignment {
    private float totalPoints;
    private float correctPoints;
    private float percentCorrect;
    private String assignmentName;
    final DecimalFormat fmt2 = new DecimalFormat("0.##");
    
    public Assignment(){
        totalPoints = 0;
        correctPoints = 0;
    }
    
    public String calculateGrade()
    {
        percentCorrect = (correctPoints / totalPoints);
        NumberFormat fmt = NumberFormat.getPercentInstance();
        return fmt.format(percentCorrect);
    }
    
    public void setCorrectPoints(float points)
    {
        correctPoints = points;
    }
    
    public void setTotalPoints(float points)
    {
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
    
    public String getTotalPoints()
    {
        return fmt2.format(totalPoints);
    }
    
    public String getCorrectPoints()
    {
        return fmt2.format(correctPoints);
    }
}
