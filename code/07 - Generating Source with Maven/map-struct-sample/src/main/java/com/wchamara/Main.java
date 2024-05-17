package com.wchamara;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User user = new User("Chamara", "Wijesekara", "abc@gmail.com");

        UserCommand userCommand = UserMapper.INSTANCE.userToUserCommand(user);

        System.out.println(userCommand.getFirstName());
        System.out.println(userCommand.getLastName());
        System.out.println(userCommand.getEmail());

        UserCommand userCommand1 = new UserCommand("Chamara", "Wijesekara", "xxxxxx@abc.com");

        User user1 = UserCommandMapper.INSTANCE.userCommandToUser(userCommand1);

        System.out.println(user1.getFirstName());
        System.out.println(user1.getLastName());
        System.out.println(user1.getEmail());

    }
}