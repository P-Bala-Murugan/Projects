import java.util.Scanner;
public class Shopstockcheck {
    public static void main(String args[]) {
        String a = "Milk", b = "Ghee", c = "Butter";
        double milkPrice = 32.50;
        double gheePrice = 48.65;
        double butterPrice = 53.25;
        int milkCode = 101;
        int gheeCode = 102;
        int butterCode = 103;
        int totalMilk = 50;
        int totalGhee = 35;
        int totalButter = 12;
        System.out.println("Stock Description : Code for " + a + " is "+ milkCode +" " + b + " is "+ gheeCode +"  "+ c + " is " + butterCode);
        Scanner code = new Scanner(System.in);
        System.out.println("Please enter the required item :");
        int input = code.nextInt();
        while (input!=milkCode && input!=gheeCode && input!=butterCode) {
            System.out.println("Please Enter the Correct Code Number");
            continue;
        }
            if(input==milkCode){
                System.out.println("You have Selected " + a + ". Total Stock Available :" + totalMilk +". Enter the Required Stock :");
                int milkStock;
                milkStock = code.nextInt();
                System.out.println("The Total Price for the "+ milkStock + " quantity is " + milkPrice*milkStock);
                int avlmStock = totalMilk-milkStock;
                System.out.println("Available Stock is : " + avlmStock);
            }
            else if(input==gheeCode){
                System.out.println("You have Selected " + b +". Total Stock Available :" + totalGhee+ ". Enter the Required Stock :");
                int gheeStock;
                gheeStock = code.nextInt();
                System.out.println("The Total Price for the "+ gheeStock + " quantity is " + gheePrice*gheeStock);
                int avlgStock = totalGhee-gheeStock;
                System.out.println("Available Stock is : " + avlgStock);
            }
            else if(input==butterCode){
                System.out.println("You have Selected " + c+". Total Stock Available :" + totalButter + ". Enter the Required Stock :");
                int butterStock;
                butterStock = code.nextInt();
                System.out.println("The Total Price for the "+ butterStock + " quantity is " + butterPrice*butterStock);
                int avlbStock = totalButter-butterStock;
                System.out.println("Available Stock is : " + avlbStock);
            }
    }
}
