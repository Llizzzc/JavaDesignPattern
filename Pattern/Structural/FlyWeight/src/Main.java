/**
 * 享元
 * 定义：提供了减少对象数量从而改善应用所需的对象结构的
 *      方式，运用共享技术有效地支持大量细粒度的对象
 *
 * 场景：1.常常应用于系统底层的开发，以便解决系统的性能问题
 *      2.系统有大量相似对象、需要缓冲池的场景
 *
 * 优点：1.减少对象的创建，降低内存中对象的数量，降低系统的内存
 *      2.减少内存之外的其他资源占用
 *
 * 缺点：1.关注内/外部状态、关注线程安全问题
 *      2.使系统、程序的逻辑复杂化
 */
public class Main {

    private static final String[] departments = {"RD", "QA", "PM", "BD"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i ++) {
            String department = departments[(int)(Math.random() * departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }
    }
}