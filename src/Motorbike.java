public class Motorbike extends Vehicle {

    public Motorbike(int basePrice) {
        super(basePrice);
        optionalFeatures.put("ABS", new Object[]{false, 5000});
        optionalFeatures.put("Seat Heating", new Object[]{false, 2000});

    }

    public void setAbs(boolean hasABS) {
        optionalFeatures.get("ABS")[0] = hasABS;
    }

    public void setSeatHeating(boolean hasSeatHeating) {
        optionalFeatures.get("Seat Heating")[0] = hasSeatHeating;
    }

}
