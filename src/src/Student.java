package src;

import java.util.stream.Stream;
import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private double grade;
    private String department;
    private Gender gender;
    int male = 0 ;
    int female = 0;

    public static final double PASSING_GRADE = 70.0;

    public Student(String name, double grade, String department, Gender gender) {
        this.name = name;
        this.grade = grade;
        this.department = department;
        this.gender = gender;
    }

    
    public enum Gender {
        MALE, FEMALE
    }
    
    public static Map<String, Map<Student.Gender, Long>> getTheNumberOfStudentsByGenderForEachDepartment(Stream<Student> students) {
    	Map<String, Map<Student.Gender, Long>> result = new HashMap<>();
    	

    	Map<Student.Gender, Long> department = new HashMap<>();

    	/* students.filter(student -> student.getGender() == Student.Gender.MALE).mapToInt(
*/
    	
    	
    	return result;

        //code here...

    }

    
    public void addMale() {
    	male++;
    }
    
    public void addFemale() {
    	female++;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
