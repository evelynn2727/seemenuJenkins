package models;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
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
}
