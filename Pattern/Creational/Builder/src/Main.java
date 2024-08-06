/**
 * 建造者模式
 * 定义：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 *      用户只需要指定需要建造的类型就可以得到，建造过程及细节不需要知道
 *
 * 场景：1.一个对象有非常复杂的内部结构（很多属性）
 *      2.想把复杂对象的创建和使用分离
 *
 * 优点：1.封装性好，创建和使用分离
 *      2.扩展性好、建造类之间相互独立
 *
 * 缺点：1.产生多余的Builder对象
 *      2.产品内部发生变化，建造者都需要修改
 */
public class Main {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course s = new Course();

        Course course = coach.makeCourse("Java设计模式精讲",
                "Java设计模式精讲PPT",
                "Java设计模式精讲视频",
                "Java设计模式精讲手记",
                "Java设计模式精讲问答");
        System.out.println(course);
    }
}