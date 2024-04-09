public class PowerSupplier extends Component{
    private int output;

    public PowerSupplier(String name, int price, String maker, int output){
        super(name, price, maker);
        this.output = output;
    }

    public void supplyPower(){
        System.out.println(this.getName() + " 전원을 공급합니다.");
    }
}
