package javatest;

public class Person {
    String name;
    int age;
    public void def(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void print(){
        System.out.println("名字是：" + name);
        System.out.println("年龄为：" + age);
    }
}
