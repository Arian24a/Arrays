package com.example;

public class problem1 {
    public static void main(String[] args) {
        Student[] classList = new Student[10];
        //creat e the first 2 students using the constructor with parameters
        double[] s1grade = {70.5, 85.3, 54.7, 68.2, 83.9};
        double[] s2grade = {75.3, 80.0, 79.5, 82.1, 78.9};
        classList[0] = new Student(s1grade);
        classList[1] = new Student(s2grade);
        //use a loop to create the rest of the students with no parameters
        for(int i = 2; i < classList.length;i++){
            classList[i] = new Student();
        }
        //print all grades and averages
        System.out.println("all grades and averages:");
        print(classList);

        //find highest average
        int top = topStudent(classList);
        System.out.println("highest average is:");
        classList[top].display(); 
    } // end main

    /**
     * methode that recieves classList and calls the disply methode on all student
     * @param classList
     */
    public static void print(Student[] classList) {
        for (Student student: classList){
            student.display();
            System.out.println();
        }
    }

    /**
     * methode thta recives classlist and returns the index to the student with the highest average
     * @param classList
     * @return highest average student index
     */
    public static int topStudent(Student[] classList){
        int top = 0;
        double highestAverage = classList[0].gradesAVG();
        for (int i = 1; i < classList.length; i++){
            double avg = classList[i].gradesAVG();
            if (avg > highestAverage) {
                highestAverage = avg;
                top = i;
            }
        }
        return top;
    }
}