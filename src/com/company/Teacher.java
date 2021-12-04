package com.company;

public class Teacher {
    private String name;
    private int age;
    private int howLongTeach;
    private Grade grade;

    public Grade getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHowLongTeach() {
        return howLongTeach;
    }

    public Teacher(String name, int age, int howLongTeach) {
        this.name = name;
        this.age = age;
        this.howLongTeach = howLongTeach;
    }
   public String getInfo(){
        return "Age: " + getAge() + " name: " + getName() + " How long teach: " + getHowLongTeach() + "Grade: " + getGrade();

   }
}

