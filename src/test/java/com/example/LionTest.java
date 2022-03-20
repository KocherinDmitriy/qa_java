package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionTest {
    private final String gender;
    private final Boolean expected;

    public LionTest(String gender, Boolean expected) {
        this.gender = gender;
        this.expected = expected;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getData() {
        return new Object[][] {
                { "Самец", true},
                { "Самка", false},
                { "Other", null},

        };
    }

    @Test
    public void doesHaveMane() {
        try {
            Lion lion = new Lion(gender);
            Boolean actual = lion.doesHaveMane();
            assertEquals(expected, actual);
        } catch (Exception exception) {
           assertTrue(exception.getMessage().contains("Используйте допустимые значения пола животного - самей или самка"));

        }

    }

    @Test
    public void testGetLionFood() {
        try { Lion lion = new Lion(gender);
        List<String> actual = lion.getFood();
         assertArrayEquals(new Object[]{"Животные", "Птицы", "Рыба"},actual.toArray());
        } catch (Exception ignored) {

        }
    }

    @Test
    public void testGetLionKittens() {
        try { Lion lion = new Lion(gender);
            int actual = lion.getKittens();
            assertEquals(1,actual);
        } catch (Exception ignored) {

        }
    }
}