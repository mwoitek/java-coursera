public class HelloGoodbye {

    public static void main(String[] args) {
        String name_1 = args[0]; // First name
        String name_2 = args[1]; // Second name
        String names_hello = name_1 + " and " + name_2 + "."; // Names for the hello message
        String names_goodb = name_2 + " and " + name_1 + "."; // Names for the goodbye message
        System.out.println("Hello " + names_hello); // Prints the hello message
        System.out.println("Goodbye " + names_goodb); // Prints the goodbye message
    }

}
