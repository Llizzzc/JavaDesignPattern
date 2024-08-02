/**
 * 合成复用
 * 定义：尽量使用对象组合/聚合，而不是继承关系来达到软件复用的目的
 * 优点：可以使系统更灵活，降低类之间的耦合
 */
public class Main {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new PostgreSQLConnection());
        productDao.addProduct();
    }
}