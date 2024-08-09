package v2;

public class SausageDecorator extends AbstractDecorator {
    public SausageDecorator(ABatterCake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    public String getDesc() {
        return super.getDesc() + "加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}