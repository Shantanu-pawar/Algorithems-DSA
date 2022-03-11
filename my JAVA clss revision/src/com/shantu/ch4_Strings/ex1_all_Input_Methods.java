package com.shantu.ch4_Strings;

import java.util.Locale;

public class ex1_all_Input_Methods {

    public static void main(String[] args) {
//        here we see all the input methods from string
        System.out.println();

//        1. length()  = used to get numbers of characters


//        String s = "while you";
//        int a = s.length();
//        System.out.println("the output of String characters are : " + a );
//        // this shows you the output of characters
//        System.out.println();
//
//
//
////        2. to Upper case() | to lower case()
////        this is the type used for converting the Characters  in capital or small
//
//        String s1= "FreeDDy ";
//        String a1 = s1.toUpperCase();
//        String a2 = s1.toLowerCase();
//
//        System.out.println(a1 + ": is the upper cases" + "\n" +
//                            a2 + "all lower case");
//
//        System.out.println();
//
////        3. charAt() = returns characters from String
//
//        char b1 = s1.charAt(3);  //this will return the specific number of char.
//        System.out.println(b1 + ": is the character in string ");
//
//        System.out.println();
//
//
////        4. substring() = it returns part of the String
//
//        String c = "Programming of mind";
//        String c1 = c.substring(2,15); // this returns the substrings from string
//        System.out.println(c1);
//
//        System.out.println();
//
//
////        5. replace() = it replaces all the occurs of given char(s) by another char(S)
////          NOTE :  we can also used this for replacing the characters like use only  ( ' ' )<- this
//
//
//        String d = "shantanu is very active during sessions ";
//        System.out.println("Previous String : " + d);
//
//        String d1 = d.replace("shantanu", "rajjjjjaaaa");
//        System.out.println("New String : " + d1 );
//
//        System.out.println();
//
//
//
////        6. concat () : it basically just combines the two strings in one String
//
//        String e = " rada hua naa";
//        String e1 = "ss ke pass huaa";
//
//        String e2 = e1.concat(e);
//        System.out.println(e2);
//
//        System.out.println();



//
////        7. indexOf() | or lastIndexOf();
////        it returns the index value of given char(s).
//
//        String f = "governments";
//        int f1 = f.indexOf('n');
//        int f2 = f.lastIndexOf('n'); // this shows last index
//        int f3 = f.indexOf("ments");
//
//        System.out.println( " this shows only first index : " + f1);
//        System.out.println("This shows the last index only : "+ f2);
//        System.out.println("this shows only word starting index : " + f3);


//        8. equals() \ equalsIgnoreCase();
//        it compress two String and returns boolean value


//        String g = "Apple";
//        String g1 = "apple";
//
//        boolean g2 = g.equals(g1);
//        boolean g3 = g.equalsIgnoreCase(g1);
//
//        System.out.println("this checks the both strings exact equal or not and return " +
//                "true or false : " + g2 );
//
//        System.out.println("this just ignore the cases only and check both strings : " + g3);



//        9. compareTo() | compareToIgnoreCase();
//        it compares two string and returns ascii difference of them


//        String k = "apple";
//        String k1 = "run";
//        int k2 = k.compareTo(k1);
//        int k3 = k.compareToIgnoreCase(k1);
//
//        System.out.println("this is basically checks the cases and return askii diffrenece :" +
//                k2);
//        System.out.println(k3);



//        10. trim(); -> it basically removes all leading and trailing blanks spaces

//        String l = "    bhauuu    raja     ";
//        String l2 = l.trim();
//
//        System.out.println(l2);
//

//        11. starts with | ends with

        String xx = "program";
        boolean aa = xx.startsWith("gram");
        boolean bb = xx.endsWith("gram");

        System.out.println("it basically check the starting of program :" + aa);
        System.out.println("checks ending of program :" + bb);







    }
}
