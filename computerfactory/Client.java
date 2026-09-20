package computerfactory;

public class Client {
    private final ComputerFactory factory;

    public Client(ComputerFactory factory) {
        this.factory = factory;
    }

    public void buildComputer() {
        CPU cpu = factory.createCPU();
        GPU gpu = factory.createGPU();

        cpu.info();
        gpu.info();
    }
}
