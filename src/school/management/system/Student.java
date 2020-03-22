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
     * @param id
     * @param name
     * @param grade
     */

    public Student(int id, String name, int grade) {

        this.id = id;
        this.name = name;
        this.grade = grade;

    }
}
