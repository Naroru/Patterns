package Command.Pattern;

public class UpdateCommand implements Command {

    private Receiver receiver;

    public UpdateCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.update_something();
    }
}
