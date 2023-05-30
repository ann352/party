public class Guest {
    private String name;
    private String meal;
    private int phoneNumber;
    private boolean isVegan;

    //we want to create new object already with new fields, so we create in class Guest own constructor
    //e.g. 'this.name' -> this is field of class and 'name' -> it is argument of constructor

    public Guest(String name, String meal, int phoneNumber, boolean isVegan) {
        this.name = name;
        this.meal = meal;
        this.phoneNumber = phoneNumber;
        this.isVegan = isVegan;
    }

    //to get infos about our Guest we have to generate getters for all fields


    public String getName() {
        return name;
    }

    public String getMeal() {
        return meal;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isVegan() {
        return isVegan;
    }

//and to set chosen field we generate setter

//    public void setName(String name) {
//        this.name = name;
//    }

    public void displayInfoAboutGuest() {
        System.out.println("Name of the guest: " + name);
        System.out.println("Favourite meal: " + meal);
        System.out.println("Phone number: " + phoneNumber);
        String isVeganString = isVegan ? "yes" : "no"; //we create String isVeganString,and it will be different regarding of value of variable isVegan
        System.out.println("Is vegan?: " + isVegan);
        System.out.println("Is vegan?: " + isVeganString);
    }
}
