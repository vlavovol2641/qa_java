import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FelineTest {
    Feline feline;
    @Before
    public void init() {
        feline=new Feline();
    }

    @Test
    public void felineEatMeat() throws Exception {
        List<String> felineMeat= feline.eatMeat();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), felineMeat);
    }

    @Test
    public void felineGetFamily()
    {
        String felineFamily= feline.getFamily();
        Assert.assertEquals("Кошачьи", felineFamily);
    }

    @Test
    public void felineGetKittensConstant()
    {
        int felineKittens= feline.getKittens();
        Assert.assertEquals(1, felineKittens);
    }

    @Test
    public void felineGetKittensVariable()
    {
        int count=4;
        int felineKittens= feline.getKittens(count);
        Assert.assertEquals(count, felineKittens);
    }
}
