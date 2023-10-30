import java.util.Arrays;
import java.util.Comparator;

class Item {
    int weight;
    int value;

    Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}

public class fractionalKnapsack{
    double fractionalKnapsack(int W, Item[] arr) {
        double ratio[][] = new double[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            ratio[i][0] = i; // store the original index after sorting
            ratio[i][1] = (double) arr[i].value / arr[i].weight;
        }

        // Sorting in descending order of value-to-weight ratio
        Arrays.sort(ratio, (a, b) -> Double.compare(b[1], a[1]));

        double maxTotalValue = 0;
        int capacity = W;

        for (int i = 0; i < arr.length; i++) {
            int itemIndex = (int) ratio[i][0];
            int itemWeight = arr[itemIndex].weight;
            int itemValue = arr[itemIndex].value;

            if (itemWeight <= capacity) {
                maxTotalValue += itemValue;
                capacity -= itemWeight;
            } else {
                maxTotalValue += (capacity / (double) itemWeight) * itemValue;
                break;
            }
        }

        return maxTotalValue;
    }

    public static void main(String[] args) {
        fractionalKnapsack knapsack = new fractionalKnapsack();
        Item[] items = {
            new Item(10, 60),
            new Item(20, 100),
            new Item(30, 120)
        };
        int capacity = 50;
        double maxTotalValue = knapsack.fractionalKnapsack(capacity, items);
        System.out.println("Maximum total value: " + maxTotalValue);
    }
}
/*
 * public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the capacity of the knapsack: ");
        int capacity = scanner.nextInt();
        
        System.out.print("Enter the number of items: ");
        int numItems = scanner.nextInt();
        Item[] items = new Item[numItems];
        
        for (int i = 0; i < numItems; i++) {
            System.out.print("Enter weight and value for item " + (i + 1) + ": ");
            int weight = scanner.nextInt();
            int value = scanner.nextInt();
            items[i] = new Item(weight, value);
        }

        FractionalKnapsack knapsack = new FractionalKnapsack();
        double maxTotalValue = knapsack.fractionalKnapsack(capacity, items);
        System.out.println("Maximum total value: " + maxTotalValue);
        
        scanner.close();
    }
 */