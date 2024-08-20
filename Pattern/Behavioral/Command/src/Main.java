/**
 * 命令
 * 定义：将请求封装成对象，以便使用的请求，命令模式解决了应用程序中对象
 *      的职责以及它们之间的通信方式
 *
 * 场景：1.请求调用者和接收者需要解耦
 *      2.需要抽象出等待执行的行为
 *
 * 优点：1.降低耦合
 *      2.容易扩展新命令
 *
 * 缺点：1.命令的无限扩展会增加类的数量，提高系统实现复杂度
 */
public class Main {
    public static void main(String[] args) {
        CourseVideo courseVideo = new CourseVideo("Java设计模式精讲 -- By Bob");
        OpenCourseVideoCommand openCourseVideoCommand = new OpenCourseVideoCommand(courseVideo);
        CloseCourseVideoCommand closeCourseVideoCommand = new CloseCourseVideoCommand(courseVideo);

        Staff staff = new Staff();
        staff.addCommand(openCourseVideoCommand);
        staff.addCommand(closeCourseVideoCommand);

        staff.executeCommands();
    }
}