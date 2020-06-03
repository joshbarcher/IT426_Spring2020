package command.commands;

import command.entities.Car;

public class MaintainenceCommand implements ICommand
{
    private Car receiver;
    private boolean initialWorking;

    public MaintainenceCommand(Car receiver)
    {
        this.receiver = receiver;
    }

    @Override
    public void execute()
    {
        this.initialWorking = receiver.isWorking();
        receiver.setWorking(true);
    }

    @Override
    public void unexecute()
    {
        receiver.setWorking(initialWorking);
    }
}
