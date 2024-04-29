package com.example.fakedata;
import com.github.javafaker.Faker;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class BaseData {


    Faker faker = new Faker(new Locale  ("ru"));
    Faker faker1 = new Faker(new Locale("en"));
    String name = this.faker.name().fullName();
    String number = this.faker.phoneNumber().phoneNumber();
    String city = this.faker.address().city();
    String email = this.faker1.internet().emailAddress();
    String text = "Имя: " + name + "\nНомер: " + number + "\nГород: " + city + "\nЕлектронная почта: " + email + "\n___________________________________" + "\n";

        public void writer(String path) throws IOException{



                try (FileWriter fileWriter = new FileWriter(path, true)) {


                    MainController mainController = new MainController();

                        String text = "Имя: " + this.name + "\nНомер: " + this.number + "\nГород: " + this.city + "\nЕлектронная почта: " + this.email + "\n___________________________________" + "\n";
                        mainController.labelData.setText(text);


                        fileWriter.write(text);




                    }catch(IOException ex){
                        System.out.println(ex.getMessage());

                    }

                    try (FileReader reader = new FileReader(path)) {

                        int c;
                        while ((c = reader.read()) != -1) {

                            System.out.print((char) c);
                        }


                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
        }





















