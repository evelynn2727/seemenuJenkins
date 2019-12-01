package models;

public class WaitersFactory {
    private String polishNameWaiter;
    private String englishNameWaiter;
    private String polishDescriptionWaiter;
    private String englishDescriptionWaiter;
    private String photoWaiter1;
    private String photoWaiter2;
    private String photoWaiter3;

    public WaitersFactory(String polishNameWaiter, String englishNameWaiter, String polishDescriptionWaiter, String englishDescriptionWaiter, String photoWaiter1, String photoWaiter2, String photoWaiter3) {
        this.polishNameWaiter = polishNameWaiter;
        this.englishNameWaiter = englishNameWaiter;
        this.polishDescriptionWaiter = polishDescriptionWaiter;
        this.englishDescriptionWaiter = englishDescriptionWaiter;
        this.photoWaiter1 = photoWaiter1;
        this.photoWaiter2 = photoWaiter2;
        this.photoWaiter3 = photoWaiter3;
    }

    public String getPolishNameWaiter() {
        return polishNameWaiter;
    }

    public void setPolishNameWaiter(String polishNameWaiter) {
        this.polishNameWaiter = polishNameWaiter;
    }

    public String getEnglishNameWaiter() {
        return englishNameWaiter;
    }

    public void setEnglishNameWaiter(String englishNameWaiter) {
        this.englishNameWaiter = englishNameWaiter;
    }

    public String getPolishDescriptionWaiter() {
        return polishDescriptionWaiter;
    }

    public void setPolishDescriptionWaiter(String polishDescriptionWaiter) {
        this.polishDescriptionWaiter = polishDescriptionWaiter;
    }

    public String getEnglishDescriptionWaiter() {
        return englishDescriptionWaiter;
    }

    public void setEnglishDescriptionWaiter(String englishDescriptionWaiter) {
        this.englishDescriptionWaiter = englishDescriptionWaiter;
    }

    public String getPhotoWaiter1() {
        return photoWaiter1;
    }

    public void setPhotoWaiter1(String photoWaiter1) {
        this.photoWaiter1 = photoWaiter1;
    }

    public String getPhotoWaiter2() {
        return photoWaiter2;
    }

    public void setPhotoWaiter2(String photoWaiter2) {
        this.photoWaiter2 = photoWaiter2;
    }

    public String getPhotoWaiter3() {
        return photoWaiter3;
    }

    public void setPhotoWaiter3(String photoWaiter3) {
        this.photoWaiter3 = photoWaiter3;
    }
}
