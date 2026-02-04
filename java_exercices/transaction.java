import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Scanner;
public class Test{
    public static void main(String[] args){
        ArrayList<String> tracker = new ArrayList<>();
        Scanner Scanner = new Scanner(system.in);
        while(true){
            System.out.println("this is your finnancial tracker");
            System.out.println("1. add transaction");
            System.out.println("2. yesterday transaction");
            System.out.println("3. Total income and expense");
            System.out.println("4. print all");
            System.out.println("5. exit");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:
                    
                    System.out.println("enter transaction type");
                    String type = scanner.nextLine();
                    System.out.println("enter amount");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();
                    LocalDate date = LocalDate.now();
                    tracker.add(type + "," + amount + "," + date);
                    System.out.println("transaction added");
                    break;
                case 2:
                    System.out.println("yesterday transaction");
                    LocalDate yesterday = LocalDate.now().minusDays(1);
                    int count = 0;
                    for (String track : tracker){
                        String[] index = tracker.split(",");
                        if(index[2].equals(yesterday.toString())){
                            count++;
                        }
                    }
                    System.out.println("yesterday transaction"+ count);
                    break;
                case 3:
                    double income = 0;
                    double expense = 0;
                    for (String track : tracker){
                        String[] index = tracker.split(",");
                        String oType = index[0];
                        double oAmount = Double.parseDouble(index[1]);
                        if(oType.equalsIgnoreCase("sale")){
                            income= income + oAmount;
                        }
                        else if(oType.equalsIgnoreCase("purchase")){
                            expense= expense + oAmount;
                        }
                    }
                    System.out.println("total expense : "+ expense);
                    System.out.println("total income : "+ income);
                    break;
                case 4:
                    System.out.println(" print all")
                    System.out.println(tracker);
                    break;
                case 5:
                    System.out.println("Exit tracker");
                    scanner.close();
                    break;
                default:
                    System.out.println("invalid choice")
            }
        }

    }
}