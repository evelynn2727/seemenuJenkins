package models;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class WaitersFactory {
    private String polishNameWaiter;
    private String englishNameWaiter;
    private String polishDescriptionWaiter;
    private String englishDescriptionWaiter;
    private String photoWaiter1;
    private String photoWaiter2;
    private String photoWaiter3;

    public WaitersFactory(String polishNameWaiter, String englishNameWaiter, String polishDescriptionWaiter, String englishDescriptionWaiter) {
        this.polishNameWaiter = polishNameWaiter;
        this.englishNameWaiter = englishNameWaiter;
        this.polishDescriptionWaiter = polishDescriptionWaiter;
        this.englishDescriptionWaiter = englishDescriptionWaiter;
    }
}
