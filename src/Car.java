import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Car extends Vehicle {

    public Car(int basePrice) {
        super(basePrice);
        optionalFeatures.put("ABS", new Object[]{false, 5000});
        optionalFeatures.put("Music System", new Object[]{false, 1000});
        optionalFeatures.put("Air Bag", new Object[]{false, 3000});
        optionalFeatures.put("Sunroof", new Object[]{false, 2000});
        optionalFeatures.put("selfparking",new Object[]{false,7000});
    }



    //opsiyonel özelliklerin durumunu ayarlamak için
    public void setSunRoof(boolean hasSunroof) {
        optionalFeatures.get("Sunroof")[0] = hasSunroof;
    }

    public void setparking(boolean selfparking) {optionalFeatures.get("selfparking")[0]= selfparking;}

    public void setAirBag(boolean hasAirBag) {
        optionalFeatures.get("Air Bag")[0] = hasAirBag;
    }

    public void setAbs(boolean hasABS) {
        optionalFeatures.get("ABS")[0] = hasABS;
    }

    public void setMusicSystem(boolean hasMusicSystem) {
        optionalFeatures.get("Music System")[0] = hasMusicSystem;
    }

}
