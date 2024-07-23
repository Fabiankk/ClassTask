class Person {
    private String name;
    private int age;
    private String address;

    // Constructor with three parameters
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method to display the person's details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    // Method that accepts a person object and calls displayDetails method
    public void printCurrentInstance(Person person) {
        person.displayDetails();
    }

    public static void main(String[] args) {
        // Creating an object with your name
        Person person = new Person("Fabian", 21, "Nairobi");

        // Using the object to call the printCurrentInstance method
        person.printCurrentInstance(person);
    }
}