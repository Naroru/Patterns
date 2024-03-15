package Command;

import Command.Pattern.*;

public class Main {

    public static void main(String[] args) {

        Receiver receiver = new Receiver();

        Invoker invoker = new Invoker(
                new SelectCommand(receiver),
                new UpdateCommand(receiver),
                new DeleteCommand(receiver)
        );

        invoker.delete();
        invoker.select();
        invoker.update();


    }
}
