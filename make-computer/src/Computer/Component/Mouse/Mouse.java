package Computer.Component.Mouse;

import Computer.Component.Component;
import Computer.Component.Maker;

public class Mouse extends Component {

    public Mouse(String name, int price, Maker maker){
        super(name, price, maker);
    }

    @Override
    public void run(){
        System.out.println(this.name + " 클릭합니다.");
    }
}
