package SingletonPattern;

/**
 * A singleton implementation may use lazy initialization, where the instance is created when the static method is first invoked.
 * If the static method might be called from multiple threads simultaneously, measures may need to be taken to prevent race conditions that could result in the creation of multiple instances of the class.
 */
//Double-checked locking
public class SingletonExample {
    private static volatile SingletonExample instance = null;

    private SingletonExample() {}

    public static SingletonExample getInstance() {
        if (instance == null) {
            synchronized (SingletonExample.class) {
                if (instance == null) {
                    instance = new SingletonExample();
                }
            }
        }
        return instance;
    }
}

//---------------------------------------------------------------------------------------------
//Lazy loading Singletons, low efficiency, thread-unsafe (should use synchronized key word)
//public class SingletonExample {
//    private static SingletonExample INSTANCE = null;
//
//    private SingletonExample() {}
//
//    public static synchronized SingletonExample getInstance() {
//        if (INSTANCE == null) {
//            INSTANCE = new SingletonExample();
//        }
//        return INSTANCE;
//    }
//}

//---------------------------------------------------------------------------------------------
//Eagerly loading Singletons, use lots of resource
//public class SingletonExample {
//    private static SingletonExample INSTANCE = new SingletonExample();
//
//    private SingletonExample(){}
//
//    public static SingletonExample getInstance(){
//        return INSTANCE;
//    }
//}


//---------------------------------------------------------------------------------------------
//More efficient way of eagerly loading Singletons, compared to previous method
//Make full use of class loading mechanism
//public class SingletonExample {
//    private static class SingletonHolder {
//        private static SingletonExample INSTANCE = new SingletonExample();
//    }
//
//    private SingletonExample(){}
//
//    public static final SingletonExample getInstance(){
//        return  SingletonHolder.INSTANCE;
//    }
//
//}



