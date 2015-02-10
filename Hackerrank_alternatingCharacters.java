/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank_alternatingcharacters;

/**
 * Solve the HackerRank Alternating Characters problem
 * 
 * @author Stephen
 * @version 1.0
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Hackerrank_alternatingCharacters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int tCases = Integer.parseInt(input.readLine());
        
        for(int i = 0 ; i < tCases ; i++){
            String caseLine = input.readLine();
            char[] lineChars = caseLine.toCharArray();
            
            int deleteCount = 0;
            for(int ii = 0 ; ii < lineChars.length - 1 ; ii++) {
                if(lineChars[ii] == lineChars[ii + 1]) {
                    deleteCount++;
                }
            }
            
            System.out.println(deleteCount);
        }
    }   
}
