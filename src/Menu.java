import java.util.Scanner;

public class Menu implements AddMenu, AddTruckToList, ShowList, VanDocking{

    @Override
    public void addMenu() {

        boolean runningMenu = true;

        while (runningMenu) {
            System.out.println();
            System.out.println("Do you wish to add a new truck or see already docked trucks?");
            System.out.println("Type add for add truck");
            System.out.println("Type show to show already docked trucks");
            System.out.println("Type stop to stop the program");

            Scanner scanner = new Scanner(System.in);
            String answer = scanner.next();


            if (answer.equalsIgnoreCase("add")) {

                vanDocker();
            }

            else if (answer.equalsIgnoreCase("show")) {

                showTrucks();
            }

            else if (answer.equalsIgnoreCase("stop")) {

                System.out.println("Goodbye");
                runningMenu = false;
            }

            else {
                System.out.println("Sorry i didn't understand that please type (add), (show), or (stop)");
                System.out.println();
            }

        }
    }

}
