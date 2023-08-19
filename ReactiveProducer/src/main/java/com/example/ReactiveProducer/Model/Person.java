package com.example.ReactiveProducer.Model;

import lombok.Data;

@Data
public class Person {

    @org.springframework.data.annotation.Id
    Integer Index;
    String User_Id;
    String First_Name;
    String Last_Name;
    String Sex;
    String Email;
    String Phone;
    String Date_of_birth;
    String Job_Title;

}
