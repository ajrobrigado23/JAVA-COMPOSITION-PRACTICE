public class Main {

    public static void main(String[] args) {

        // We now have all the parts and can put together our personal computer.
        ComputerCase theCase = new ComputerCase("2208", "Dell",
                "240");

        Monitor theMonitor = new Monitor("27inch Beast", "Acer",
                27, "2540 x 1440");

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus",
                4, 6, "v2.44");

        // PERSONAL COMPUTER WILL HAVE SAME MANUFACTURER AND MODEL AS THE COMPUTER CASE
        PersonalComputer thePC = new PersonalComputer("2208", "Dell",
                theMonitor, theMotherboard, theCase); // PASSING THE OTHER OBJECTS.

        // ACCESS TO A COMPOSITE OBJECT'S METHOD. (HOW TO MAKE IT DO ANYTHING)
        thePC.getMonitor().drawPixelAt(10, 10, "red");
        /*
            ONE WAY TO EXECUTING FUNCTIONALITY BY USING THE GETTER METHOD FROM
            PERSONAL COMPUTER TO GET THE INSTANCE OF THE MONITOR CLASS THAT THE PERSONAL COMPUTER CONTAINS.
         */
        thePC.getMotherboard().loadProgram("Window OS");
        // ACCESSING OTHER FUNCTIONS THROUGH THE PC OBJECT-(COMPOSITION).
        thePC.getComputerCase().pressPowerButton();

        /*
            Hide the functionality further - (I don't want anybody to access
            the Monitor, Motherboard or ComputerCase directly)

            -FROM THE CALLING CODE PERSPECTIVE, THIS CODE IN MAIN DIDN'T HAVE TO KNOW ANYTHING ABOUT PERSONAL
            COMPUTER PARTS TO GET THE PC TO DO SOMETHING
         */
        thePC.powerUp();

    }
}
