package collection;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class CollectionsShould {

    @Test
    void be_copied_easily() {
        // Map, Set, ...
        final List<Integer> integers = List.of(1, 2, 3);
        final List<Integer> newIntegers = List.copyOf(integers);

        assertThat(integers).isEqualTo(newIntegers);
    }

    @Test
    void be_immutable_in_stream() {
        final List<Integer> integers = List.of(1, 2, 3);

        final Set<Integer> newSet = integers.stream()
                .filter(num -> num > 1)
                .collect(Collectors.toUnmodifiableSet());

        assertThat(newSet).containsOnly(2, 3);
    }
}
