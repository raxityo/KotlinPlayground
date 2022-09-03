package playground

import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertNotSame
import org.junit.Test

class SolutionTest {

    @Test
    fun testGiveMeDouble() {
        val solution = Solution()
        assertEquals(2, solution.giveMeDouble(1))
        assertNotSame(1, solution.giveMeDouble(1))
    }
}
