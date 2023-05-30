import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;
        Party party = new Party();

        while (shouldContinue) {
            System.out.println("Chose option: ");
            System.out.println("1.Display list of guests");
            System.out.println("2.Add new guest");
            System.out.println("3.Display meals");
            System.out.println("4.Find guest by phone number");
            System.out.println("5.Exit");

            int userChoice = scanner.nextInt();

            //here in loop, we can use switch -> we chose specified action regarding of value of variable given as argument in switch
            //from java 12 instead ":" and -> 'break;' at the end every case we need only "->",for example : case 1 ->  System.out.println("CHOSEN 1"); and only 1 case is executed
            //in old switch like below, when we don't use break instruction, from the case that evaluate to true we execute all instructions to the end
            switch (userChoice) {
                case 1:
                    party.displayGuests(); //when method return nothing we cannot use 'sout'
                    break;
                case 2:
                    party.addGuest();
                    break;
                case 3:
                    party.displayMeals();
                    break;
                case 4:
                    party.displayGuestByPhoneNumer();
                    break;
                case 5:
                    shouldContinue = false;
                    break;
                default:
                    System.out.println("Chose given option");
            }
        }
    }
}

            //if we try to find our guest by phone number that doesn't exist we get NullPointerException -> read about exceptions how to treat them in case not to end program