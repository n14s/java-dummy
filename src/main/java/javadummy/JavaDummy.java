package javadummy;

import org.eclipse.basyx.components.configuration.BaSyxConfiguration;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

import java.io.*;
import java.util.HashMap;
import java.util.stream.Collectors;

public class JavaDummy {
    public static void main(String[] args) {
        JavaDummy javaDummy = new JavaDummy();

        javaDummy.test4();

    }

    void test1() {
        String text = "shmoo";
        try {
            Object obj = new JSONParser().parse(new FileReader("config.properties"));
            JSONObject jo = (JSONObject) obj;
            text = (String) jo.get("foo");
        } catch (Exception e) {
            System.out.println(e);
        }

        while (true) {

            System.out.println("test1: " + text);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    void test2() {
        String text = "shmoo";

        ClassLoader loader = JavaDummy.class.getClassLoader();
        InputStream stream = loader.getResourceAsStream("config.properties");
        InputStreamReader reader = null;
        try {
            text = new BufferedReader(new InputStreamReader(stream, "UTF-8"))
                    .lines()
                    .collect(Collectors.joining("\n"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        while (true) {

            System.out.println("text2: " + text);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    void test3(){
        HashMap<String, String> defaultValues = new HashMap<String, String>();
        BaSyxConfiguration config = new BaSyxConfiguration(defaultValues);

        while(true) {
            config.loadFromFile("config.properties");
            String value = config.getProperty("foo");
            System.out.println(value);
            try {
                Thread.sleep(3000);
            } catch (Exception e){
                System.out.println(e);
            }
        }



    }
    void test4() {
        String text = "shmoo";

        InputStream stream = null;
        try {
            stream = new FileInputStream("config.properties");
        } catch (Exception e){
            System.out.println(e);
        }
        InputStreamReader reader = null;
        try {
            text = new BufferedReader(new InputStreamReader(stream, "UTF-8"))
                    .lines()
                    .collect(Collectors.joining("\n"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        while (true) {

            System.out.println("text2: " + text);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}