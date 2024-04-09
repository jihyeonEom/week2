public class Cooler extends Component{
    String cooling_way;

    Cooler(String name, int price, String maker, String cooling_way){
        super(name, price, maker);
        this.cooling_way = cooling_way;
    }

    void cool(){
        System.out.println(this.getName() + " 냉각합니다.");
    }
}
