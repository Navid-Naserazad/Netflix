package org.example;

public class Cast {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String nationality;

    public Cast(String firstName, String lastName, int age, String gender, String nationality)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.nationality = nationality;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Cast{" +
                "firstName:'" + firstName + '\'' +
                ", lastName:'" + lastName + '\'' +
                ", age:" + age +
                ", gender:'" + gender + '\'' +
                ", nationality:'" + nationality + '\'' +
                '}';
    }
}
