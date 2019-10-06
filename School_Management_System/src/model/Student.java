package model;

public class Student extends Person {

    private String date_of_birth;
    private Module_List modules;

    public Student(String first_name, String last_name, String date_of_birth, String phone_number, String email_address) {
        super(phone_number, email_address);
        this.person_name.set_first_name(first_name);
        this.person_name.set_last_name(last_name);
        this.date_of_birth = date_of_birth;

        modules = new Module_List();
    }

    public Student (String first_name, String middle_name, String last_name, String date_of_birth, String phone_number, String email_address) {
        super(phone_number, email_address);
        this.person_name.set_first_name(first_name);
        this.person_name.set_middle_name(middle_name);
        this.person_name.set_last_name(last_name);
        this.date_of_birth = date_of_birth;

        modules = new Module_List();
    }

    public String get_date_of_birth() {
        return date_of_birth;
    }

    public void set_date_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public Module get_specific_module(int index) {
        if ((index >-1) && (index < modules.get_modules_list_size())) {
            return modules.get_specific_module(index);
        }

        return null;
    }

    public void set_specific_module(Module module) {
        if (modules.get_modules_list_size() < 7) {
            modules.add_module(module);
        }
        else {
            System.out.println("Student named " + this.get_name() + " already has " + modules.get_modules_list_size() + " modules.");
        }
    }

    public Module_List get_all_modules() {
        return this.modules;
    }

    public void set_all_modules(Module_List modules) {
        this.modules = modules;
    }

}
