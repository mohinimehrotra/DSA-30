package DSA;

import java.util.*;
public class ValidSquare {
	public static int distance(int[] a, int[] b) {
        return (a[0] - b[0]) * (a[0] - b[0]) + (a[1] - b[1]) * (a[1] - b[1]);
    }

    public static boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int[] distances = new int[] {
            distance(p1, p2),
            distance(p1, p3),
            distance(p1, p4),
            distance(p2, p3),
            distance(p2, p4),
            distance(p3, p4)
        };

        Arrays.sort(distances);

        return distances[0] > 0 &&
               distances[0] == distances[1] &&
               distances[1] == distances[2] &&
               distances[2] == distances[3] &&
               distances[4] == distances[5];
    }
public static void main(String args[]) {
	int[] p1 = {0,0}, p2 = {1,1}, p3 = {1,0}, p4 = {0,12};
	int[] p5 = {0,0}, p6 = {1,1}, p7 = {1,0}, p8 = {0,1};
	System.out.println(" Does four coordinates "+Arrays.toString(p1)+" "+Arrays.toString(p2)+" "+Arrays.toString(p3)+" "+Arrays.toString(p4)+" construct a square? " +validSquare(p1,p2,p3,p4));
	System.out.println(" Does four coordinates "+Arrays.toString(p5)+" "+Arrays.toString(p6)+" "+Arrays.toString(p7)+" "+Arrays.toString(p8)+" construct a square? " +validSquare(p5,p6,p7,p8));
}
}
