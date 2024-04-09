public class Computer {
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

    private Computer(Cpu cpu, Ram ram, GraphicsCard graphicsCard, PowerSupplier powerSupplier){
        this.cpu = cpu;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.powerSupplier = powerSupplier;
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
            computer.cooler = this.cooler;
            computer.mouse = this.mouse;
            computer.keyBoard = this.keyBoard;
            computer.monitor = this.monitor;
            return computer;
        }
    }

    public void boot(){
        System.out.println("컴퓨터를 부팅합니다.");
        cpu.on();
        ram.on();
        graphicsCard.on();
        powerSupplier.on();
        if(cooler != null ){
            cooler.on();
        }
        if(mouse != null){
            mouse.on();
        }
        if(keyBoard != null){
            keyBoard.on();
        }
        if(monitor != null){
            monitor.on();
        }
    }

    public void shutdown(){
        System.out.println("컴퓨터를 종료합니다.");
        cpu.off();
        ram.off();
        graphicsCard.off();
        powerSupplier.off();
        if(cooler != null){
            cooler.off();
        }
        if(mouse != null){
            mouse.off();
        }
        if(keyBoard != null){
            keyBoard.off();
        }
        if(monitor != null){
            monitor.off();
        }
    }

    public void run(){
        System.out.println("컴퓨터의 기능을 전부 실행합니다.");
        runCpu();
        runRam();
        runGraphicsCard();
        runPowerSupplier();
        if(cooler != null){
            runCooler();
        }
        if(mouse != null){
            runMouse();
        }
        if(keyBoard != null){
            runKeyBoard();
        }
        if(monitor != null){
            runMonitor();
        }
    }

    public void runCpu(){
        cpu.processInstruction();
    }
    public void runRam(){
        ram.readData();
    }
    public void runGraphicsCard(){
        graphicsCard.render();
    }
    public void runPowerSupplier(){
        powerSupplier.supplyPower();
    }
    public void runCooler(){
        cooler.cool();
    }
    public void runMouse(){
        mouse.click();
    }
    public void runKeyBoard(){
        keyBoard.type();
    }
    public void runMonitor(){
        monitor.display();
    }
}
