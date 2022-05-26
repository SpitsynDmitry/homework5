public class Main {
    public static void main(String[] args) {
        //задача 2.1
        int[ ] weights = new int [12];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;

        for (int i = 0; i < 12; i++) {
            System.out.print(weights[i] + " , ");

        }
        System.out.println(" ");

         // задача 2.2
        double [ ] a = {1.57, 7.654, 9.986, 0, 0, 0, 0, 0, 0, 0, 0, 0,};
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.println(a[i]);
            } else {
                System.out.print(a[i] + " , ");
            }
        }
        // задача 2.3
        int [ ] b = { 3, 50, 90, 0, 0, 0, 0, 0, 0, 12};
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " , ");
        }
        }


    }
