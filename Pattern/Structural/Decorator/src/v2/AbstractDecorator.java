package v2;

public abstract class AbstractDecorator extends ABatterCake {
    private ABatterCake aBattercake;

    public AbstractDecorator(ABatterCake aBattercake) {
        this.aBattercake = aBattercake;
    }

    protected abstract void doSomething();

    @Override
    public String getDesc() {
        return this.aBattercake.getDesc();
    }

    @Override
    public int cost() {
        return this.aBattercake.cost();
    }
}