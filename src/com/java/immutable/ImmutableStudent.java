package com.java.immutable;

public final class ImmutableStudent {

    private final int id;
    private final String name;
    private final Age age;

    public ImmutableStudent(int id, String name, Age age) {
        this.id = id;
        this.name = name;
        Age cloneAge = new Age();
        cloneAge.setDay(age.getDay());
        cloneAge.setMonth(age.getMonth());
        cloneAge.setYear(age.getYear());
        this.age = cloneAge;
    }

    public static void main(String[] args) {
        Age age = new Age(1, 01, 1990);
        ImmutableStudent student = new ImmutableStudent(1, "Lita", age);
        System.out.println("Lita's age before modification: " + student.getAge().getYear());
        age.setYear(1992);
        student.getAge().setYear(1993);
        System.out.println("Lita's age after modification: " + student.getAge().getYear());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Age getAge() {
        Age cloneAge = new Age();
        cloneAge.setDay(this.age.getDay());
        cloneAge.setMonth(this.age.getMonth());
        cloneAge.setYear(this.age.getYear());

        return cloneAge;
    }
}
