import java.time.LocalDate;

public class Student {
    private String name;
    private String surName;
    private LocalDate dateOfStar;

    private EducationCenter educationCenter;
    private Gender gender;

    public Student(String name, String surName, LocalDate dateOfStar, EducationCenter educationCenter, Gender gender) {
        this.name = name;
        this.surName = surName;
        this.dateOfStar = dateOfStar;
        this.educationCenter = educationCenter;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public LocalDate getDateOfStar() {
        return dateOfStar;
    }

    public void setDateOfStar(LocalDate dateOfStar) {
        this.dateOfStar = dateOfStar;
    }

    public EducationCenter getEducationCenter() {
        return educationCenter;
    }

    public void setEducationCenter(EducationCenter educationCenter) {
        this.educationCenter = educationCenter;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", dateOfStar=" + dateOfStar +
                ", educationCenter=" + educationCenter +
                ", gender=" + gender +
                '}';
    }
}
