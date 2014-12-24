package com.careercup;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LargestRange {

    static class Interval {
        int start;
        int end;

        public Interval(int base) {
            this(base,base);
        }

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int size() {
            return 1 + end - start;
        }

        @Override
        public String toString() {
            return "[" + start + "," + end + "]";
        }
    }


    public static void main(String[] args) {
        System.out.println(biggestInterval(Arrays.asList(1, 3, 5, 7, 4, 6, 10)));
    }

    public static Interval biggestInterval(List<Integer> list) {
        HashSet<Integer> set = new HashSet<Integer>(list);
        Interval largest = null;

        while(set.size() > 0) {
            Integer item = set.iterator().next();
            set.remove(item);

            Interval interval = new Interval(item);
            while(set.remove(interval.start-1)) {
                interval.start--;
            }
            while(set.remove(interval.end+1)) {
                interval.end++;
            }

            if (largest == null || interval.size() > largest.size()) {
                largest = interval;
            }
        }

        return largest;
    }
}

