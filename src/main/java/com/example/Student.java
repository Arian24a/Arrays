package com.example;
import java.util.Random;

public class Student {
    private double[] grades;

    /**
     * constructor to create grades array of 5 grades with random numbers in the range of 50 - 100
     */
    Student(){
        Random rdm = new Random();
        grades = new double[5];
        for (int i=0 ;i <grades.length ;i++)
            grades[i] = rdm.nextDouble(50) + 50;
    }

    /**
     * constructor that recieves a double array and copies the scores to the grades array
     * @param x double array
     */
    Student(double[] x){
        grades = new double[5];
        for (int i =0; i < x.length ; i++)
            grades[i] = x[i];
    }

    /**
     * set methode to set the entered index in grades to the given value
     * @param index subscript to the grades array
     * @param newGrade new grade value to be set
     */
    public void setGrade(int index, double newGrade){
        grades[index] = newGrade;
    }

    /**
     * get mehthode for grades
     * @return grades
     */
    public double[] getGrade(){
        return grades;
    }

    /**
     * methode that calculates and returns the average of hte grades 
     * @return sum of grades devided by the number of grades
     */
    public double gradesAVG(){
        double sum = 0;
        for(double grade : grades){
            sum += grade;
        }
        return sum / grades.length;
    }

    /**
     * methode that returns tha max grade found in the grades array
     * @return double max
     */
    public double maxGrade(){
        double max = grades[0];
        for (double grade: grades){
            if(grade > max)
                max = grade;
        }
        return max;
    }

    /**
     * methode to display student grade and average
     */
    public void display(){
        for (double grade : grades){
            System.out.printf("%.2f  ", grade);
        }
        System.out.printf("Ave:%.2f", gradesAVG());
    }
}
