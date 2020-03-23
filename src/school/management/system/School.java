package school.management.system;

import java.util.List;

/**
 * Many teachers, many students.
 * Implement teachers and students using ArrayList
 */

public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    /**
     * new school object is created.
     * @param teachers list of teachers in the school.
     * @param students list of students in the school.
     */
    public School (List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     *
     * @return the list of teachers in the school.
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Adds a teacher to the school
     * @param teacher the teacher to be added.
     */
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }
}
