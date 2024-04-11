package Computer.Component.Cpu;

import Computer.Component.Component;
import Computer.Component.Maker;

public class Cpu extends Component {
    private int speed;
    private CpuPurpose purpose;

    public Cpu(String name, int price, Maker maker, int speed, CpuPurpose use){
        super(name, price, maker);
        this.speed = speed;
        this.purpose = use;
    }

    @Override
    public void run(){
        System.out.println(this.name + " 명령어를 처리합니다.");
    }
}

