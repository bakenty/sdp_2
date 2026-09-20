package computerfactory;

public abstract class ComputerCreator {
    public abstract Computer createComputer();

    public void startComputer() {
        Computer computer = createComputer();
        computer.start();
    }
}
