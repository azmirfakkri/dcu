public class WindInstrument {

    // class attributes or fields
    public String family;
    public String mouthPiece;

    // is this a class attribute or variable?
    public int numberOfReed = 1;

    // initialises WindInstrument
    public WindInstrument() {
        family = "blow instruments";
        mouthPiece = "whistle or reed";
    }

    // constructor
    public WindInstrument(String family, String mouthPiece) {
        this.family = family;
        this.mouthPiece = mouthPiece;
    }

    // parent method - print family
    public void printFamily() {
        System.out.println("This is superclass(parent) family: " + family);
    }

    // parent method - print mouth piece (this method is only available in parent)
    public void printMouthPiece() {
        System.out.println("This is superclass(parent) method - printMouthPiece: " + mouthPiece);
    }
}
