import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void removeDuplicateLettersTest1() {
        String s = "bcabc";
        String expected = "abc";
        String actual = new Solution().removeDuplicateLetters(s);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeDuplicateLettersTest2() {
        String s = "cbacdcbc";
        String expected = "acdb";
        String actual = new Solution().removeDuplicateLetters(s);

        Assert.assertEquals(expected, actual);
    }
}
