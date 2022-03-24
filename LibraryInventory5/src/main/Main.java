package main;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        printStatement();
        DatabaseControl databaseControl = new DatabaseControl();
        databaseControl.databaseSetup();
        //Testing test = new Testing(databaseControl);
        //test.addTestingInventoryData();
        databaseControl.getIdFromName("test");
        ControlScreen controlScreen = new ControlScreen(databaseControl);
        controlScreen.getFrame().addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                new PDFCreation().makePDF(databaseControl.getUnderReoder());
                databaseControl.closeConnection();
            }
        });
    }

    public static void printStatement() {
        System.out.println("------- |\\      |  -------- \\            /   /\\       ------- -------  --------  |\\      |");
        System.out.println("   |    | \\     | |        | \\          /   /  \\         |       |    |        | | \\     |");
        System.out.println("   |    |  \\    | |        |  \\        /   /    \\        |       |    |        | |  \\    |");
        System.out.println("   |    |   \\   | |        |   \\      /   /------\\       |       |    |        | |   \\   |");
        System.out.println("   |    |    \\  | |        |    \\    /   /        \\      |       |    |        | |    \\  |");
        System.out.println("   |    |     \\ | |        |     \\  /   /          \\     |       |    |        | |     \\ |");
        System.out.println("------- |      \\|  --------       \\/   /            \\    |    -------  --------  |      \\|");
        System.out.println("");
        System.out.println("");
        System.out.println(" ------  ----- |\\      | -------  -----  ---");
        System.out.println("|       |      | \\     |    |    |      |   \\");
        System.out.println("|       |      |  \\    |    |    |      |    |");
        System.out.println("|       |----- |   \\   |    |    |----- |   /");
        System.out.println("|       |      |    \\  |    |    |      |--");
        System.out.println("|       |      |     \\ |    |    |      |  \\");
        System.out.println(" ------  ----- |      \\|    |     ----- |   \\");
    }
}
