/**
 * 开闭原则
 * 定义：一个软件实体如类、模块和函数应该对拓展开放，对修改关闭
 * 用抽象构建框架，用实现拓展细节
 * 优点：提高软件系统的可复用性及可维护性
 */
public class Main {

    public static void main(String[] args) {
        Course course = new JavaDiscountCourse(96, "Java从零到企业级电商开发", 348d);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) course;
        System.out.println("课程ID:" + javaCourse.getId() + " 课程名称:" + javaCourse.getName() + " 课程原价:" + javaCourse.getPrice() + " 课程折后价格:" + javaCourse.getDiscountPrice() + "元");
    }
}