package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionWithoutParameterizationTest {

    @Test
    public void doesHaveManeWithCustomException() {
        try {
            Lion lion = new Lion("Значение");
            Boolean actual = lion.doesHaveMane();
        } catch (Exception exception) {
            assertTrue(exception.getMessage().contains("Используйте допустимые значения пола животного - самей или самка"));
        }
    }
    @Test
    public void testGetLionFood() throws Exception {
       Lion lion = new Lion("Самец");
        List<String> actual = lion.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"),actual);

    }

    @Mock
    Feline feline;

    @Test
    public void testGetLionKittens() throws Exception {
            Lion lion = new Lion("Самка");
            Mockito.when(feline.getKittens()).thenReturn(5);
            int actual = lion.getKittens();
            assertEquals(5,actual);

    }
}