/**
 * 中介者
 * 定义：1.定义一个封装一组对象如何交互的对象，通过使对象明确地相互引用
 *      来促进松散耦合，并允许独立地改变它们的交互
 *
 * 场景：1.系统中对象之间存在复杂的引用关系，产生的相互依赖关系结构混乱
 *      2.交互的公共行为，如果需要改变行为则可以增加新的中介者类
 *
 * 优点：1.将一对多转化成了一对一
 *      2.类之间解耦
 *
 * 缺点：1.中介者过多，系统变复杂
 */
public class Main {
    public static void main(String[] args) {
        User dell = new User("Dell");
        User tom= new User("Tom");

        dell.sendMessage("Hey! Tom! Let's learn Design Pattern");
        tom.sendMessage("OK! Dell");
    }
}