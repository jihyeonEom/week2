package Computer;
import Computer.Component.Component;
import Computer.Component.Cooler.Cooler;
import Computer.Component.Cpu.Cpu;
import Computer.Component.GracphicCard.GraphicsCard;
import Computer.Component.KeyBoard.KeyBoard;
import Computer.Component.Monitor.Monitor;
import Computer.Component.Mouse.Mouse;
import Computer.Component.PowerSupplier.PowerSupplier;
import Computer.Component.Ram.Ram;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    // 필수
    private Cpu cpu;
    private Ram ram;
    private GraphicsCard graphicsCard;
    private PowerSupplier powerSupplier;
    // 선택부품 리스트
    private List<Component> optionalComponents;

    private Computer(Cpu cpu, Ram ram, GraphicsCard graphicsCard, PowerSupplier powerSupplier){
        this.cpu = cpu;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.powerSupplier = powerSupplier;
        this.optionalComponents = new ArrayList<>();
    }

    public static class ComputerBuilder {
        // 필수
        private Cpu cpu;
        private Ram ram;
        private GraphicsCard graphicsCard;
        private PowerSupplier powerSupplier;
        // 선택
        private Cooler cooler;
        private Mouse mouse;
        private KeyBoard keyBoard;
        private Monitor monitor;

        public ComputerBuilder(Cpu cpu, Ram ram, GraphicsCard graphicsCard, PowerSupplier powerSupplier){
            this.cpu = cpu;
            this.ram = ram;
            this.graphicsCard = graphicsCard;
            this.powerSupplier = powerSupplier;
        }
        public ComputerBuilder cooler(Cooler cooler){
            this.cooler = cooler;
            return this;
        }
        public ComputerBuilder mouse(Mouse mouse){
            this.mouse = mouse;
            return this;
        }
        public ComputerBuilder keyBoard(KeyBoard keyBoard){
            this.keyBoard = keyBoard;
            return this;
        }
        public ComputerBuilder monitor(Monitor monitor){
            this.monitor = monitor;
            return this;
        }
        public Computer build(){
            Computer computer = new Computer(cpu, ram, graphicsCard, powerSupplier);

            // 선택부품이 있으면 리스트에 추가
            if(cooler != null){
                computer.optionalComponents.add(cooler);
            }
            if(mouse != null){
                computer.optionalComponents.add(mouse);
            }
            if(keyBoard != null){
                computer.optionalComponents.add(keyBoard);
            }
            if(monitor != null){
                computer.optionalComponents.add(monitor);
            }
            return computer;
        }
    }

    public void boot(){
        System.out.println("컴퓨터를 부팅합니다.");
        cpu.on();
        ram.on();
        graphicsCard.on();
        powerSupplier.on();
        optionalComponents.forEach(component -> component.on());
    }

    public void shutdown(){
        System.out.println("컴퓨터를 종료합니다.");
        cpu.off();
        ram.off();
        graphicsCard.off();
        powerSupplier.off();
        optionalComponents.forEach(component -> component.off());
    }

    public void run(){
        System.out.println("컴퓨터의 기능을 전부 실행합니다.");
        cpu.run();
        ram.run();
        graphicsCard.run();
        powerSupplier.run();
        optionalComponents.forEach(component -> component.run());
    }
}
