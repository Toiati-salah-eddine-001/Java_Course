import java.util.Scanner;
public class main  {
    public static void  main(String[] args){
//            hello
            System.out.print("hello from java\n");
            System.out.println("yooo");
//           <variable>
            int x=2;
            double y=5.222;
            char a='A';
            String z = "salah";
            boolean isbool=true;
            System.out.println("the int is "+x);
            System.out.println("the double is "+y);
            System.out.println("the char is "+a);
            System.out.println("the string is "+z);
            System.out.print("the int is "+isbool);
//           <inputs>;
            Scanner scanner = new Scanner(System.in);
        //  1-for string
            System.out.println("wats your name ");
            String name = scanner.nextLine();
//            dont accepte space ;
//            String name = scanner.next();
            System.out.println(" your name "+name);
//            2-for int
            System.out.println("whats age :");
            int age = scanner.nextInt();
            System.out.println("age is "+age);
        //   2-for double
            System.out.println("whats gpa :");
            double gpa = scanner.nextDouble();
            System.out.println("gpa is "+gpa);
        //   2-for boolean
            System.out.println("whats isok :");
            boolean isok = scanner.nextBoolean();
            System.out.println("ok is "+isok);
            scanner.close();
//            <L'arithmétique>
            int num1=2;
            int num2=6;
            int res;
            res=num1+num2;
//            res=num1-num2;
//            res=num1*num2;
//            res=num1 / num2;
//            res=num1%num2;
//            2-Augmented assigne
                num2+=num1;
    //        num2-=num1;
    //        num2/=num1;
    //        num2%=num1;
//        Increment and dec Op
    //        num2++
    //        num2--
    //        num2**
//            Oeder ==> [(),exp,*,/,+,-]
            System.out.println(res);
//            <condition>
//            if (num1 == 5){
//                System.out.println("loka modric");
//            } else if (num1 == 10) {
//                System.out.println("ali mouhsin");
//            }else {
//                System.out.println("free gaza");
//            }
    }
}
