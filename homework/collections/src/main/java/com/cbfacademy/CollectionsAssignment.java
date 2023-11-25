package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.HashMap;

public class CollectionsAssignment { // name of class {

    /**
     * This method removes all values from the provided list that are smaller
     * than the indicated integer. The remaining elements retain their original
     * ordering.
     *
     * @param list   - the list of integers
     * @param minValue the minimum value to retain
     */
    // list of methods
    public static void removeSmallInts(List<Integer> list, int minValue) {

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) < minValue) {
                list.remove(list.get(i));
            } 
        }
        // Your solution must traverse the list from last to first element
        // removing any values less than minValue.  
    }

    /**
     * This method returns true if the provided collection contains any
     * duplicate elements.
     *
     * @param integers - a collection of integers
     * @return true if integers contains duplicates, false otherwise
     */
    public static boolean containsDuplicates(Collection<Integer> integers) {
        // Your solution must not use any loops.
        Set<Integer> uniqueElemets = new HashSet<>(integers);
        return uniqueElemets.size() != integers.size();
    }

    /**
     * This method returns an ArrayList containing all elements that appear in
     * either of the two collection arguments. There will be no duplicate values
     * in the resulting ArrayList. The values in the returned ArrayList must be
     * in sorted order.
     * <p>
     * For example, if the two arguments contain {2, 1, 2, 3} and {3, 4, 4, 5},
     * the returned ArrayList will contain {1, 2, 3, 4, 5}. The original
     * collections will not be modified.
     *
     * @param ints1 - the first collection
     * @param ints2 - the second collection
     * @return A sorted ArrayList containing the integers that appear in either
     * collection.
     */
    public static ArrayList<Integer> inEither(Collection<Integer> ints1, Collection<Integer> ints2) {
        // This must be done with no loops.

        Set<Integer> noDupeSet = new HashSet <>();
        noDupeSet.addALL(ints1); 
        noDupeSet.addAll(ints2);
        
        List<Integer> organisedList = new ArrayList<>(noDupeSet);

        Collections.sort(organisedList);
        return new ArrayList<>(organisedList);
    }

    /**
     * This method returns an ArrayList containing all elements that appear in
     * both of the two collection arguments. There will be no duplicate values
     * in the resulting ArrayList. The values in the returned ArrayList must be
     * in sorted order. For example, if the two arguments contain {2, 1, 2, 3} and
     * {3, 4, 4, 5}, the returned ArrayList will contain {3}. The original
     * collections will not be modified.
     *
     * @param ints1 - the first collection
     * @param ints2 - the second collection
     * @return An ArrayList containing the integers that appear in both
     * collections.
     */
    public static ArrayList<Integer> inBoth(Collection<Integer> ints1, Collection<Integer> ints2) {
        // This must be done with no loops.
        Set <Integer> ints1Set = new HashSet <> (ints1);
        Set <Integer> ints2Set = new HashSet <> (ints2);
        Set <Integer> commonValues = new HashSet <> (ints1Set);
        ints1Set.retainAll(ints2Set);
        List<Integer> commonValues = new ArrayList <>(ints1Set);
        Collections.sort(commonValues);
        return new ArrayList<>(commonValues);

    }

    /**
     * This method returns the String that appears most frequently in the
     * provided list. For example, if the input list contains the elements
     * {"Bob", "Alice", "Bob"}, this method will return "Bob". If there are
     * ties, any of the most frequently occurring elements may be returned.
     * If the list is empty, return the empty string "".
     *
     * @param list - a list of Strings
     * @return the most frequently occurring String
     */
    public static String mostFrequent(List<String> list) {
        // You should solve this problem in two stages: First iterate through
        // the list to count occurrences of each String. Then iterate through
        // your counts to find the largest. You'll need a collection that allows
        // you to store a mapping from Strings to counts.
        // No nested loops or non-enhanced for-loops are allowed.
      // Count occurrences of each string
        Map<String, Integer> counts = new HashMap<>();
        for (String str : list) {
            counts.put(str, counts.getOrDefault(str, 0) + 1);
        }

        // Find the most frequently occurring string
        String mostFrequentString = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequentString = entry.getKey();
            }
        }

        return mostFrequentString;

       
        
}
