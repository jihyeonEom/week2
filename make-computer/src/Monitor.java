public class Monitor extends Component{
    private int size;

    public Monitor(String name, int price, String maker, int size){
        super(name, price, maker);
        this.size = size;
    }

    public void display(){
        System.out.println(this.getName() + " 화면을 출력합니다.");
    }
}
