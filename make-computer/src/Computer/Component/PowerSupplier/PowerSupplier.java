package Computer.Component.PowerSupplier;

import Computer.Component.Component;
import Computer.Component.Maker;

public class PowerSupplier extends Component {
    private int output;

    public PowerSupplier(String name, int price, Maker maker, int output){
        super(name, price, maker);
        this.output = output;
    }

    @Override
    public void run(){
        System.out.println(this.name + " 전원을 공급합니다.");
    }
}
