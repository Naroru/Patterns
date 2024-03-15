package Command.Pattern;

public class Invoker {

    Command select;
    Command update;
    Command delete;

    public Invoker(Command select, Command update, Command delete) {
        this.select = select;
        this.update = update;
        this.delete = delete;
    }

public void select()
{
    select.execute();
}
    public void delete()
    {
        delete.execute();
    }

    public void update()
    {
        update.execute();
    }

}
