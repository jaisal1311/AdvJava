package sycs64;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.io.*;

public class JavaTwitter {
public static void main(String[] args) {
try{
URL url = new URL("https://jsonplaceholder.typicode.com/todos/1");
URLConnection urlCon = (HttpURLConnection) url.openConnection();
System.out.println(urlCon.getInputStream());

BufferedReader br = new BufferedReader(new InputStreamReader(urlCon.getInputStream()));
String temp = null;
while ((temp = br.readLine()) != null)
{
System.out.println(temp);
}
}
catch(Exception e) {e.printStackTrace();}
}

}

