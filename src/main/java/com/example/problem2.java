package com.example;
import java.util.ArrayList;

public class problem2 {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            s.add(new Student());
        }
        System.out.println(s.size());
        //print all students info
        System.out.println("all grades and averages:");
        print(s);
        System.out.println();
        //find lowest average
        int lowindex = lowest(s);
        System.out.printf("student with the lowest average is at index %d\n", lowindex);
    
        //remove lowest average 
        s.remove(lowindex);

        //print new results
        System.out.println("all grades and averages after the removing lowest average:");
        print(s);
        System.out.println();
        //add student to subscript 4
        s.add(4, new Student());
        System.out.println("all info after adding new student:");
        print(s);
    }//end main

    //print the ArrayList
    public static void print(ArrayList<Student> classList){
        for (Student stu:classList){
            stu.display();
            System.out.println();
        }
    }

    /**
     * methode find the lowest average index and delete it
     */
    public static int lowest(ArrayList<Student> classList){
        int index = 0;
        double lowestAverage = classList.get(0).gradesAVG();

        for(int i = 1; i < classList.size(); i++){
            double avg = classList.get(i).gradesAVG();
            if (avg < lowestAverage) {
                lowestAverage = avg;
                index = i;
            }
        }
        return index;
    }
}
