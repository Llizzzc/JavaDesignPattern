/**
 * 代理
 * 定义：为其他对象提供一种代理，以控制对这个对象的访问，代理对象在客户端和目标对象之间起到中介的作用
 *
 * 场景：1.保护目标对象
 *      2.增强目标对象
 *
 * 优点：1.代理模式能将代理对象与真实被调用的目标对象分离
 *      2.一定程度上降低了系统的耦合度，扩展性好
 *      3.保护目标对象
 *      4.增强目标对象
 *
 * 缺点：1.代理模式会造成系统设计中类的数目增加
 *      2.在客户端和目标对象增加一个代理对象，会造成请求处理速度变慢
 *      3.增加系统的复杂度
 */
public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);
        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
        System.out.println();

        Order order2 = new Order();
        order2.setUserId(1);
        IOrderService orderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        orderServiceDynamicProxy.saveOrder(order2);
    }
}