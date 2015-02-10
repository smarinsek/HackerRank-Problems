package hackerrank_lonelyinteger;

/**
 * Solve the HackerRank Lonely Integer problem
 * 
 * @author Stephen
 * @version 1.00
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Hackerrank_lonelyInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        //read the first line of input
        int nIntegers = Integer.parseInt(input.readLine());
        int solution = 0;
        
        String Line = input.readLine();
        for(String intStr : Line.split("\\s")) {
            solution ^= Integer.parseInt(intStr);
        }
        
        System.out.println(solution);
    } 
}
