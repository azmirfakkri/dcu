public class OOPTester {

    public static void main(String[] args) {

        // first statement
        WindInstrument x = new WindInstrument();
        System.out.println(x.family);
        System.out.println(x.mouthPiece);
        x.printFamily();

        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        // second statement
        Flute y = new Flute();
        y.printFamily();
        y.printNumberOfReed();
        y.printMouthPiece();

        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        // third statement
        x = y;

        // fourth statement
//        y = x;

        // fifth statement
//        y = new WindInstrument();

        // sixth statement
        x = new Flute();

    }
}
