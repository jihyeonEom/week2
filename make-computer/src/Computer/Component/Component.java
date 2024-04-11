package Computer.Component;
import static Computer.Component.Maker.isMakerProduceThisComponent;

public abstract class Component implements Tunable {
    protected String name;
    private int price;
    private Maker maker;

    public Component(String name, int price, Maker maker){
        this.isvalidateMaker(maker); // 유효한 제조사인지 확인
        this.name = name;
        this.price = price;
        this.maker = maker;
    }
    private void isvalidateMaker(Maker maker) {
        if (!isMakerProduceThisComponent(maker, this.getClass())) {
            throw new IllegalArgumentException("해당 제조사는 이 부품을 제작하지 않습니다...");
        }
    }

    @Override
    public void on(){
        System.out.println(this.name + " ON");
    }
    @Override
    public void off(){
        System.out.println(this.name + " OFF");
    }

    public abstract void run();
}
