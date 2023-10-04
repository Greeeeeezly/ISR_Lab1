public class Main {
    public static void main(String[] args) {
        int n = 1000;
        PoolThreads poolThreads = new PoolThreads(n);
        poolThreads.startAll();
    }
}
