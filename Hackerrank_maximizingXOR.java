package hackerrank_maximizingxor;

/**
 * Complete the HackerRank Maximizing XOR problem
 * 
 * @author Stephen
 * @version 1.0
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Hackerrank_maximizingXOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int inputL = Integer.parseInt(input.readLine());
        int inputR = Integer.parseInt(input.readLine());
        
        int xor = inputR ^ inputL;
        int bitPlace = 0;
        int solution = 1;
        
        while(Math.pow(2, bitPlace) < xor) {
            bitPlace++;
            solution *= 2;
        }
        
        if(bitPlace == 0) {
            System.out.println(0);
        } else {
            System.out.println(solution - 1);
        }
    }   
}
