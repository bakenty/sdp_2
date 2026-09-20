package computerfactory;

public class AmdFactory implements ComputerFactory {
    public CPU createCPU() {
        return new AmdCPU();
    }

    public GPU createGPU() {
        return new AmdGPU();
    }
}
