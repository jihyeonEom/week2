public class Component implements Tunable {
    private String name;
    private int price;
    private String maker;

    public Component(String name, int price, String maker){
        this.name = name;
        this.price = price;
        this.maker = maker;
    }

    public String getName(){
        return name;
    }

    @Override
    public void on(){
        System.out.println(this.name + " ON");
    }
    @Override
    public void off(){
        System.out.println(this.name + " OFF");
    }
}
