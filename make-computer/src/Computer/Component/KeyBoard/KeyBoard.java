package Computer.Component.KeyBoard;

import Computer.Component.Component;
import Computer.Component.Maker;

public class KeyBoard extends Component {
    private Layout layout;

    public KeyBoard(String name, int price, Maker maker, Layout layout){
        super(name, price, maker);
        this.layout = layout;
    }

    @Override
    public void run(){
        System.out.println(this.name + " 타이핑합니다.");
    }
}
