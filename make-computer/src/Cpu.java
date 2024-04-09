public class Cpu extends Component{
    private int speed;
    private String use;

    public Cpu(String name, int price, String maker, int speed, String use){
        super(name, price, maker);
        this.speed = speed;
        this.use = use;
    }

    public void processInstruction(){
        System.out.println(this.getName() + " 명령어를 처리합니다.");
    }
}

