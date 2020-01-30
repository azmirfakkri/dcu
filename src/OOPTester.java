public class OOPTester {

    public static void main(String[] args) {

        WindInstrument x = new WindInstrument();
        System.out.println(x.family);
        System.out.println(x.mouthPiece);
        x.printFamily();

        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        Flute y = new Flute();
        y.printFamily();
        y.printNumberOfReed();
        y.printMouthPiece();

        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

//        y = new WindInstrument();
//        x = new Flute();

    }
}
