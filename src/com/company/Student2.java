package com.company;

public  final class Student2 extends Teacher{
    private String name;
    private int age;
    private double grades;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public double getGrades() {
        return grades;
    }

    public Student2(String name, int age, int howLongTeach, String name1, int age1, double grades) {
        super(name, age, howLongTeach);
        this.name = name1;
        this.age = age1;
        this.grades = grades;
    }
    public void studentTakePhone (String phone){
        System.out.println(phone);

    }

    public void studentTakePhone (String phone, int phonee){
        for (int i = 0; i <phonee ; i++) {
            System.out.println(phone);
        }


    }
    public String getInfo(){
        return "Age: " + getAge() + " name: " +
                getName() + " How long teach: " + getHowLongTeach() + "Grade: " + getGrades();

    }
}