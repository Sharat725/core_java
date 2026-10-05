package javatoString;

public class EmpDetail {

    String emp_name;
    char emp_grade;
    int emp_sal;

    EmpDetail(String emp_name, char emp_grade, int emp_sal) {
        this.emp_name = emp_name;
        this.emp_grade = emp_grade;
        this.emp_sal = emp_sal;
    }

    public String toString() {
        return this.emp_name + " " + this.emp_grade + " " + this.emp_sal;
    }

    public static void main(String[] args) {

        EmpDetail e1 = new EmpDetail("Najappa", 'A', 80000);
        System.out.println(e1);

        EmpDetail e2 = new EmpDetail("Rajappa", 'B', 60000);
        System.out.println(e2);
    }
}
