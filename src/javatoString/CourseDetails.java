package javatoString;

public class CourseDetails {

    int exam_cost;
    String course_name;
    String univer_name;

    CourseDetails(int exam_cost, String course_name, String univer_name) {
        this.exam_cost = exam_cost;
        this.course_name = course_name;
        this.univer_name = univer_name;
    }

    public String toString() {
        return this.exam_cost + " " + this.course_name + " " + this.univer_name;
    }

    public static void main(String[] args) {

        CourseDetails c1 = new CourseDetails(1200, "CSE", "VTU");
        System.out.println(c1);

        CourseDetails c2 = new CourseDetails(1500, "ECE", "Bangalore University");
        System.out.println(c2);
    }
}

