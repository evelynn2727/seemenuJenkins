package models;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor(access= AccessLevel.PUBLIC)
public class CategoryFactory {
    private String polishNameCategory;
    private String englishNameCategory;
}
