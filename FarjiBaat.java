import java.awt.*;
import java.nio.channels.InterruptedByTimeoutException;
import java.sql.SQLOutput;
import java.util.*;
import java.math.*;
import javax.naming.PartialResultException;
import javax.swing.*;
import java.util.*;
import java.lang.*;

import static java.util.Collections.sort;
import static java.util.Collections.swap;


public class FarjiBaat {
    public static void displayR(Node head){
        Node temp = head;
        if(temp==null) return;
        displayR(temp.next);
        System.out.print(head.data+" ");

        }
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        //use of if
//        Scanner input = new Scanner(System.in);
         /*int age = input.nextInt();
         and&& or|| not!
        if (age > 18) {
            System.out.println("You can Vote");
        } else if (age <= 18 && age >= 0) {
            System.out.println("You can not Vote");
        } else {
            System.out.println("invalid input");
        }
        String z = "";
        while(z.isBlank()) {
            System.out.println("TYPE YOUR NAME BITCH or Enter to Skip");
            z = input.nextLine();
        }
        System.out.printf("%s u bastard why were u skipping...duh!",z);
       do while same hi hai
       for loops hi easy hi hai

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " happy new year");

        }
        //arrays 1s way to assign
        String[] cars = {"porsche","mustang","bmw","tesla"};
        cars[3]="ferrari";
        for (String car : cars) {
            System.out.println(car);
        }

        // arrays assign 2nd way
        String[] cars = new String[4];
        cars[0] = input.nextLine();
        cars[1] = input.nextLine();
        cars[2] = input.nextLine();
        cars[3] = input.nextLine();
        for(String car : cars){
            System.out.println(car);
        }

        // declaring 2D arrays general way
        String[][] letters = new String[3][3];
        letters[0][0] = "A";
        letters[0][1] = "B";
        letters[0][2] = "C";
        letters[1][0] = "D";
        letters[1][1] = "E";
        letters[1][2] = "F";
        letters[2][0] = "G";
        letters[2][1] = "H";
        letters[2][2] = "I";
        // #the better way
        for (String[] letter : letters) {
            System.out.println();
            for (String s : letter) {
                System.out.print(" " + s);
            }
        }
        // average way
        for(int j =0 ; j<letters.length ; j++){
            System.out.println("");
            for (int i = 0; i < letters[j].length; i++) {
                System.out.print(" "+letters[j][i]);
            }
        }

          String name = "Bablu Bhaiya";
       boolean re = name.equalsIgnoreCase("bablu bhaiya");
        System.out.println(re);

       // toUpper toLower charAt isEmpty trim
        // ye sab usefull strilng methods hai aur bhi aa sakte hai
        // reference data type contai some useful methods and are dynamic in nature they are slower is one disadavantage
        // autoboxing in java compiler converts primitive to corresponding wrapper class
        // u can still use reference data type as a primitve data type
        // array list
//        ArrayList<String> inT = new ArrayList<String>();
//        for (int i = 0; i < 5 ; i++) {
//            inT.add(input.nextLine());
//        }
//        System.out.println("your entered items are-:");
//        inT.set(2,"La");
//        for(String s : inT){
//            System.out.println(  s );
//
//        }
//    2d array list is list of lists
        ArrayList<ArrayList<String>> grocery = new ArrayList<ArrayList<String>>();
        ArrayList<String> bakery = new ArrayList<String>();
        bakery.add("Bread");
        bakery.add("Cheese");
        bakery.add("Cake");
        ArrayList<String> shopping= new ArrayList<String>();
        shopping.add("VEGGIES");
        shopping.add("Cupcakes");
        shopping.add("littichokha");
        ArrayList<String> MAterial= new ArrayList<String>();
        MAterial.add("screw");
        MAterial.add("wrench");
        MAterial.add("nuts");
        grocery.add(bakery);
        grocery.add(MAterial);
        grocery.add(shopping);
        System.out.println(grocery.get(1).get(1));
        */
//        for each loop less steps more readable less flexible
//        String[][] letters = new String[3][3];
//        letters[0][0] = "A";
//        letters[0][1] = "B";
//        letters[0][2] = "C";
//        letters[1][0] = "D";
//        letters[1][1] = "E";
//        letters[1][2] = "F";
//        letters[2][0] = "G";
//        letters[2][1] = "H";
//        letters[2][2] = "I";
//         #the better way using for each loop
//       for (String[] letter : letters) {
//            System.out.println();
//            for (String s : letter) {
//                System.out.print(" " + s);
//            }
//        }double pi = 3.141;
//
//        final double pi = 3.1415;
//        System.out.println(pi);


//        Cup cup1 =new Cup("Bon china", 200);
//        Cup cup2 =new Cup("Steel", 400);
//        cup1.display();
//        cup2.display();
//        DiceRoller d1 = new DiceRoller();

//         toStriing textually return an object
//        Cup c1= new Cup();
//        System.out.println(c1.toString());
//
//          inheritance
//        car car = new car();
//        car.go();
//
//        bicycle bicycle = new bicycle();
//        bicycle.stop();
//        System.out.println(car.speed);
//        System.out.println(bicycle.speed);
//        System.out.println(car.doors);
//        System.out.println(car.wheels);
//        System.out.println(bicycle.wheels);
//    method ovverriding
//    Dog dog = new Dog();
//    dog.speak();
//    animal animal = new animal();
//    animal.speak();//use closest method  rather going to inherited method
//protected class are visible to other class if it extends the parent class doesnt matter in which packagee is
//        private is only visible to class which contains it
//encapsulation done
//        array 2d
//        Scanner sc = new Scanner(System.in);
//        System.out.println("rows");
//        int rows = sc.nextInt();
//        System.out.println("cols");
//        int col = sc.nextInt();
//        int[][] arr1 = new int[rows][col];
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j <col ; j++) {
//               arr1[i][j]= sc.nextInt();
//            }
//        }
//        System.out.println();
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < col; j++) {
//                if(arr1[i][j]==12) {
//                    System.out.print(i+","+j);
//
//                }
//            }
//            System.out.println();
//        StringBuilder str = new StringBuilder("hello");
//        for (int i = 0; i < str.length()/2 ; i++) {
//            int front =i;
//            int back = str.length()-i-1;
//            char f = str.charAt(front);
//            char b = str.charAt(back);
//            str.setCharAt(front,b);
//            str.setCharAt(back,f);
//        }
//        System.out.println(str);
//       DigitsOperation s = new DigitsOperation(2390);
//        System.out.println(s.getSumOfDigits());
//        System.out.println(s.getMaxDigit());
//        System.out.println(s.getMinDigit());
//        System.out.println(s.numberToString());
//        System.out.println("enter size of array");
//     int a = sc.nextInt();
//     int[] arr = new int[100];
//        for (int i = 0; i <a ; i++) {
//            arr[i]=sc.nextInt();
//        }
//        bubble sort
//       int b = Integer.MIN_VALUE;
//        for (int i = 0; i <a-1 ; i++) {
//            for (int j = 0; j < a-i-1; j++) {
//                if (arr[j] > arr[j+1]) {
//                    b=arr[j+1];
//                    arr[j+1]=arr[j];
//                    arr[j]=b;
//
//                }
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            int small=i;
//
//        }
//        for (int i = 0; i < a; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println(sum(5));
//
//    }
//    public static int sum(int n){
//        int s=n;
//        if(n==0){
//            return s;
//
//        }
//
//        s+=sum(n-1);
//        return s;
//        int Char =2;
//        int Inte=4;
//        int lng=8;
//        int flt=4;
//        int duble=8;
//        String s=sc.nextLine();
//        switch (s){
//            case "Character":
//                System.out.println(Char);
//                break;
//            case "Integer":
//                System.out.println(Inte);
//                break;
//            case "Long":
//                System.out.println(lng);
//                break;
//            case "Float":
//                System.out.println(flt);
//                break;
//            case "Double":
//                System.out.println(duble);
//                break;
//            default:
//out                System.out.println(-1);
//        }
//        Animal animal;
//        System.out.println("what animal u want");
//        System.out.println("1=dog , 2 = cat");
//        int choice = sc.nextInt();
//        if (choice == 1) {
//            animal = new Dog();
//            animal.speak();
//        } else if (choice == 2) {
//            animal = new Cat();
//            animal.speak();
//        } else {
//            animal = new Animal();
//            System.out.println("invalid choice");
//            animal.speak();
//        }
//        try {
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//            int z = x / y;
//            System.out.println("result " + z);
//        }catch (ArithmeticException e){
//            System.out.println("Cant divide by zero");
//        }catch (InputMismatchException e){
//            System.out.println("Please enter number only");
//        }catch (Exception e){
//            System.out.println("something unexpected happened");
//        }finally {
//            sc.close();
//        int a=0;int b=1;int n=30;
//        System.out.println(a);
//        System.out.println(b);
//        printFib(a,b,n-2);
//        }
//    }
//    static void printFib(int a ,int b, int n){
//        if (n==0){
//            return;
//        }
//        int c=a+b;
//        System.out.println(c);
//        printFib(b,c,n-1);
//        System.out.println(xTon(5,5));
//    }
//    static int xTon(int x , int n){
//        int y=1;
//        if(n%2==0){
//            y=xTon(x,n/2)*xTon(x,n/2);
//        }
//        if(n==1){
//            return y;
//        }
//        else{
//            y=x*xTon(x,n/2)*xTon(x,n/2);
//        }
//
//

//        int T = sc.nextInt();
//        while (T--> 0) {
//            int N = sc.nextInt();
//            int[] A = new int[N];
//            long sum = 0;
//            int minAbsValue = Integer.MAX_VALUE;
//            int negativeCount = 0;
//
//            for (int i = 0; i < N; i++) {
//                A[i] = sc.nextInt();
//                sum += Math.abs(A[i]);
//                if (A[i] < 0) {
//                    negativeCount++;
//                }
//                minAbsValue = Math.min(minAbsValue, Math.abs(A[i]));
//            }
//
        // If we have an odd number of negative numbers
//            if (negativeCount % 2 == 1) {
//                sum -= 2 * minAbsValue;
//            }
//
//            System.out.println(sum);
//        }
//        toh(3 ,"Source","Helper", "Destination");
//
//    }
//    static void toh(int n, String S , String H , String D){
//        if(n==1){
//            System.out.println("Disc "+n+" moved from "+S+" to "+D);
//            return;
//        }
//        toh(n-1,S,D,H);
//        System.out.println("disc "+n+" moved from "+S+" to "+D);
//        toh(n-1 , H , S ,D);

//    xcount(0,"axxbdxde","" , 0);
//
//    }
//   static void xcount(int idx , String str , String NewStr , int count){
//        if(idx==str.length()){
//            for (int i = 0; i < count; i++) {
//                NewStr+='x';
//            }
//            System.out.print(NewStr);
//            return;
//        }
//
//        if(str.charAt(idx)=='x'){
//            count++;
//            xcount(idx+1,str,NewStr , count);
//        }
//        else{
//            NewStr += str.charAt(idx);
//            xcount(idx+1,str,NewStr , count);
//        }

//     repeat("aassddffhhrr",0,"");
//
//   }
//   public static boolean[] map = new boolean[26];
//   static void repeat(String str , int idx , String newstr){
//    if(idx==str.length()){
//        System.out.print(newstr);
//        return;
//    }
//    char currenntChar = str.charAt(idx);
//    if (map[currenntChar - 'a']){
//        repeat(str , idx+1,newstr);
//    }else{
//        newstr += currenntChar;
//        map[currenntChar-'a']=true;
//        repeat(str,idx+1,newstr);
//    }
// print all the subsequences ofa string VIP*****************
//        HashSet<String> set = new HashSet<>();
//        Subsequences(0,"aaaaaaa","" , set);
//   }
//        static void Subsequence(int idx , String str , String Newstr){
//            Scanner sc = new Scanner(System.in);
//            if(str.length()==idx){
//                System.out.println(Newstr);
//            }
//            else{
//                System.out.printf("you want the chracter %c press 1 for yes and 0 for No- " , str.charAt(idx));
//                int a = sc.nextInt();
//                if(a==1){
//                    Newstr += str.charAt(idx);
//                }
//                Subsequence(idx+1 , str   , Newstr);
//            }
//        static void Subsequences(int idx , String str , String Newstr , HashSet<String> set ){
//            if(idx==str.length()){
//                if(set.contains(Newstr)){
//                    return;
//                }else {
//                    System.out.println(Newstr);
//                    set.add((Newstr));
//                    return;
//                }
//            }
//            char Currchar = str.charAt(idx);
//            Subsequences(idx+1 , str , Newstr+Currchar , set);
//            Subsequences(idx+1 , str , Newstr , set);
//            KeypadCombinations(0,"4","");
//        }
//    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
//    static void KeypadCombinations(int idx , String str ,String Combination){
//        if(idx==str.length()){
//            System.out.println(Combination);
//            return;
//        }
//        char CurrChar = str.charAt(idx);
//        String mapping = keypad[CurrChar - '0'];
//        for (int i = 0; i < mapping.length(); i++) {
//            KeypadCombinations(idx+1 , str , Combination+mapping.charAt(i));
//
//        }
//        nCr(0,"abc","");
//    }
//    static void nCr(int idx , String str , String combStr){
//        if(idx==str.length()){
//            System.out.println(combStr);
//            return;
//        }
//        char currchar = str.charAt(idx);
//        for(int i=0 ;i<str.length()-1 ;i++){
//            combStr += currchar;
//            nCr(idx+1,str,combStr);
//        }
//        System.out.println("enter the number you want to find is Evil or not--->");
//        int a = sc.nextInt();
//        System.out.println(DecimaTOBinary(a));
//        EvilNumber(a,0);
//    }
//
//    static StringBuilder  DecimaTOBinary(int n ){
//        StringBuilder bin = new StringBuilder();
//        while(n>0){
//            bin.append(n%2);
//            n=n/2;
//        }
//        bin.reverse();
//        return bin;
//    }
//    static void EvilNumber(int n , int y){
//       StringBuilder store= DecimaTOBinary(n);
//        for (int i = 0; i < store.length(); i++) {
//            if(store.charAt(i)=='1'){
//                y++;
//            }
//        }
//        if(y%2==0){
//            System.out.printf("YES %d is an EVIL NUMBER!!",n);
//        }
//        else {
//            System.out.printf("NO %d is NOT an EVIL number OwO",n);
//        }
//    int T = sc.nextInt();
//    int count=0;
//    ArrayList<Integer> arr2 = new ArrayList<>();
//   while(T-- >0){
//       int N=sc.nextInt();
//       int K=sc.nextInt();
//       ArrayList<Integer> arr1= new ArrayList<>();
//       for(int i=0 ; i<N ; i++){
//           arr1.add(sc.nextInt());
//       }
//       while(K -- >0) {
//           int p = arr1.getFirst() + arr1.getLast();
//           arr2.clear();
//           arr2.addAll(arr1);
//           arr2.removeFirst();
//           arr2.removeLast();
//           arr2.addLast(p);
//           arr1.clear();
//           arr1.addAll(arr2);
//       }
//
//   System.out.println(arr2);
//   }
//         JFrame frame = new JFrame(
//         );
//         frame.setVisible(true);
//         frame.setSize(420,420);
//         frame.setTitle("This Is A Frame");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setResizable(true);
//         ImageIcon img = new ImageIcon("img.jpg");
//         frame.setIconImage(img.getImage());
//         frame.getContentPane().setBackground(Color.cyan);
//         frame.getContentPane().setBackground(Color.ORANGE);
//         JLabel label = new JLabel();
//         label.setText("GUI asaan hai yrr");
//         frame.add(label);
//         ImageIcon img1 = new ImageIcon("IMG1.jpg");
//         label.setIcon(img1);
//         int[] arr={2 ,4 ,6 ,12 ,24 ,34 ,45,  56 ,67};
//         System.out.println(Bin(arr , 56 ));


//    static int Bin(int[] a , int key ){
//        int l=1 , h= a.length , m ;
//         while (l<=h){
//              m=(l+h)/2;
//              if (a[m]==key){
//                    return a[m];
//              }
//              if (key<a[m]){
//                   h=m-1;
//              }
//              if (key>a[m]){
//                   l=m+1;
//              }
//
//         }
//         return 0;
//         Scanner sc =new Scanner(System.in);
//         String a = sc.nextLine();
//        System.out.println(isLucky(Lucky(a)));
//    }
//     static int Lucky(String a){
//         int flag=0;
//         for(int i = 0 ; i<a.length();i++){
//              if(a.charAt(i)=='4' || a.charAt(i)=='7'){
//                   flag++;
//              }
//         }
//         return flag;
//     }
//     static String isLucky(int f){
//         int k=0 , l=0;
//         while(f>0){
//              if(f%10==4|| f%10==7){
//                  l++;
//              }
//              else{
//                   k++;
//              }
//              f=f/10;
//         }
//          if(k==0 && l!=0){
//               return "YES";
//          }
//          return "NO";
//     }
//}
        //brothers

//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(BrotherIsLate(a,b));
//
//    }
//    static int BrotherIsLate(int a , int  b){
//        return switch (a + b) {
//            case 3 -> 3;
//            case 4 -> 2;
//            case 5 -> 1;
//            default -> 0;
//        };
//        int[] a ={1,2,3,4,5,6,9};
//        int[] b ={};
//        for (int i=a.length-1 ; i>0 ; i--){
//            if(a[i]==9){
//
//
//            }
//        }
        // backtracking n queens problem
        //find all solutions and use the one u want
        // arrange 3 kids in a line
//        String a = "ABC";
//        printPerm(a,"");
//
//
//
//
//    }
//    static void printPerm(String str , String perm ){
//        if(str.length()==0){
//            System.out.println(perm);
//            return;
//        }
//        for (int i = 0; i < str.length(); i++) {
//            char currchar=str.charAt(i);
//            String newStr = str.substring(0,i) + str.substring(i+1);
//            printPerm(newStr,perm+currchar);
//        }
//        N queens Problem
//        int target=8;
//        int[] nums={1,2,7};
//        for (int i = 0; i < nums.length-1 ; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if(nums[i]+nums[j]==target && nums[i]!=nums[j]){
//                    int[] a={i,j};
//                    for (int k = 0; k < a.length; k++) {
//                        System.out.print(a[k]);
//
//                    }
//                }
        // heap sort

//
//            }
//        }

//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while(t-->0){
//            long n,k;
//            n=sc.nextInt();
//            k=sc.nextInt();
//         if(k==1){
//             if(n%2==0){
//                 System.out.println("YES");
//             }else {
//                 System.out.println("NO");
//             }
//         } else if (k>n || k==n) {
//             if(n%2==0){
//                 if((n/2)%2==0){
//                     System.out.println("YES");
//                 }else{
//                     System.out.println("NO");
//                 }
//             }else{
//                 if((n/2)%2==0){
//                     System.out.println("NO");
//                 }else{
//                     System.out.println("YES");
//                 }
//             }
//         }
//
//        new Myframe();
//      ------------- linear search --------------
//        int[] arr1={1,2,3,4,5,6,7,8,9,0};
//        int element=12;
//        int found=-1;
//        for (int i = 0; i < arr1.length; i++) {
//            if (arr1[i]==element){
//                found=arr1[i];
//            }
//
//        }
//        if(found!=-1){
//            System.out.println(found);
//        }else{
//            System.out.println(found);
//        }
//     ---------binary search---------(must be sorted elements)
//        int[] arr = {2, 4, 7, 12, 45};
//        System.out.println(BinSearch(arr,12,0,arr.length-1));
//        System.out.println(BinSRec(arr, 45, 0, arr.length - 1));
//       --------------------- oops--------------------
//
//
//
//
//
//
//    Car car1= new Car("chevrolet",2023,30.41);
//    car1.run();
//        Car.model=112;
//        System.out.println(car1.model);    //yaha pr 1 answer dega
//    Car car2 = new Car("maruti suzuki",2013,19);
//        System.out.println(car2.model);    //yaha 2 dena chaiye model ++ ho rha lekin kyui static keyword nhi use kiya hai toh dono objects keliye alag alag model box create ho rha
//            details(car1);
//            details(car2);
//            car2.run();
        // -----------------------implementing Linked List--------------------
//        array list vs Linked list
//                   insert        search
//   arraylist        O(n)           O(1)**
//   linked list      O(1)**         O(n)  variable size , non contiguous memory , insert in O(1) , Search in O(n)
//        linked list form from nodes which have data and refrence pointer
//        a head and a tail of linked list 3types of LL -> singular , double , circular
//        code of LL --
// code is implemented in LL class

// conditional statement inheritance evil numb
//    Node a = new Node(5);
//    Node b = new Node(6);
//    Node c = new Node(7);
//    Node d = new Node(8);
//    a.next=b;
//    b.next=c;
//    c.next=d;
//    displayR(a);
//        FarjiBaat$Node@6acbcfc0
//    }
   int[] a={4,3,8,6};
   BubbleSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);

        }
    }
//    -----------------bubble sort------------------
    static void BubbleSort(int[] arr ){
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1]){
                    int t = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
                
            }  
            
        }
    }

    // -----------interative binary search--------------
     static int BinSearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (arr[mid] < target) {
                end = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }

    //  --------------recursive binary Search-----------------
    static int BinSRec(int[] arr, int target, int st, int end) {
        if (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] > target) {
                return BinSRec(arr, target, st, mid);
            } else if (arr[mid] < target) {
                return BinSRec(arr, target, mid + 1, end);

            } else {
                return mid;
            }

        }
    return -1;
    }
//    --------------creating a class oops revisit---------------
//    static class Car{
//        String name;
//        int make;
//      static int model;
//        double milage;
//        Car(String name,int  make ,double milage){
//            this.name=name;
//            this.make=make;
//            this.milage=milage;
//            model++;
//        }
//        void run(){
//            System.out.println(this.name+" is running");
//        }
//
//    }
//    static void details(Car a){
//        System.out.println(a.name+" ");
//    }
}