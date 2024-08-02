package methodinput;

import java.util.Map;

public class Child extends Base {
    public void method(Map map) {
        System.out.println("子类HashMap入参方法被执行");
    }
}