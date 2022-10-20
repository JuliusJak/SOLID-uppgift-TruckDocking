public interface ShowList extends ShowTrucksInList, AddTruckToList,Lists{

    @Override
    default void showTrucks() {

        System.out.print("Docking station [A]: \n");
        for (Vehicle vehicle : dockingA) {
            System.out.println(" - " + vehicle.getType() + " ["+vehicle.getWeight() + "kg] - ");
            System.out.println();
        }

        System.out.print("Docking station [B]: \n");
        for (Vehicle vehicle : dockingB) {
            System.out.println(" - " + vehicle.getType() + " ["+vehicle.getWeight() + "kg] - ");
            System.out.println();
        }

        System.out.print("Docking station [C]: \n");
        for (Vehicle vehicle : dockingC) {
            System.out.println(" - " + vehicle.getType() + " ["+vehicle.getWeight() + "kg] - ");
            System.out.println();
        }

        System.out.print("Docking station [D]: \n");
        for (Vehicle vehicle : dockingD) {
            System.out.println(" - " + vehicle.getType() + " ["+vehicle.getWeight() + "kg] - ");
            System.out.println();
        }

        System.out.print("Docking station [E]: \n");
        for (Vehicle vehicle : dockingE) {
            System.out.println(" - " + vehicle.getType() + " ["+vehicle.getWeight() + "kg] - ");
            System.out.println();
        }


    }
}
