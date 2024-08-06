import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class LazyDoubleCheckSingleton implements Serializable {
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton() {
        //  无法避免反射攻击
        if (lazyDoubleCheckSingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    //  2、3可能发生重排序，需要加上volatile来保证内存一致性
                    //  1.分配内存给这个对象
                    //  2.初始化对象
                    //  3.设置lazyDoubleCheckSingleton 指向刚分配的内存地址
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }

    private Object readResolve() {
        return lazyDoubleCheckSingleton;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 序列化网络传输
//        LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(lazyDoubleCheckSingleton);
//
//        File file = new File("singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//        LazyDoubleCheckSingleton newInstance = (LazyDoubleCheckSingleton) ois.readObject();
//
//        System.out.println(lazyDoubleCheckSingleton);
//        System.out.println(newInstance);
//        System.out.println(lazyDoubleCheckSingleton == newInstance);

        // 反射创建
        Class objectClass = LazyDoubleCheckSingleton.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        LazyDoubleCheckSingleton newInstance2 = (LazyDoubleCheckSingleton) constructor.newInstance();
        LazyDoubleCheckSingleton lazyDoubleCheckSingleton2 = LazyDoubleCheckSingleton.getInstance();

        System.out.println(newInstance2);
        System.out.println(lazyDoubleCheckSingleton2);
        System.out.println(lazyDoubleCheckSingleton2 == newInstance2);
    }
}