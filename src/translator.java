import java.util.HashMap;

public class translator {
    HashMap< Integer, String> numericAlpha = new HashMap<>();
    public translator (String[] alphabetic, Integer[] numeric){
        for (int i = 0; i < numeric.length; i++) {
            numericAlpha.put(numeric[i], alphabetic[i]);

        }
    }

    public String translate (Integer number) {
        numericAlpha.get(number);
        String value = numericAlpha.get(number);
        return value;
    }

}
