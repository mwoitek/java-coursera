public class CMYKtoRGB {

    public static void main(String[] args) {
        double cyan;
        double magenta;
        double yellow;
        double black;
        double white;
        double aux; // Auxiliary variable
        long red;
        long green;
        long blue;
        // Reads the values corresponding to the levels of cyan, magenta, yellow and black
        cyan = Double.parseDouble(args[0]);
        magenta = Double.parseDouble(args[1]);
        yellow = Double.parseDouble(args[2]);
        black = Double.parseDouble(args[3]);
        // Converts from CMYK to RGB
        white = 1.0 - black;
        aux = 255.0 * white;
        red = Math.round(aux * (1.0 - cyan));
        green = Math.round(aux * (1.0 - magenta));
        blue = Math.round(aux * (1.0 - yellow));
        // Prints the RGB values
        System.out.println("red   = " + red);
        System.out.println("green = " + green);
        System.out.println("blue  = " + blue);
    }

}
