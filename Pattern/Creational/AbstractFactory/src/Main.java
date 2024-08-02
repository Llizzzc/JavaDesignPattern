/**
 * 抽象工厂
 * 定义：抽象工厂模式提供一个创建一系列相关或相互依赖
 *      对象的接口，无须指定它们具体的类
 *
 *  场景：1.应用层不依赖于产品类实例创建细节
 *       2.强调一系列相关的产品对象一起使用创建对象需要大量重复代码
 *       3.提供一个产品类的库，所有产品以同样的接口出现
 *
 *  优点：1.具体产品在应用层代码隔离
 *       2.将一个系列的产品族统一到一起创建
 *
 *  缺点：1.规定了所有可能被创建的产品，拓展产品需要修改抽象工厂接口
 *       2.增加了系统抽象性与理解难度
 */
public class Main {
    public static void main(String[] args) {
        CourseFactory courseFactory = new PythonCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();
    }
}