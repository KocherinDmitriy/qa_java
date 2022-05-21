package com.example;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class FelineTest {

    @Test
    public void testFelineEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();
        assertEquals(List.of("Животные", "Птицы", "Рыба"),actual);
    }

    @Test
    public void testGetFelineFamily() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        assertEquals("Кошачьи",actual);
    }

    @Test
    public void testGetDefaultFelineKittens() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        assertEquals(1,actual);
    }

    @Test
    public void testGetFelineKittens() {
        Feline feline = new Feline();
        int actual = feline.getKittens(5);
        assertEquals(5,actual);
    }
}