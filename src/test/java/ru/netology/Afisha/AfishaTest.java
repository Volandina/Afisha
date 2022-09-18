package ru.netology.Afisha;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AfishaTest {
    @Test
    public void AddThreeItems() {
        Afisha afisha = new Afisha();

        afisha.add("Movie 1");
        afisha.add("Movie 2");
        afisha.add("Movie 3");

        String[] expected = {"Movie 1", "Movie 2", "Movie 3"};
        String[] actual = afisha.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShoudReversLimitItems() {
        Afisha afisha = new Afisha();

        afisha.add("Movie 1");
        afisha.add("Movie 2");
        afisha.add("Movie 3");

        String[] expected = {"Movie 3", "Movie 2", "Movie 1"};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void ShoudRevers5of11movies() {
        Afisha afisha = new Afisha(5);

        afisha.add("Movie 1");
        afisha.add("Movie 2");
        afisha.add("Movie 3");
        afisha.add("Movie 4");
        afisha.add("Movie 5");
        afisha.add("Movie 6");
        afisha.add("Movie 7");
        afisha.add("Movie 8");
        afisha.add("Movie 9");
        afisha.add("Movie 10");

        String[] expected = {"Movie 10", "Movie 9", "Movie 8", "Movie 7", "Movie 6"};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}