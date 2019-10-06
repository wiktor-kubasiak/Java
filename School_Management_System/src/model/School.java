package model;

import java.util.ArrayList;

public class School {

    private String school_name;
    private ArrayList<Teacher> teachers;
    private ArrayList<School_Class> school_classes;

    public School(String school_name) {
        this.school_name = school_name;
        teachers = new ArrayList<>();
        school_classes = new ArrayList<>();
    }

    public String get_school_name() {
        return this.school_name;
    }

    public void set_school_name(String school_name) {
        this.school_name = school_name;
    }

    public void add_teacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void remove_teacher_by_index(int index) {
        if ((index > -1) && (index < teachers.size()))
            teachers.remove(index);
    }

    public ArrayList<Teacher> get_all_teachers() {
        return this.teachers;
    }

    public void set_all_teachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public String get_teacher_details(int index) {

        if ((index >-1) && (index < teachers.size())) {
            return (index + 1) + ". " + teachers.get(index).person_name.get_first_name() + " " +
                    teachers.get(index).person_name.get_middle_name() + " " +
                    teachers.get(index).person_name.get_last_name() + " " +
                    teachers.get(index).get_phone_number() + " " +
                    teachers.get(index).get_email_address() + " " +
                    teachers.get(index).get_teacher_degree() + "\n";
        }

        return null;
    }

    public void add_class(School_Class school_class) {
        school_classes.add(school_class);
    }

    public void remove_class_by_index(int index) {
        if ((index > -1) && (index < school_classes.size())) {
            school_classes.remove(index);
        }
    }

    public ArrayList<School_Class> get_school_classes() {
        return this.school_classes;
    }

    public void set_school_classes(ArrayList<School_Class> school_classes) {
        this.school_classes = school_classes;
    }

    public String get_school_class_details(int index) {

        if ((index >-1) && (index < school_classes.size())) {
            return (index+1) + ". " + school_classes.get(index).get_student_details(index) + "\n";
        }

        return null;
    }

}
