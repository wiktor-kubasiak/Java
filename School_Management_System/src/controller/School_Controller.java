package controller;

import model.Person;
import model.School_Class;
import model.Module;
import model.Module_List;
import model.School;
import model.Student;
import model.Teacher;

public class School_Controller {

    private Person person_model;
    private Student student_model;
    private Teacher teacher_model;
    private Module module_model;

    private School school_model;
    private School_Class class_group;
    private Module_List modules;

    public School_Controller(School model) {
        this.school_model = model;
        school_model = new School(null);
    }

    public void add_class(School_Class school_class) {
        school_model.add_class(school_class);
    }

    public void delete_class(int index) {
        school_model.remove_class_by_index((index - 1));
    }

    public void add_student(String first_name, String middle_name, String last_name, String date_of_birth, String phone_number, String email_address) {
        Student student = new Student(first_name, middle_name, last_name, date_of_birth, phone_number, email_address);
        class_group.add_student(student);
    }

    public void delete_student(int index) {
        class_group.remove_student_by_index((index-1));
    }

    public void add_teacher(Teacher teacher) {
        school_model.add_teacher(teacher);
    }

    public void delete_teacher(int index) {
        school_model.remove_teacher_by_index((index - 1));
    }

    public School get_school_model() {
        return school_model;
    }

    public void set_school_model(School schoolModel) {
        this.school_model = schoolModel;
    }

    public Person get_person_model() {
        return person_model;
    }

    public void set_person_model(Person personModel) {
        this.person_model = personModel;
    }

    public Student get_student_model() {
        return student_model;
    }

    public void set_student_model(Student studentModel) {
        this.student_model = studentModel;
    }

    public Module_List get_modules() {
        return modules;
    }

    public void set_modules(Module_List modules) {
        this.modules = modules;
    }

    public Teacher get_teacher_model() {
        return teacher_model;
    }

    public void set_teacher_model(Teacher teacherModel) {
        this.teacher_model = teacherModel;
    }

    public String get_classes_list() {
        StringBuilder list = new StringBuilder();

        for (int index = 0; index < school_model.get_school_classes().size(); index++) {
            list.append(school_model.get_school_class_details(index));
        }

        return list.toString();
    }

    public void add_classes(School_Class classGroup) {
        school_model.add_class(classGroup);
    }

    public School_Class get_class_group() {
        return class_group;
    }

    public void set_class_group(School_Class classGroup) {
        this.class_group = classGroup;
    }

}
