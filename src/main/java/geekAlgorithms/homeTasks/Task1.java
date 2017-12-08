package geekAlgorithms.homeTasks;

import geekAlgorithms.theoryAndRealization.QuickPow;

import java.io.*;
import java.util.Scanner;

public class Task1 {

    public static void main (String ... args) {
        Task1 task1 = new Task1();

        task1.indexOfWeight();
        task1.maxNumber();
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
}
