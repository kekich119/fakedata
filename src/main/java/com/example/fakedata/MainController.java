package com.example.fakedata;

import com.github.javafaker.Faker;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;


import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.Locale;

public class MainController {



    @FXML
    public Button genericButton;
    @FXML
    public Label labelData = new Label();
    @FXML
    public TextField pathFile = new TextField();

    @FXML
    public CheckBox checkBX = new CheckBox();






    @FXML
    void buttonClick(ActionEvent event) throws IOException {



        try {
            if (checkBX.isSelected()) {
                for (int i = 1; i < 6; i++) {
                    expot();
                }
            } else {
                expot();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    public void checkClick(ActionEvent event){
    }
    @FXML
    void actionVb(MouseEvent event) throws IOException {
    }

    void expot() throws IOException {

        try {
            BaseData baseData = new BaseData();
            String filePath = pathFile.getText();
            if (!filePath.isEmpty()) {
                baseData.writer(filePath);
                labelData.setText("Всё найдено. Сохранено в файл: " + filePath);
                 labelData.setText(baseData.text);


            } else {
                labelData.setText("Путь к файлу не указан");


                System.out.println("Путь к файлу не указан.");
                // Можно также вывести сообщение об ошибке на экран или как-то еще обработать эту ситуацию
            }
        } catch (IOException ex) {
            System.out.println("Ошибка при записи в файл: " + ex.getMessage());
            ex.printStackTrace();
            // Можно также вывести сообщение об ошибке на экран или как-то еще обработать эту ситуацию

        }


    }




}


