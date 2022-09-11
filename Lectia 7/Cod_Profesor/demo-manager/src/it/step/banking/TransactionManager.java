package it.step.banking;

// Design pattern: Singleton
public class TransactionManager {

    private static TransactionManager instance;

    public static TransactionManager getInstance(){
        if(instance != null) {
            instance = new TransactionManager();
        }
        return instance;
    }

    private TransactionManager() {

    }
}
