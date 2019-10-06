package model;

import java.util.Comparator;

public class Module implements Comparable<Module>, Comparator<Module> {

    private String module_title;
    private String module_code;
    private String module_grade;

    public Module(String title, String code, String grade) {
        this.module_title = title;
        this.module_code = code;
        this.module_grade = grade;
    }

    public String get_title() {
        return this.module_title;
    }

    public String get_code() {
        return this.module_code;
    }

    public String get_grade() {
        return this.module_grade;
    }

    public void set_title(String title) {
        this.module_title = title;
    }

    public void set_code(String code) {
        this.module_code = code;
    }

    public void set_grade(String grade) {
        this.module_grade = grade;
    }

    @Override
    public int compare(Module module_1, Module module_2) {
        return module_1.get_grade().compareTo(module_2.get_grade());
    }

    @Override
    public int compareTo(Module module) {
        int module_name_comparison = module_title.compareTo(module.get_title());
        if (module_name_comparison != 0) {
            return module_name_comparison;
        }
        else {
            return module_code.compareTo(module.get_code());
        }
    }

    @Override
    public String toString() {
        return "Module title: " + module_title + "\n, Module code: " + module_code + "\n, Module grade: " + module_grade;
    }

}
