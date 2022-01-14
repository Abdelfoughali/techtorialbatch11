package MentoringWithAhmet.ATMPackage;

//import switchStatement.SwitchPractice;
//
//import java.util.Scanner;
//
//public class ATM {
//    //first let's create a password and cardNumber
////second let's create a scanner to get data from the user username and password
////if i get the wrong password or username 3 times stop the code and say ""Your account is hold. Please contact with customer service"
////let's use do while for it and put if conditions
////if correct then say "Welcome to Bank of America ATM Machine" and "What would you like to do today ?"
////Options: "Withdrawal Deposit Balance Payments Change the Password Exit"
//    //*tips: switch is good to be used for this example
//
////Bills: Gas Electricity Garbage  Shopping
////cost:  45, 69.55, 24.33, 12.44
////options for withdrawal: 5, 10, 20, 30, 40, 50, 75, 100
//public static void main(String[] args) {
//   Scanner scanner =new Scanner(System.in);
//    String cardNumber ="1234567890";
//    String password= "jafar foughali";
//    double balance=100;
//    int [] options={5, 10, 20, 30, 40, 50, 75, 100};
//    String [] bills={"Gas", "Electricity", "Garbage" ," Shopping"};
//    double [] cost ={45, 69.55, 24.33, 12.44};
//
//do {
//
//
//    System.out.println("what is the card number  ");
//    String cardNumber1 = scanner.nextLine();
//    System.out.println("enter you password ");
//    String password1 = scanner.nextLine();
//
//    if (cardNumber.equals(cardNumber1) && password.equals(password1)) {
//        do {
//            System.out.println("welcome to bank of america");
//            System.out.println(" what would you like to do today");
//            System.out.println("1-Withdrawal \n2 -Deposit \n3-Balnace\n4-payement \n5-change the password \n6-exit");
//            int choice =scanner.nextInt();
//            switch (choice){
//                case 1:
//                    for (int i=0;i<options.length;i++){
//                        System.out.println(options[i]+" $ ");
//                    }
//                    System.out.println(" how much you would like to withdraw");
//                    double withdraw =scanner.nextDouble();
//                    if (balance>=withdraw){
//                        balance-=withdraw;
//                        System.out.println("you successfully withdraw the amount"+ withdraw+" from your acount");
//                    }else {
//                        System.out.println(" balance it is not enough  ");
//
//                    }break;
//                case 2:
//                    for (int i=0;i<options.length;i++){
//                        System.out.println(options[i]+" $ ");
//                    }
//                    System.out.println(" how much you would like to withdraw");
//                    double deposit =scanner.nextDouble();
//
//                        balance+=deposit;
//
//                        System.out.println("you successfully deposi the amount"+ deposit+" and your balncais"+balance);
//                break;
//                        case 3 :
//                            System.out.println("you balance" + balance);
//                            break;
//
//                case 4: for (int i=0;i<bills.length;i++){
//                    System.out.println(bills[i] +" "+cost[i]);
//                }Scanner scanner2=new Scanner(System.in);
//                    System.out.println(" which bills you would like to pay");
//                String  BillsNames=scanner2.nextLine();
//                for (int k =0; k<bills.length;k++){
//                    if (BillsNames.equalsIgnoreCase(bills[k])){
//                        if (balance>cost[k]){
//                            balance-=cost[k];
//                            System.out.println(" you successfully paid "+BillsNames+ " and your balcne is"+balance);
//                        }
//                    }
//                }
//            }
//
//            break;
//        }while (true);
//
//
//
//    } else {
//        System.out.println("you cardNumber or password is wrong ? please try again");
//    }while (true);
//
//}while (true);
//
//
//}
//
//
//}
