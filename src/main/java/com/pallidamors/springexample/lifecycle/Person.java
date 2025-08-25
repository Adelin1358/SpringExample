package com.pallidamors.springexample.lifecycle;

public class Person {
    //멤버변수
    //이름, 나이
    private String name;
    private int age;

    public Person() {
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "이름 : "+name +"나이 : "+ age;
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

}
