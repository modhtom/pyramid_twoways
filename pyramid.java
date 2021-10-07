import java.util.Scanner;
public class pyramid{
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the number of rows:");
	int r=input.nextInt();
	int k=0;
    for (int i=1;i<=r;++i,k=0){
    for (int s=1;s<=r-i;++s){
    System.out.print("  ");}
    while (k!=2*i-1) {
    System.out.print("* ");++k;}
    System.out.println();}
}}