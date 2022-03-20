package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)
public class CatTest {

@Mock
Feline feline;

    @Test
    public void testGetSound() {
        Cat cat = new Cat(feline);
        String actualSound = cat.getSound();
        assertTrue(actualSound.contains("Мяу"));

    }

    @Test
    public void testGetFood() throws Exception {
        Cat cat = new Cat(feline);
        int countOfFood = cat.getFood().size();
        assertEquals(0,countOfFood);
     }


}
