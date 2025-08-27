import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class main  {
    static int x = 3; //CLASS
    public static void  main(String[] args){
//            hello
//            System.out.print("hello from java\n");
//            System.out.println("yooo");
//           <variable>
//            int x=2;
//            double y=5.222;
//            char a='A';
//            String z = "salah";
//            boolean isbool=true;
//            System.out.println("the int is "+x);
//            System.out.println("the double is "+y);
//            System.out.println("the char is "+a);
//            System.out.println("the string is "+z);
//            System.out.print("the int is "+isbool);
//           <inputs>;
//            Scanner scanner = new Scanner(System.in);
        //  1-for string
//            System.out.println("wats your name ");
//            String name = scanner.nextLine();
//            dont accepte space ;
//            String name = scanner.next();
//            System.out.println(" your name "+name);
////            2-for int
//            System.out.println("whats age :");
//            int age = scanner.nextInt();
//            System.out.println("age is "+age);
        //   2-for double
//            System.out.println("whats gpa :");
//            double gpa = scanner.nextDouble();
//            System.out.println("gpa is "+gpa);
        //   2-for boolean
//            System.out.println("whats isok :");
//            boolean isok = scanner.nextBoolean();
//            System.out.println("ok is "+isok);
//            scanner.close();
//            <L'arithmétique>
//            int num1=2;
//            int num2=6;
//            int res;
//            res=num1+num2;
//            res=num1-num2;
//            res=num1*num2;
//            res=num1 / num2;
//            res=num1%num2;
//            2-Augmented asifgne
//                num2+=num1;
    //        num2-=num1;
    //        num2/=num1;
    //        num2%=num1;
//        Increment and dec Op
    //        num2++
    //        num2--
    //        num2**
//            Oeder ==> [(),exp,*,/,+,-]
//            System.out.println(res);
//            <condition>
//            if (num1 == 5){
//                System.out.println("loka modric");
//            } else if (num1 == 10) {
//                System.out.println("ali mouhifn");
//            }else {
//                System.out.println("free gaza");
//            }
//        <mathématiques>
//        double math=Math.abs(-5);
//        double math=Math.pow(5,2);
//        double math=Math.sqrt(58);
//        double math=Math.round(5.5);
//        double math=Math.floor(-5);
//        double math=Math.ceil(-5);
//        double math=Math.max(-5,55);
//        <Print()>
        // printf() est une méthode permettant de formater la sortie
        // % [flags] [width] [.preciifon] [specifier-character]
        // [specifier-character]

//        String name = "Bob l'éponge";
//        char firstLetter = 'S';
//        int age = 30;
//        double height = 60.5;
//        boolean isEmployed = true;

//        System.out.printf("Bonjour %s\n", name);
//        System.out.printf("Votre nom commence par un %c\n", firstLetter);
//        System.out.printf("Vous avez %d ans\n", age);
//        System.out.printf("Vous mesurez %f pouces\n", height); System.out.printf("Employé : %b\n", isEmployed);
//
//        System.out.printf("%s a %d ans", nom, âge);

        // [.preciifon]

//        double prix1 = 9,99 ;
//        double prix2 = 100,15 ;
//        double prix3 = -54,01 ;
//
//        System.out.printf("%.3f\n", prix1);
//        System.out.printf("%.3f\n", prix2);
//        System.out.printf("%.3f\n", prix3);

            // [flags]

            // + = afficher un ifgne plus
            // , = virgule de séparation de groupe
            // ( = les nombres négatifs sont entourés de ()
            // espace = afficher un ifgne moins if négatif, un espace if poiftif

//        System.out.printf("%f\n", prix1);
//        System.out.printf("%f\n", prix2);
//        System.out.printf("%f\n", prix3);

            // [width]

            // 0 = remplissage par zéros
            // nombre = remplissage justifié à droite
            // nombre négatif = remplissage justifié à gauche

            //        int id1 = 1;
            //        int id2 = 23;
            //        int id3 = 456;
            //        int id4 = 7890;
            //
            //        System.out.printf("id: %04d\n", id1);
            //        System.out.printf("id: %04d\n", id2);
            //        System.out.printf("id: %04d\n", id3);
            //        System.out.printf("id: %04d\n", id4);
//            <Les instructions if imbriquées >

            //        boolean estÉtudiant = true;
            //        boolean estSenior = true;
            //        double prix = 9,99;
            //
            //        if(estÉtudiant){
            //            if(estSenior){
            //                System.out.println("Vous bénéficiez d'une réduction senior de 20 %");
            //                System.out.println("Vous bénéficiez d'une réduction étudiant de 10 %");
            //                prix *= 0,7;
            //            }
            //else{
            //                System.out.println("Vous bénéficiez d'une réduction étudiant de 10 %");
            //                prix *= 0,9;
            //            }
            //        }
            //else{
            //            if(estSenior){
            //                System.out.println("Vous bénéficiez d'une réduction senior de 20 %");
            //                prix *= 0,8; }
            //else{
            //                price *= 1;
            //            }
            //        }
            //
            //        System.out.printf("Le prix d'un billet est : $%.2f", price);

//            <String Méthodes>
//        int length = nom.length();
//        char letter = nom.charAt(0);
//        int index = nom.indexOf(" ");
//        int lastIndex = nom.lastIndexOf("o");
//
//        name = nom.toUpperCase();
//        name = nom.toLowerCase();
//        name = nom.trim();
//        name = nom.replace("o", "a");
//
//        if(name.isEmpty()){
//            System.out.println("Votre nom est vide");
//        }
//        else{
//            System.out.println("Bonjour " + nom); }
//
//        if(name.contains(" ")){
//            System.out.println("Votre nom contient un espace");
//        }
//        else{
//            System.out.println("Votre nom NE CONTIENT AUCUN espace");
//        }
//
//        if(name.equalsIgnoreCase("password")){
//            System.out.println("Votre nom ne peut pas être un mot de passe");
//        }
//        else{
//            System.out.println("Bonjour " + name);
//        }


//        <.substring() = Méthode permettant d'extraire une portion de chaîne>
        // .substring(start, end)

//        Scanner scanner = new Scanner(System.in);
//
//        String email;
//        String username;
//        String domain;
//
//        System.out.print("Entrez votre e-mail : ");
//
//        email = scanner.nextLine();
//
//        if(email.contains("@")){
//            username = email.substring(0, email.indexOf("@"));
//            domain = email.substring(email.indexOf("@") + 1);
//
//            System.out.println(nom d'utilisateur);
//            System.out.println(domaine);
//        }
//        else{
//            System.out.println("Les e-mails doivent contenir @");
//        }
//
//        scanner.close();

//        T____ernurie operator :________
        // opérateur ternaire ? = Renvoie 1 valeur sur 2 si une condition est vraie
        // variable = (condition) ? IfTrue : IfFalse;
//
//        int number = 10;
//
//        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";

//        _____________switch case______________
//        String check="salah";
//        switch (check){
//            case "ahmed"->System.out.println("no");
//            case "khalid"->System.out.println("no");
//            case "salah"->System.out.println("yes");
//            default->System.out.println("noooooot");
//        }
//        _________________LOgique operator_______
//        En Java, les opérateurs logiques permettent de combiner ou d'inverser des expressions booléennes, permettant ainsi d'évaluer les conditions ensemble.
//        (&& pour « et », || pour « ou ») ou inversés (! pour « non »)
// ---------------------- while loop --------------------------

//        String name1 = "";
//
//        while(name1.isEmpty()){
//            System.out.print("Entrez votre nom : ");
//            name1 = scanner.nextLine();
//        }
//        ------------------- random-----------------------
//          Random ranadom = new Random();
//          int ran= ranadom.nextInt(1,5);
//          System.out.println(ran);
//        -------for loop---Break + continue --------------------
//        for(int i =0; i <  5;i++){
//              System.out.println(i);
//                if(i == 3){
//                    break;
//                    continue;
//                }
//        }
//--------------nested loop ------------
//        for(int i = 0; i < rows; i++){
//            for(int j = 0; j < columns; j++){
//                System.out.print(symbol);
//            }
//            System.out.println();
//        }
//        ------------------Method------------
        happyBirthday("salah",20);
        double tst = square(25.3);
        System.out.println(tst);
        // -------------overloaded methods = methods that share the same name,------------
        System.out.println(add(1,2,5));
        System.out.println(add(1,2));
//        -------------------Locale and scoop var -----------
        int x = 1; //LOCAL
        doSomething();

//        -----------------------Array------------------
        String fruits[] = {"salah","lux","limona"};
        Arrays.sort(fruits  );
//        Arrays.fill(fruits,"armonica");
        for(String fruit:fruits){
            System.out.println(fruit);
        }
//        System.out.print(fruit[2]);
//        <Reserch Table >
//        Scanner scanner = new Scanner(System.in);
//
//        String[] fruits = {"apple", "orange", "banana"};
//        boolean isFound = false;
//        String target;
//
//        System.out.print("Enter a fruit to search for: ");
//        target = scanner.nextLine();
//
//        for(int i = 0; i < fruits.length; i++){
//            if(fruits[i].equals(target)){
//                System.out.println("Element found at index: " + i);
//                isFound = true;
//                break;
//            }
//        }
//
//        if(!isFound){
//            System.out.println("Element not found in the array");
//        }
//
//        scanner.close();

        System.out.println(average(1, 2, 3, 4));
    }
    static void doSomething(){

        int x = 2; //LOCAL

        System.out.println(x);
    }
    static int add(int a, int b){
        return a + b;
    }
    static int add(int a, int b,int c){
        return a + b + c;
    }
    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!\n");
    }
    static double square(double number){
        return number * number;
    }
//    --------------------<VARARGS>-----------------------------
    // varargs = allow a method to accept a varying # of arguments
    // makes methods more flexible, no need for overloaded methods
//    it`s use the array
static double average(double... numbers){

    double sum = 0;

    if(numbers.length == 0){
        return 0;
    }

    for(double number : numbers){
        sum += number;
    }

    return sum / numbers.length;
}
}
