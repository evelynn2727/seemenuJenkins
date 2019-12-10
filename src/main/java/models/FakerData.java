package models;

import com.github.javafaker.Faker;
import configuration.ConfigController;

public class FakerData {
    public static Faker faker = new Faker();

    public static String email = "epalka+"+ ConfigController.readUserId()+"@milosolutions.com";
    public static String password = "milo1024";
    public static String restaurationName = "MiloS"+ConfigController.readUserId();

    public static String city = faker.address().city();
    public static String street = faker.address().streetName();
    public static String phoneNumber = faker.numerify("#########");

    public static String plRestaurantDescription = faker.lorem().words(30).toString();
    public static String enRestaurantDescription = faker.lorem().words(30).toString();

    public static String address = faker.address().fullAddress();
    public static String nip = faker.numerify("######");

    public static String plCategoryName = "Category"+ ConfigController.readNameCategory("category");
    public static String enCategoryName = "Category"+ ConfigController.readNameCategory("category");

    public static String plDishName = "Danie"+ ConfigController.readDishId();
    public static String enDishName = "Dish"+ConfigController.readDishId();

    public static String plDishDescription = faker.lorem().words(10).toString();
    public static String enDishDescription = faker.lorem().words(10).toString();

    public static String plWaiterName = "Waiter"+ ConfigController.readWaiterId();
    public static String enWaiterName = "Waiter" +ConfigController.readWaiterId();

    public static String plWaiterDescription = faker.lorem().words(10).toString();
    public static String enWaiterDescription= faker.lorem().words(10).toString();
}
