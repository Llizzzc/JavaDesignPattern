import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class LazySingleton implements Serializable {
    private static LazySingleton lazySingleton = null;

    private LazySingleton() {
        //  无法避免反射攻击
        if (lazySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    private Object readResolve() {
        return lazySingleton;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 序列化网络传输
        LazySingleton lazySingleton = LazySingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(lazySingleton);

        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        LazySingleton newInstance = (LazySingleton) ois.readObject();

        System.out.println(lazySingleton);
        System.out.println(newInstance);
        System.out.println(lazySingleton == newInstance);

        // 反射创建
        Class objectClass = LazySingleton.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        LazySingleton newInstance2 = (LazySingleton) constructor.newInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();

        System.out.println(newInstance2);
        System.out.println(lazySingleton2);
        System.out.println(lazySingleton2 == newInstance2);
    }
}