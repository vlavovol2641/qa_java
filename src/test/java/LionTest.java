import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    Lion lion;
    @Mock
    Feline feline;

    @Before
    public void init() throws Exception {
        lion = new Lion("Самка", feline);
    }

    @Test
    public void lionGetFoodTest() throws Exception {
        Mockito.when(lion.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> lionFood = lion.getFood();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lionFood);
    }

    @Test
    public void lionGetKittensTest() {
        Mockito.when(feline.getKittens()).thenReturn(1);
        int lionKittens = lion.getKittens();
        Assert.assertEquals(1, lionKittens);
    }

    @Test
    public void lionSexExceptionTest() throws Exception {
        String lionException = null;
        try
        {
            lion=new Lion("вертолет", feline);
        } catch (Exception e)
        {
            lionException = e.getMessage();
        } finally {
            Assert.assertEquals("Используйте допустимые значения пола животного - самей или самка", lionException);
        }
    }


}