/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank_utopiantree;

/**
 * Solve the HackerRank Utopian Tree problem
 * 
 * @author Stephen
 * @version 1.0
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Hackerrank_utopianTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int inputT = Integer.parseInt(input.readLine());
        
        for(int i = 0 ; i < inputT ; i++) {
            Tree loopTree = new Tree();
            loopTree.growTree(Integer.parseInt(input.readLine()));
            System.out.println(loopTree.getHeight());
        }
    }  
}

class Tree {
        private int height;
        
        public Tree () {
            this.height = 1;    
        }
        
        public int getHeight() {
            return height;
        }
        
        public void growTree (int growCycles) {
            if(growCycles == 0) {
                return;
            }
            
            for(int i = 1 ; i <= growCycles ; i++) {
                if(i % 2 == 0) {
                    this.height++;
                } else {
                    this.height *= 2;
                }
            }
            
            return;
        }
    }
