package command.commands;

import command.entities.Car;

public class DriveCommand implements ICommand
{
    private Car receiver;
    private int howManyMiles;
    private int initialMiles;

    public DriveCommand(Car receiver, int howManyMiles)
    {
        this.receiver = receiver;
        this.howManyMiles = howManyMiles;
    }

    @Override
    public void execute()
    {
        this.initialMiles = receiver.getMiles(); //save before making a change
        receiver.setMiles(receiver.getMiles() + howManyMiles);
    }

    @Override
    public void unexecute()
    {
        receiver.setMiles(initialMiles);
    }
}
