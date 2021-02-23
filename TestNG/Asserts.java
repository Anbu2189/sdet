package suiteExample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Asserts{

    @Test()
        public void assertSuccessTest() {
        // Comparing two same Strings.
        Assert.assertEquals("testng", "testng");
    }

    @Test()
        public void assertFailureTest() {
        // Comparing two different Strings
        Assert.assertEquals("testng", "java");
    }

    @SuppressWarnings("null")
	@Test()
    public void exceptionFailureTest() {
        String ptr = null;
        // This line of code throws NullPointerException
        ptr.equals("testng");
    }
}
