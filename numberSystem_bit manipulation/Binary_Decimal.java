public class Binary_Decimal {
    public static void main(String[] args) {
        int binary = 101010; 
        int decimal = 0,i=0;
        while(binary!=0){
            int digit = binary%10;
            decimal=(digit<<i)+decimal;
            i++;
            binary = binary/10;
        }
        System.out.println("Decimal representation: " + decimal);
    }
}