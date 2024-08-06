import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class StaticInnerClassSingleton implements Serializable {
    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }

    private StaticInnerClassSingleton() {
        if (InnerClass.staticInnerClassSingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    private Object readResolve() {
        return InnerClass.staticInnerClassSingleton;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 序列化网络传输
        StaticInnerClassSingleton staticInnerClassSingleton = StaticInnerClassSingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(staticInnerClassSingleton);

        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        StaticInnerClassSingleton newInstance = (StaticInnerClassSingleton) ois.readObject();

        System.out.println(staticInnerClassSingleton);
        System.out.println(newInstance);
        System.out.println(staticInnerClassSingleton == newInstance);

        // 反射创建
//        Class objectClass = StaticInnerClassSingleton.class;
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        StaticInnerClassSingleton newInstance2 = (StaticInnerClassSingleton) constructor.newInstance();
//        StaticInnerClassSingleton staticInnerClassSingleton2 = StaticInnerClassSingleton.getInstance();
//
//        System.out.println(newInstance2);
//        System.out.println(staticInnerClassSingleton2);
//        System.out.println(staticInnerClassSingleton2 == newInstance2);
    }
}