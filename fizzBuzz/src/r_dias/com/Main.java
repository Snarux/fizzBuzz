package r_dias.com;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i < 101; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.printf("\n %d: fizz buzz",i);
                continue;  //then skip the iteration
            }

            if (i % 5 == 0) {
                System.out.printf("\n %d: buzz",i);
                continue;  //then skip the iteration
            }

            if (i % 3 == 0) {
                System.out.printf("\n %d: fizz",i);
                continue;  //then skip the iteration
            }
        }
        System.out.printf("\n");

    }

}
