package com.imoving.UI;

import com.github.javafaker.Faker;

public class JavaFaker {
    public static void main(String[] args) {

        Faker faker = new Faker();

        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String email = faker.internet().emailAddress();
        String test = faker.chuckNorris().fact();
        String addressCity = faker.address().city();
        String cardNumber = faker.business().creditCardNumber();
        System.out.println(cardNumber);
    }
}
