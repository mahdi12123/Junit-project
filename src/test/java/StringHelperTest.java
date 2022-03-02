import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringHelperTest {

    // AACD => CD ACD => CD CDEF=>CDEF CDAA => CDAA

    StringHelper stringHelper=new StringHelper();

    @Test
    public void truncateAInFirst2Positions() {
        //StringHelper stringHelper=new StringHelper();
        assertEquals("CD",stringHelper.truncateAInFirst2Positions("AACD"));

    }
    @Test
    public void truncateAInFirst2Positions2(){
        // StringHelper stringHelper=new StringHelper();
        assertEquals("CD",stringHelper.truncateAInFirst2Positions("ACD"));

    }

    //ABCD =>false,AABCAA=>true

    @Test
    void areFirstAndLastTwoCharactersTheSame() {
        //assertEquals(true,stringHelper.areFirstAndLastTwoCharactersTheSame("AABCAA"));
        assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("AABCAA"));

    }

    @Test
    void areFirstAndLastTwoCharactersTheSame2() {
       // assertEquals(false,stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD"));
        assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }

}
