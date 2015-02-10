/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank_flippingbits;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Stephen
 */
public class Hackerrank_FlippingBits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int loopLength = Integer.parseInt(input.readLine());
        
        for(int i = 0 ; i < loopLength ; i++) {
            System.out.println(flipUnsignedBits(Long.parseLong(input.readLine())));
        }
    }
    
    private static long flipUnsignedBits(long flipInput) {
        return ~flipInput + 4294967296L;   
    }
    
}
