import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    Cat cat;
    @Mock
    Feline feline;

    @Before
    public void init() {
        cat=new Cat(feline);
    }

    @Test
    public void catGetSoundTest()
    {
        String catSound= cat.getSound();
        Assert.assertEquals("Мяу", catSound);
    }

    @Test
    public void catGetFoodTest() throws Exception {
        Mockito.when(cat.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> catFood= cat.getFood();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), catFood);
    }
}

