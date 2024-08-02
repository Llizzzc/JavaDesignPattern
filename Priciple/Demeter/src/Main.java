/**
 * 迪米特
 * 定义：一个对象应该对其他对象保持最少的了解，尽量降低类与类之间的耦合
 *
 * 要求：强调只和朋友交流，不和陌生人说话，出现在成员变量、方法的输入、
 *      输出参数中的类称为成员朋友类，而在方法体内部的类不属于朋友
 *
 * 优点：降低类之间的耦合
 */
public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}