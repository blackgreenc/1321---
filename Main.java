import java.util.Scanner;
import java.util.Random;
//1번 -
//class Main {
//  public static void main(String[] args) {
//    Scanner in = new Scanner(System.in);
//    
//    String a = in.next();
//    String b = in.next();
//
//    System.out.println(a+b);    
//  }
//}



//2번 -
//class Main {
//  public static void main(String[] args) {
//    int[] arr = new int[] {5,10,13,22,25};
//
//    int sum = 0;
//
//    for (int i = 0; i<arr.length; i++){
//        if(arr[i] % 5 == 0){
//            sum += arr[i];
//        }
//
//    }
//    System.out.println("sum = " + sum);
//
//  }
//}


//3번 -
//class Main {
//    public static void main(String[] args) {
//    int sum = 1;
//    int totalsum = 0;
//    
//    for(int i = 1; i<=5; i++){
//        
//        sum *= i;
//        totalsum += sum;
//
//    }
//    System.out.println("totalsum = " + totalsum);
//  }
//}


//4번 -
//class Main {
//    public static void main(String[] args) {
//    Scanner in = new Scanner(System.in);
//    String input;
//    int i = 0;
//    char k ;
//
//    int random = ((int)(Math.random()*25) + 66);
//
//    while(true){
//        i++;
//        System.out.println("A부터 Z 사이의 값을 입력하시오 :");
//        input = in.next();
//
//        k = input.charAt(0);
//
//        if(random == (int)k){
//            System.out.println("맞음 " + i + "번 했음");
//            break;
//        }
//
//        else if(random < (int)k){
//            System.out.println("더 작은 값 적어");
//        }
//
//        else{
//            System.out.println("더 큰 값 적어");
//        }
//    }
//
//    System.out.println(random);
//
//  }
//}



//5번 -
//class Main {
//    public static void main(String[] args) {
//        int total = 0;
//        float average = 0;
//        int[][] arr = { {2,3,4,5,6},
//                        {4,6,8,10,12},           
//                        {6,9,12,15,18},
//                        {8,12,16,20,24} };
//        
//        arr[0] = new int[] {6,3,4,5,2};
//        arr[1] = new int[] {12,6,8,10,4};
//        arr[2] = new int[] {18,9,12,15,6};
//        arr[3] = new int[] {24,12,16,20,8};
//   
//
//        for(int i = 0; i<arr.length; i++){
//                if(j >= 1 && j<= 3){
//                    total += arr[i][j];
//                }
//
//        }
//        System.out.println("total = " + total);
//        average = total/12;
//        System.out.println("average = " +  average);
//        
//        
//        for(int i = 0; i<arr.length; i++){
//            for(int j = 0; j< arr[i].length; j++){
//            }
//                System.out.println(arr[i][0] + " " + arr[i][1] + " " + arr[i][2] + " " + arr[i][3] + " " + arr[i][4]);
//        }
//    }
//}



//6번 -
//class Main {
//    public static void main(String[] args) {
//    int sum = 0;
//    int s = 1;
//    int i = 0;
//
//    while(sum < 100){
//        s *= -1;
//        i++;
//        sum += i*s;
//    }
//        
//    System.out.println("num = " + i);
//    System.out.println("sum = " + sum);
//  }
//}



//7번 -
//class Car{
//    void run(){
//        System.out.println("차가 달립니다.");
//    }
//}
//
//public class Main {//Main == CarExam
//    public static void main(String[] args) {
//    Car n =  new Car();
//
//    n.run();
//  }
//}


//8번 -
// public class Main{ // prod8 == Main
//     public static void main(String[] args){
//         String str1 = new String("Hello world");
//         String str2 = new String("Hello world");

//         if(str1 == str2){
//             System.out.println("같은 인스턴스");
//         }
//         else{
//             System.out.println("다른 인스턴스");
//         }

//     }
// }

