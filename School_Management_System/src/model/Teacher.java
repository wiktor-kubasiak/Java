package model;

public class Teacher extends Person {

    private String teacher_degree;

    public Teacher (String first_name, String last_name, String phone_number, String email_address, String degree) {
        super(phone_number, email_address);
        this.person_name.set_first_name(first_name);
        this.person_name.set_last_name(last_name);
        this.teacher_degree = degree;
    }

    public Teacher (String first_name, String middle_name, String last_name, String phone_number, String email_address, String degree) {
        super(phone_number, email_address);
        this.person_name.set_first_name(first_name);
        this.person_name.set_middle_name(middle_name);
        this.person_name.set_last_name(last_name);
        this.teacher_degree = degree;
    }

    public String get_teacher_degree() {
        return this.teacher_degree;
    }

    public void set_teacher_degree(String degree) {
        this.teacher_degree = degree;
    }

}
