package org.acme.record;

import java.util.List;

public class RecordTest {

    private static final List<Data> data = List.of(new Data(1, 2), new Data(1, 3), new Data(2, 2));

    public static void main(final String[] args) {
        final var xEqualsOne = data.stream().filter(d -> d.x() == 1).toList();
        System.out.println(xEqualsOne);

        final var yEqualsTwo = data.stream().filter(d -> d.y() == 2).toList();
        System.out.println(yEqualsTwo);
    }
}
