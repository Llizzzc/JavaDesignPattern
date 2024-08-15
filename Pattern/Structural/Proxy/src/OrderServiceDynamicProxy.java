import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind() {
        Class cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), this);
    }

    // JDK动态代理，被代理的对象必须实现接口；CGLIB通过生成被代理类的子类来实现代理
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeMethod();
        Object object = method.invoke(target, args);
        afterMethod();
        return object;
    }

    private void beforeMethod() {
        System.out.println("动态代理 before code");
    }

    private void afterMethod() {
        System.out.println("动态代理 after code");
    }
}