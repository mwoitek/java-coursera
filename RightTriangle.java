public class RightTriangle {

    public static void main(String[] args) {
        long s1; // First side length
        long s2; // Second side length
        long s3; // Third side length
        boolean are_pos; // Are all side lengths positive?
        boolean pyth_holds; // Does the Pythagorean theorem hold?
        boolean is_right_tri; // Is it a right triangle?
        // Reads the side lengths
        s1 = Long.parseLong(args[0]);
        s2 = Long.parseLong(args[1]);
        s3 = Long.parseLong(args[2]);
        // Determines if all side lengths are positive
        are_pos = (s1 > 0) && (s2 > 0) && (s3 > 0);
        // Determines if the Pythagorean theorem holds
        pyth_holds = (s1 * s1 - s2 * s2 == s3 * s3);
        pyth_holds = pyth_holds || (s2 * s2 - s1 * s1 == s3 * s3);
        pyth_holds = pyth_holds || (s3 * s3 - s1 * s1 == s2 * s2);
        // Determines if we have a right triangle
        is_right_tri = are_pos && pyth_holds;
        System.out.println(is_right_tri);
    }

}
