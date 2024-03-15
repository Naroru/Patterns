package Command.Pattern;

public class SelectCommand implements Command {

    private Receiver receiver;

    public SelectCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.select_something();
    }
}
