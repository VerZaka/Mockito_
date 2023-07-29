package ru.netology.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    MovieManager manager = new MovieManager(3);
    MovieManager film1 = new MovieManager();
    MovieManager film2 = new MovieManager();
    MovieManager film3 = new MovieManager();
    MovieManager film4 = new MovieManager();
    MovieManager film5 = new MovieManager();
    MovieManager film6 = new MovieManager();
    MovieManager film7 = new MovieManager();
    MovieManager film8 = new MovieManager();

    @Test
    public void FindAllTest() {
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);

        MovieManager[] expected = {film1, film2, film3};
        MovieManager[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastTest() {
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);

        MovieManager[] expected = {film3, film2, film1};
        MovieManager[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastIf8() {
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);

        MovieManager[] expected = {film8, film7, film6};
        MovieManager[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastIfDefaultLimit() {
        MovieManager manager = new MovieManager();

        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);


        MovieManager[] expected = {film8, film7, film6, film5, film4};
        MovieManager[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void IfLimitGreaterArray() { //покрытие
        manager.add(film1);
        manager.add(film2);


        MovieManager[] expected = {film2, film1};
        MovieManager[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
