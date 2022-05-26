public class Main {
    public static void main(String[] args) {
        //задача 3.1
        int[ ] weights = new int [3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;

        for (int i = 3-1; i >=0; i--){
            if(weights[i]%2!=0){
                weights [i] = weights [i] + 1;}
            System.out.println(weights[i]);}
        System.out.println("\n");


        // задача 3.2
        double [ ] a = {1.57, 7.654, 9.986, 0, 0, 0, 0, 0, 0, 0, 0, 0,};
        for (int i = a.length-1; i >=0; i--) {
            if (i == 0) {
                System.out.println(a[i]);
                // Это последний член массива
            } else {
                System.out.print(a[i] + " , ");
            }
        }
        System.out.println("\n");
        // задача 3.3
        int [ ] b = { 3, 50, 90, 0, 0, 0, 0, 0, 0, 12};
        for (int i = b.length -1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(b[i]);
                // Это последний член массива
            } else {
                System.out.print(b[i] + " , ");
            }
        }
        }


    }
