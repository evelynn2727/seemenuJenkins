package models;

public class RestaurationDataFactory {
    private String nameCity;
    private String nameStreet;
    private String phoneNumbers;
    private String logoRestaurant;
    private String descRestaurantPl;
    private String descRestaurantEn;
    private String promoRestaurant1;
    private String promoRestaurant2;
    private String promoRestaurant3;
    private String saveRestaurantButton;
    private String billingRestaurationName;
    private String billingRestaurationAddress;
    private String billingNIP;

    public RestaurationDataFactory(String nameCity, String nameStreet, String phoneNumbers, String logoRestaurant, String descRestaurantPl, String descRestaurantEn, String promoRestaurant1, String promoRestaurant2, String promoRestaurant3, String saveRestaurantButton, String billingRestaurationName, String billingRestaurationAddress, String billingNIP) {
        this.nameCity = nameCity;
        this.nameStreet = nameStreet;
        this.phoneNumbers = phoneNumbers;
        this.logoRestaurant = logoRestaurant;
        this.descRestaurantPl = descRestaurantPl;
        this.descRestaurantEn = descRestaurantEn;
        this.promoRestaurant1 = promoRestaurant1;
        this.promoRestaurant2 = promoRestaurant2;
        this.promoRestaurant3 = promoRestaurant3;
        this.saveRestaurantButton = saveRestaurantButton;
        this.billingRestaurationName = billingRestaurationName;
        this.billingRestaurationAddress = billingRestaurationAddress;
        this.billingNIP = billingNIP;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    public String getNameStreet() {
        return nameStreet;
    }

    public void setNameStreet(String nameStreet) {
        this.nameStreet = nameStreet;
    }

    public String getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public String getLogoRestaurant() {
        return logoRestaurant;
    }

    public void setLogoRestaurant(String logoRestaurant) {
        this.logoRestaurant = logoRestaurant;
    }

    public String getDescRestaurantPl() {
        return descRestaurantPl;
    }

    public void setDescRestaurantPl(String descRestaurantPl) {
        this.descRestaurantPl = descRestaurantPl;
    }

    public String getDescRestaurantEn() {
        return descRestaurantEn;
    }

    public void setDescRestaurantEn(String descRestaurantEn) {
        this.descRestaurantEn = descRestaurantEn;
    }

    public String getPromoRestaurant1() {
        return promoRestaurant1;
    }

    public void setPromoRestaurant1(String promoRestaurant1) {
        this.promoRestaurant1 = promoRestaurant1;
    }

    public String getPromoRestaurant2() {
        return promoRestaurant2;
    }

    public void setPromoRestaurant2(String promoRestaurant2) {
        this.promoRestaurant2 = promoRestaurant2;
    }

    public String getPromoRestaurant3() {
        return promoRestaurant3;
    }

    public void setPromoRestaurant3(String promoRestaurant3) {
        this.promoRestaurant3 = promoRestaurant3;
    }

    public String getSaveRestaurantButton() {
        return saveRestaurantButton;
    }

    public void setSaveRestaurantButton(String saveRestaurantButton) {
        this.saveRestaurantButton = saveRestaurantButton;
    }

    public String getBillingRestaurationName() {
        return billingRestaurationName;
    }

    public void setBillingRestaurationName(String billingRestaurationName) {
        this.billingRestaurationName = billingRestaurationName;
    }

    public String getBillingRestaurationAddress() {
        return billingRestaurationAddress;
    }

    public void setBillingRestaurationAddress(String billingRestaurationAddress) {
        this.billingRestaurationAddress = billingRestaurationAddress;
    }

    public String getBillingNIP() {
        return billingNIP;
    }

    public void setBillingNIP(String billingNIP) {
        this.billingNIP = billingNIP;
    }
}
