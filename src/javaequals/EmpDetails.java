package javaequals;

public class EmpDetails {

    String emp_name;
    char emp_grade;
    int emp_sal;

    EmpDetails(String emp_name, char emp_grade, int emp_sal) {

        this.emp_name = emp_name;
        this.emp_grade = emp_grade;
        this.emp_sal = emp_sal;

    }

    public boolean equals(Object obj) {

        EmpDetails e2 = (EmpDetails)obj;

        return this.emp_sal == e2.emp_sal;
    }

    public static void main(String[] args) {

        EmpDetails e1 = new EmpDetails("Najappa", 'A', 80000);

  

        EmpDetails e2 = new EmpDetails("Rajappa", 'B', 60000);

        

        if(e1.equals(e2)) {

            System.out.println("Same");

        } else {

            System.out.println("Diff");
        }

    }

}