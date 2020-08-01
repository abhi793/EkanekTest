
package com.example;

import java.util.ArrayList; 
import java.util.Collections; 
import java.util.Iterator; 
import java.util.List; 
import java.util.Comparator;

public class Student {
    String name;
    int age;
    int marks;
    String rollNumber;
    
    public Student(String name, int age, int marks, String rollNumber) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.rollNumber = rollNumber;
    }
  

  public static final Comparator<Student> ageCompare = new Comparator<Student>(){

        @Override
        public int compare(Student s1, Student s2) {
            return s1.age - s2.age;  
        }
      
    };
  public static final Comparator<Student> nameCompare = new Comparator<Student>(){

        @Override
        public int compare(Student s1, Student s2) {
            return s1.name.compareTo(s2.name); 
        }
      
    };
  public static final Comparator<Student> marksCompare = new Comparator<Student>(){

        @Override
        public int compare(Student s1, Student s2) {
            return s1.marks - s2.marks;
        }
      
    };
  
  public static final Comparator<Student> rollNumberCompare = new Comparator<Student>(){

        @Override
        public int compare(Student s1, Student s2) {
            return s1.rollNumber.compareTo(s2.rollNumber);
        }
      
    };
  
  public static final ArrayList<Student> sortStudents(ArrayList<Student> students, String[] criteria){
    for (String s: criteria) {
      if(s.equals("name")) Collections.sort(students, Student.nameCompare);
      if(s.equals("age")) Collections.sort(students, Student.ageCompare);
      if(s.equals("marks")) Collections.sort(students, Student.marksCompare);
      if(s.equals("rollNumber")) Collections.sort(students, Student.rollNumberCompare);
    }
    return students;
  }

     public static void main(String []args){
       Student student1 = new Student("Abhi", 22, 39, "1");
       Student student2 = new Student("shshj", 25, 70, "2");
       Student student3 = new Student("look", 27, 90, "5");
       
       ArrayList<Student> listOfStudents = new ArrayList<Student>();
       listOfStudents.add(student1);
       listOfStudents.add(student2);
       listOfStudents.add(student3);
       String[] params = {"name", "age", "rollNumber", "marks"};
       ArrayList<Student> students = Student.sortStudents(listOfStudents, params);
       for (Student s: students){
         System.out.println(s.name);
         System.out.println(s.age);
       }
     }
}
