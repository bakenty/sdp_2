package computerfactory;

public class IntelFactory implements ComputerFactory {
    public CPU createCPU() {
        return new IntelCPU();
    }

    public GPU createGPU() {
        return new NvidiaGPU();
    }
}
