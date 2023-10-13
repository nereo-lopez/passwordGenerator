import com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length
import org.junit.Assert
import org.junit.jupiter.api.Test

class MainKtTest {
    @Test
    fun `Test succeeds if a character is returned`() {
        val result = passwordGenerator()
        Assert.assertTrue(result is Char)
    }
}
