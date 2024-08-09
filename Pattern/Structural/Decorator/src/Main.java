import v2.ABatterCake;
import v2.BatterCake;
import v2.EggDecorator;
import v2.SausageDecorator;

/**
 * 装饰者
 * 定义：在不改变原有对象的基础之上，将功能附加到对象上，提供
 *      了比继承更有弹性的替代方案（扩展原有对象功能）
 *
 * 场景：1.扩展一个类的功能或给一个类添加附加职责
 *      2.动态的给一个对象添加功能，这些功能可以再动态的撤销
 *
 *  优点：1.继承的有利补充，比继承灵活，不改变原有对象的情况下给一个对象扩展功能
 *       2.通过使用不同装饰类以及这些装饰类的排列组合，可以实现不同效果
 *       3.符合开闭原则
 *
 *  缺点：1.会出现更多的代码，更多的类，增加程序复杂性
 *       2.动态装饰时，多层装饰时会更加复杂
 */
public class Main {
    public static void main(String[] args) {
        ABatterCake aBattercake;
        aBattercake = new BatterCake();
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);
        System.out.println(aBattercake.getDesc() + "销售价格: " + aBattercake.cost());
    }
}