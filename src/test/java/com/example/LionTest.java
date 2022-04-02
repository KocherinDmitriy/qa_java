package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
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

        };
    }


    @Test
    public void doesHaveMane() throws Exception {
            Feline feline=new Feline();
            Lion lion = new Lion(gender,feline);
            Boolean actual = lion.doesHaveMane();
            assertEquals(expected, actual);

    }



}