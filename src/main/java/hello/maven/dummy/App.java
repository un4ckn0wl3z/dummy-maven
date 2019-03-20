package hello.maven.dummy;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Gson gson = new Gson();
    public static void main( String[] args )
    {
        System.out.println(gson.toJson("Hello World!"));
    }
}
