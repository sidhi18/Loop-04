import java.util.Scanner;

public class Loops_04 {
    public static void main(String[] args) {

        // Prime Number method #1
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");   // taking a number from user
        int n = sc.nextInt();
        int i;
        int a = 0;

        for (i = 1; i <= n; i++) {
            if (n % i == 0) {   // prime number is divisible by 1 and itself
                a++;
            }
        }
        if (a == 2) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is not a Prime Number");
        }


        // Prime Number method #2
        System.out.print("Enter the number : ");   // taking a number from user
        int n2 = sc.nextInt();
        int i2;
        int a2 = 0;
        if (n2 <= 1) {
            System.out.println("Not Prime Number");
        } else {
            for (i2 = 2; i2 <= n2 - 1; i2++) {
                if (n2 % i2 == 0) {
                    a2++;
                }
            }
        }if (a2 != 0) {
            System.out.println(" Not Prime Number");
        } else {
            System.out.println("Prime Number");
        }


        // Prime Number method #3
        System.out.print("Enter the number : ");   // taking a number from user
        int n3 = sc.nextInt();
        int i3;
        int a3 = 0;
        if (n3 <= 1) {
            System.out.println("Not Prime Number");
        } else {
            for (i3 = 2; i3 <= n3 / 2; i3++) {
                if (n3 % i3 == 0) {
                    a3++;
                }
            }
            if (a3 != 0) {
                System.out.println(n3 + " is not a prime number");
            } else {
                System.out.println(n3 + " is a prime number");
            }
        }

            // Prime Number method #4
        System.out.print("Enter the number : ");   // taking a number from user
        int n4 = sc.nextInt();
        int i4;
        int a4 = 0;
            if (n4 <= 1) {
                System.out.println("Not Prime Number");
            } else {
                for (i4 = 2; i4 <= Math.sqrt(n4); i4++) {
                    if (n4 % i4 == 0) {
                        a4++;
                    }
                }
                if (a4 != 0) {
                    System.out.println(n4 + " is not a prime number");
                } else {
                    System.out.println(n4 + " is a prime number");
                }
            }


            //  Prime Number method #5
        System.out.print("Enter the number : ");   // taking a number from user
        int n5 = sc.nextInt();
        int i5;
            boolean prime = true;  // assuming a prime number
            if (n5 <= 1) {
                prime = false;  // 0 and 1 are not prime number
            } else {
                for (i5 = 2; i5 < n5; i5++) {
                    if (n5 % i5 == 0) {
                        prime = false;
                    }
                }
                if (prime) {
                    System.out.println("Prime Number");
                } else {
                    System.out.println("Not Prime Number");
                }
            }

        // print first 10 prime number
        System.out.print("Enter the limit : ");
        int limit = sc.nextInt();
        int i6;
        int i7 ;
        for (i6=2;i6<=limit;i6++){
            int count=0;
            for (i7=1;i7<=i6;i7++){
                if (i6%i7==0){
                    count++;
                }
            } if (count==2){
                System.out.println(i6);
            }
        }


        //  Sum of Prime number upto n
        System.out.print("Enter the limit : ");
        int limit2 = sc.nextInt();
        int i8;
        int i9;
        int sum = 0;
        System.out.println("The series is ");
        for (i8=2;i8<=limit2;i8++){  // Loop starts from 2 to limit
            int count=0;
            for (i9=1;i9<=i8;i9++){   // check for prime number
                if (i8%i9==0){
                    count++;
                }
            }if (count==2){
                System.out.println(i8);
                sum= sum + i8; // sum of prime numbers
            }
        }
        System.out.println("The sum of "+limit2+" prime number is : "+sum);

        }
    }
