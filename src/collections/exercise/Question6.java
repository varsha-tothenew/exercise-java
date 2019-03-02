package collections.exercise;

import java.util.*;

//6.Print the elements of an array in the decreasing frequency if 2 numbers have same frequency then print the one which came first.
public class Question6 {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 6, 7, 8, 8, 8, 9, 9, 7, 7, 7, 2, 5, 5, 5, 5, 5, 1};
        Map<Integer, Integer> integerMap = new HashMap();
        List<Integer> outputArray = new ArrayList<>();

        // Assign elements and their count in the list and map
        for (int current : arr) {
            int count = integerMap.getOrDefault(current, 0);
            integerMap.put(current, count + 1);
            outputArray.add(current);
        }

        // Compare the map by value
        SortComparator comp = new SortComparator(integerMap);

        // Sort the map using Collections CLass
        Collections.sort(outputArray, comp);

        // Final Output
        for (Integer i : outputArray) {
            System.out.print(i + " ");
        }
    }
}
    class SortComparator implements Comparator<Integer> {
        private final Map<Integer, Integer> freqMap;

        // Assign the specified map
        SortComparator(Map<Integer, Integer> tFreqMap)
        {
            this.freqMap = tFreqMap;
        }

        // Compare the values
        @Override
        public int compare(Integer k1, Integer k2)
        {

            // Compare value by frequency
            int freqCompare = freqMap.get(k2).compareTo(freqMap.get(k1));

            // Compare value if frequency is equal
            int valueCompare = k1.compareTo(k2);

            // If frequency is equal, then just compare by value, otherwise -
            // compare by the frequency.
            if (freqCompare == 0)
                return valueCompare;
            else
                return freqCompare;
        }
    }
