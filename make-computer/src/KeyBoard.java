public class KeyBoard extends Component{
    private String layout;

    public KeyBoard(String name, int price, String maker, String layout){
        super(name, price, maker);
        this.layout = layout;
    }

    public void type(){
        System.out.println(this.getName() + " 타이핑합니다.");
    }
}
