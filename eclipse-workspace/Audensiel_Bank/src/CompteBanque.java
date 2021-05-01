import java.util.Scanner;

    public class CompteBanque {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int userChoice;
            boolean quit = false;
            float balance = 0f;
            do {
                System.out.println("1. Deposit money");
                System.out.println("2. Withdraw money");
                System.out.println("3. Check balance");
                System.out.print("Your choice, 0 to quit: ");
                userChoice = in.nextInt();
                switch (userChoice) {

                    case 1:
                        float amount;
                        System.out.print("Amount to deposit: ");
                        amount = in.nextFloat();
                        if (amount <= 0)
                            System.out.println("Can't deposit nonpositive amount.");
                        else {
                            balance += amount;
                            System.out.println("£" + amount + " has been deposited.");
                             }
                        break;

                    case 2:
                        System.out.print("Amount to withdraw: ");
                        amount = in.nextFloat();
                        if (amount <= 0 || amount > balance)
                            System.out.println("Withdrawal can't be completed.");
                        else {
                            balance -= amount;
                            System.out.println("£" + amount + " has been withdrawn.");
                             }
                        break;

                    case 3:
                        System.out.println("Your balance: £" + balance);
                        break;
                        case 0:
                            quit = true;
                            break;

                            default:
                                System.out.println("Mauvais Choix.");
                                break;
                }
                System.out.println();
            } while (!quit);

            System.out.println("Aurevoir!");
        }

       // pour imprimer un relevé bancaire

        public String toString(String line) {
            int position = 0;
            String[] info = new String[0];
            for(int i = 0; i < position; i++){
                line = info[i];
                position++;
            }
            return info[2]+", "+info[0]+", "+info[1]+", "+info[3];
        }

}
