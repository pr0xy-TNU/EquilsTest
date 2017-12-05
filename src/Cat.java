public class Cat implements Fuctionality {
    private String name;

    public String getName() {
        return name;
    }

    public Cat(String name) {

        this.name = name;
    }

    public Cat() {
    }

    @Override
    public void sayHello() {
        System.out.println("Hell catty!");
    }
}
