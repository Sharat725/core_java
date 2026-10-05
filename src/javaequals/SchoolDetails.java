package javaequals;

public class SchoolDetails {

    String school_name;
    char school_grade;
    int school_strength;

    SchoolDetails(String school_name, char school_grade, int school_strength) {

        this.school_name = school_name;
        this.school_grade = school_grade;
        this.school_strength = school_strength;

    }

    public boolean equals(Object obj) {

        SchoolDetails s2 = (SchoolDetails)obj;

        return this.school_strength == s2.school_strength;
    }

    public static void main(String[] args) {

        SchoolDetails s1 = new SchoolDetails("New Public English School", 'A', 200);

   
        SchoolDetails s2 = new SchoolDetails("Delhi Public School", 'A', 500);

      

        if(s1.equals(s2)) {

            System.out.println("Same");

        } else {

            System.out.println("Diff");
        }

    }

}
