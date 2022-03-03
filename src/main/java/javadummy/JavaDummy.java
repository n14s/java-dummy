package javadummy;

import org.json.simple.JSONObject;
import org.json.simple.parser.*;

import java.io.FileReader;

public class JavaDummy {
    public static void main(String[] args) {
        while (true) {
            try {
                Object obj = new JSONParser().parse(new FileReader("config.json"));
                JSONObject jo = (JSONObject) obj;
                String dings = (String) jo.get("foo");
                System.out.println(dings);
            } catch (Exception e) {
                System.out.println(e);
            }
            try {
                Thread.sleep(5000);
            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}
