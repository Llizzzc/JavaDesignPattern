import java.util.ArrayList;
import java.util.List;

/**
 * 访问者
 * 定义：封装作用于某数据结构中的各元素的操作，可以在不改变各元素
 *      的类的前提下，定义作用于这些元素的操作
 *
 * 场景：1.一个数据结构包含很多类型对象
 *      2.数据结构与数据操作分离
 *
 * 优点：1.增加新的操作很容易
 *
 * 缺点：1.增加新的数据结构困难
 *      2.具体元素变更困难
 */
public class Main {
    public static void main(String[] args) {
        List<Course> courseList = new ArrayList<>();

        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("SpringMVC数据绑定");

        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setName("Java设计模式精讲 -- By Dell");
        codingCourse.setPrice(299);

        courseList.add(freeCourse);
        courseList.add(codingCourse);

        for (Course course : courseList) {
            course.accept(new Visitor());
        }
    }
}