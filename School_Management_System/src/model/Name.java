package model;

public class Name {

    private String first_name;
    private String middle_name;
    private String last_name;

    public Name() {}

    public Name(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public Name(String first_name, String middle_name, String last_name) {
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
    }

    public String get_first_name() {
        return this.first_name;
    }

    public String get_middle_name() {
        return this.middle_name;
    }

    public String get_last_name() {
        return this.last_name;
    }

    public void set_first_name(String first_name) {
        this.first_name = first_name;
    }

    public void set_middle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public void set_last_name(String last_name) {
        this.last_name = last_name;
    }

    @Override
    public String toString() {
        return "First name: " + first_name + ",\n Middle name: " + middle_name + ",\n Last name: " + last_name;
    }

}
