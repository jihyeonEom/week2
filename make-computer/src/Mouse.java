public class Mouse extends Component{

    public Mouse(String name, int price, String maker){
        super(name, price, maker);
    }

    public void click(){
        System.out.println(this.getName() + " 클릭합니다.");
    }
}
