/**
 * 解释器
 * 定义：给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个
 *      解释器使用该表示来解释语言中的句子
 *
 * 场景：1.某个特定类型问题发生的频率足够高
 * 优点：1.语法由很多类表示，容易改变及扩展
 * 缺点：1.当语法规则数目太多时，增加了系统复杂度
 */
public class Main {
    public static void main(String[] args) {
        String inputStr = "6 100 11 + *";
        ExpressionParser expressionParser = new ExpressionParser();
        int result = expressionParser.parse(inputStr);
        System.out.println("解释器计算结果: " + result);
    }
}