package kata;
// #zad 1 (8)
//We need a simple function that determines if a plural is needed or not. It should take a number, and return true if a plural should be used with that number or false if not. This would be useful when printing out a string such as 5 minutes, 14 apples, or 1 sun.
// You only need to worry about english grammar rules for this kata, where anything that isn't singular (one of something), it is plural (not one of something).
//  All values will be positive integers or floats, or zero.
/*
public class Kata {
    public static void main(String[] args) {
    }
    public static boolean isPlural(float f){
        return f != 1;
    }
}
*/

//**
// #zad 2 (8)
/*
You will be given a list of strings. You must sort it alphabetically (case-sensitive, and based on the ASCII values of the chars) and then return the first value.
 The returned value must be a string, and have "***" between each of its letters.
 You should not remove or add elements from/to the array.
import java.util.Arrays;
public class Kata {
    public static void main(String[] args) {
        String[] arr = { "are",
                "www.geeksforgeeks.org",
                "code.geeksforgeeks.org" };
        twoSort(arr);
    }
    public static String twoSort(String[] s) {
        java.util.Arrays.sort(s);
        return String.join("***", s[0].split(""));
    }
}
 */

// #zad 3 (7)
/*
My grandfather always predicted how old people would get, and right before he passed away he revealed his secret!
In honor of my grandfather's memory we will write a function using his formula!
Take a list of ages when each of your great-grandparent died.
Multiply each number by itself.
Add them all together.
Take the square root of the result.
Divide by two.
Example
predictAge(65, 60, 75, 55, 60, 63, 64, 45) === 86
Note: the result should be rounded down to the nearest integer.
Some random tests might fail due to a bug in the JavaScript implementation. Simply resubmit if that happens to you.


public class Kata {
    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
      int[] arr = {age1, age2, age3, age4, age5, age6, age7, age8};
      int val = 0;
      for(int a: arr){
          val += a * a;
      }
      int root = (int) Math.sqrt(val);
        return root / 2;
    }
    public static int squareNumber(int number){
        return number * number;
    }
}
 */



/* #zad 4 (8)
Your task is to sum the differences between consecutive pairs in the array in descending order.

Example
[2, 1, 10]  -->  9
In descending order: [10, 2, 1]

Sum: (10 - 2) + (2 - 1) = 8 + 1 = 9

If the array is empty or the array has only one element the result should be 0 (Nothing in Haskell, None in Rust).


import java.util.Arrays;

public class Kata {
    public static void main(String[] args) {
        sumOfDifferences(new int[] {1, 2, 10});
    }
    public static int sumOfDifferences(int[] arr) {
    Arrays.sort(arr);
    return arr.length <= 1 ? 0 : arr[arr.length-1] - arr[0];


    }
}

 */
/* #zad 5 (8)
Wolves have been reintroduced to Great Britain. You are a sheep farmer, and are now plagued by wolves which pretend to be sheep. Fortunately, you are good at spotting them.

Warn the sheep in front of the wolf that it is about to be eaten. Remember that you are standing at the front of the queue which is at the end of the array:

[sheep, sheep, sheep, sheep, sheep, wolf, sheep, sheep]      (YOU ARE HERE AT THE FRONT OF THE QUEUE)
   7      6      5      4      3            2      1
If the wolf is the closest animal to you, return "Pls go away and stop eating my sheep". Otherwise, return "Oi! Sheep number N! You are about to be eaten by a wolf!" where N is the sheep's position in the queue.

Note: there will always be exactly one wolf in the array.

Examples
Input: ["sheep", "sheep", "sheep", "wolf", "sheep"]
Output: "Oi! Sheep number 1! You are about to be eaten by a wolf!"

Input: ["sheep", "sheep", "wolf"]
Output: "Pls go away and stop eating my sheep"

public class Kata {
    public static String warnTheSheep(String[] array) {
        //Your code)))
        for(int i=0; i<array.length-1;i++) {
            if (array[i].equals("wolf"))
                return "Oi! Sheep number " + (array.length - i - 1) + "! You are about to be eaten by a wolf!";
        }
            return "Pls go away and stop eating my sheep";
    }}
 */

/* #zad 6 (8)
Write a simple regex to validate a username. Allowed characters are:

lowercase letters,
numbers,
underscore
Length should be between 4 and 16 characters (both included).
public static boolean validateUsr(String s) {
    return s.matches("[a-z_\\d]{4,16}");
  }
 */

/* #zad 7 (8)
Your car is old, it breaks easily. The shock absorbers are gone and you think it can handle about 15 more bumps before it dies totally.

Unfortunately for you, your drive is very bumpy! Given a string showing either flat road (_) or bumps (n). If you are able to reach home safely by encountering 15 bumps or less, return Woohoo!, otherwise return Car Dead


public class Kata {
    public static String bumps(final String road) {

       int count=0;
       for(int i =0; i<road.length(); i++){
           if(road.charAt(i) == 'n')
               count++;
       }
       if(count <= 15){
           return "Woohoo!";
       }else
           return "Car Dead";
    }
}
 */



/* #zad 9 (7)
Happy Holidays fellow Code Warriors!
Santa's senior gift organizer Elf developed a way to represent up to 26 gifts by assigning a unique alphabetical character to each gift. After each gift was assigned a character, the gift organizer Elf then joined the characters to form the gift ordering code.

Santa asked his organizer to order the characters in alphabetical order, but the Elf fell asleep from consuming too much hot chocolate and candy canes! Can you help him out?

Sort the Gift Code
Write a function called sortGiftCode/sort_gift_code/SortGiftCode that accepts a string containing up to 26 unique alphabetical characters, and returns a string containing the same characters in alphabetical order.

Examples (Input -- => Output):
"abcdef"                      -- => "abcdef"
"pqksuvy"                     -- => "kpqsuvy"
"zyxwvutsrqponmlkjihgfedcba"  -- => "abcdefghijklmnopqrstuvwxyz"

public class Kata{
    public static void main(String[] args) {
        sortGiftCode("afdscva");
    }
    public static String sortGiftCode(String code){
        char arr[] = code.toCharArray();
        Arrays.sort(arr);
        return new String (arr);
    }
}


public class Kata{
    public static void main(String[] args) {
        greet("Riley");
    }
    public static String greet(String name){
        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        return "Hello " + name + "!";
    }
}
 */

/*
#zad 10 (Akademia kodu 1)
 Dodaj liczby w danym ciągu arytmetycznym:
 public static int sum(int number){

  int n = 10;
        int sum = 0;
    for (int i = 1; i <= n; i++) {
        sum += i;
    }

    sum = (n + 1) + n /2;
    System.out.println(sum);
        }
          }
          return sum;
 */


/*
#zad 11 (Akademia kodu 2)
Zamień dwie liczby. Nie zadziała w metodzie ponieważ to są kopie tych referencji.


class Kata {
public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj pierwszą liczbę");
    int firstNumber = scanner.nextInt();
    System.out.println("Podaj drugą liczbę");
    int secondNumber = scanner.nextInt();
    System.out.println("Wartości przed:");
    System.out.println(firstNumber + " " + secondNumber);
    int thirdNumber = secondNumber;
    secondNumber = firstNumber;
    firstNumber = thirdNumber;
    System.out.println("Wartości po zamianie:");
    System.out.println(firstNumber + " " + secondNumber);
}
}
 */

/*
#zad 12 (Akademia kodu 3)
Porównywanie dwóch stringów

class Kata {
    public static void main(String[] args) {
        String name1 = "Domi";
        String name2 = "Domi";
        String name3 = new String("Domi");
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
        System.out.println(name1 == name3);
        System.out.println(name3.equals(name2));
      StringBuilder stringBuilder = new StringBuilder("Domi");
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        stringBuilder.insert(0, "nap");
        System.out.println(stringBuilder);
    }

}

 */

/* Codility demo task
Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].

import java.util.*;
class Kata {
    public static void main(String[] args) {
        System.out.println(solution((new int[]{2, 4, 6, 5, 7, 100})));
    }
    public static int solution(int[] A){
        Set<Integer> set = new HashSet<>();
        for(int i : A){
            set.add(i);
        }

        for (int i = 1; i <= 100 * 100+1; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return 0;
    }
}
 */

/* # Codility task 1
A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.

For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.

Write a function:

class Solution { public int solution(int N); }

that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.

For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..2,147,483,647].


import java.math.BigInteger;

class kata {
    public static void main(String[] args) {
        int solution = solution(4214);
    }
    public static int solution(int N){
        String s = Long.toBinaryString(N);
        String[] split = s.split("1");
        int max = 0;
        for (int i = 0; i < split.length - 1; i++) {
            int length = split[i].length();
            if(length > max){
                max = length;
            }
        }
        return max;
    }
    }

 */

/* Codility task 2 Arrays
A non-empty array A consisting of N integers is given. The array contains an odd number of elements, and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.

For example, in array A such that:

  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9
the elements at indexes 0 and 2 have value 9,
the elements at indexes 1 and 3 have value 3,
the elements at indexes 4 and 6 have value 9,
the element at index 5 has value 7 and is unpaired.
Write a function:

class Solution { public int solution(int[] A); }

that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.

For example, given array A such that:

  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9
the function should return 7, as explained in the example above.

Write an efficient algorithm for the following assumptions:

N is an odd integer within the range [1..1,000,000];
each element of array A is an integer within the range [1..1,000,000,000];
all but one of the values in A occur an even number of times.

/*
import java.util.HashSet;
import java.util.Set;

public class Kata {
    public static void main(String[] args) {
    }

    public static int solution(int [] A){
        Set<Integer> ints = new HashSet<>();

        for(int a : A){
            if(!ints.contains(a)){
                ints.add(a);
            } else {
                ints.remove(a);
            }
        }

        for(int a: ints){
            return a;
        }return 0;
        }
    }
 */

/*


 */

/*
import java.util.*;

public class Kata {

    public static List<Integer> list (List<Integer> list) {

        List<Integer> newList = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++){
            if(i % 2 == 1){
                newList.add(list.get(i));
            } else {
                secondList.add(list.get(i));
            }

        }
        newList.addAll(secondList);
        return newList;
    }
    public static void main(String[] args) {
      List<Integer> ints = new LinkedList<>();
        Collections.addAll(ints, 2, 6, 9, 3, 1, 0 ,5);
        System.out.println(list(ints));
        //initialize an immutable list from array using asList method


    }
}
*/






/*

package ZadaniaNaRozmowe;

import java.util.List;

public class Kata {
    public static void main(String[] args) {
        List<Integer> newList = List.of(4, 3, 7, 8, 1, 2);

        convertList(newList);
    }
    public static int convertList(List<Integer> numbers){ //metoda typu int o nazwie convertList,jako parametr przyjmuje Listę numbers
        int result = numbers.get(0); // result równa się pierwszej liczbie z listy (4)
        for(int i = 1; i < numbers.size(); i = i+2){ //pętla, i zaczyna od 1, iteruje do wielkości listy, i przeskakuje co dwa indeksy
            if(i == numbers.size()-1){ //jeżeli i jest równe liczbie indeksów listy minus jeden
                result = result + numbers.get(i); //przypisz do zmiennej result: result + aktualną liczbę o indeksie i
            } else { // lub
                result = result + numbers.get(i) * numbers.get(i + 1);
                //przypisz do zmiennej result: aktualną liczbę o indeksie i i pomnóż ją przez liczbę o następnym indeksie
            }
        }
        System.out.println(result);
        return result;
    }

}
*/
//System.out.println(x - x / 2 * 2); zamiennik modulo
/*
import java.util.ArrayList;
import java.util.List;

public class Kata {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 6, 9, 3, 1, 0, 5);
        convertList(numbers);

        int x = 22;

    }
    public static List<Integer> convertList(List<Integer> numbers) {
        ArrayList<Integer> newList = new ArrayList<>();
        ArrayList<Integer> newList2 = new ArrayList<>();
        for(int i = 0; i < numbers.size(); i++){
            if(i % 2 != 0){
               newList.add(numbers.get(i));
            } else {
                newList2.add(numbers.get(i));
            }
        }
        newList.addAll(newList2);
        System.out.println(newList);
        return newList;
    }
}

*/

/*

import java.util.*;
import java.util.stream.Stream;
public class Zad1{
   public static List<Integer> convertList(List<Integer> numbers){
        List<Integer> newList = new LinkedList<>();
        List<Integer> newList2 = new LinkedList<>();
       for (int j = 0; j < numbers.size(); j++) {
           if(j % 2 != 0){
               newList2.add(0, numbers.get(j));
               Collections.reverse(newList2);
           }}
        for (int i = 0; i < numbers.size(); i++) {
            if(i % 2 == 0){
                newList.add(0, numbers.get(i));
            }
            System.out.println(numbers.get(i));
            Collections.reverse(newList);
        }
       List<Integer> newList3 = Stream.concat(newList2.stream(), newList.stream()).toList();
        return newList3;
    }
    public static void main(String[] args) {
        List<Integer> nums = new LinkedList<>();
        Collections.addAll(nums, 2, 6, 9, 3, 1, 0, 5);
        System.out.println(Zad1.convertList(nums));
    }
}



 */
// [2, 6, 9, 3, 1, 0, 5]
// [6, 3, 0, 2, 9, 1, 5]





/*
#zad fibonacci
 */
//
//class Kata {
//    public static int fib(int n){
//        if(n <= 1)return n;
//        System.out.println(n);
//        return fib(n - 1) + fib(n - 2);
//
//
//    }
//    public static void main(String[] args) {
//
//        System.out.println(fib(6));
//    }
//}

/*
fib drugie podejście


class Kata {
    static int fib(int n){
        int a = 0, b = 1, c;

        if(n == 0) {
            return a;
        }
        for (int i =2; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
    public static void main(String[] args) {

        System.out.println(fib(9));
    }
}

*/
/* Java2Blog.com
Question 1 : How to reverse a String in java? Can you write a program without using any java inbuilt methods?

/*
public class Kata {
//    #1 poprzez StringBuffera i reverse i toString
    public static String reverseString(String name){
        StringBuilder stringBuffer = new StringBuilder(name);
     return stringBuffer.reverse().toString();
    }

//    #2 Poprzez for
     static String appendString(String name){
          String reverse = "";
         for (int i = name.length() - 1; i >= 0 ; i--) {
             reverse = reverse + name.charAt(i);

         }
         return reverse;
     }

    public static void main(String[] args) {
        String name = "Dominik";
        System.out.println(reverseString(name));

        System.out.println(appendString("Patrycja"));
    }
}

 */

/*
Question 2 : Write a java program to check if two Strings are anagram in java?
Solution: Two string are anagrams if they have same characters but in different order. For example: Angel and Angle are anagrams
There are few ways to check if Strings are anagrams. Some of them are:

Using String methods
Using array.sort

#1using loop
class Kata {
    static boolean isAnagram(String name1, String name2){
        if(name1.length() != name2.length()) return false;

        for (int i = 0; i < name1.length(); i++) {
            char c = name1.charAt(i);
            System.out.println("c " +c);
            int index = name2.indexOf(c);
            System.out.println("index " + index);

            if(index != -1){
                name2 = name2.substring(0, index) + name2.substring(index + 1, name2.length());
            }
                else return false;


        }
        return name2.isEmpty();

    }


    public static void main(String[] args) {
        System.out.println(isAnagram("Dominik", "kinimoD"));
    }
}
 */

import java.util.Arrays;

/*
#2 using Arrays.sort()

 */
class Kata {
    static boolean isAnagram(String word, String anagram){
        String sortedWord = sortChars(word);
        String sortedAnagram = sortChars(anagram);
        return sortedWord.equals(sortedAnagram);
    }
    static String sortChars(String word){
        char[] wordArr = word.toLowerCase().toCharArray();
        Arrays.sort(wordArr);
        return String.valueOf(wordArr);
    }
}











