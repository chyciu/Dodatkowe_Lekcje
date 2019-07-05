import java.util.Scanner;

public class QuadraitcEquation {

    static int a, b, c;
    static double delta = Math.pow(b, 2) - (4 * a * c);

    public QuadraitcEquation() {
        this.a = a;
        this.b = b;
        this.c = c;
        this.delta = delta;
    }

    public void getX1AndX2() {
        if (delta > 0) {
            double X1 = (-b - Math.sqrt(delta)) / 2 * a;
            double X2 = (-b + Math.sqrt(delta)) / 2 * a;
            System.out.println(" X1 = " + X1 + " , X2 = " + X2 + ".");
        }
        else if (delta == 0) {
            double X1 = -b / 2 * a;
            System.out.println("X1 = " + X1);
        } else {
            System.out.println("Delta jes mniejsza od zera i nie ma pierwiastków");
        }
    }

    public static void main (String[]args){

            QuadraitcEquation quadraitcEquation = new QuadraitcEquation();

            Scanner input = new Scanner(System.in);
            System.out.println("Podaj A");
            a = input.nextInt();
            System.out.println("Podaj B");
            b = input.nextInt();
            System.out.println("Podaj C");
            c = input.nextInt();

            quadraitcEquation.getX1AndX2();
        }
    }

