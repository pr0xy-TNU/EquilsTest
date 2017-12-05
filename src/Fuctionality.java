public interface Fuctionality {
    void sayHello();

    default void hi() {
        System.out.println("hi !");
    }
}
