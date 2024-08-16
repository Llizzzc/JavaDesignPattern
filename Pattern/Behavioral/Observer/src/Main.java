/**
 * 观察者
 * 定义：定义了对象之间的一对多依赖，让多个观察者对象同时监听某
 *      一个主题对象，当主题对象发生变化时，它的所有依赖者都会
 *      收到通知并更新
 *
 * 场景：1.关联行为场景，建立一套触发机制
 *
 * 优点：1.观察者和被观察者之间建立了一个抽象的耦合
 *      2.支持广播通信
 *
 * 缺点：1.观察者之间有过多的细节依赖、提高时间消耗及程序复杂度
 *      2.使用要得当，要避免循环调用
 */
public class Main {
    public static void main(String[] args) {
        Course course = new Course("Java设计模式精讲");
        Teacher teacher1 = new Teacher("Alpha");
        Teacher teacher2 = new Teacher("Beta");

        course.addObserver(teacher1);
        course.addObserver(teacher2);

        Question question = new Question();
        question.setUserName("Dell");
        question.setQuestionContent("Java的主函数如何编写");
        course.produceQuestion(course, question);
    }
}