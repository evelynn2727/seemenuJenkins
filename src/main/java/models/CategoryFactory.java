package models;

public class CategoryFactory {
    private String polishNameCategory;
    private String englishNameCategory;

    public CategoryFactory(String polishNameCategory, String englishNameCategory) {
        this.polishNameCategory = polishNameCategory;
        this.englishNameCategory = englishNameCategory;
    }

    public String getPolishNameCategory() {
        return polishNameCategory;
    }

    public void setPolishNameCategory(String polishNameCategory) {
        this.polishNameCategory = polishNameCategory;
    }

    public String getEnglishNameCategory() {
        return englishNameCategory;
    }

    public void setEnglishNameCategory(String englishNameCategory) {
        this.englishNameCategory = englishNameCategory;
    }
}
