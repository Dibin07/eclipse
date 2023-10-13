package testngprgm;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	@Parameters("a")
	@Test
public void test(String v)
{
		System.out.println(v);
}
}
