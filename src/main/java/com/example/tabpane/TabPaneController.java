package com.example.tabpane;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class TabPaneController implements Initializable {
    @FXML
    private Tab tab1, tab2, tab3;

    private ImageView addGraphic(String imageFile){
        ImageView imageView = null;
        Image image = new Image(getClass().getResourceAsStream(imageFile));
        imageView = new ImageView(image);
        imageView.setFitWidth(15);
        imageView.setFitHeight(15);
        return imageView;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ImageView view1 = addGraphic("tab1.png");
        tab1.setGraphic(view1);
        ImageView view2 = addGraphic("tab2.png");
        tab2.setGraphic(view2);
        ImageView view3 = addGraphic("tab3.png");
        tab3.setGraphic(view3);
    }
}