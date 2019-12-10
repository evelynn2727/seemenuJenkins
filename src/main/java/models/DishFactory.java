package models;

public class DishFactory {
    private String polishDishName;
    private String englishDishName;
    private String polishDescription;
    private String englishDescription;
    private String photoDish1;
    private String photoDish2;
    private String photoDish3;

    public DishFactory(String polishDishName, String englishDishName, String polishDescription, String englishDescription) {
        this.polishDishName = polishDishName;
        this.englishDishName = englishDishName;
        this.polishDescription = polishDescription;
        this.englishDescription = englishDescription;

    }

    public String getPolishDishName() {
        return polishDishName;
    }

    public void setPolishDishName(String polishDishName) {
        this.polishDishName = polishDishName;
    }

    public String getEnglishDishName() {
        return englishDishName;
    }

    public void setEnglishDishName(String englishDishName) {
        this.englishDishName = englishDishName;
    }

    public String getPolishDescription() {
        return polishDescription;
    }

    public void setPolishDescription(String polishDescription) {
        this.polishDescription = polishDescription;
    }

    public String getEnglishDescription() {
        return englishDescription;
    }

    public void setEnglishDescription(String englishDescription) {
        this.englishDescription = englishDescription;
    }


    public String getPhotoDish1() {
        return photoDish1;
    }

    public void setPhotoDish1(String photoDish1) {
        this.photoDish1 = photoDish1;
    }

    public String getPhotoDish2() {
        return photoDish2;
    }

    public void setPhotoDish2(String photoDish2) {
        this.photoDish2 = photoDish2;
    }

    public String getPhotoDish3() {
        return photoDish3;
    }

    public void setPhotoDish3(String photoDish3) {
        this.photoDish3 = photoDish3;
    }

}
