package org.acme;

public class PatterMatching {
    void patternMatchingInstanceOf(final Object obj) {
        if (obj instanceof final String s) {
            System.out.println(s.toUpperCase());
        }
    }
}
