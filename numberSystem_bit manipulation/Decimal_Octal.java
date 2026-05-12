public class Decimal_Octal{
    public static void main(String[]args){
        int decimal=26;
        String octal="";
        while(decimal!=0){
            int remainder = decimal%8;
            octal = remainder + octal;
            decimal=decimal/8;
        }
        System.out.println("Octal representation: " + octal);
    }
}