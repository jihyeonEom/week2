public class Main {
    public static void main(String[] args) {
        Cpu cpu = new Cpu("Intel", 10, "intel", 100, "gaming");
        Ram ram = new Ram("Samsung", 5, "samsung", "8GB");
        GraphicsCard graphicsCard = new GraphicsCard("Nvidia", 30, "nvidia", "gaming");
        PowerSupplier power = new PowerSupplier("Cooler Master", 3, "cooler Master", 500);
        Cooler cooler = new Cooler("Thermaltake", 12, "Thermaltake", "waterCooling");
        Mouse mouse = new Mouse("Logitech", 1, "logitech");
        KeyBoard keyBoard = new KeyBoard("Razer", 10, "Razer", "ANSI");
        Monitor monitor = new Monitor("LG", 10, "LG", 31);

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