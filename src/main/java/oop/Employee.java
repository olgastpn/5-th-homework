package oop;

public class Employee {
    private String name;
    private String position;
    private String email;
    private int tlf;
    private int salary;
    private int age;

    public static void main(String[] args){
    }
    public Employee() {
    }

    public Employee(String name, String position, String email, int tlf, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.tlf = tlf;
        this.salary = salary;
        this.age = age;

    }
    public int getAge() {
        return age;
    }

    public String toString(){
        String s = name + " " + position + " " + email + " " + tlf + " " + salary + " " + age;
        return s;
    }
}