public class Decimal_Bcd {

    // Function to convert ONE decimal digit to 4-bit BCD
    static String decimalToBCD(int decimal) {

        int binary = 0;
        int place = 1;

        // Convert decimal digit to binary
        while (decimal != 0) {

            int remainder = decimal % 2;

            binary = binary + (remainder * place);

            place = place * 10;

            decimal = decimal / 2;
        }

        // Convert binary number into String manually
        String result = "";

        // Count digits in binary
        int temp = binary;
        int count = 0;

        if (binary == 0) {
            count = 1;
        }

        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        // Add leading zeros to make 4 bits
        for (int i = count; i < 4; i++) {
            result = result + "0";
        }

        result = result + binary;

        return result;
    }

    public static void main(String[] args) {

        int decimal = 45;

        int temp = decimal;

        String bcd = "";

        // Process each decimal digit
        while (temp != 0) {

            int digit = temp % 10;

            temp = temp / 10;

            // Add converted BCD at front
            bcd = decimalToBCD(digit) + " " + bcd;
        }

        System.out.println("Decimal: " + decimal);

        System.out.println("BCD: " + bcd);
    }
}