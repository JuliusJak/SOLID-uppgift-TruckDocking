import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface AddTruckToList extends AddTruck {
    @Override
    default Vehicle addTruck() {

        List<Vehicle> vehicles = new ArrayList<>();


        Scanner scanner = new Scanner(System.in);

            System.out.println("Select type of truck: \n1 for -van- \n2 for -Small Truck- \n3 for -Heavy Truck");


            String selectedOption = scanner.next();
            String selectedOptionAndWeight = "You have selected type " + selectedOption;

                if (selectedOption.equalsIgnoreCase("1")) {
                    String type = " -van-";
                    System.out.println(selectedOptionAndWeight + type);
                    System.out.println("How much does it weigh in kilo?");

                    int weight = scanner.nextInt();
                    Vehicle newTruck = new Van(weight);
                    vehicles.add(newTruck);

                    return newTruck;

                }
                else if (selectedOption.equalsIgnoreCase("2")) {
                    String type = " -Small Truck-";
                    System.out.println(selectedOptionAndWeight + type);
                    System.out.println("How much does it weigh in kilo?");

                    int weight = scanner.nextInt();
                    Vehicle newTruck = new SmallTruck(weight);
                    vehicles.add(newTruck);

                    return newTruck;

                }
                else if (selectedOption.equalsIgnoreCase("3")) {
                    String type = " -Heavy Truck-";
                    System.out.println(selectedOptionAndWeight + type);
                    System.out.println("How much does it weigh in kilo?");

                    int weight = scanner.nextInt();
                    Vehicle newTruck = new HeavyTruck(weight);
                    vehicles.add(newTruck);

                    return newTruck;


                }
                else {
                    System.out.println("You did not select a valid type of truck");
                }

        return null;
    }
}

