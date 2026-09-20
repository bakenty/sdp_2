package computerfactory;

public class Main {
    public static void main(String[] args) {
        ComputerCreator creator = new GamingComputerCreator();
        creator.startComputer();

        ComputerFactory factory = new IntelFactory();
        Client client = new Client(factory);
        client.buildComputer();

        factory = new AmdFactory();
        client = new Client(factory);
        client.buildComputer();
    }
}
