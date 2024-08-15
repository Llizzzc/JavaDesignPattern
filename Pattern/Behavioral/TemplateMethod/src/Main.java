/**
 * 模板方法
 * 定义：定义了一个算法骨架，并允许子类为一个或多个步骤提供实现，模板
 *      方法使得子类可以在不改变算法结构的情况下，重新定义算法的某些
 *      步骤
 *
 * 场景：1.一次性实现一个算法的不变的部分，并将可变的行为留给子类来实现
 *      2.各子类中公共的行为被提取出来并集中到一个公共父类中，从而避免代码重复
 *
 * 优点：1.提高复用性
 *      2.提高扩展性
 *      3.符合开闭原则
 *
 * 缺点：1.类数目增加
 *      2.增加了系统实现的复杂度
 *      3.继承关系自身缺点
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("后端设计模式课程start---");
        ACourse designPatternCourse = new DesignPatternCourse();
        designPatternCourse.makeCourse();
        System.out.println("后端设计模式课程end---");

        System.out.println("前端课程start---");
        ACourse feCourse = new FECourse(true);
        feCourse.makeCourse();
        System.out.println("前端课程end---");
    }
}