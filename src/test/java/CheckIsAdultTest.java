import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CheckIsAdultTest {

    private final int age;
    private final boolean result;

    public CheckIsAdultTest(int age, boolean result) {
        this.age = age;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] getTextData() {
        return new Object[][]{
                {18, true},
                {17, false},
                {19, true},
                {21, true},

        };
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();
        int age = this.age;
        boolean isAdult = program.checkIsAdult(age);
        boolean expected = result;
        assertEquals("Не соответствует ожидаемому результвту", expected, isAdult);
    }
}
