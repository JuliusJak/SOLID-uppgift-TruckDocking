public interface VanDocking extends VanChecker, AddTruck, AddTruckToList,Lists{

    @Override
    default Vehicle vanDocker() {


        Vehicle typeChecker = addTruck();
        String type = typeChecker.getType();
        int weight = typeChecker.getWeight();


        if (type.equalsIgnoreCase("van")) {

            if (dockingA.size() < 1) {

                System.out.println(type +" [" + weight + "kg] was sent to docking station [A]");
                System.out.println();
                dockingA.add(typeChecker);

            } else if (dockingA.size() == 1 && dockingB.size() < 1) {

                System.out.println("Docking station [A] was full redirecting to station [B]");
                System.out.println(type +" [" + weight + "kg] was sent to docking station [B]");
                System.out.println();
                dockingB.add(typeChecker);

            } else  {
                System.out.println("All possible stations for vans are full");
                System.out.println("Returning to main menu");
                System.out.println();
            }
        }
        if (type.equalsIgnoreCase("small truck")) {
            if (dockingC.size() < 1) {

                System.out.println(type +" [" + weight + "kg] was sent to docking station [C]");
                System.out.println();
                dockingC.add(typeChecker);

            } else if (dockingC.size() == 1 && dockingD.size() < 1) {

                System.out.println("Docking station [C] was full redirecting to station [D]");
                System.out.println(type +" [" + weight + "kg] was sent to docking station [D]");
                System.out.println();
                dockingD.add(typeChecker);

            } else if (dockingC.size() == 1 && dockingD.size() == 1 && dockingA.size() < 1 && weight <5000){

                System.out.println("Docking station [D] was full redirecting to station [A]");
                System.out.println(type +" [" + weight + "kg] was sent to docking station [A]");
                System.out.println();
                dockingA.add(typeChecker);

            }
            else {
                System.out.println("All possible stations for small trucks are full");
                System.out.println("Returning to main menu");
                System.out.println();
            }
        }
        if (type.equalsIgnoreCase("heavy truck")) {
            if (dockingE.size() <1) {

                System.out.println(type +" [" + weight + "kg] was sent to docking station [E]");
                System.out.println();
                dockingE.add(typeChecker);

            } else if (dockingE.size() == 1 && weight < 9000 && dockingD.size() < 1) {

                System.out.println("Docking station [E] was full redirecting to station [D]");
                System.out.println(type +" [" + weight + "kg] was sent to docking station [D]");
                System.out.println();
                dockingD.add(typeChecker);

            }
            else {
                System.out.println("All possible stations for heavy trucks are full");
                System.out.println("Returning to main menu");
                System.out.println();
            }
        }
        return null;
    }
}
