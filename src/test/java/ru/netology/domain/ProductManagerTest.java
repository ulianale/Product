package ru.netology.domain;

import ru.netology.repository.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductManagerTest {

    ProductRepository repo = new ProductRepository();
    ProductManager manager = new ProductManager(repo);

    Product book1 = new Book(1, "Sun", 10, "Bob Li");
    Product book2 = new Book(2, "Galaxy", 10, "Alex Smith");
    Product book3 = new Book(3, "Family", 10, "Anna Koch ");
    Product smartphone1 = new Smartphone(11, "Iphone11", 1000, "USA");
    Product smartphone2 = new Smartphone(12, "Iphone9", 500, "China");
    Product smartphone3 = new Smartphone(13, "Samsung Galaxy", 800, "China");

    @BeforeEach
    public void setup(){
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);
    }

    @Test
    public void test1() {
        Product[] expected = {};
        Product[] actual = manager.searchBy("Nokia");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        Product[] expected = {book2, smartphone3};
        Product[] actual = manager.searchBy("Galaxy");

        Assertions.assertArrayEquals(expected, actual);
    }
}
