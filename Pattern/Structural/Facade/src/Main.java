/**
 * 外观模式
 * 定义：提供了一个统一的接口，用来访问子系统中的一群接口
 * 场景：1.子系统越来越复杂，增加外观模式提供简单的接口调用
 *      2.构建多层系统结构，利用外观对象作为每层的入口，简化层间调用
 *
 * 优点：1.简化了调用过程
 *      2.减少系统依赖、松散耦合
 *      3.更好的划分访问层次
 *      4.符合迪米特法则
 *
 * 缺点：1.增加子系统、扩展子系统行为容易引入风险
 *      2.不符合开闭原则
 */
public class Main {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T恤");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);
    }
}