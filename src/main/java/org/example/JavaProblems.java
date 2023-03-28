package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;


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



}