package placement;
public class ReverseNumber {

    public static void main(String[] args) {
        int number = 654321;
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        System.out.println("Reversed number: " + reversedNumber);
    }

}
