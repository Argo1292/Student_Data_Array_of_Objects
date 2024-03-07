import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        UserInput userinput = new UserInput();

        Object[] detailsStudents = new Object[3];

        System.out.println("Enter number of records: ");
        int n = scan.nextInt();

        Student[] students = new Student[n];

        for(int i = 0; i < n; i++){

            detailsStudents = userinput.inputStudent();

            students[i] = new Student();
            students[i].setName((String) detailsStudents[0]);
            students[i].setPrn((Integer) detailsStudents[1]);
            students[i].setDob((String) detailsStudents[2]);
        }

        //display(students);
    }
}
