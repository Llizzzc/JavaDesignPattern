public class T implements Runnable {
    @Override
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
        StaticInnerClassSingleton staticInnerClassSingleton = StaticInnerClassSingleton.getInstance();;
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        ContainerSingleton.putInstance("object", new Object());
        Object instance = ContainerSingleton.getInstance("object");
        ThreadLocalInstance threadLocalInstance = ThreadLocalInstance.getInstance();
        System.out.println(Thread.currentThread().getName() + "  " + threadLocalInstance);
    }
}