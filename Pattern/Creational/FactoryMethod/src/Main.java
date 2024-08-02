/**
 * 工厂方法
 * 定义：通过定义一个创建对象的接口，但让实现这个接口的类来决定
 *      实例化哪个类，工厂方法让类的实例化推迟到子类中进行
 *
 * 场景：1.创建对象需要大量重复代码
 *      2.应用层不依赖与产品类实例如何被创建、实现等细节
 *      3.一个类通过其子类来指定创建哪个对象
 *
 * 优点：1.用户只需要关心所需产品对应的工厂，而不用关心细节
 *      2.加入新产品符合开闭原则，提高可拓展性
 *
 * 缺点：1.类的个数容易过多，增加复杂度
 *      2.增加了系统的抽象性和理解难度
 */
public class Main {
    public static void main(String[] args) {
        VideoFactory videoFactory = new PythonVideoFactory();
        VideoFactory videoFactory2 = new JavaVideoFactory();
        VideoFactory videoFactory3 = new FEVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}