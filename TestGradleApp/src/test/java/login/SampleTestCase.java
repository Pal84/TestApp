package login;

import org.junit.Assert;
import org.junit.Test;

public class SampleTestCase {

	@Test
	public void test_sample_assert_one() {
		Assert.assertNotNull(new String("Hello !"));
	}
	
	@Test
	public void test_sample_assert_two() {
		Assert.assertEquals(1, 1);
	}
}
