public class GraphicsCard extends Component{
    private String use;

    public GraphicsCard(String name, int price, String maker, String use){
        super(name, price, maker);
        this.use = use;
    }

    void render(){
        System.out.println(this.getName() + " 화면을 렌더링합니다.");
    }
}
