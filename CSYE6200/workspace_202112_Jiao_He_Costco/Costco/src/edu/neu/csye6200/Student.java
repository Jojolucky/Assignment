package edu.neu.csye6200;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Student extends Person {
    private String name;
    private int age;

    public Student() {
        super();
    }

    public Student(int id, String name, int age) {
        super(id);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public void show(){
        System.out.println("This is the <show> function of Student class: ");
        System.out.println("【Absstraction】 Name: "+ this.name+" "+", Age: "+ this.age);
        System.out.print("\n");
     }
}
