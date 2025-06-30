import java.io.*;
import java.lang.*;
public class Test
{
	public static void main(String[] args) {
		ClassLoader ld = Test.class.getClassLoader();
		System.out.println(ld.getResource("Test.class"));
	}
}
