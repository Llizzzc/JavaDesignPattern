/**
 * 里氏替换
 * 定义：如果对每一个类型为T1的对象o1，都有类型为T2的对象o2，使得
 *      以T1定义的所有程序P在所有的对象o1都替换成o2时，程序P的行
 *      为没有发生变化，那么T2是T1的子类型
 *
 * 拓展定义：一个软件实体如果适用一个父类的话，那一定适用于其子类，所有
 *         引用父类的地方必须能透明地使用其子类，子类对象能替换父类对
 *         象，而程序逻辑不变
 *
 * 引申意义：1.子类可以拓展父类的功能，但不能改变父类原有的功能
 *         2.子类可以实现父类的抽象方法，但不能覆盖父亲的非抽象方法
 *         3.子类中可以增加自己特有的方法
 *         4.当子类的方法重载父类的方法时，方法的前置条件（入参）要比父类更宽松
 *         5.当子类的方法实现父类的方法时，方法的后置条件（返回值）要比父类更严格或相等
 *
 * 优点：1.约束继承泛滥，开闭原则的一种体现
 *      2.加强健壮性与兼容性
 */
public class Main {
    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
            System.out.println("width: " + rectangle.getWidth() + " length: " + rectangle.getLength());
        }
        System.out.println("resize方法结束 width: "+rectangle.getWidth() + " length: "+rectangle.getLength());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(20);
        resize(rectangle);
    }
}