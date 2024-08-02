/**
 * 简单工厂
 * 定义：由一个工厂对象决定创建出哪一种产品类的实例
 * 场景：1.工厂类负责创建的对象比较少
 *      2.应用层只知道传入工厂类的参数，不关心创建细节
 * 优点：只需要传入正确的参数而无需考虑细节
 * 缺点：工厂类的职责相对过重，增加新的产品需要修改工厂类，违背开闭原则
 */
public class Main {
    public static void main(String[] args) {
//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
//        if (video == null) {
//            return;
//        }
//        video.produce();

        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if (video == null) {
            return;
        }
        video.produce();
    }
}