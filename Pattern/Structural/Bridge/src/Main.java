/**
 * 桥接
 * 定义：将抽象部分与它的具体实现部分分离，使它们都可以独立地
 *      变化，通过组合地方式建立两个类之间联系，而不是继承
 *
 * 场景：1.抽象和具体实现之间增加更多地灵活性
 *      2.一个类存在两个（或多个）独立变化地维度，且这些维度都需要独立进行扩展
 *      3不希望使用继承，或因为多层继承导致系统类地个数剧增
 *
 * 优点：1.分离抽象部分及其具体实现部分
 *      2.提高了系统地可扩展性
 *      3.符合开闭原则
 *      4.符合合成复用原则
 *
 * 缺点：1.增加了系统的理解与设计难度
 *      2.需要正确地识别出系统中两个独立变化的维度
 */
public class Main {
    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new DepositAccount());
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();

        Bank icbcBank2 = new ICBCBank(new SavingAccount());
        Account icbcAccount2 = icbcBank2.openAccount();
        icbcAccount2.showAccountType();

        Bank abcBank = new ABCBank(new SavingAccount());
        Account abcAccount = abcBank.openAccount();
        abcAccount.showAccountType();
    }
}