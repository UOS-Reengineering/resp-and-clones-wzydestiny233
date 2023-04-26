package example.project.CodeClones;

import java.util.HashSet;
import java.util.Set;

public class JaccardSimilarity {

    public static double computeJaccardSimilarity(Set<String> set1, Set<String> set2) {
        // TODO: implement this function to compute the Jaccard similarity between two string arrays
        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);

        double intersectionSize = (double) intersection.size();
        double unionSize = (double) union.size();

        return intersectionSize / unionSize;

    }

}
