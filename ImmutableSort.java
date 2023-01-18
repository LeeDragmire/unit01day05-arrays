public class ImmutableSort {
    public static void main(String[] args) {
        int[] a = {Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2])};
        int[] b = {0,0,0};
        if (a[0]<a[1]&&a[0]<a[2]) {
            b[0] = a[0];
            if (a[1]<a[2]) {
                b[1] = a[1];
                b[2] = a[2];
            } else {
                b[1] = a[2];
                b[2] = a[1];
            }
        } else if (a[1]<a[0]&&a[1]<a[2]) {
            b[0] = a[1];
            if (a[0]<a[2]) {
                b[1] = a[0];
                b[2] = a[2];
            } else {
                b[1] = a[2];
                b[2] = a[0];
            }
        } else {
            b[0] = a[2];
            if (a[0]<a[1]) {
                b[1] = a[0];
                b[2] = a[1];
            } else {
                b[1] = a[1];
                b[2] = a[0];
            }
        }
        System.out.println(a[0] + " " + a[1] + " " + a[2]);
        System.out.println(b[0] + " " + b[1] + " " + b[2]);
    }
}
