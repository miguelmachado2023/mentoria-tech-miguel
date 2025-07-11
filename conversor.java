import java.util.Scanner;


public class conversor{
    public static void main{String args[]){
        
        double celsius;
        double kelvin;
        double fahrenheit;
        Scanner sc = new Scanner( System.in);
        System.out.println("Qual a temperatura");
        celsius=sc.newDouble();
        kelvin=celsius +273.15;
        fahrenheit=(celsius *9/5)+32;
        System.out.prinln("A temperatura em celsius e "+celsius);
        System.out.prinln("A temperatura em kelvin é:"+ kelvin);
        System.out.println("A temperatura em fahrenheit é:"+ fahrenheit);
    
    }
}