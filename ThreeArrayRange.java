public class ThreeArrayRange {
    public static void main(String[] args) {
        try {
            int[] a = {Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2])};
            if (a[0]>a[1]&&a[0]>a[2]) {
                if (a[1]>a[2]) {
                    System.out.println(a[0] - a[2]);
                } else {
                    System.out.println(a[0] - a[1]);
                }
            } else if (a[1]>a[0]&&a[1]>a[2]) {
                if (a[0]>a[2]) {
                    System.out.println(a[1]-a[2]);
                } else {
                    System.out.println(a[1]-a[0]);
                }
            } else {
                if (a[0]>a[1]) {
                    System.out.println(a[2]-a[1]);
                } else {
                    System.out.println(a[2]-a[0]);
                }
            }
        } catch (Exception e) {
            System.out.println("try again");
        }
    }
}
