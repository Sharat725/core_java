package javatoString;

public class SchoolDetails {

    String school_name;
    char school_grade;
    int school_strength;

    SchoolDetails(String school_name, char school_grade, int school_strength) {
        this.school_name = school_name;
        this.school_grade = school_grade;
        this.school_strength = school_strength;
    }

    public String toString() {
        return this.school_name + " " + this.school_grade + " " + this.school_strength;
    }

    public static void main(String[] args) {

        SchoolDetails s1 = new SchoolDetails("New Public English School", 'A', 200);
        System.out.println(s1);

        SchoolDetails s2 = new SchoolDetails("Delhi Public School", 'A', 500);
        System.out.println(s2);
    }
}

