/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import org.junit.jupiter.api.Test;
import static quotes.App.*;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    @Test void testqoutes(){
        Path path1= Paths.get("src/main/resources/test.json");
        Quotes newquote=generateRandomQuote(path1);
//        assertEquals("Quotes{tags=[attributed-no-source], author='Marilyn Monroe', likes='18651 likes', text=' “I am good, but not an angel. I do sin, but I am not the devil. I am just a small girl in a big world trying to find someone to love.” '}",generateRandomQuote(path1));
           assertEquals("18651 likes",newquote.likes);
    }

}
