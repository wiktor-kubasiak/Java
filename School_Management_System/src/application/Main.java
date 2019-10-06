package application;

import javafx.application.Platform;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import model.School;
import model.Module;
import model.Teacher;
import model.Student;
import view.School_View;
import controller.School_Controller;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage main_window) {
        main_window.setTitle("JavaFX Program");
        main_window.setOnCloseRequest(event -> {
            event.consume();
            close_the_program();
        });

        School school_model = new School("CIT");
        Module module_model = new Module(null, null, null);
        Teacher teacher_model = new Teacher(null, null, null, null, null);
        Student student_model = new Student(null, null, null, null, null);

        School_Controller school_controller = new School_Controller(school_model);

        School_View school_view = new School_View(school_controller);

        Scene main_scene = new Scene(school_view.as_parent(), 1000, 500);
        main_window.setScene(main_scene);
        main_window.show();
    }

    private void close_the_program() {
        boolean answer = Exit_Confirmation_Box.display();
        if (answer) {
            Platform.exit();
        }
    }

}
