package Utilities;

import org.junit.Assert;

public class Assertions {
	public void assertIt(String a, String b, String message) {
		Assert.assertEquals(a, b, message);
	}
	public void assertIt(boolean a, boolean b) {
		Assert.assertEquals(a, b);
		
	}
	public void fail() {
		Assert.fail();
	}
	public void pass() {
		Assert.assertTrue(true);
	}
}
