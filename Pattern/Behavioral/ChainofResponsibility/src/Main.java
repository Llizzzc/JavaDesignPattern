/**
 * 责任链
 * 定义：为请求创建一个接受此此请求对象的链
 *
 * 场景：1.一个请求的处理需要多个对象当中的一个或几个协作处理
 *
 * 优点：1.请求发送者和接收者解耦
 *
 * 缺点：1.责任链太长或者处理时间过长，影响性能
 *      2.责任链可能过多
 */
public class Main {
    public static void main(String[] args) {
        Approver articleApprover = new ArticleApprover();
        Approver videoApprover = new VideoApprover();

        Course course = new Course();
        course.setName("Java设计模式精讲 -- By Dell");
        course.setArticle("Java设计模式精讲的手记");
        course.setVideo("Java设计模式精讲的视频");

        articleApprover.setNextApprover(videoApprover);
        articleApprover.deploy(course);
    }
}