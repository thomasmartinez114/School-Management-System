package school.management.system;

/*
This class is responsible for keeping track of
Student fees, name, grade & fees paid
 */

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * To create a new student by initializing:
     * Fee per student is $30,000
     * Fees paid initially is $0
     * @param id
     * @param name
     * @param grade
     */

    public Student(int id, String name, int grade) {
        feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // Not going to alter student's name, student's id.

    /**
     * Used to update the student's grade.
     * @param grade new grade of the student.
     */

    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Keep adding the fees to feesPaid field.
     * Add the fees to the fees paid.
     * The school is going to receive the funds
     *
     * @param fees the fees that the student owes
     */
    public void updateFeesPaid(int fees) {
        feesPaid += fees;
    }

}
