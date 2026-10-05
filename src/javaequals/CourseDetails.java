package javaequals;

public class CourseDetails {

    int exam_cost;
    String course_name;
    String univer_name;

    CourseDetails(int exam_cost, String course_name, String univer_name) {

        this.exam_cost = exam_cost;
        this.course_name = course_name;
        this.univer_name = univer_name;

    }

    public boolean equals(Object obj) {

        CourseDetails c2 = (CourseDetails)obj;

        return this.exam_cost == c2.exam_cost;
    }

    public static void main(String[] args) {

        CourseDetails c1 = new CourseDetails(1200, "CSE", "VTU");

        

        CourseDetails c2 = new CourseDetails(1500, "ECE", "Bangalore University");

    

        if(c1.equals(c2)) {

            System.out.println("Same");

        } else {

            System.out.println("Diff");
        }

    }

}
