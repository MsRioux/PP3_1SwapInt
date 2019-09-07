import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class swapIntTest
{
    @Test
    public void checkSwap1() throws Exception{
        swapInt yes1 = new swapInt(7, 5);
        assertEquals(5, yes1.checkSwap());
    }

    @Test
    public void checkSwap2() throws Exception{
        swapInt no1 = new swapInt(5, 7);
        assertEquals(5, no1.checkSwap());
    }

}