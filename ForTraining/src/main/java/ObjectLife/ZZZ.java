package ObjectLife;

import java.util.HashMap;

public class ZZZ {
    public ZZZ(HashMap<String, String> zzz){
        zzz.put(Z1(), Z2());
    }

    private String z1 = "Z";
    private String z2 = z1;

    private String Z1(){
        return String.format("%s%d", z1, 1);
    }

    private String Z2(){
        return String.format("%s%d", z2, 2);
    }
}
