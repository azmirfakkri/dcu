public class Flute extends WindInstrument {

    // subclass variable/constant
    public int numberOfReed = 0;

    // initialises Flute
    public Flute() {
        // super usage 1 - access superclass constructor
        super("Flute", "whistle");
    }

    // child method - print family name
    public void printFamily() {
        // super usage 2 - access superclass method, differentiate method of same name
        super.printFamily();
        System.out.println("This is child method: " + family);
    }

    // child method - print number of reed
    public void printNumberOfReed() {
        System.out.println("This subclass number of reed: " + numberOfReed);
        // super usage 3 - access class variable?
        System.out.println("This superclass number of reed: " + super.numberOfReed);
    }

}
