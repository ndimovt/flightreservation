package io.github.ndimovt;

public class Human {
    private String name;
    private String fathername;
    private String surname;
    public Human(String name, String fathername, String surname) {
        this.name = name;
        this.fathername = fathername;
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public String getFathername() {
        return fathername;
    }
    public String getSurname() {
        return surname;
    }
}
