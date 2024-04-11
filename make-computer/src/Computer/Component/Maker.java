package Computer.Component;
import Computer.Component.Cooler.Cooler;
import Computer.Component.Cpu.Cpu;
import Computer.Component.GracphicCard.GraphicsCard;
import Computer.Component.KeyBoard.KeyBoard;
import Computer.Component.Monitor.Monitor;
import Computer.Component.Mouse.Mouse;
import Computer.Component.PowerSupplier.PowerSupplier;
import Computer.Component.Ram.Ram;

import java.util.Arrays;
import java.util.List;

public enum Maker {

    INTEL(Arrays.asList(Cpu.class)),
    AMD(Arrays.asList(Cpu.class, GraphicsCard.class)),
    SAMSUNG(Arrays.asList(Ram.class, Monitor.class)),
    KINGSTON(Arrays.asList(Ram.class)),
    NVIDIA(Arrays.asList(GraphicsCard.class)),
    COOLER_MASTER(Arrays.asList(PowerSupplier.class, Cooler.class)),
    THERMALTAKE(Arrays.asList(PowerSupplier.class, Cooler.class)),
    LOGITECH(Arrays.asList(Mouse.class, KeyBoard.class)),
    RAZER(Arrays.asList(Mouse.class, KeyBoard.class)),
    LG(Arrays.asList(Monitor.class));

    private List<Class<? extends Component>> ComponentList;

    Maker(List<Class<? extends Component>> componentList) {
        this.ComponentList = componentList;
    }

    // 해당 제조사가 그 부품을 생산하는지 확인
    public static boolean isMakerProduceThisComponent(Maker maker, Class<? extends Component> component) {
        return maker.getComponentList().contains(component);
    }

    // 제조사가 생산하는 부품 목록을 리턴
    private List<Class<? extends Component>> getComponentList() {
        return this.ComponentList;
    }
}
