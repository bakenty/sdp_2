package computerfactory;

public class GamingComputerCreator extends ComputerCreator {
    @Override
    public Computer createComputer() {
        return new GamingComputer();
    }
}
