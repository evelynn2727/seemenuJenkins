package configuration;

import java.io.*;
import java.util.Properties;

public class ConfigController {

    public static String readUserId(){
        try (InputStream input = new FileInputStream("C:\\Users\\eweli\\OneDrive\\Dokumenty\\seemenu\\src\\main\\java\\configuration\\users.properties")) {

            Properties properties = new Properties();
            properties.load(input);

            return properties.getProperty("userId");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static void updateUserId(){
        String value =null;

        try (InputStream input = new FileInputStream("C:\\Users\\eweli\\OneDrive\\Dokumenty\\seemenu\\src\\main\\java\\configuration\\users.properties")) {

            Properties properties = new Properties();
            properties.load(input);

            value = properties.getProperty("userId");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try (OutputStream output = new FileOutputStream("C:\\Users\\eweli\\OneDrive\\Dokumenty\\seemenu\\src\\main\\java\\configuration\\users.properties")) {

            Properties prop = new Properties();

            int result = Integer.parseInt(value);
            result++;


            prop.setProperty("userId", Integer.toString(result));

            prop.store(output, null);

        } catch (IOException io) {
            io.printStackTrace();
        }
    }


    public static String readNameCategory(String key){
        try (InputStream input = new FileInputStream("C:\\Users\\eweli\\OneDrive\\Dokumenty\\seemenu\\src\\main\\java\\configuration\\category.properties")) {

            Properties properties = new Properties();
            properties.load(input);

            return properties.getProperty(key);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return null;
    }


    public static void updateCategoryId() {
        String value =null;

        try (InputStream input = new FileInputStream("C:\\Users\\eweli\\OneDrive\\Dokumenty\\seemenu\\src\\main\\java\\configuration\\category.properties")) {

            Properties properties = new Properties();
            properties.load(input);

            value = properties.getProperty("category");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try (OutputStream output = new FileOutputStream("C:\\Users\\eweli\\OneDrive\\Dokumenty\\seemenu\\src\\main\\java\\configuration\\category.properties")) {

            Properties prop = new Properties();

            int result = Integer.parseInt(value);
            result++;

            prop.setProperty("category", Integer.toString(result));

            prop.store(output, null);

        } catch (IOException io) {
            io.printStackTrace();
        }
    }


    public static String readDishId(){
        try (InputStream input = new FileInputStream("C:\\Users\\eweli\\OneDrive\\Dokumenty\\seemenu\\src\\main\\java\\configuration\\dish.properties")) {

            Properties properties = new Properties();
            properties.load(input);

            return properties.getProperty("dish");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static void updateDishId() {
        String value =null;

        try (InputStream input = new FileInputStream("C:\\Users\\eweli\\OneDrive\\Dokumenty\\seemenu\\src\\main\\java\\configuration\\dish.properties")) {

            Properties properties = new Properties();
            properties.load(input);

            value = properties.getProperty("dish");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try (OutputStream output = new FileOutputStream("C:\\Users\\eweli\\OneDrive\\Dokumenty\\seemenu\\src\\main\\java\\configuration\\dish.properties")) {

            Properties prop = new Properties();

            int result = Integer.parseInt(value);
            result++;


            prop.setProperty("dish", Integer.toString(result));

            prop.store(output, null);

        } catch (IOException io) {
            io.printStackTrace();
        }
    }


    public static String readWaiterId(){
        try (InputStream input = new FileInputStream("C:\\Users\\eweli\\OneDrive\\Dokumenty\\seemenu\\src\\main\\java\\configuration\\waiters.properties")) {

            Properties properties = new Properties();
            properties.load(input);

            return properties.getProperty("waiterId");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static void updateWaiterId() {
        String value =null;

        try (InputStream input = new FileInputStream("C:\\Users\\eweli\\OneDrive\\Dokumenty\\seemenu\\src\\main\\java\\configuration\\waiters.properties")) {

            Properties properties = new Properties();
            properties.load(input);

            value = properties.getProperty("waiterId");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try (OutputStream output = new FileOutputStream("C:\\Users\\eweli\\OneDrive\\Dokumenty\\seemenu\\src\\main\\java\\configuration\\waiters.properties")) {

            Properties prop = new Properties();

            int result = Integer.parseInt(value);
            result++;


            prop.setProperty("waiterId", Integer.toString(result));

            prop.store(output, null);

        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
