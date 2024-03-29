package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class MamitaDockerTest extends TestCase {
    @Test
    public void testUserNameDisplay() {
        // Arrange
        MamitaDocker mamitaDocker = new MamitaDocker("Mamita");

        // Act
        String actualName = mamitaDocker.mamitaDockerNameDisplay();

        // Assert
        assertEquals("Mamita", actualName);
    }
}
