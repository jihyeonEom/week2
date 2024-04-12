import Computer.*;
import Computer.Component.Cooler.Cooler;
import Computer.Component.Cooler.CoolingWay;
import Computer.Component.Cpu.Cpu;
import Computer.Component.Cpu.CpuPurpose;
import Computer.Component.GracphicCard.GCPurpose;
import Computer.Component.GracphicCard.GraphicsCard;
import Computer.Component.KeyBoard.KeyBoard;
import Computer.Component.KeyBoard.Layout;
import Computer.Component.Maker;
import Computer.Component.Monitor.Monitor;
import Computer.Component.Mouse.Mouse;
import Computer.Component.PowerSupplier.PowerSupplier;
import Computer.Component.Ram.Ram;

public class Main {
    public static void main(String[] args) {
        Cpu cpu = new Cpu("intel", 10, Maker.INTEL, 100, CpuPurpose.GAMING);
        Ram ram = new Ram("Samsung", 5, Maker.SAMSUNG, "8GB");
        GraphicsCard graphicsCard = new GraphicsCard("Nvidia", 30, Maker.NVIDIA, GCPurpose.GAMING);
        PowerSupplier power = new PowerSupplier("Cooler Master", 3, Maker.COOLER_MASTER, 500);
        Cooler cooler = new Cooler("Thermaltake", 12, Maker.COOLER_MASTER, CoolingWay.WATER);
        Mouse mouse = new Mouse("Logitech", 1, Maker.LOGITECH);
        KeyBoard keyBoard = new KeyBoard("Razer", 10, Maker.RAZER, Layout.ANSI);
        Monitor monitor = new Monitor("LG", 10, Maker.LG, 31);

        Computer my_desktop = new Computer.ComputerBuilder(cpu, ram, graphicsCard, power)
                .cooler(cooler)
                .mouse(mouse)
                .build();

        my_desktop.boot();
        System.out.println();
        my_desktop.shutdown();
        System.out.println();
        my_desktop.run();
    }
}