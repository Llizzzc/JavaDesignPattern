public class ThreadLocalInstance {

    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstanceThreadLocal = new ThreadLocal<>() {
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };

    private ThreadLocalInstance() {

    }

    public static ThreadLocalInstance getInstance() {
        return threadLocalInstanceThreadLocal.get();
    }
}