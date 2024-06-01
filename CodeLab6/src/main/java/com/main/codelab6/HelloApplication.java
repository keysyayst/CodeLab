package com.main.codelab6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.geometry.Pos;
public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Form Login");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        Text scenetitle = new Text("HALAMAN LOGIN");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);
        grid.setHgap(10);
        grid.setVgap(10);

        Label userNameLabel = new Label("User Name:");
        grid.add(userNameLabel, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label passwordLabel = new Label("Password:");
        grid.add(passwordLabel, 0, 2);

        PasswordField passwordField = new PasswordField();
        grid.add(passwordField, 1, 2);

        Button loginButton = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(loginButton);
        grid.add(hbBtn, 1, 4);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 3);

        loginButton.setOnAction(e -> {
            String userName = userTextField.getText();
            String password = passwordField.getText();

            if (userName.equals(validUsername) && password.equals(validPassword)) {
                showWelcomeScreen(primaryStage, userName);
            } else {
                actiontarget.setFill(Color.RED);
                actiontarget.setText("Password atau Username Salah");
            }
        });

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private final String validUsername = "keysya";
    private final String validPassword = "363";

    private void showWelcomeScreen(Stage primaryStage, String userName) {
        StackPane welcomePane = new StackPane();
        welcomePane.setAlignment(Pos.CENTER);

        Label welcomeLabel = new Label("Halo " + userName);
        welcomePane.getChildren().add(welcomeLabel);

        Button backButton = new Button("Kembali");
        backButton.setOnAction(e -> primaryStage.setScene(loginScene(primaryStage)));

        VBox vbox = new VBox(20, welcomeLabel, backButton);
        vbox.setAlignment(Pos.CENTER);

        welcomePane.getChildren().add(vbox);

        Scene welcomeScene = new Scene(welcomePane, 300, 200);
        primaryStage.setScene(welcomeScene);
    }

    private Scene loginScene(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);

        Label userNameLabel = new Label("User Name:");
        grid.add(userNameLabel, 0, 1);
        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label passwordLabel = new Label("Password:");
        grid.add(passwordLabel, 0, 2);
        PasswordField passwordField = new PasswordField();
        grid.add(passwordField, 1, 2);

        Button loginButton = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(loginButton);
        grid.add(hbBtn, 1, 4);

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);


        return new Scene(grid, 300, 275);
    }

    public static void main(String[] args) {
        launch(args);
    }
}