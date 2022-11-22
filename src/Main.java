import java.time.LocalDate;

public class Main<Students> {
    public static void main(String[] args) {
        EducationCenter educationCenter = new College("KGGTU", "Kyrgysztan", LocalDate.of(2018, 9, 1));
        EducationCenter educationCenter3 = new College("Finteh", "Kyrgysztan", LocalDate.of(2000, 9, 1));
        EducationCenter educationCenter1 = new University("BGU", "Kazakstan", LocalDate.of(2008, 9, 1));
        EducationCenter educationCenter4 = new University("KNU", "Amerika", LocalDate.of(2011, 4, 1));
        EducationCenter educationCenter2 = new School("Manas", "Bishkek", LocalDate.of(2005, 5, 1));
        EducationCenter educationCenter5 = new School("Seitek", "Karakol", LocalDate.of(2001, 7, 3));

        Student student = new Student("Jenishbek", "Asangaziev", LocalDate.of(2012, 9, 1), educationCenter, Gender.W);
        Student student1 = new Student("Azamat", "Asanov", LocalDate.of(2019, 9, 1), educationCenter1, Gender.M);
        Student student2 = new Student("Nurdai", "Talgatova", LocalDate.of(2017, 9, 1), educationCenter2, Gender.W);
        Student student3 = new Student("Aigerim", "Baktybekova", LocalDate.of(2016, 9, 1), educationCenter3, Gender.W);
        Student student4 = new Student("Kairat", "Rysbekov", LocalDate.of(2017, 9, 4), educationCenter4, Gender.M);
        Student student5 = new Student("Medina ", "Omurbekova", LocalDate.of(2020, 9, 1), educationCenter5, Gender.W);
        Student[] students = {student, student1, student2, student3, student4, student5};
        for (Student student7 : getAllStudent(students)) {
            System.out.println(student7);
        }
    }
    public static Student[] getAllStudent(Student[] students) {
        return students;
    }
    public static void massiv(EducationCenter[]educationCenters,Student[]students) {
        int schoolLength =0;
        int univerLength = 0;
        int collegeLength = 0;
        School[] schools = new School[schoolLength];
        University[] universities = new University[univerLength];
        College[] colleges = new College[collegeLength];
        for (Student student : students) {
            
        }
    }
}