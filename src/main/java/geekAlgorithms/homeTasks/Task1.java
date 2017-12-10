package geekAlgorithms.homeTasks;

import geekAlgorithms.theoryAndRealization.QuickPow;

import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;

public class Task1 {

    public static void main (String ... args) {
        Task1 task1 = new Task1();
        task1.randomize();
//        task1.indexOfWeight();
//        task1.maxNumber();
//        task1.swapSimple(5, 7);
//        task1.swapQuick(5, 7);
//        task1.getRootOfSqueareEquation();
            System.out.println(MyRandom.getInstance().myRand());
        System.out.println(MyRandom.getInstance().myRand());
        System.out.println(MyRandom.getInstance().myRand());
        System.out.println(MyRandom.getInstance().myRand());
    }

    private void indexOfWeight () {
        int height = 0;
        int weight = 0;
        double result = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height : ");
        while(input.hasNextInt())
        if(input.hasNextInt()) {
            height = input.nextInt();
            break;
        }else {
            System.out.print("\nTry again : ");
        }
        System.out.print("Enter weight : ");
        while(input.hasNextInt())
            if(input.hasNextInt()) {
                weight = input.nextInt();
                break;
            }else {
                System.out.print("\nTry again : ");
            }
        result = weight / (int)QuickPow.getInstance().pow(height, 2);
        System.out.println(result);
    }

    private void maxNumber () {
        String strData = "";
        int a = 0;
        int b=0;
        int c=0;
        int d=0;
        int mid1 = 0;
        int mid2 = 0;
        File file = new File("resources/task1.txt");
        try {
            System.out.println(file.getAbsolutePath());
            FileInputStream fistr = new FileInputStream(file);
            //BufferedInputStream bis = new BufferedInputStream(fistr);
            BufferedReader bis = new BufferedReader(new InputStreamReader(fistr));
            //while((strData = bis.readLine()) != null){}
            strData = bis.readLine();
            System.out.println(strData);
        } catch (IOException e) {
            System.out.println("Error! " + e.getStackTrace().toString());
        }

        a= Integer.parseInt(strData.split(" ")[0]);
        b= Integer.parseInt(strData.split(" ")[1]);
        c= Integer.parseInt(strData.split(" ")[2]);
        d= Integer.parseInt(strData.split(" ")[3]);

        if(a>b){
            mid1 = a;
        }else {
            mid1 = b;
        }

        if(c>d){
            mid2 = c;
        }else {
            mid2 = d;
        }

        if(mid1>mid2){
            System.out.println("Max element is " + mid1);
        }else {
            System.out.println("Max element is " + mid2);
        }

    }

    private void swapSimple (int a, int b) {
        int c = 0;
        System.out.print("First data is : " + a + ", " + b);
        c = a;
        a = b;
        b = c;
        System.out.println(" Swap is : " + a + ", " + b);
    }

    private void swapQuick(int a, int b) {
        System.out.print("First data is : " + a + ", " + b);
        a =a^b; //если 5 и 7, то тут получается 2(промежуточное значение)
        b = a ^ b;
        a = a ^ b;
        System.out.println(" Swap is : " + a + ", " + b);
    }

    private void getRootOfSqueareEquation () {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        System.out.println("Decision of square equation like A*x^2 + B*x + C = 0");
        System.out.print("Enter A : ");
        while (true) {
            if (scanner.hasNextInt()) {
                a = scanner.nextInt();
                break;
            } else {
                System.out.println("\n Incorrect type. Try again. ");
            }
        }

        System.out.printf("\n Decision of square equation like %d*x^2 + B*x + C = 0", a);
        System.out.println("\nEnter B : ");
        while (true) {
            if (scanner.hasNextInt()) {
                b = scanner.nextInt();
                break;
            } else {
                System.out.println("\n Incorrect type. Try again. ");
            }
        }

        System.out.printf("\nDecision of square equation like %d*x^2 + %d*x + C = 0", a , b);
        System.out.print("\nEnter C : ");
        while (true) {
            if (scanner.hasNextInt()) {
                c = scanner.nextInt();
                break;
            } else {
                System.out.println("\n Incorrect type. Try again. ");
            }
        }
        System.out.printf("\nDecision of square equation like %d*x^2 + %d*x + %d = 0", a , b, c);

        double descriminant = QuickPow.myInstatnce.pow(b, 2) - 4* a*c;
        double root1 = (-b + Math.sqrt(descriminant))/(2*a);
        double root2 = (-b - Math.sqrt(descriminant))/(2*a);
        System.out.println("root1 is " + root1 + " root2 is " + root2);
    }

    private void seasonOfYear (int number) {
        switch (number) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
        }
    }

    private int randomize () {
        int result = (int)(Math.random()*100) - (int)(Math.random()*10);
        System.out.println(result);

        Random rand = new Random(System.currentTimeMillis());//определяем начальную точку случайной последовательности
        System.out.println(rand.nextInt(100));
        return rand.nextInt(100);
        //return result;
    }


}