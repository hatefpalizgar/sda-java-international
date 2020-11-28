package com.sda.java.annotations;

import com.sda.java.collections.maps.Person;

public class AnnotationDemo {
    public static void main(String[] args) {
        Student student = new Student("fName", "lName", 10);
        student.methodWithAnnotation(14);
    }
}

class Student extends Person {

    public Student(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @MyCustomAnnotation({"first value", "second value"})
    @Deprecated
    public void methodWithAnnotation(@Deprecated Integer someNumber) {
        // does nothing
    }
}
