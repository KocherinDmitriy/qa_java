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


    @Test //(expected  = Exception.class) -- Можно и так, но тогда доступа к тексту кастомного эксепшена не могу получить. Провеяем что просто есть эксепшен
    public void doesHaveManeWithCustomException() {
        try {
            Lion lion = new Lion("ЗначениеОтличноеОтСпискаОбрабатываемых",feline);
            fail("Эксепшен не был выброшен");
        } catch (Exception exception) {
            assertTrue(exception.getMessage().contains("Используйте допустимые значения пола животного - самей или самка"));
        }
    }

    @Mock
    Feline feline;

    @Test
    public void testGetLionFood() throws Exception {
       Lion lion = new Lion("Самец",feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = lion.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"),actual);

    }


    @Test
    public void testGetLionKittens() throws Exception {
            Lion lion=new Lion("Самец",feline);
            Mockito.when(feline.getKittens()).thenReturn(5);
            int actual = lion.getKittens();
            assertEquals(5,actual);

    }
}