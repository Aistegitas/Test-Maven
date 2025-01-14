package org.example.UzdOpenClosedRanges;

import com.google.common.collect.Range;

public class OpenClosedRangesMain {
    public static void main(String[] args) {

        Range<Integer> closedRange = Range.closed(32,67);
        Range<Integer> openClosedRange = Range.openClosed(42,70);

        int checkInRanges = 33;

        System.out.println("Does closedRange contain value: " + checkInRanges + " / answer: " + closedRange.contains(checkInRanges));
        System.out.println();
        System.out.println("Does openClosedRange contain value: " + checkInRanges + " / answer: " + openClosedRange.contains(checkInRanges));
        System.out.println();

        try {
            Range<Integer> intersection = closedRange.intersection(openClosedRange);
            System.out.println("Intersection of closedRange and openClosedRange: " + intersection);
        } catch (IllegalArgumentException e) {
            System.out.println("Ranges don't intersect.");
        }

        Range<Integer> span = closedRange.span(openClosedRange);
        System.out.println();
        System.out.println("Span of both ranges: " + span);
    }
}