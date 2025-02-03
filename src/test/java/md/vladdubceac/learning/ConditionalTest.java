package md.vladdubceac.learning;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionalTest {

    @Test
    @Disabled("Don't run until 'divide' method is added")
    void basicTest(){
        // execute method and perform asserts
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    public void testForWindowsOnly(){

    }

    @Test
    @EnabledOnOs(OS.MAC)
    public void testForMacOnly(){

    }

    @Test
    @EnabledOnOs({OS.MAC, OS.WINDOWS})
    public void testForMacAndWindowsOnly(){

    }

    @Test
    @EnabledOnOs(OS.LINUX)
    public void testForLinuxOnly(){

    }

    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void testOnlyForJava17(){

    }

    @Test
    @EnabledOnJre(JRE.JAVA_11)
    void testOnlyForJava11(){

    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_23)
    void testOnlyForJavaRange(){

    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11)
    void testOnlyForJavaRangeMin(){

    }

    @Test
    @EnabledIfEnvironmentVariable(named="RUN_ENV", matches = "dev")
    void testOnlyForDevEnvironment(){
    }

    @Test
    @EnabledIfSystemProperty(named = "ACTION_SYS_PROP",matches = "CI_CD_DEPLOY")
    void testOnlyForSystemProperty(){
    }
}
