package example.project.CodeClones;

public class DotPlot {

    public static void printDotPlot(char[] sequence1, char[] sequence2) {
        // TODO: complete this function to print the dot plot of two string arrays
        // Create a two-dimensional boolean array to store the dot plot
        boolean[][] dotPlot = new boolean[sequence1.length][sequence2.length];

        // Fill in the dot plot
        for (int i = 0; i < sequence1.length; i++) {
            for (int j = 0; j < sequence2.length; j++) {
                dotPlot[i][j] = sequence1[i] == sequence2[j];
            }
        }

        // Print the dot plot
        System.out.print("\t");
        for (char c : sequence2) {
            System.out.print(c + "\t");
        }
        System.out.println();
        for (int i = 0; i < sequence1.length; i++) {
            System.out.print(sequence1[i] + "\t");
            for (int j = 0; j < sequence2.length; j++) {
                if (dotPlot[i][j]) {
                    System.out.print("+\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }

}
