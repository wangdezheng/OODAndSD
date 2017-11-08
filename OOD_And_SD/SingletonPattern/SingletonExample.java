package SingletonPattern;

/**
 * A singleton implementation may use lazy initialization, where the instance is created when the static method is first invoked.
 * If the static method might be called from multiple threads simultaneously, measures may need to be taken to prevent race conditions that could result in the creation of multiple instances of the class.
 */

//public final class SingletonExample {
//    private static volatile SingletonExample instance = null;
//
//    private SingletonExample() {
//    }
//
//    public static SingletonExample getInstance() {
//        if (instance == null) {
//            synchronized (SingletonExample.class) {
//                if (instance == null) {
//                    instance = new SingletonExample();
//                }
//            }
//        }
//        return instance;
//    }
//}
    // Simple implementation of singleton (single thread environment)
public final class SingletonExample {
    private static SingletonExample INSTANCE = null;

    private SingletonExample() {}

    public static SingletonExample getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonExample();
        }
        return INSTANCE;
    }
}
