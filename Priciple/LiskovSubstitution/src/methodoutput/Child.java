package methodoutput;

import java.util.HashMap;

public class Child extends Base {
    @Override
    public HashMap method() {
        HashMap hashMap = new HashMap();
        System.out.println("子类method被执行");
        hashMap.put("message", "子类method被执行");
        return hashMap;
    }
}