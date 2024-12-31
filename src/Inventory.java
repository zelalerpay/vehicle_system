import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventory {

    List<Vehicle> vehicles = new ArrayList<>();
    HashMap<String, Integer> vehicleCounts = new HashMap<>();

    public void add(Vehicle v) {
        vehicleCounts.put(v.getName(), vehicleCounts.getOrDefault(v.getName(), 0) + 1);
        vehicles.add(v);
        //listeye eklerken direkt tipini sayısıını hashmapte artırmak için
    }

    public String getVehicleCounts() {
        String result = ""; //araç sayılarını ve adlarını içeren metin
        int i = 0;
        for (String key : vehicleCounts.keySet()) {
            result += vehicleCounts.get(key) + " " + key + (vehicleCounts.get(key) > 1 ? "s" : "");
            if (i < vehicleCounts.size() - 2) {
                result += ", ";
            } else if (i == vehicleCounts.size() - 2) {
                result += " and ";
            }
            i++;
        }
        return result;
    }


    @Override
    public String toString() {
        String result = "";
        for (Vehicle v : vehicles) {
            result += v.toString() + v.getOptionalFeatures() + " having a total price of " + v.calculateOverallPrice() + " TL\n";
        }
        result += "TOTAL : " + vehicles.size() + " Vehicles including " + getVehicleCounts() + " having a total price of " + getTotalPrice() + " TL";
        return result;
    }

    public int getTotalPrice() {
        int totalPrice = 0;
        for(Vehicle v : vehicles) {
            totalPrice += v.calculateOverallPrice();
        }
        return totalPrice;
    }


}
