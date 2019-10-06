package model;

import java.util.Collections;
import java.util.ArrayList;

public class School_Class {

    private String class_name;
    private ArrayList<Student> all_students;

    public School_Class(String name) {
        this.class_name = name;
        all_students = new ArrayList<>();
    }

    public void add_student(Student student) {
        all_students.add(student);
    }

    public void remove_student_by_index (int index) {
        if ((index > -1) && (index < all_students.size())) {
            all_students.remove(index);
        }
    }

    public Student get_particular_student(int index) {
        if ((index >-1) && (index < all_students.size())) {
            return all_students.get(index);
        }

        return null;
    }

    public ArrayList<Student> get_all_students() {
        return all_students;
    }

    public void set_all_students(ArrayList<Student> students) {
        this.all_students = students;
    }

    public String get_student_details(int index) {
        if ((index >-1) && (index < all_students.size()))
            return (index + 1) + ". " + all_students.get(index).get_name() + " " +
                    all_students.get(index).get_date_of_birth() + " " +
                    all_students.get(index).get_phone_number() + " " +
                    all_students.get(index).get_email_address() + " " +
                    all_students.get(index).get_all_modules() + "\n";

        return null;
    }

    public void sort_by_last_name() {
        Collections.sort(all_students);
    }

    public void sort_by_last_name_reversed() {
        Collections.reverse(all_students);
    }

    public int get_students_list_size() {
        return all_students.size();
    }

}
