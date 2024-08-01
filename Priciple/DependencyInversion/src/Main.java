/**
 * 依赖倒置
 * 定义：高层模块不应该依赖低层模块，二者都应该依赖其抽象
 * 抽象不应该依赖细节，细节应该依赖抽象
 * 针对接口编程，不要针对实现编程
 * 优点：可以减少类间的耦合性、提高系统稳定性和可读性，降低修改程序所造成的风险
 */
public class Main {

    public static void main(String[] args) {
        Bob bob = new Bob();
        bob.studyCourse(new JavaCourse());
        bob.studyCourse(new PythonCourse());

        Bob bob2 = new Bob(new JavaCourse());
        bob2.studyCourse();

        Bob bob3 = new Bob();
        bob3.setCourse(new JavaCourse());
        bob3.studyCourse();
        bob3.setCourse(new PythonCourse());
        bob3.studyCourse();
    }
}