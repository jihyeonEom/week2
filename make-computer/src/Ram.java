public class Ram extends Component{
    private String capacity;

    public Ram(String name, int price, String maker, String capacity){
        super(name, price, maker);
        this.capacity = capacity;
    }

    public void readData(){
        System.out.println(this.getName() + " 데이터를 읽습니다.");
    }
}
