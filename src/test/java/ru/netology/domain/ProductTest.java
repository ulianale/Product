package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {

    Product book1 = new Book(1, "Sun", 10, "Bob Li");
    Product smartphone1 = new Smartphone(11, "Iphone11", 1000, "USA");

    @Test
    public void bookTest() {

        Assertions.assertTrue(book1.matches("Sun"));
        Assertions.assertTrue(book1.matches("Bob"));
        Assertions.assertFalse(book1.matches("Galaxy"));

    }

    @Test
    public void smartphoneTest() {

        Assertions.assertTrue(smartphone1.matches("11"));
        Assertions.assertTrue(smartphone1.matches("USA"));
        Assertions.assertFalse(smartphone1.matches("Nokia"));
    }

}






