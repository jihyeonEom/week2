package Computer.Component.Cooler;
import Computer.Component.Component;
import Computer.Component.Maker;

public class Cooler extends Component {
    private CoolingWay cooling_way;

    public Cooler(String name, int price, Maker maker, CoolingWay cooling_way){
        super(name, price, maker);
        this.cooling_way = cooling_way;
    }

    @Override
    public void run(){
        System.out.println(this.name + " 냉각합니다.");
    }
}
