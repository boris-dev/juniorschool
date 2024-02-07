package ru.liga.dcs;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class DuplicateRemoverTest extends TestCase {
    private DuplicateRemover duplicateRemover;

    @Before
    public void setUp() {
        duplicateRemover = new DuplicateRemover();
    }

    @Test
    public void testRemoveDuplicates_AllUnique() {
        List<String> original = Arrays.asList("Apple", "Banana", "Orange");
        List<String> result = duplicateRemover.removeDuplicates(original);
        assertEquals(Arrays.asList("Apple", "Banana", "Orange"), result);
    }

    @Test
    public void testRemoveDuplicates_SomeDuplicates() {
        List<String> original = Arrays.asList("Apple", "Banana", "Apple", "Orange", "Banana");
        List<String> result = duplicateRemover.removeDuplicates(original);
        assertEquals(Arrays.asList("Apple", "Banana", "Orange"), result);
    }

    @Test
    public void testRemoveDuplicates_EmptyList() {
        List<String> original = Arrays.asList();
        List<String> result = duplicateRemover.removeDuplicates(original);
        assertEquals(Arrays.asList(), result);
    }

    @Test
    public void testRemoveDuplicates_NullList() {
        List<String> result = duplicateRemover.removeDuplicates(null);
        assertEquals(null, result);
    }

}