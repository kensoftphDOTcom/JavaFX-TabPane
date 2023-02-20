package com.example.tabpane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        /*FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("tabpane.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("JavaFX TabPane");
        stage.setScene(scene);
        stage.show();*/

        TabPane tabPane = new TabPane();

        Tab tab1 = new Tab();
        tab1.setText("Personal Information");
        tab1.setContent(new Button("This is a button"));
        tab1.setClosable(false);

        Tab tab2 = new Tab();
        tab2.setText("Address");
        tab2.setContent(new Button("A button in tab 2"));
        tab2.setClosable(false);

        Tab tab3 = new Tab();
        tab3.setText("Other Information");
        tab3.setContent(new Label("This is a label inside the tab 3"));
        tab3.setClosable(false);

        tabPane.getTabs().addAll(tab1, tab2, tab3);

        StackPane layout = new StackPane();
        layout.getChildren().add(tabPane);
        Scene scene = new Scene(layout, 500, 350);
        stage.setScene(scene);
        stage.setTitle("TabPane in JavaFX");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}