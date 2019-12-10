package models;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RestaurationDataFactory {
    private String nameCity;
    private String nameStreet;
    private String phoneNumbers;
    private String descRestaurantPl;
    private String descRestaurantEn;
    private String billingRestaurationName;
    private String billingRestaurationAddress;
    private String billingNIP;

    public RestaurationDataFactory(String nameCity, String nameStreet, String phoneNumbers, String descRestaurantPl, String descRestaurantEn,  String billingRestaurationName, String billingRestaurationAddress, String billingNIP) {
        this.nameCity = nameCity;
        this.nameStreet = nameStreet;
        this.phoneNumbers = phoneNumbers;
        this.descRestaurantPl = descRestaurantPl;
        this.descRestaurantEn = descRestaurantEn;
        this.billingRestaurationName = billingRestaurationName;
        this.billingRestaurationAddress = billingRestaurationAddress;
        this.billingNIP = billingNIP;
    }

}
