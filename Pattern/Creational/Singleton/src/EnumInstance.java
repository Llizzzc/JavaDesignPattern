import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public enum EnumInstance {

    INSTANCE {
        protected void printTest() {
            System.out.println("dell Print Test");
        }
    };

    protected abstract void printTest();
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 序列化网络传输
        EnumInstance enumInstance = EnumInstance.getInstance();
        enumInstance.setData(new Object());

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(enumInstance);

        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        EnumInstance newInstance = (EnumInstance) ois.readObject();

        System.out.println(enumInstance);
        System.out.println(newInstance);
        System.out.println(enumInstance == newInstance);
        System.out.println(enumInstance.data == newInstance.data);

         // 反射创建
        Class objectClass = EnumInstance.class;
        Constructor constructor = objectClass.getDeclaredConstructor(String.class, int.class);
        constructor.setAccessible(true);
        EnumInstance newInstance2 = (EnumInstance) constructor.newInstance("dell", 666);
        EnumInstance enumInstance2 = EnumInstance.getInstance();

        System.out.println(newInstance2);
        System.out.println(enumInstance2);
        System.out.println(enumInstance2 == newInstance2);
    }
}