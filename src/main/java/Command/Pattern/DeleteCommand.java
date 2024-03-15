package Command.Pattern;

public class DeleteCommand implements  Command{

    private Receiver receiver;

    public DeleteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.delete_something();
    }
}
