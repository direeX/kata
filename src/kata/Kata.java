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

/*
#2 using Arrays.sort()


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
 */

/* ======================================================
# zad 3
How to check if String has all unique characters in java


class Kata {
    static boolean hasUniqueChars (String word){
        HashSet<Character> hashSet = new HashSet<Character>();
        for (int i = 0; i < word.length() ; i++) {
            char c = word.charAt(i);
            if(!hashSet.add(c))
                return false;
        }
        return true;
    }

    public static boolean hasAllUniqueChars (String word) {

        for(int index=0;index < word.length(); index ++)   {

            char c =word.charAt(index);
            if(word.indexOf(c)!=word.lastIndexOf(c))
                return false;
        }

        return true;
    }
}
 */

/*=====================================
# zad
Java Program to check if one String is rotation of another.


class Kata {
    public static void main(String[] args) {
        System.out.println(isRotation("abc", "cba"));
    }
    static boolean isRotation(String str, String rotation){
        String str2 = str + str;
        System.out.println(str2);
        if(str2.contains(rotation)){
            return true;
        }
        return false;
    }
}
*/

/*==============================================================
# zad 10
Java Program to Find Smallest and Largest Element in an Array



class Kata{
    public static void main(String[] args) {
        int[] arr = new int[] {12,56,76,89,100,343,21,234};
        findLargestSmallestNumbers(arr);
    }
    static void findLargestSmallestNumbers(int[] arr){
        int smallest = arr[0]; //przypisz pierwszy element tablicy do smallest i largest
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > largest) // jeżeli element od i jest większy od largest
                largest = arr[i]; // przypisz do largest aktualny element tablicy
            else if(arr[i] < smallest) // jezeli element jest mniejszy od smallest
                smallest= arr[i]; //przypisz do smallest element tablicy
        }
        System.out.println("Smallest Number is : " + smallest);
        System.out.println("Largest Number is : " + largest);
    }
}
 */
/* ====================
#zad 11
Java program to find missing number in an array:
class Kata {
    static int missingNumber(int[] arr){
        int n = arr.length+1; //n wynosi długość tablicy + 1 (5)
        int sum = n*(n+1)/2;  // sum wynosi n * n+1 / 2 ;; 5 * (5+1) / 2 = (15)
        int restSum = 0; // restSum wynosi 0, tymczasowa zmienna
        for (int i = 0; i < arr.length; i++) { // pętla for
            restSum+=arr[i]; // resSum dodaje do siebie siebie i kolejną liczbę z tablicy o i indeksie
        }
        int missingNumber = sum - restSum; // brakująca liczba to wynik odejmowania sumy z tablicy
        return missingNumber;

    }
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[] {1, 2, 3, 5}));
    }
}
 */



/*
# zad fibonacci

class Kata{
    static int fib(int number){
        int firstNumber = 0;
        int secondNumber = 1;
        int thirdNumber = 0;
        for (int i = 2; i<number; i++){
            thirdNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
        }
        return thirdNumber;
    }

    public static void main(String[] args) {
        System.out.println(fib(10));
    }
}
 */
/*
import java.util.HashMap;
import java.util.Map;


#zad Find Frequency of each element in an Array using HashMap


class Kata{
    static void freqCounter(int arr[]){
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if ((hm.containsKey(arr[i]))){
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        for(Map.Entry entry:hm.entrySet()){
            System.out.println("Element | Frequency" );
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,4,5,9,7,7,1,4,4,7,7};
        freqCounter(arr);
    }
}
 */

/*
#zad Znajdz drugą największa liczbę w tablicy:

class Kata {


    public static void main(String[] args) {
        int[] arr1={7,5,6};
        int secondHighest=findSecondLargestNumberInTheArray(arr1);
        System.out.println("Second largest element in the array : "+ secondHighest);
    }

    private static int findSecondLargestNumberInTheArray(int[] array) {
        int highest = Integer.MIN_VALUE; // zainicjuj namniejszą wartość
        int secondHighest = Integer.MIN_VALUE; // zainicjuj namniejszą wartość

        for (int i = 0; i < array.length; i++){
            System.out.println("i wynosi: " + i);
            if(array[i] > highest){
                secondHighest = highest; // przydziel druga największą wartość do największej wartości
                highest = array[i]; // przydziel największy do aktualnego elementu pętli
            } else if(array[i] > secondHighest && array[i]!=highest)
                secondHighest = array[i];
        }
        return secondHighest;
    }

}
 */

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;

//import java.util.*;


/*
#zad napisz bubble sorting program

import java.util.Random;

public class Kata {
    public static void main(String[] args) {
       extracted();
    }

    private static void extracted() {
        int[] numbers = getInts();

        //Sorting algorithm here
        boolean swappedSomething = true;

        while (swappedSomething) {
            swappedSomething = false;

            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    swappedSomething = true;
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }


        System.out.println("\nAfter:");
        printArray(numbers);
    }

    private static int[] getInts() {
        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000000);
        }

        System.out.println("Before:");
        printArray(numbers);
        return numbers;
    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}


 */
/*

#zad napisz program który wyświetli parzyste liczby od 1 do 100 rosnąco oraz malejąco


class Kata{
    public static void main(String[] args) {
        extracted();
        desc();

    }
    private static void desc()
    {
        for (int i = 100; i > 1 ; i--) {
            if(i%2 == 0){
                System.out.println(i);
            }

        }
    }
    private static void extracted() {
        for (int i = 1; i<=100; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
}
 */


/*
#zad britenet 1


class Kata{
    public static void main(String[] args) {
        List<Integer> ints = List.of(2,6,9,3,1,0,5);
        numbers(ints);
    }

    static List<Integer> numbers(List<Integer> list){
        ArrayList<Integer> oddArrayList = new ArrayList<Integer>();
        ArrayList<Integer> evenArrayList2 = new ArrayList<Integer>();

        for (int i = 0; i<list.size(); i++){
            if(i % 2 != 0 ){
                oddArrayList.add(list.get(i));
            } else evenArrayList2.add(list.get(i));
        }
        oddArrayList.addAll(evenArrayList2);
        System.out.println(oddArrayList);

        return oddArrayList;
    }
}
 */

/* #zad2 britenet 2
// */
//import java.util.List;
//import java.io.*;
//class Kata {
//    public static void main(String[] args) {
//        List<Integer> newList = List.of(4, 3, 7, 8, 1); // zadeklarowanie listy
//        List<Integer> ints = List.of(2, 6, 9, 3, 1, 0, 5);

//        System.out.println(addAndMultiply6(newList));
//        addAndMultiply3(ints);

//
//    }
////
////        addAndMultiply3(newList); // wywołanie i wyświetlenie metody
//    }
////
//    static int addAndMultiply(List<Integer> list) { // zadeklarowanie metody
//        int result = list.get(0);  // przypisanie pierwszego elementu listy do zmiennej result
//        for (int i = 1; i < list.size(); i = i + 2) { // pętla for, zaczyna iterować od drugiego elementu, do wielkości listy, przeskakuj co drugi element
//            if (i == list.size() - 1) { // jeżeli i równa się długości listy pomniejszonej o 1
//                result += list.get(i); // result wynosi result + aktualny element listy i
//            } else { // lub
//                result += list.get(i) * list.get(i + 1); // result wynosi result + element listy pomnożony przez nastepny element listy
//            }
//        }
//        return result; // zwróc result
//    }

//    public static int addAndMultiply5(List<Integer> list) {
//        int result = list.get(0);
//        for (int i = 1; i < list.size(); i += 2) {
//            if (i == list.size() - 1) {
//                result = result + list.get(i);
//                System.out.println("Dodaję ostatni element do result");
//            } else {
//                System.out.println("result " + result);
//                result = result + list.get(i) * list.get(i + 1);
//                System.out.println("Mnożę result");
//                System.out.println("result" + result);
//                System.out.println("i " + list.get(i));
//            }
//        }
//        return result;
//    }

//    public static int addAndMultiply6(List<Integer> list){
//        int result = list.get(0);
//        for (int i = 1; i < list.size(); i+=2) {
//            if(i == list.size() - 1){
//                result += list.get(i);
//            } else {
//                result += list.get(i) * list.get(i + 1);
//            }
//        }
//        return result;
//    }





    /* zadeklarowanie metody
    przypisanie pierwszego elementu listy do zmiennej result
    pętla for, zaczyna iterować od drugiego elementu, do wielkości listy, przeskakuj co drugi element
    jeżeli i równa się długości listy pomniejszonej o 1
    result wynosi result + aktualny element listy i
     lub
    result wynosi result + element listy pomnożony przez nastepny element listy
     zwróc result
    */



//
//    public static List<Integer> addAndMultiply3 (List<Integer> list){
//        List<Integer> oddList = new ArrayList<Integer>();
//        List<Integer> evenList = new ArrayList<Integer>();
//        for (int i = 0; i < list.size(); i++){
//            if(i % 2 != 0){
//               oddList.add(list.get(i));
//            } else{
//                evenList.add(list.get(i));
//            }
//        }
//      oddList.addAll(evenList);
//        System.out.println(oddList);
//        return oddList;
//    }
// ========================================================================

// # zad posortuj tablicę intów\
/*
public class Kata{
    public static void main(String[] args) {
        int[] numbers = {4, 6, 2, 3, 7, 8, 1, 9, 0};
        printArray(numbers);
        System.out.println("");
//        extracted1(numbers);
        sortArray(numbers);
        printArray(numbers);
    }

    private static void extracted1(int[] numbers) {
        int min;
        for (int i = 0; i < numbers.length; i++) {
            min = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if(numbers[j] < min){
                    min = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = min;
                }
            }
        }
    }

    private static void printArray(int[] numbers) {
        for(int number : numbers) {
            System.out.print(number + " ");
        }
    }

    private static int[] sortArray(int[] array){
        int min;
        for (int i = 0; i < array.length; i++) {
            min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if(array[j] < min){
                    min = array[j];
                    array[j] = array[i];
                    array[i] = min;
                }

            }
        }
        return array;
    }

}
*/

/* #zad napisz program który przesunie wszystkie elementy tablicy o jedno miejsce w lewo.
class Kata {
    public static void main(String[] args) {
        int [] tab = {20, 30, 40};
        int[] result = new int[3];
        for (int i = 0; i < tab.length; i++) {
            if(i == 0){
                result[result.length - 1] = tab[0];
            } else {
                result [i - 1] = tab[i];
            }
        }

    }
}
 */

/*
#zad stwórz listę unikalnych elementów od użytkownika i posortuj je

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//import java.util.*;
class Kata {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
//        int [] arr = new int[]{1, 8, 9, 2, 6, 6, 1, 3, 5, 5};

        System.out.println("Enter 5 integers: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int temp = scanner.nextInt();
            if(!integers.contains(temp))
                integers.add(temp);
        }
        Collections.sort(integers);
        System.out.println(integers);


    }
}
 */

/*
#zad Napisz program który wyświetli sumę, produkt(mnożenie poszczególnych elementów), oraz średnią


class Kata {
    public static void main(String[] args) {
        int [] ints = new int[] {1, 2, -3, 5, 7};

        double sum = 0;
        int product = 1;
        for (int j : ints) {
            sum += j;
            product = product * j;
        }
        System.out.println(sum);
        System.out.println(product);
       double avg = sum / ints.length;
        System.out.println(avg);
    }
}
 */

/*
#zad Napisz program w którym wyliczysz liczbę wystąpień danej liczby

class Kata {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 1, 2, 3, 4};
        int searchElement = 1;

        System.out.println(getNumberOcc(arr, searchElement));
    }
    public static int getNumberOcc(int[] numbers, int searchElement){
        int occ = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(searchElement == numbers[i])
                occ++;
        }
        return occ;
    }
}
 */

/*
#zad napisz program który wskaże najmniejszą i największa liczbę w tabeli


class Kata{
    public static void main(String[] args) {
        int [] numbers = {2,4,6,-3,5};
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            max = Math.max(numbers[i], max);
            min = Math.min(numbers[i], min);
            // lub
            max = (numbers[i] > max) ? numbers[i] : max;
            min = (numbers[i] < min) ? numbers[i] : min;
        }
        System.out.println("max = " + max + " min = " + min);
    }
}
 */

/*
#zad1 Java blog
Java program to reverse a String

class Kata {
    public static void main(String[] args) {
        String blogName = "java2blog";
        StringBuffer sb = new StringBuffer(blogName);
        System.out.println("Reverse of java2blog is:" + sb.reverse());
    }
}
// lub

public class Kata {
    public static void main(String[] args) {
        String blogName = "java2blog";
        String reverse = "";
        for (int i = blogName.length() - 1; i >= 0; i--) {
            reverse = reverse + blogName.charAt(i);
        }
        System.out.println("Reverse of java2blog is: " + reverse);
    }
}
 */


/*
#


class Kata {
    public static void main(String[] args) {
        int[] ints = {5, 3, 65, 1, 0, -1};
        String [] strings = {"aa", "dsd", "D32d23", "0f23fi2j"};
        Arrays.sort(ints);
        Arrays.sort(strings);
        String [] newStrings = {};

        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(strings));
    }
}
 */
/*
Sortowanie w ujemnej kolejnośći
SortArrayExample2.java

public class SortArrayExample2
{
public static void main(String[] args)
{
//creating an instance of an array
int[] arr = new int[] {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};
System.out.println("Array elements after sorting:");
//sorting logic
for (int i = 0; i < arr.length; i++)
{
for (int j = i + 1; j < arr.length; j++)
{
int tmp = 0;
if (arr[i] > arr[j])
{
tmp = arr[i];
arr[i] = arr[j];
arr[j] = tmp;
}
}
//prints the sorted element of the array
System.out.println(arr[i]);
}
}
}


class Kata{
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(3, 2, 1, 545, 12);

    miniMaxSum(al);
    }
    public static void miniMaxSum(List<Integer> arr) {

        Collections.sort(arr);
        System.out.println(arr);


    }
}


    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        int min = 0;
        for(int i = 0; i < arr.size() - 1; i++){
            min+= arr.get(i);
        }
        int max = 0;
        for(int i = 1; i < arr.size(); i++){
            max+= arr.get(i);
        }
        System.out.println(min + " " + max);
    }
 */

//public class Kata {
//    public static List<Integer> listConverter(List<Integer> list){
//        List<Integer> even = new ArrayList<>();
//        List<Integer> odd = new ArrayList<>();
//        for (int i = 0; i < list.size(); i++) {
//            if(i % 2 == 0){
//                even.add(list.get(i));
//            } else {
//                odd.add(list.get(i));
//            }
//        }
//        odd.addAll(even);
//        System.out.println(odd);
//        return odd;
//    }
//    public static void main(String[] args) {
//        List<Integer> newList = List.of(2, 6, 9, 3, 1, 0, 5);
//        listConverter(newList);
//    }
//}

//class Kata {
//    static int listConverter(List<Integer> list){
//        int result = list.get(0);
//        for (int i = 1; i < list.size(); i+=2) {
//            if(i == list.size() - 1){
//                result += list.get(i);
//            } else {
//                result += list.get(i) * list.get(i + 1);
//            }
//        }
//        return result;
//    }
//    public static void main(String[] args) {
//        List<Integer> newList = List.of(4, 3, 7, 8, 1);
//        System.out.println(listConverter(newList));
//    }
//}
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//class Kata{
//    public static void main(String[] args) {
//        List<Integer> newList = List.of(4, 3, 7, 8, 1);
//        System.out.println(addAndMultiply(newList));
//    }
//    static int addAndMultiply(List<Integer> list) {
//        int sum = list.get(0);
//        for (int i = 1; i < list.size(); i+=2) {
//            if(i == list.size() -1){
//                sum += list.get(i);
//            } else {
//                sum += list.get(i) * list.get(i + 1);
//            }
//        }
//        return sum;
//    }
//}
//class Kata {
//    public static void main(String[] args) {
//    int[] arr = {1, 2, 3 ,4 ,5};
//    int sum = 0;
//        for (int i = 0; i < arr.length ; i++) {
//            sum+= arr[i];
//        }
//        System.out.println(sum);
//    }
//}


// # Codility demo:
//import java.util.Arrays;
//
//public class Kata {
//
//    public static void main(String[] args) {
//        int[] arr = {5, 2, 5, 7, 1, 2, 3, 6};
//        System.out.println(solution(arr));
//    }
//    public static int solution(int[] A) {
//      int smallest = 1;
//      Arrays.sort(A);
//        for (int i = 0; i < A.length; i++) {
//            if(A[i] == smallest){
//                smallest++;
//            }
//        }
//        return smallest;
//
//        }
//    }


 // # codility 1 binary gap
//
//class Kata {
//    public static void main(String[] args) {
//        int solution = solution(52);
//        System.out.println(solution);
//    }
//
//        public static int solution(int N){
//            String s = Long.toBinaryString(N);
//            int modifier = 0;
//            if(s.endsWith("0")){
//                modifier = 1;
//            }
//            String[] split = s.split("1");
//            int max = 0;
//            for (int i = 0; i < split.length - modifier; i++) {
//                int length = split[i].length();
//                if(length > max){
//                    max = length;
//                }
//            }
//            return max;
//        }
//
//
//
//}
/*
import java.util.*;

class Kata {
    public static void main(String[] args) {
//        List<Integer> ints = new ArrayList<>();
//        Collections.addAll(ints, 2, 6, 9, 3, 1, 0, 5);
//        List<Integer> numbers = List.of(2, 6, 9, 3, 1, 0, 5);

        List<Integer> ints = List.of(2, 6, 9, 3, 1, 0, 5);
        System.out.println(oddEvenList(ints));
    }

    public static List <Integer> oddEvenList(List <Integer> list) {
        List <Integer> newList = new ArrayList<>();
        List <Integer> secondList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if(i%2!=0){
                newList.add(list.get(i));
            } else {
                secondList.add(list.get(i));
            }
        }
         newList.addAll(secondList);
        return newList;
    }
}
*/

//import java.util.List;

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
import java.util.*;
class Kata {
    public static void main(String[] args) {
        List<Integer> list = List.of(4,3,7,8,1);
        System.out.println(addAndMultiply(list));

    }
    public static int addAndMultiply (List<Integer> list){
        int result = list.get(0);
        for (int i = 1; i < list.size(); i+=2) {
            if(i == list.size() - 1){
                result += list.get(i);
            } else {
                result += list.get(i) * list.get(i + 1);
            }
        }
return result;
    }
}
*/
/*
import java.util.*;
class Kata {
    public static void main(String[] args) {
        List<Integer> list = List.of(4,3,7,8,1);
        System.out.println(addAndMultiply(list));
    }
    public static int addAndMultiply(List<Integer> list){
        int result = list.get(0);
        for (int i = 1; i < list.size(); i+=2) {
            if(i == list.size() - 1){
                result+= list.get(i);
            } else {
                result+= list.get(i) * list.get(i + 1);
            }
        }
        return result;

    }
}
*/
/*
#LISTY
1. Write a Java program to create a new array list, add some colors (string) and print out the collection. Go to the editor

class Kata {
    public static void main(String[] args) {
        List<String> list = List.of("red", "blue", "black");
        System.out.println(list);
        for (String color:list){
            System.out.print(color + " ");
        }
    }
}
 */
/*
2. Write a Java program to iterate through all elements in an array list.

class Kata {
    public static void main(String[] args) {
        List<String> list = List.of("aa", "bb", "cc");
        for(String letters: list){
            System.out.println(letters);
        }
    }
}
 */
/*
3. Write a Java program to insert an element into the array list at the first position


import java.util.*;
class Kata {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(0, 5);
        System.out.println(list);
    }
}
 */
/*
 Write a Java program to retrieve an element (at a specified index) from a given array list.

import java.util.List;
class Kata{
    public static void main(String[] args) {
        List<String> list = List.of("burek", "reksio", "pusia");
        String name = list.get(2);
        System.out.println(name);

    }
}
 */
/*
5. Write a Java program to update specific array element by given element

import java.util.ArrayList;
import java.util.List;
class Kata {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("nnn");
        list.add("aaa");
        list.add("ttt");
        list.add("aaa");
        list.set(3, "lll");
        System.out.println(list);
    }
}
*/

//import java.util.ArrayList;

/*
6. Write a Java program to remove the third element from a array list.

import java.util.*;
 class Kata {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("nnn");
        list.add("aaa");
        list.add("ttt");
        list.add("aaa");
        list.remove(2);
        System.out.println(list);
    }
}
 */
/*
7. Write a Java program to search an element in a array list

import java.util.*;
class Kata{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("blue");
        list.add("green");
        list.add("yellow");
        list.add("white");
        System.out.println(list.contains("yellow"));
    }
}
 */
 /*
 8. Write a Java program to sort a given array list

import java.util.*;
class Kata {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(212312);
        list.add(354543);
        list.add(212);
        list.add(9);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
 */
/*
9. Write a Java program to copy one array list into another


import java.util.*;
class Kata{
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(2);
        list1.add(3);
        list1.add(4);

        list2.add(5);
        list2.add(6);
        list2.add(7);

        System.out.println("List 1 " + list1);
        System.out.println("List 2 " + list2);
        Collections.copy(list1, list2);
        System.out.println(list1);
        System.out.println(list2);

    }
}
 */
/*
10. Write a Java program to shuffle elements in a array list


import java.util.*;
class Kata{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("red");
        list.add("blue");
        list.add("green");
        list.add("yellow");
        list.add("white");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
 */
/*
11. Write a Java program to reverse elements in a array list


import java.util.Collections;
import java.util.List;

class Kata {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("red");
        list.add("blue");
        list.add("green");
        list.add("yellow");
        list.add("white");
        System.out.println(list);

        System.out.println(reverseList(list));

    }

    static ArrayList<String> reverseList (ArrayList<String> list){
        Collections.reverse(list);
        return list;

    }
}
 */
 /*
 12. Write a Java program to extract a portion of a array list

import java.util.List;
class Kata{
    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        System.out.println("Original list: " + list_Strings);
//        List<String> sub_List = list_Strings.subList(1, 3);
//        System.out.println("List of first three elements: " + sub_List);
        System.out.println("ddd" + listExtracter(list_Strings));
    }

    public static List<String> listExtracter (List<String> list){
        return list.subList(1, 3);
    }
        }
          */
  /*
  13. Write a Java program to compare two array lists.

import java.util.ArrayList;
import java.util.*;
class Kata {
    public static void main(String[] args) {
        ArrayList<String> c1= new ArrayList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2= new ArrayList<>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        ArrayList<String> c3 = new ArrayList<>();
        for (String e : c1)
            c3.add(c2.contains(e) ? "Yes" : "No");
        System.out.println(c3);

        System.out.println("metoda: " + listComparator(c1, c2));
    }

    public static ArrayList<String> listComparator (ArrayList <String> list1, ArrayList<String> list2){
        ArrayList<String> list3 = new ArrayList<>();
        for (String e : list1){
            list3.add(list2.contains(e) ? "Yes" : "No");

        }
        return list3;
    }
}
  */
   /*
   14. Write a Java program of swap two elements in an array list


import java.util.ArrayList;
import java.util.Collections;
public class Kata {
    public static void main(String[] args) {
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        System.out.println("Array list before Swap:");
        System.out.println(c1);
//        for(String a: c1){
//            System.out.println(a);
//        }
        //Swapping 1st(index 0) element with the 3rd(index 2) element
//        Collections.swap(c1, 0, 2);
//        System.out.println("Array list after swap:");
//        System.out.println(c1);
//        for(String b: c1){
//            System.out.println(b);
//        }
        System.out.println("After method swap: ");
        swapList(c1);
    }

    public static void swapList (ArrayList<String> list){
        Collections.swap(list, 0, 2);
        System.out.println(list);

    }
}
  */
    /*
    15. Write a Java program to join two array lists


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kata {
    public static void main(String[] args) {
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("List of first array: " + c1);
        ArrayList<String> c2= new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        System.out.println("List of second array: " + c2);

        // Let join above two list
        ArrayList<String> a = new ArrayList<String>();
        a.addAll(c1);
        a.addAll(c2);
        System.out.println("New array: " + a);

        System.out.println("method: " + joinLists(c1, c2));

    }
    public static List<String> joinLists (List<String> list1, List<String> list2){
        ArrayList<String> newList = new ArrayList<>();
        newList.addAll(list1);
        newList.addAll(list2);
        return newList;
    }
}
*/

/*
16. Write a Java program to clone an array list to another array list


import java.util.ArrayList;
import java.util.Collections;
public class Kata {
    public static void main(String[] args) {
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original array list: " + c1);
//        ArrayList<String> newc1 = (ArrayList<String>)c1.clone();
//        System.out.println("Cloned array list: " + newc1);
        System.out.println("Cloned array list: " + cloneList(c1));
    }
    public static ArrayList<String> cloneList (ArrayList<String> list){
        return (ArrayList<String>) list.clone();
    }
}
 */

/*
17. Write a Java program to empty an array list.

import java.util.ArrayList;
import java.util.Collections;
public class Kata {
    public static void main(String[] args) {
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original array list: " + c1);
//        c1.removeAll(c1);
        System.out.println("Array list after remove all elements "+c1);

        listCleaner(c1);
        System.out.println("method " + c1);
    }
    public static void listCleaner(ArrayList<String> list){
        list.removeAll(list);
    }
}

 */

/*
18. Write a Java program to test whether an array list is empty or not

import java.util.ArrayList;
import java.util.Collections;
public class Kata {
    public static void main(String[] args) {
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original array list: " + c1);
        System.out.println("Checking the above array list is empty or not! "+c1.isEmpty());
        c1.removeAll(c1);
        System.out.println("Array list after remove all elements "+c1);
        System.out.println("Checking the above array list is empty or not! "+c1.isEmpty());

        System.out.println("method: " + isEmptyList(c1));
    }

    public static boolean isEmptyList(ArrayList<String> list){
        return list.isEmpty();
    }
}

 */

/*
19. Write a Java program for trimming the capacity of an array list.

import java.util.ArrayList;
import java.util.Collections;
public class Kata {
    public static void main(String[] args) {
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original array list: " + c1);
        System.out.println("Let trim to size the above array: ");
//        c1.trimToSize();
        trimList(c1);
        System.out.println(c1);
    }

    public static void trimList(ArrayList<String> list){
        list.trimToSize();
    }
}

 */

/*
20. Write a Java program to increase an array list size.

import java.util.ArrayList;
import java.util.Collections;
public class Kata {
    public static void main(String[] args) {
        ArrayList<String> c1= new ArrayList<String>(3);
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        System.out.println("Original array list: " + c1);
        //Increase capacity to 6
//        c1.ensureCapacity(6);
        increaseListSizeTo6(c1);
        c1.add("White");
        c1.add("Pink");
        c1.add("Yellow");
        System.out.println("New array list: " + c1);
    }
    public static void increaseListSizeTo6(ArrayList<String> list){
        list.ensureCapacity(6);
    }
}
 */
/*
21. Write a Java program to replace the second element of an ArrayList with the specified element

import java.util.ArrayList;
public class Kata {
    public static void main(String[] args){
        ArrayList<String>  color = new ArrayList<String>();

        color.add("Red");
        color.add("Green");

        System.out.println("Original array list: " + color);
        replaceSecondElement(color, "purple");
        System.out.println(color);
//        String new_color = "White";
//        color.set(1,new_color);

//        int num=color.size();
//        System.out.println("Replace second element with 'White'.");
//        for(int i=0;i<num;i++)
//            System.out.println(color.get(i));
    }
    public static void replaceSecondElement(ArrayList<String> list, String newColor){
        list.set(1, newColor);
    }
}
 */


/*
22. Write a Java program to print all the elements of an ArrayList using the elements' position
import java.util.ArrayList;
public class Kata {
    public static void main(String[] args) {
        ArrayList <String> c1 = new ArrayList <String> ();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("\nOriginal array list: " + c1);
        System.out.println("\nPrint using index of an element: ");
        listPrinter(c1);
//        int no_of_elements = c1.size();
//        for (int index = 0; index < no_of_elements; index++)
//            System.out.println(c1.get(index));
    }

    public static void listPrinter(ArrayList<String> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));


        }
    }
}
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteratorRemoveExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(18);
        numbers.add(25);
        numbers.add(40);

        Iterator<Integer> numbersIterator = numbers.iterator();
        while (numbersIterator.hasNext()) {
            Integer num = numbersIterator.next();
            if(num % 2 != 0) {
                numbersIterator.remove();
            }
        }

        System.out.println(numbers);
    }
}
*/

/*
LINKED LIST
1. Write a Java program to append the specified element to the end of a linked list.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Kata {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> l_list = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");
        l_list.add("Yellow");

        // print the list
        System.out.println("The linked list: " + l_list);
        appendToList(l_list, "blue");
        System.out.println("The linked list: " + l_list);
    }
    public static void appendToList(List<String> list, String element) {
        list.add(element);
    }
}

 */

/*
2. Write a Java program to iterate through all elements in a linked list.


import java.util.LinkedList;
public class Kata {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> l_list = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");
        // Print the linked list
        for (String element : l_list) {
            System.out.println(element);
        }
    }
}



/*
3. Write a Java program to iterate through all elements in a linked list starting at the specified position

import java.util.LinkedList;
import java.util.Iterator;
public class Kata {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> l_list = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");
// set Iterator at specified index
        Iterator p = l_list.listIterator(1);

        // print list from second position
        while (p.hasNext()) {
            System.out.println(p.next());
        }
    }
    static void iterateList(LinkedList<String> list){
        Iterator p = list.listIterator(1);
        while(p.hasNext()){
            System.out.println(p.next());
        }
    }
}
 */

/*
4. Write a Java program to iterate a linked list in reverse order


import java.util.LinkedList;
import java.util.Iterator;
public class Kata {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> l_list = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("orange");

        // print original list
        System.out.println("Original linked list:" + l_list);

        Iterator it = l_list.descendingIterator();

        // Print list elements in reverse order
        System.out.println("Elements in Reverse Order:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        listPrinter(l_list);
    }

    static void listPrinter(LinkedList<String> list){
        Iterator it = list.descendingIterator();
        System.out.println("Elements in reverse order:");

        while(it.hasNext()){
            System.out.println(it.next());
        }
        }
    }


 */
/*
5. Write a Java program to insert the specified element at the specified position in the linked list

import java.util.LinkedList;
public class Kata {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList <String> l_list = new LinkedList <String> ();
        // use add() method to add values in the linked list
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");
        System.out.println("Original linked list: ");
        System.out.println("Let add the Yellow color after the Red Color: " + l_list);
        l_list.add(1, "Yellow");
        // print the list
        System.out.println("The linked list:" + l_list);
        addList(3, l_list, "yellow");
        System.out.println(l_list);
    }

    static void addList (int index, LinkedList<String> list, String color){
        list.add(index, color);
    }
}

 */
/*
6. Write a Java program to insert elements into the linked list at the first and last positions.

import java.util.LinkedList;
import java.util.Scanner;

public class Kata {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> l_list = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        System.out.println("Original linked list:" + l_list);
        // Add an element at the beginning
        l_list.addFirst("White");

        // Add an element at the end of list
        l_list.addLast("Pink");
        System.out.println("Final linked list:" + l_list);
        addFirstAndLast(l_list);
        System.out.println("method " + l_list);
    }
    static void addFirstAndLast(LinkedList<String> list){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first element: ");
        String first = scanner.nextLine();
        System.out.println("Input last element:");
        String last = scanner.nextLine();
        list.addFirst(first);
        list.addLast(last);
        scanner.close();
    }
}

 */

/*
7. Write a Java program to insert the specified element at the front of a linked list.

import java.util.LinkedList;
public class Kata {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> l_list = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        System.out.println("Original linked list:" + l_list);
        // Add an element to front of LinkedList
        l_list.offerFirst("Pink"); // offerFirst zwraca false, addFirst wyrzuca wyjątek
        System.out.println("Final linked list:" + l_list);
    }
}
 */
 /*
 8. Write a Java program to insert the specified element at the end of a linked list.

import java.util.LinkedList;
public class Kata {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> l_list = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        System.out.println("Original linked list:" + l_list);
        // Add an element at the end of a linked list
        l_list.offerLast("Pink");
        System.out.println("Final linked list:" + l_list);
    }
}
  */
  /*
  9. Write a Java program to insert some elements at the specified position into a linked list.

import java.util.LinkedList;
public class Kata {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList <String> l_list = new LinkedList <String> ();
        // use add() method to add values in the linked list
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");

        // print original list
        System.out.println("Original linked list:" + l_list);

        // create a new collection and add some elements

        LinkedList <String> new_l_list = new LinkedList <String> ();
        new_l_list.add("White");
        new_l_list.add("Pink");

        // Add the collection in the second position of the existing linked list
        l_list.addAll(1, new_l_list);

        // print the new list
        System.out.println("LinkedList:" + l_list);
    }
    static void listInserter(LinkedList<String> list, String element){
    }
}
   */
/*
10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.

import java.util.LinkedList;
import java.util.Iterator;
public class Kata {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> l_list = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("orange");

        // print original list
        System.out.println("Original linked list:" + l_list);

        // Find first element of the List
        Object first_element = l_list.getFirst();
        System.out.println("First Element is: "+first_element);

        // Find last element of the List
        Object last_element = l_list.getLast();
        System.out.println("Last Element is: "+last_element);
        Object ad = getFirstElement(l_list);
        System.out.println("method: " + ad);

    }
    static Object getFirstElement(LinkedList<String> list){
        return list.getFirst();
    }
    static Object getLastElement(LinkedList<String> list){
        return list.getLast();
    }
}

 */
/*
11. Write a Java program to display elements and their positions in a linked list.

import java.util.LinkedList;
import java.util.Iterator;
public class Kata {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> l_list = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("orange");

        // print original list
        System.out.println("Original linked list:" + l_list);
        for(int p=0; p < l_list.size(); p++)
        {
            System.out.println("Element at index "+p+": "+l_list.get(p));
        }
        listPrinter(l_list);

    }
    static void listPrinter(LinkedList<String> list){
        for (int i = 0; i< list.size(); i++){
            System.out.println("Element at index: " + i + " : " + list.get(i));
        }
    }
}
 */
/*
Remove:
l_list.remove(2);
13. Write a Java program to remove the first and last elements from a linked list.
/ Remove the first element
    Object firstElement = l_list.removeFirst();
  // Remove the last element
    Object lastElement = l_list.removeLast();
    System.out.println("Element removed: "+ lastElement);

14. Write a Java program to remove all elements from a linked list.
l_list.clear();

15. Write a Java program that swaps two elements in a linked list
 Collections.swap(l_list, 0, 2);

 16. Write a Java program to shuffle elements in a linked list
 Collections.shuffle(l_list);

 17. Write a Java program to join two linked lists
    // Let join above two list
    LinkedList<String> list1 = new LinkedList<>();
    LinkedlIst <String> list2 = new LinkedList<>();
        LinkedList <String> a = new LinkedList <String> ();
        a.addAll(list1);
        a.addAll(list2);

18. Write a Java program to copy a linked list to another linked list.
 LinkedList<String> list1 = new LinkedList<>();
 LinkedList <String> newc1 = new LinkedList <String> ();
 newc1 = (LinkedList)list1.clone();

 19. Write a Java program to remove and return the first element of a linked list.
 System.out.println("Removed element: "+c1.pop());

 20. Write a Java program to retrieve, but not remove, the first element of a linked list.
 String x = c1.peekFirst();
    System.out.println("First element in the list: " + x);

 21. Write a Java program to retrieve, but not remove, the last element of a linked list
     String x = c1.peekLast();
    System.out.println("Last element in the list: " + x);

22. Write a Java program to check if a particular element exists in a linked list
// Checks whether the color "Green" exists or not.
    if (c1.contains("Green")) {
       System.out.println("Color Green is present in the linked list.");
    } else {
       System.out.println("Color Green is not present in the linked list.");
     }

 23. Write a Java program to convert a linked list to an array list.
   /Convert a linked list to array list
     List<String> list = new ArrayList<String>(linked_list);

24. Write a Java program to compare two linked lists.
//comparison output in linked list
          LinkedList<String> c3 = new LinkedList<String>();
          for (String e : c1)
             c3.add(c2.contains(e) ? "Yes" : "No");
          System.out.println(c3);

25. Write a Java program to check if a linked list is empty or not.
System.out.println("Check the above linked list is empty or not! "+c1.isEmpty());

26. Write a Java program to replace an element in a linked list
  c1.set(1, "Orange");
 */

/*
HashSet
1. Write a Java program to append the specified element to the end of a hash set.
import java.util.HashSet;
  public class Exercise1 {
  public static void main(String[] args) {
     // Create a empty hash set
     HashSet<String> h_set = new HashSet<String>();
   // use add() method to add values in the hash set
          h_set.add("Red");
          h_set.add("Green");
          h_set.add("Black");
          h_set.add("White");
          h_set.add("Pink");
          h_set.add("Yellow");
   // print the hash set
   System.out.println("The Hash Set: " + h_set);
   }
}

2. Write a Java program to iterate through all elements in a hash list.
// set Iterator
    Iterator<String> p = h_set.iterator();
  // Iterate the hash set
   while (p.hasNext()) {
   System.out.println(p.next());
   }

3. Write a Java program to get the number of elements in a hash set.
 System.out.println("Size of the Hash Set: " + h_set.size());

4. Write a Java program to empty a hash set.
  h_set.removeAll(h_set);

5. Write a Java program to test if a hash set is empty or not.
System.out.println("Checking the above array list is empty or not! "+h_set.isEmpty());

6. Write a Java program to clone a hash set to another hash set.
HashSet <String> new_h_set = new HashSet <String> ();
          new_h_set = (HashSet)h_set.clone();
          System.out.println("Cloned Hash Set: " + new_h_set);

7. Write a Java program to convert a hash set to an array.
String[] new_array = new String[h_set.size()];
      h_set.toArray(new_array);
     // Displaying Array elements
     System.out.println("Array elements: ");
      for(String element : new_array){
        System.out.println(element);
     }

8. Write a Java program to convert a hash set to a tree set.
  HashSet<String> h_set = new HashSet<String>();
   // use add() method to add values in the hash set
          h_set.add("Red");
          h_set.add("Green");
 // Create a TreeSet of HashSet elements
     Set<String> tree_set = new TreeSet<String>(h_set);

10. Write a Java program to compare two hash set.
 HashSet<String>result_set = new HashSet<String>();
         for (String element : h_set){
             System.out.println(h_set2.contains(element) ? "Yes" : "No");
          }

11. Write a Java program to compare two sets and retain elements that are the same.
   h_set1.retainAll(h_set2);
12. Write a Java program to remove all elements from a hash set.
  h_set.clear();
  ====================================================================================
 */

//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Scanner;

/*
Write a program that adds only unique elements to the list.

class Kata{
    public static void main(String[] args) {
uniqueList();
    }
    static void uniqueList(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int size = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.println("Please enter the number: ");
            int temp = scanner.nextInt();
            scanner.nextLine();
            if(!integers.contains(temp)){
                integers.add(temp);
            } else {
                System.out.println("This number is already in list!");
            }
        }
        Collections.sort(integers);
        System.out.println(integers);

    }
}
 */
/*
Program do dodawania elementów do listy

import java.util.ArrayList;
import java.util.Scanner;

class Kata {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        mainLoop(list);
    }
    static void mainLoop(ArrayList<String> list){
        Scanner scanner = new Scanner(System.in);
        boolean closeProgram = false;
        do{
            printUserOptions();
            int userOption = scanner.nextInt();

            if (userOption==1) {
                addElement(list);
            } else if(userOption == 2){
                removeElement(list);
            } else if(userOption == 3){
                displayList(list);
            } else if(userOption == 4){
                closeProgram();
                closeProgram = true;

            }
        }while(!closeProgram);
    }

    private static void closeProgram() {
        System.out.println("Bye bye");
    }

    private static void displayList(ArrayList<String> list) {
        System.out.println(list);

    }

    private static void removeElement(ArrayList<String> list) {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("At which index, do you want to remove an element?");
        int indexToRemove = scanner2.nextInt();
        list.remove(indexToRemove);
        System.out.println("Element removed");

    }

    private static void printUserOptions() {
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. Display");
        System.out.println("4. Exit");
    }
    private static void addElement(ArrayList<String> list){
        Scanner scanner2 = new Scanner(System.in);
            System.out.println("Input element to the list:");
            String input = scanner2.nextLine();
            list.add(input);
            System.out.println(input + " has been added to the list");
        }
    }
 */
/*
# Program do odwracania stringa

class Kata {
    public static void main(String[] args) {
        System.out.println(reverseString("dog"));

    }
    static String reverseString(String word){
        char[] letters = new char[word.length()];

        int letterIndex = 0;
        for (int i = word.length() - 1; i >=0 ; i--) {
            letters[letterIndex] = word.charAt(i);
            letterIndex++;

        }
        String reverse = "";
        for (int i = 0; i < word.length(); i++) {
            reverse = reverse + letters[i];

        }
        return reverse;
    }
}
 */


/*
Java strumienie


import java.util.List;
import java.util.stream.Stream;

class Kata{
    public static void main(String[] args) {
        List<String> list = List.of("Pies", "kot");
        Stream<String> stream = list.stream();
        stream.forEach(s-> System.out.println(s));

    }
}
 */

import java.util.*;

/*
 #Write a method that returns the maximum value in an ArrayList of Integers.

class Kata {
    public static void main(String[] args) {
       ArrayList<Integer> integers = new ArrayList<>();
       integers.add(1);
       integers.add(2);
       integers.add(3);
       integers.add(4);
       integers.add(5);

        System.out.println(maxValue(integers));
    }
    static int maxValue(ArrayList<Integer> list){
        if(list.size() == 0){
            return 0;
        }
        Collections.sort(list);
        Collections.reverse(list);
        int max = list.get(0);
        return max;
    }
}

 */
/*
# Write a method that calculates the sum of the items

class Kata{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,4,7,3,6));
        System.out.println(sumScores(list));
    }
    static int sumScores(ArrayList<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}

 */

/*
Write a method that finds the average value in a list

class Kata {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,4,7,3,6));
        System.out.println(average(list));
    }
    static double average(ArrayList<Integer> list){
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum+= list.get(i);
        }
        return sum / list.size();

    }
}

 */
/*
Remove words too short
Let the user choose how many words they want to input
Read that many words
Let the user choose a number bigger than 0
Remove all words from the ArrayList that are shorter than the given number
Example:

Input:
4 // four words
Ananas
Zimtzitroneneis
Apple
Zartbitterschokolade
6 // remove all shorter than six

Output:
Zimtzitroneneis
Zartbitterschokolade

class Kata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("How many words do you want to input?");
        int wordsNumber = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < wordsNumber; i++) {
            list.add(scanner.nextLine());
        }
        System.out.println("Choose number bigger than 0");
        int userNumber = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) < userNumber)

        }
    }
}

 */
/*
# two sum target

class Kata {
    public int[] twoSum(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};

            }
        }
        return nums;
    }
}

 */
/*
# Create an ArrayList in Java and add the days of the week. Also, display the ArrayList.

class Kata {
    public static void main(String[] args) {
        List<String> weekDays = new ArrayList<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");

        System.out.println(weekDays);

        Iterator<String> weekDaysIterator = weekDays.iterator();
        while(weekDaysIterator.hasNext()){
            System.out.println("Week day: " + weekDaysIterator.next());
        }

        }
    }

 */
/*
# Write a program that creates an ArrayList of strings and displays its elements using an iterator.


class Kata {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Object> list2 = new ArrayList <>();
        list2.add("ddd");
        list2.add(2);
        list2.add(11122.33);
        System.out.println(list2);
        System.out.println(list.get(1));



        list.add("ala1");
        list.add("ala2");
        list.add("ala3");
        list.add("ala4");

        Iterator<String> listIterator = list.iterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }
} */

/*
ArrayList
1. Create a new array list, add some colors (String) and print out the collection.

2. Iterate through all elements in an array list.

3. Insert an element into the array list at the first position.

4. Retrieve an element (at a specified index) from a given array list.

5. Update a specific array element by given element.

6. Remove the third element from an array list.

7. Search an element in an array list.

8. Sort a given array list.

9. Shuffle elements in an array list.

10. Reverse elements in an array list.

11. Swap two elements in an array list.

12. Extract a portion of an array list.

13. Replace the second element of an ArrayList with the specified element.

14. Empty an array list.

15. Test an array list is empty or not.

16. Copy one array list into another.


class Kata {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("red");
        list.add("blue");
        list.add("yellow");
        list.add("purple");
        list.add("white");
        list.add(0, "pink");



        System.out.println(list.get(3));
        System.out.println(list.set(1, "brown"));
        for (String elem : list){
            System.out.print(elem + " ");
        }

        list.remove(2);

        for (String elem : list){
            System.out.print(elem + " ");
        }
        System.out.println();
        if (list.contains("white")){
            System.out.println("Found");
        } else
            System.out.println("Did not found");
        System.out.println("list before sort " + list);
       Collections.sort(list);
        System.out.println("List after sort"  + list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.swap(list, 0, 1);
        System.out.println(list);
        List<String> list2 =  list.subList(1, 3);
        System.out.println(list2);
        list.removeAll(list);
        System.out.println(list);
        boolean isEmpty = list.isEmpty();
        System.out.println(isEmpty);

        list2.add("111");
        list.add("222");
        Collections.copy(list, list2);
        System.out.println(list);
    }
}

*/

/*
# Write a method that returns the maximum value in an ArrayList of Integers.

class Kata {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1234,435,547,8678,465));

        long startTime = System.nanoTime();
        System.out.println(max2(lista));
        long endTime = System.nanoTime();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");
//        System.out.println(max2(lista));
    }


//    static int max(ArrayList<Integer> list)
//    {
//       if (list.size() == 0){
//           return 0;
//       }
//       Collections.sort(list);
//       Collections.reverse(list);
//       return list.get(0);
//    }


//    drugi sposób
    static int max2(ArrayList<Integer> list){
        int max2 = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if(max2 < list.get(i))
                max2 = list.get(i);
        }
        return max2;
    }
}


class Kata {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,3,7,8,1));
        System.out.println(listConverter(list));

    }
    public static int listConverter(ArrayList<Integer> list){
        int firstIndex = list.get(0);
        for (int i = 1; i < list.size(); i+=2) {
            if(i == list.size()-1){
                firstIndex += list.get(i);
            } else {
                firstIndex += list.get(i) * list.get(i + 1);
            }
        }
        return firstIndex;
    }
} */

class Kata {
    public static void main(String[] args) {
        int[] array = {5,10,20,25};

        int sum = 0;
        for (int i = 0; i <array.length ; i++) {
            sum += array[i];
        }
        System.out.println(sum);


    }
}