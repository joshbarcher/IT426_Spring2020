package command.test;

import command.commands.DriveCommand;
import command.commands.ICommand;
import command.commands.MaintainenceCommand;
import command.entities.Car;

import java.util.Stack;

public class TestCommands
{
    public static void main(String[] args)
    {
        Car car = new Car("Nissan", "Sentra", 12000, false);

        Stack<ICommand> doStack = new Stack<>();
        ICommand[] commands = {
            new DriveCommand(car, 100),
            new MaintainenceCommand(car),
            new DriveCommand(car, 20)
        };

        System.out.println(car);
        for (int i = 0; i < commands.length; i++)
        {
            commands[i].execute();
            doStack.push(commands[i]);
            System.out.println(car);
        }
        System.out.println();

        //unravel our stack
        while (!doStack.isEmpty())
        {
            doStack.pop().unexecute();
            System.out.println(car);
        }
    }
}
