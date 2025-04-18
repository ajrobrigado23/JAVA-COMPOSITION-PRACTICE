// EVEN THOUGHT MY PERSONAL COMPUTER HAS A BUNCH OF STUFF, IT'S STILL A PRODUCT WITH ALL OF PRODUCTS ATTRIBUTES
public class PersonalComputer extends Product {
    /*
        TIPS
            - YOU CAN USE A COMBINATION OF INHERITANCE AND COMPOSITION TO CREATE YOU MODEL.
            - PERSONAL COMPUTER 'IS A' TYPE OF PRODUCT

            - LIMITATION OF INHERITANCE IN JAVA, AND HOW IT ALLOWS YOU TO INHERIT FROM ONLY ONE CLASS AT A TIME,
            YOU COULD SEE THAT YOU WOULD RUN INTO DIFFICULTIES AND LIMITATIONS QUITE QUICKLY IF YOUR ONLY TOOL WAS
            INHERITANCE.

            - MASTER OBJECT

            - DELEGATED THE WORK TO IT'S OBJECTS
     */

    // 3 FIELD, which composed of three other classes.
    private Monitor monitor;
    private Motherboard motherboard;
    private ComputerCase computerCase;

    public PersonalComputer(String model, String manufacturer, Monitor monitor, Motherboard motherboard, ComputerCase computerCase) {
        super(model, manufacturer);
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.computerCase = computerCase;
    }
    // MAKE IT PRIVATE BECAUSE THE ONLY CODE I WANT TO DRAW THE COMPUTER MANUFACTURE LOGO IS THE PERSONAL COMPUTER ITSELF
    private void drawLogo() {
        // We want this class only to use this method
        this.monitor.drawPixelAt(1200, 50, "yellow");
    }
    // When you turn on the computer on you will see the logo come up on the screen.
    public void powerUp() {
        this.computerCase.pressPowerButton();
        // It will draw the logo
        this.drawLogo();
    }

    public Monitor getMonitor() {
        return this.monitor;
    }

    public Motherboard getMotherboard() {
        return this.motherboard;
    }

    public ComputerCase getComputerCase() {
        return this.computerCase;
    }
}
