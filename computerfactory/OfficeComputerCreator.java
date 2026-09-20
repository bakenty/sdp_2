package computerfactory;

public class OfficeComputerCreator extends ComputerCreator {
    @Override
    public Computer createComputer() {
        return new OfficeComputer();
    }
}
