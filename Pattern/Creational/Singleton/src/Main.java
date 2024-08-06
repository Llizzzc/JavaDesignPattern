/**
 * 单例模式
 * 定义：保证一个类仅有一个实例，并提供一个全局访问点
 * 场景：想确保任何情况下都绝对只有一个实例
 * 优点：1.在内存里只有一个实例，减少了内存开销
 *      2.可以避免对资源的多重占用
 *      3.设置全局访问点，严格控制访问
 *
 * 缺点：1.没有接口，扩展困难
 */
public class Main {
    public static void main(String[] args) {
        ThreadLocalInstance threadLocalInstance = ThreadLocalInstance.getInstance();
        ThreadLocalInstance threadLocalInstance2 = ThreadLocalInstance.getInstance();
        ThreadLocalInstance threadLocalInstance3 = ThreadLocalInstance.getInstance();
        ThreadLocalInstance threadLocalInstance4 = ThreadLocalInstance.getInstance();
        System.out.println(threadLocalInstance);
        System.out.println(threadLocalInstance2);
        System.out.println(threadLocalInstance3);
        System.out.println(threadLocalInstance4);

        Thread th1 = new Thread(new T());
        Thread th2 = new Thread(new T());
        System.out.println("program start...");
        th1.start();
        th2.start();
        System.out.println("program end...");
    }
}