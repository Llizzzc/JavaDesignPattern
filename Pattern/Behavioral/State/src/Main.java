/**
 * 状态
 * 定义：允许一个对象在内部状态改变时，改变他的行为
 *
 * 场景：1.一个对象存在多个状态，且状态可相互转换
 *
 * 优点：1.将不同的状态隔离
 *      2.把各种状态的转换逻辑，分布到State子类中，减少相互依赖
 *      3.增加新的状态简单
 *
 * 缺点：1.状态多的业务场景导致类数目增加
 */
public class Main {
    public static void main(String[] args) {
        CourseVideoContext courseVideoContext = new CourseVideoContext();
        courseVideoContext.setCourseVideoState(new PlayState());

        System.out.println("当前状态: " + courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        courseVideoContext.pause();

        System.out.println("当前状态: " + courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        courseVideoContext.speed();

        System.out.println("当前状态: " + courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        courseVideoContext.stop();

        System.out.println("当前状态: " + courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        courseVideoContext.speed();
    }
}