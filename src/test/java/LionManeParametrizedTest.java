import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class LionManeParametrizedTest {
    private final String sex;
    private final boolean mane;

    public LionManeParametrizedTest(String sex, boolean mane) {
        this.sex = sex;
        this.mane = mane;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void lionDoesHaveManeTest() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Lion lion=new Lion(sex, feline);
        Assert.assertEquals(mane, lion.doesHaveMane());
    }
}
