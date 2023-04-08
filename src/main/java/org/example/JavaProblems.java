package org.example;


import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;


public class JavaProblems {

//        Mars Exploration
//        return the number of times  a letter has been changed in the SOS message
        public static int marsExploration(String s) {
            int count = 0;

            for(int i = 0; i < s.length(); i += 3){
                if(s.charAt(i) != 'S'){
                    count++;
                }
                if(s.charAt(i + 1) != 'O'){
                    count++;
                }
                if(s.charAt(i + 2) != 'S'){
                    count++;
                }
            }

            return count;
        }

//        Lonely Integer
//    Given an array of integers find the unique value
    public static int lonelyInteger(List<Integer> a){
            int num = 0;

            if(a.size() == 1){
                return a.get(0);
            }else {
                for(int i = 0 ; i < a.size() - 1; i++){
                    for(int j = i + 1; j < a.size(); j++ ){
                        if(Objects.equals(a.get(i), a.get(j))){
                            a.set(j, 0);
                            a.set(i, 0);
                        }
                    }
                }
            }
            for(int nums: a){
                if(nums != 0){
                    num = nums;
                }
            }

            return num;
    }

/*  Flipping the Matrix
    Sean invented a game involving a 2n x 2n matrix where each cell of the matrix contains an integer.
    He can reverse any of its rows or columns any number of times. The goal of the game is to maximize the sum of the elements in the
    N x N submatrix located in the upper-left quadrant of the matrix.
    Given the initial configurations for q matrices, help Sean reverse the rows and columns of each matrix in the best possible way so
    that the sum of the elements in the matrix's upper-left quadrant is maximal.
*/

    public static int flippingTheMatrix(List<List<Integer>> matrix){

        return 0;
    }

//    Permuting Two Arrays
//There are two -element arrays of integers, and . Permute them into some and such that the relation holds for all where
//
//.
//
//There will be
//queries consisting of , , and . For each query, return YES if some permutation , satisfying the relation exists. Otherwise, return NO.

    public static String  twoArrays(int k, List<Integer> A, List<Integer> B){
        Collections.sort(B, Collections.reverseOrder());

        Collections.sort(A);

        for(int i = 0; i < A.size(); i++){
            if(A.get(i) + B.get(i) < k){
                return "NO";
            }
        }

        return "YES";
    }








//    Subarray Division 2
//    Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.
//
//    Lily decides to share a contiguous segment of the bar selected such that:
//
//    The length of the segment matches Ron's birth month, and,
//    The sum of the integers on the squares is equal to his birth day.
//
//    Determine how many ways she can divide the chocolate.

    public static int birthday(List<Integer> s, int d, int m){
        int count = 0;


        for(int i = 0; i <= s.size()-m; i++){
            int num = 0;
            for(int j = i; j < i+m; j++){
                num = num + s.get(j);
            }
            if(num == d) {
                count++;
            }
        }

        return count;
    }



//    XOR Strings Three
//   In this challenge, the task is to debug the existing code to successfully execute all provided test files.
//
//  Given two strings consisting of digits 0 and 1 only, find the XOR of the two strings.
//
//  To know more about XOR Click Here
//
//  Debug the given function strings_xor to find the XOR of the two given strings appropriately.
//
//  Note: You can modify at most three lines in the given code and you cannot add or remove lines to the code.
//
//  To restore the original code, click on the icon to the right of the language selector.

    public static String stringsXOR(String s, String t){
        String res = new String("");
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == t.charAt(i))
                res += "0";
            else
                res += "1";
        }
        return res;
    }



}