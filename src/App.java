
import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double a, b, c, halfPerimeter, perimeter, area;

        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            a = -1;
            b = -1;
            while (a <= 0) {
                System.out.print("| Enter side a of right triangle : ");
                a = sc.nextDouble();
            }

            while (b <= 0) {
                System.out.print("| Enter side b of right triangle : ");
                b = sc.nextDouble();
            }

            c = Math.sqrt((a*a) + (b*b));
            System.out.println("| Hypotenuse (c) : " + c);

            halfPerimeter = (a + b + c) / 2;
            perimeter = 2 * halfPerimeter;
            System.out.println("| Perimeter : " + perimeter);

            area = Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
            System.out.println("| Area : " + area);

            System.out.print("| Exit (Y/N) : ");
            exit = Objects.equals(sc.next(), "Y");
            System.out.println("---------");
        }
        sc.close();
    }
}
