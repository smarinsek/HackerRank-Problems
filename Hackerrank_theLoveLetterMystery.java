package hackerrank_problems;

/**
 * Solve the HackerRank Love-Letter Mystery Problem
 * 
 * @author Stephen
 * @versio 1.0
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Hackerrank_theLoveLetterMystery {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        int inputT = Integer.parseInt(input.readLine());
        char rightChar;
        char leftChar;
        
        for(int inputWords = 0 ; inputWords < inputT ; inputWords++) {
            
            int operations = 0;
            String rawWord = input.readLine();
            
            if(rawWord.length() % 2 != 0) {
                int i = rawWord.length()/2 + 1;
                int j = rawWord.length()/2 - 1;
                
                for(; i < rawWord.length() ; i++, j--) {
                    if(rawWord.charAt(i) != rawWord.charAt(j)) {
                        operations += Math.abs(rawWord.charAt(i) - rawWord.charAt(j));
                    }
                }
            } else {
                int i = rawWord.length()/2;
                int j = rawWord.length()/2 - 1;
                
                if(rawWord.charAt(i) != rawWord.charAt(j)) {
                    operations += Math.abs(rawWord.charAt(i) - rawWord.charAt(j));
                }
                
                i++;
                j--;
                
                for(; i < rawWord.length(); i++, j--) {
                    if(rawWord.charAt(i) != rawWord.charAt(j)) {
                        operations += Math.abs(rawWord.charAt(i) - rawWord.charAt(j));
                    }
                }
            }
            
            System.out.println(operations);
        }
        
    }
    
}
