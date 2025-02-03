package md.vladdubceac.learning;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

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
}
