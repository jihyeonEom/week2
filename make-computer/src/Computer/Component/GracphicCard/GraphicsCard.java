package Computer.Component.GracphicCard;

import Computer.Component.Component;
import Computer.Component.Maker;

public class GraphicsCard extends Component {
    private String propose;

    public GraphicsCard(String name, int price, Maker maker, String purpose){
        super(name, price, maker);
        this.propose = purpose;
    }

    @Override
    public void run(){
        System.out.println(this.name + " 화면을 렌더링합니다.");
    }
}
