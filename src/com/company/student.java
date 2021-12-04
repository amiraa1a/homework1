package com.company;

public class student extends Teacher{

    private String name;
    private int age;
    private int gardes;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public double getGardes() {
        return gardes;
    }

    public student(String name, int age, int howLongTeach, String name1, int age1, int gardes) {
        super(name, age, howLongTeach);
        this.name = name1;
        this.age = age1;
        this.gardes = gardes;
    }
    public void studentHand(String hand){
        System.out.println(hand);

    }
    public void studentHand(String hand,int schet){
        for (int i = 0; i < schet; i++) {
            System.out.println(hand);

        }


    }
    public String getInfo(){
        return "Age: " + getAge() + " name: " +
                getName() + " How long teach: " + getHowLongTeach() + "Grade: " + getGardes();

    }

}
