/**
 * 策略
 * 定义：定义了算法家族，分别封装起来，让它们之间可以互相替换，此
 *      模式让算法的变化不会影响到使用算法的用户
 *
 * 场景：1.系统有很多类，而它们的区别仅仅在于它们的行为不同
 *      2.一个系统需要动态地在几种算法中选择一种
 *
 * 优点：1.符合开闭原则
 *      2.避免使用多重条件转移语句
 *      3.提高算法的保密性和安全性
 *
 * 缺点：1.客户端必须知道所有的策略类，并自行决定使用哪个策略类
 *      2.产生很多策略类
 */
public class Main {
    public static void main(String[] args) {
        String promotionKey = "LIJIAN";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.executePromotionStrategy();
    }
}