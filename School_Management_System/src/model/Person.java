package model;

import java.util.Comparator;

public abstract class Person implements Comparable<Person>, Comparator<Person>{

    protected Name person_name;
    protected String person_phone_number;
    protected String person_email_address;

    public Person (String phone_number, String email_address) {
        person_name = new Name();
        this.person_phone_number = phone_number;
        this.person_email_address = email_address;
    }

    public Name get_name() {
        return this.person_name;
    }

    public String get_phone_number() {
        return this.person_phone_number;
    }

    public String get_email_address() {
        return this.person_email_address;
    }

    public void set_name(Name name) {
        this.person_name = name;
    }

    public void set_phone_number(String phone_number) {
        this.person_phone_number = phone_number;
    }

    public void set_email_address(String email_address) {
        this.person_email_address = email_address;
    }

    @Override
    public int compare(Person person_1, Person person_2) {
        return person_1.person_name.get_first_name().compareTo(person_2.person_name.get_first_name());
    }

    @Override
    public int compareTo(Person person) {
        return this.person_name.get_last_name().compareTo(person.person_name.get_last_name());
    }

    @Override
    public Comparator<Person> reversed() {
        return Comparator.super.reversed();
    }

    @Override
    public String toString() {
        return "Name: " + this.get_name() + "\n"
                + "Phone number: " + this.get_phone_number() + "\n"
                + "Email address: " + this.get_email_address() + "\n";
    }

}
