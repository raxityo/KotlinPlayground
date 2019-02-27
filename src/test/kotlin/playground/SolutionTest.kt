package playground

import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertNotSame
import org.junit.Test

class SolutionTest {

    @Test
    fun testGiveMeDouble() {
        val solution = Solution()
        assertEquals(2, solution.giveMeDouble(1))
        assertNotSame(1, solution.giveMeDouble(1))
    }
}
