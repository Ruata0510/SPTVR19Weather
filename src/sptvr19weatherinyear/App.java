package sptvr19weatherinyear;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void run(){
        int random2;
        int sum;
        int sum0;
        int mitT;
        int sum1;
        double[] myArr = new double[31];
        int[] myArr2 = new int[12];
        int sa;
        byte n = 0, min = 0, max = 0;
        Random random = new Random();
        int[][] tempInYear = new int[12][];
        for(int i=0;i < tempInYear.length;i++){
            switch (i) {
                case 0: min = -25; max=0; n = 31; break;
                case 1: min = -20; max=5; n = 28; break;
                case 2: min = -10; max=10; n = 31; break;
                case 3: min = -5; max=15; n = 30; break;
                case 4: min = 0; max=17; n = 31; break;
                case 5: min = 5; max=20; n = 30; break;
                case 6: min = 10; max=30; n = 31; break;
                case 7: min = 10; max=25; n = 31; break;
                case 8: min = 5; max=20; n = 30; break;
                case 9: min = 0; max=15; n = 31; break;
                case 10: min = -10; max=5; n = 30; break;
                case 11: min = -20; max=0; n = 31; break;
            }
            tempInYear[i] = new int[n];
            for(byte j = 0; j < tempInYear[i].length;j++){
                random2 = random.nextInt(max - min +1) + min;
                tempInYear[i][j]= random2;
                System.out.println(random2);
                myArr[j] = random2;
                myArr2[i] += random2;
            }
        }
        System.out.print("    ");
        for(int i= 1;i<32;i++){
            System.out.printf("%4d",i);
        }
        System.out.println();
        System.out.print("    ");
        for(int i= 1;i<32;i++){
            System.out.printf("%s","----");
        }
        System.out.println();
        int minT = 50;
        int maxT = -50;
        for(byte i = 0;i<tempInYear.length;i++){
            System.out.printf("%2d| ",i+1);
            for(byte j = 0; j < tempInYear[i].length;j++){
                System.out.printf("%4d",tempInYear[i][j]);
                if(tempInYear[i][j]<minT)minT = tempInYear[i][j];
                if(tempInYear[i][j]>maxT)maxT = tempInYear[i][j];
            }
            System.out.println();
        }
        System.out.println("Минимальная температура в году: "+minT);
        System.out.println("Максимальная температура в году: "+maxT);
        System.out.println("Температура в конкретный день года.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите месяц: "); int month = scanner.nextInt();
        System.out.print("Введите день месяца: "); int day = scanner.nextInt();
        System.out.println("В этот день было температура: "+tempInYear[month-1][day-1]+" градус");
       
        for (int x = 0; x < myArr2.length; x++) {
           
        System.out.println("Средняя температура в " + (x+1) + " месяце " + myArr2[x] / tempInYear[x].length);
        }          
       
    }
}