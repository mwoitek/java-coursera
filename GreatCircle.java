public class GreatCircle {

    public static void main(String[] args) {
        double x1;
        double y1;
        double x2;
        double y2;
        double cos1;
        double cos2;
        double sin1;
        double sin2;
        double sq_root;
        double r = 6371.0; // Mean radius of the Earth in kilometers
        double distance;
        // Reads the coordinates of the points and converts the values from degrees to radians
        x1 = Math.toRadians(Double.parseDouble(args[0]));
        y1 = Math.toRadians(Double.parseDouble(args[1]));
        x2 = Math.toRadians(Double.parseDouble(args[2]));
        y2 = Math.toRadians(Double.parseDouble(args[3]));
        // Evaluates the cosines in the formula for the distance
        cos1 = Math.cos(x1);
        cos2 = Math.cos(x2);
        // Evaluates the squared sines in the formula for the distance
        sin1 = Math.sin((x2 - x1) / 2.0);
        sin1 = sin1 * sin1;
        sin2 = Math.sin((y2 - y1) / 2.0);
        sin2 = sin2 * sin2;
        // Evaluates the square root in the formula for the distance
        sq_root = sin1 + cos1 * cos2 * sin2;
        sq_root = Math.sqrt(sq_root);
        // Uses the haversine formula to calculate the distance
        distance = 2.0 * r * Math.asin(sq_root);
        System.out.println(distance + " kilometers");
    }

}
