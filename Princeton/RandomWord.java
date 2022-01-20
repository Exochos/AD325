// Princeton DataStructures and Algorithms
// Winter 2022
// Jeremy Ward

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;

public class RandomWord {
    
    public static void main(String[] args) {
        String randomWord = "";
        String tempWord = "";
        int champion = 1;
        while (!StdIn.isEmpty()) {
            tempWord = StdIn.readString();
            if (StdRandom.bernoulli(1.0 / (double)champion)) {
                randomWord = tempWord;
            }
            champion++;
        }
       StdOut.println(randomWord);
    }
}
