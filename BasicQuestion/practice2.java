package BasicQuestion;

public class practice2 {
    public static void main(String[] args) {
        int sum = 0;
        int [] inventory = {120,50,60,150,200};
        for (int i = 0; i < inventory.length; i++) {
            sum += inventory[i];
        }
        System.out.println(sum);
        /*System.out.println("\n");
        System.out.println("---------------\n");
        System.out.println("\n");
        System.out.println("编号为:\n");
        for (int i = 1001; i <=2000; i++) {
            System.out.print("ORD"+i+"\t");
        }*/
        int findmin = inventory[0];
        int findmax = inventory[0];
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i]<findmin) findmin = inventory[i];
            if (inventory[i]>findmin) findmax = inventory[i];
        }
        System.out.println(findmin);
        System.out.println(findmax);
        double[] sales = {230.5, 120.0, 560.0, 300.5, 410.0};
        double find_min = sales[0];
        double find_max = sales[0];
        double salesSum = 0;
        for (int i = 0; i < sales.length; i++) {
            salesSum += sales[i];
            if (sales[i]<findmin) find_min = sales[i];
            if (sales[i]>findmin) find_max = sales[i];
        }
        System.out.println(salesSum);
        System.out.println(find_min);
        System.out.println(find_max);
    }
}
