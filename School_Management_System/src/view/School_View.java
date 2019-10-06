package view;

import controller.School_Controller;
import javafx.scene.Parent;
import javafx.scene.layout.*;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

public class School_View {

    private School_Controller school_controller;
    private boolean switcher_is_on = true;

    private BorderPane main_view;
    private VBox left_column = new VBox(10);
    private VBox right_column = new VBox(10);

    private Button change_person_button;

    private TextField first_name_input;
    private TextField middle_name_input;
    private TextField last_name_input;
    private TextField date_of_birth_or_degree_input;
    private TextField email_address_input;
    private TextField phone_number_input;

    private TextArea teachers_and_students_display_area;

    private TextField class_input;

    public School_View(School_Controller controller) {

        this.school_controller = controller;

        create_and_configure_pane();

        create_and_position_controls();

        //load_list();
    }

    public Parent as_parent() throws NullPointerException {
        return main_view;
    }

    private void create_and_configure_pane() {
        main_view = new BorderPane();
        main_view.setMinWidth(1000);
        main_view.setPadding(new Insets(15, 15, 15, 15));
        main_view.setLeft(left_column);
        main_view.setRight(right_column);
    }

    private void create_and_position_controls() {
        Label select_person_label = new Label("Select Person: ");
        select_person_label.setMinHeight(25);

        Label class_label = new Label("Class: ");
        class_label.setMinHeight(25);

        Text change_person_information_label = new Text();
        change_person_information_label.setText("Student is selected by default.");

        Text information_label = new Text();
        information_label.setText("Enter the student's details below:");

        Label first_name_label = new Label("First Name:");
        first_name_label.setMinHeight(25);
        first_name_input = new TextField();
        first_name_input.setMinSize(100, 20);

        Label middle_name_label = new Label("Middle Name:");
        middle_name_label.setMinHeight(25);
        middle_name_input = new TextField();
        middle_name_input.setMinSize(100, 20);

        Label last_name_label = new Label("Last Name:");
        last_name_label.setMinHeight(25);
        last_name_input = new TextField();
        last_name_input.setMinSize(100, 20);

        Label date_of_birth_or_degree_label = new Label();
        date_of_birth_or_degree_label.setMinHeight(25);
        date_of_birth_or_degree_label.setText("Date of Birth:");
        date_of_birth_or_degree_input = new TextField();
        date_of_birth_or_degree_input.setMinSize(100, 20);

        Label phone_number_label = new Label("Phone Number:");
        phone_number_label.setMinHeight(25);
        phone_number_input = new TextField();
        phone_number_input.setMinSize(100, 20);

        Label email_address_label = new Label("Email Address:");
        email_address_label.setMinHeight(25);
        email_address_input = new TextField();
        email_address_input.setMinSize(100, 20);

        Label teacher_or_student_to_be_removed_label = new Label();
        teacher_or_student_to_be_removed_label.setMinHeight(25);
        teacher_or_student_to_be_removed_label.setText("Name of a student to be removed:");
        TextField teacher_or_student_to_be_removed_input = new TextField();
        teacher_or_student_to_be_removed_input.setMinSize(100, 20);

        class_input = new TextField();
        class_input.setMinSize(100, 20);

        teachers_and_students_display_area = new TextArea("< List of teachers and students to be displayed >");
        TextArea classes_display_area = new TextArea("< List of classes to be displayed >");

        change_person_button = new Button("Student");
        Button add_button = new Button("Add");
        Button create_button = new Button("Create");
        Button delete_button = new Button("Delete");
        Button list_teachers_and_students_button = new Button("List");
        Button list_classes_button = new Button("List");
        Button sort_by_name_button = new Button("Sort by name");
        Button load_button = new Button("Load");
        Button save_button = new Button("Save");

        change_person_button.setOnAction( e -> {
            if (switcher_is_on) {
                change_person_button.setText("Teacher");
                switcher_is_on = false;
                change_person_information_label.setText("You have switched to teacher.");
                information_label.setText("Enter the teacher's details below:");
                date_of_birth_or_degree_label.setText("Degree:");
                teacher_or_student_to_be_removed_label.setText("Name of a teacher to be removed:");
            }
            else {
                change_person_button.setText("Student");
                switcher_is_on = true;
                change_person_information_label.setText("You have switched to student.");
                information_label.setText("Enter the student's details below:");
                date_of_birth_or_degree_label.setText("Date of Birth:");
                teacher_or_student_to_be_removed_label.setText("Name of a student to be removed:");
            }
        });

        add_button.setOnAction(e -> add_button_clicked());

        //delete_button.setOnAction(e -> delete_button_clicked());

        //create_button.setOnAction(e -> create_button_clicked());

        list_classes_button.setOnAction(e -> {
            teachers_and_students_display_area.setText(school_controller.get_classes_list());
            System.out.println(school_controller.get_classes_list());
        });

        //load_button.setOnAction(e -> load_list());

        HBox change_person_functional_layout = new HBox(10);
        change_person_functional_layout.getChildren().addAll(select_person_label, change_person_button);

        HBox change_person_information_layout = new HBox(10);
        change_person_information_layout.getChildren().add(change_person_information_label);

        VBox change_person_layout = new VBox();
        change_person_layout.getChildren().addAll(change_person_functional_layout, change_person_information_layout);
        change_person_layout.setSpacing(10);

        HBox information_label_layout = new HBox(10);
        information_label_layout.getChildren().add(information_label);

        HBox first_name_input_layout = new HBox(20);
        first_name_input_layout.getChildren().addAll(first_name_label, first_name_input);

        HBox middle_name_input_layout = new HBox(20);
        middle_name_input_layout.getChildren().addAll(middle_name_label, middle_name_input);

        HBox last_name_input_layout = new HBox(20);
        last_name_input_layout.getChildren().addAll(last_name_label, last_name_input);

        HBox date_of_birth_or_degree_input_layout = new HBox(20);
        date_of_birth_or_degree_input_layout.getChildren().addAll(date_of_birth_or_degree_label, date_of_birth_or_degree_input);

        HBox phone_number_input_layout = new HBox(20);
        phone_number_input_layout.getChildren().addAll(phone_number_label, phone_number_input);

        HBox email_address_input_layout = new HBox(20);
        email_address_input_layout.getChildren().addAll(email_address_label, email_address_input);

        HBox teacher_or_student_to_be_removed_layout = new HBox(20);
        teacher_or_student_to_be_removed_layout.getChildren().addAll(teacher_or_student_to_be_removed_label, teacher_or_student_to_be_removed_input);

        VBox all_inputs_layout = new VBox();
        all_inputs_layout.getChildren().addAll(first_name_input_layout, middle_name_input_layout, last_name_input_layout,
                                        date_of_birth_or_degree_input_layout, phone_number_input_layout,
                                        email_address_input_layout, teacher_or_student_to_be_removed_layout);
        all_inputs_layout.setSpacing(15);

        HBox buttons = new HBox(10);

        HBox add_and_list_teachers_and_students_buttons_layout = new HBox();
        add_and_list_teachers_and_students_buttons_layout.setSpacing(5);
        add_and_list_teachers_and_students_buttons_layout.getChildren().addAll(add_button, list_teachers_and_students_button);

        HBox delete_teacher_or_student_button_layout = new HBox();
        delete_teacher_or_student_button_layout.getChildren().addAll(delete_button);

        HBox load_and_save_teachers_and_students_buttons_layout = new HBox();
        load_and_save_teachers_and_students_buttons_layout.setSpacing(5);
        load_and_save_teachers_and_students_buttons_layout.getChildren().addAll(load_button, save_button);

        HBox sort_by_name_button_layout = new HBox();
        sort_by_name_button_layout.getChildren().addAll(sort_by_name_button);

        buttons.getChildren().addAll(add_and_list_teachers_and_students_buttons_layout, delete_teacher_or_student_button_layout, sort_by_name_button_layout, load_and_save_teachers_and_students_buttons_layout);

        HBox class_management_layout = new HBox();
        class_management_layout.getChildren().addAll(class_label, class_input, create_button, list_classes_button);
        class_management_layout.setSpacing(10);

        left_column.getChildren().addAll(change_person_layout, information_label_layout, all_inputs_layout);
        left_column.setSpacing(30);
        left_column.setPadding(new Insets(30, 30, 30, 30));

        right_column.getChildren().addAll(buttons, teachers_and_students_display_area, class_management_layout, classes_display_area);
        right_column.setPadding(new Insets(30, 30, 30, 30));
    }

    private void add_button_clicked() {
        school_controller.add_student(
                first_name_input.getText(),
                middle_name_input.getText(),
                last_name_input.getText(),
                date_of_birth_or_degree_input.getText(),
                email_address_input.getText(),
                phone_number_input.getText()
        );
        first_name_input.clear();
        middle_name_input.clear();
        last_name_input.clear();
        date_of_birth_or_degree_input.clear();
        email_address_input.clear();
        phone_number_input.clear();
        class_input.clear();
        teachers_and_students_display_area.setText("New Student added. Number of Students: " + school_controller.get_class_group().get_students_list_size());
    }

    /*
    public void delete_button_clicked() {

    }
    */

    /*
    public void create_button_clicked() {
        school_controller.add_class(new School_Class(group.getText()));
    }
    */

    /*
    public void load_list() {

    }
    */
}
