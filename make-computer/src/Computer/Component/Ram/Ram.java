package Computer.Component.Ram;

import Computer.Component.Component;
import Computer.Component.Maker;

public class Ram extends Component {
    private String capacity;

    public Ram(String name, int price, Maker maker, String capacity){
        super(name, price, maker);
        this.capacity = capacity;
    }

    @Override
    public void run(){
        System.out.println(this.name + " 데이터를 읽습니다.");
    }
}
