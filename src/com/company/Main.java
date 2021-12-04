package com.company;

public class Main {

    public static void main(String[] args) {
     student student1 = new student("Diman", 13,4,"Zaza",12,1);
        System.out.println(student1.getInfo());
        student1.studentHand( "поднял руку",2);
     Student2 student3 = new Student2("Erkeayim", 12,3,"Deniza",13,5);
        System.out.println(student3.getInfo());
        student3.studentTakePhone("достал телефон");

        Student2 student4 = new Student2("Mirai", 14,5,"Mark",12,4);
        System.out.println(student4.getInfo());
        student4.studentTakePhone("достал телефон",4);
    }

}
