import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MainTest{
    @Test
    fun `test addition`(){
        // Arrange
        val x = 5
        val y = 6

        // Act
        val z = add(x,y)

        // Assert
        assertThat(z).isEqualTo(x+y)
    }
}