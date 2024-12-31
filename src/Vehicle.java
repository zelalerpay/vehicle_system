import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Vehicle {
    int basePrice;
    HashMap<String, Object[]> optionalFeatures = new HashMap<>();
    //bu satırda özellikleri tutan hashmap nesnesi oluşturdum...
    public Vehicle(int basePrice) {
        this.basePrice = basePrice;
    }
    //vehicle sınıfının kurucu const.

    public List<String> getIncludedFeatures() {
        List<String> includedFeatures = new ArrayList<>();
        //burda oluşturduğum ArrayList 'de aşağıdan true gelenleri tutacağım

        for (String key : optionalFeatures.keySet()) {
            boolean isTrue = (boolean) optionalFeatures.get(key)[0];
            //optionalFeatures.get(key) ifadesi, optionalFeatures'ın key anahtarına karşılık gelen değeri döndürür.
            if (isTrue) {
                includedFeatures.add(key);
            }
        }

        return includedFeatures;
    }

    public String getOptionalFeatures() {
        List<String> includedFeatures = getIncludedFeatures();

        if (includedFeatures.size() > 0) {
            String result = " with ";

            for (int i = 0; i < includedFeatures.size(); i++) {
                result += includedFeatures.get(i);
                if (i < includedFeatures.size() - 1) {
                    result += ", ";
                }
            }

            return result + " optional";
        }

        return "";
    }

    public int calculateOverallPrice() {
        List<String> includedFeatures = getIncludedFeatures();

        int overallPrice = basePrice;
        for (int i = 0; i < includedFeatures.size(); i++) {
            overallPrice += (int) optionalFeatures.get(includedFeatures.get(i))[1];
        }

        return overallPrice;
    }

    public String getName() {
        return this.getClass().getSuperclass().getSimpleName();
    }

}
