package application;

import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

class Exit_Confirmation_Box {

    private static boolean answer;

    static boolean display() {
        Stage alert_window = new Stage();
        alert_window.setTitle("Exit");

        alert_window.initModality(Modality.APPLICATION_MODAL);

        alert_window.setWidth(300);
        alert_window.setHeight(200);

        Label quit_label = new Label();
        quit_label.setText("Are you sure you want to quit?");

        Button yes_button = new Button("Yes");
        yes_button.setPrefWidth(50);
        yes_button.setOnAction(event -> {
            answer = true;
            alert_window.close();
        });

        Button no_button = new Button ("No");
        no_button.setPrefWidth(50);
        no_button.setOnAction(event -> {
            answer = false;
            alert_window.close();
        });

        VBox alert_window_layout = new VBox();
        alert_window_layout.setPadding(new Insets(15, 15, 15, 15));
        alert_window_layout.setAlignment(Pos.CENTER);
        alert_window_layout.setSpacing(30);

        HBox buttons_selection = new HBox(yes_button, no_button);
        buttons_selection.setAlignment(Pos.CENTER);
        buttons_selection.setSpacing(30);

        alert_window_layout.getChildren().addAll(quit_label, buttons_selection);

        Scene alert_scene = new Scene(alert_window_layout);

        alert_window.setScene(alert_scene);
        alert_window.showAndWait();

        return answer;
    }

}
