package Computer.Component.Monitor;

import Computer.Component.Component;
import Computer.Component.Maker;

public class Monitor extends Component {
    private int size;

    public Monitor(String name, int price, Maker maker, int size){
        super(name, price, maker);
        this.size = size;
    }

    @Override
    public void run(){
        System.out.println(this.name + " 화면을 출력합니다.");
    }
}
