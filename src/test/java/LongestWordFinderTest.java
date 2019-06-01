import hello.LongestWordFinderController;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class LongestWordFinderTest {

    private final List<String> words= new ArrayList<>();
    @org.junit.Before
    public void setUp() throws Exception {
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("sixsixsix");
    }

    @org.junit.Test
    public void find() {
        LongestWordFinderController longestWordFinder = new LongestWordFinderController();
        String longest = longestWordFinder.find(words);
        assertEquals(longest,"sixsixsix");
        Integer.toBinaryString(5);
    }
}