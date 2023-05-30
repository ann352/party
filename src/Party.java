import java.util.*;

public class Party { // here we create public class, to which we have access from all places in the program

    private List<Guest> guests = new ArrayList<>();  //then we create private fields with access only from the Party class (java convention)
    //we create in class Party collection with dishes and map with phone numbers and implement proper methods to display those data
    private Set<String> meals = new HashSet<>();
    private Map<Integer, Guest> phoneToGuest = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    //and we create public methods to modify those private fields (java convention), here 'void' method that return any value
    // in  this method we can take given name from user by object of Scanner class;
    public void addGuest() {
        System.out.println("Please insert the name of new guest");
        String name = scanner.nextLine();
        //when we create class Guest with or Constructor -> we need more information from user:
        System.out.println("Please insert favourite meal of the guest");
        String meal = scanner.nextLine();
        System.out.println("Insert guest's phonenumber");
//        int phoneNumber = scanner.nextInt(); -> to proper reading enter we have to use instead nextInt(), conversion from String to int by method valueOf()
        int phoneNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Is our guest a vegan? (Y / N)"); //program didn't wait until we insert info about being vegan, because nextInt() doesn't read enter
        String isVeganString = scanner.nextLine(); //enter is reading here as answer for the question

        boolean isVegan;
        if (isVeganString.equals("Y")) {
            isVegan = true;
        } else {
            isVegan = false;
        }

        //now we can create new Guest object with all those fields
        Guest guest = new Guest(name, meal, phoneNumber, isVegan); //we must use here our constructor, we can use default only if it is explicitly declared
        guests.add(guest);
        // we add here new meal to set meals, and to map with phone number and guests
        meals.add(meal);
        phoneToGuest.put(phoneNumber, guest); //we add here phoneNumber and created above guest object
    }

    //method that return the list of guests
    //    public List<String> getGuests() { in this method we returned the list with names [], but we only want to display a list

    public void displayGuests() {
        for (Guest guest : guests
        ) {
    //            System.out.println(guest.getName()); -> instead displaying info only about a name of the guest we can create in Guest class method that will display all information
            guest.displayInfoAboutGuest();
            System.out.println();
        }
    }

    // now to use class Party in our program we have to create object of this class in Main -> to make this we need use constructor
    // if we don't specify our constructor in Party class, object is created with default constructor that takes no arguments, and create new object with any features

    public void displayMeals() {
        for (String meal : meals
        ) {
            System.out.println(meal);
        }
    }

    public void displayGuestByPhoneNumer() {
        System.out.println("Insert guest's phone number");
        int phoneNumber = Integer.valueOf(scanner.nextLine());
        Guest guest = phoneToGuest.get(phoneNumber); //from our map we take guest by phoneNumber
        guest.displayInfoAboutGuest(); //and then we have to display information about our guest
    }
}
