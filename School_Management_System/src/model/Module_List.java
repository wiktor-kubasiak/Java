package model;

import java.util.Objects;
import java.util.ArrayList;

public class Module_List {

    private ArrayList<Module> all_modules;

    Module_List() {
        all_modules = new ArrayList<>();
    }

    public void add_module(Module module) {
        if (all_modules.size() < 7) {
            all_modules.add(module);
        }
        else {
            System.out.println("The modules list cannot have more than 6 modules. The current number is " + all_modules.size() + " modules.");
        }
    }

    public void remove_module_by_index(int index) {
        if ((index > -1) && (index < all_modules.size())) {
            all_modules.remove(index);
        }
    }

    @SuppressWarnings("SuspiciousListRemoveInLoop")
    public void remove_module_by_code(String code) {
        for (int index = 0; index < all_modules.size(); index++) {
            if (Objects.requireNonNull(get_specific_module(index)).get_code().equals(code)) {
                all_modules.remove(index);
            }
        }
    }

    public String get_module_details(int index) {
        if ((index >-1) && (index < all_modules.size()))
            return (index+1) + ". " + all_modules.get(index).get_title() + " " +
                    all_modules.get(index).get_code() + " " +
                    all_modules.get(index).get_grade() + "\n";
        return null;
    }

    public Module get_specific_module(int index) {
        if ((index >-1) && (index < all_modules.size())) {
            return all_modules.get(index);
        }

        return null;
    }

    public int get_modules_list_size() {
        return all_modules.size();
    }

}
