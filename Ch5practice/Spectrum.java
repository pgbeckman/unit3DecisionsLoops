import java.util.Scanner;

public class Spectrum
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Wavelength");
        double wavelength = s.nextDouble();
        if (wavelength>1) {
            System.out.println("Radio");
        }
        else if (wavelength>1e-2) {
            System.out.println("Micro");
        }
        else if (wavelength>7e-7) {
            System.out.println("Infrared");
        }
        else if (wavelength>4e-7) {
            System.out.println("Visible");
        }
        else if (wavelength>1e-8) {
            System.out.println("Ultraviolet");
        }
        else if (wavelength>1e-11) {
            System.out.println("X-rays");
        }
        else {
            System.out.println("Gamma");
        }
    }
}
