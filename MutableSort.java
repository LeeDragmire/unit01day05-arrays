public class MutableSort {
    public static void main(String[] args) {
        int[] a = {Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2])};
        /*int b;
        int c;
        int d;
        if (a[0]<a[1]&&a[0]<a[2]) {
            b = a[0];
            if (a[1]<a[2]) {
                c = a[1];
                d = a[2];
            } else {
                c = a[2];
                d = a[1];
            }
        } else if (a[1]<a[0]&&a[1]<a[2]) {
            b = a[1];
            if (a[0]<a[2]) {
                c = a[0];
                d = a[2];
            } else {
                c = a[2];
                d = a[0];
            }
        } else {
            b = a[2];
            if (a[0]<a[1]) {
                c = a[0];
                d = a[1];
            } else {
                c = a[1];
                d = a[0];
            }
        }
        a[0] = b;
        a[1] = c;
        a[2] = d;
        */
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int temp;
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(a[0] + " " + a[1] + " " + a[2]);
    }
}
