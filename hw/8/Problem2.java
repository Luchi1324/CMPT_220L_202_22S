import java.util.*;
public class Problem2 {
    public static void main(String[] args) {
        // Gets input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of objects: ");
        int count = input.nextInt();
        ArrayList<Integer> weights = new ArrayList<Integer>();
        ArrayList<Container> containers = new ArrayList<Container>();
        System.out.print("Enter the weights of the objects: ");
        // Assigns input to overall
        for (int i = 0; i < count; i++) {
            weights.add(input.nextInt());
        }
        // Sorts ints by descending order
        Collections.sort(weights, Collections.reverseOrder());
        input.close();

        // Tracks which objects have already been assigned, and breaks main loop once all objects have been assigned
        boolean[] assignedObjects = new boolean[weights.size()];
        boolean allObjectsAssigned = false;
        while (allObjectsAssigned != true) {
            if (checkAllObjectsAssigned(assignedObjects)) {
                allObjectsAssigned = true;
            }
            for (int i = 0; i < weights.size(); i++) {
                Container currentContainer = new Container();
                // Searches for first unused weight
                for (int j = i; j < weights.size(); j++) {
                    if (!assignedObjects[j]) {
                        currentContainer.addToContents(weights.get(j));
                        currentContainer.increaseWeight(weights.get(j));
                        assignedObjects[j] = true;
                        break;
                    }
                }
                // Compares weights, then adds in order whether it is a perfect fit or within 10 lbs
                for (int j = i; j < weights.size() && currentContainer.getCurrentWeight() < 10; j++) {
                    if (currentContainer.atLimit(weights.get(j)) && !assignedObjects[j]) {
                        currentContainer.addToContents(weights.get(j));
                        currentContainer.increaseWeight(weights.get(j));
                        assignedObjects[j] = true;
                        break;
                    }
                    if (currentContainer.withinLimit(weights.get(j)) && !assignedObjects[j]) {
                        currentContainer.addToContents(weights.get(j));
                        currentContainer.increaseWeight(weights.get(j));
                        assignedObjects[j] = true;
                    }
                }
                // Adds current container to container arraylist
                containers.add(currentContainer);
            }
        }
        // Prints all container contents
        for (int i = 0; i < containers.size(); i++) {
            System.out.println("Container "+(i+1)+" contains objects with weight "+containers.get(i).getContents());
        }
    }

    public static boolean checkAllObjectsAssigned (boolean[] objs) {
        for ( int i = 0; i < objs.length; ++i) {
            if (objs[i] == false ) {
                return false;
            }
        }
        return true;
    }
}

class Container {
    private ArrayList<Integer> contents = new ArrayList<Integer>();
    private int maxWeight = 10;
    private int currentWeight = 0;
    
    // Constructor
    Container() {}

    // Getters
    public String getContents() {
        return Arrays.toString(contents.toArray());
    }

    public int getCurrentWeight() {
        return currentWeight;
    }

    // Methods
    public void addToContents(int obj) {
        contents.add(obj);
    }

    public void increaseWeight(int a) {
        this.currentWeight += a;
    }

    public boolean atLimit(int a) {
        if (a + this.currentWeight == maxWeight) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean withinLimit(int a) {
        if (a + this.currentWeight < maxWeight) {
            return true;
        } else {
            return false;
        }
    }
}