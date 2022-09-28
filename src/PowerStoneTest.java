import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;

class PowerStoneTest {
    Person testPerson = null;
    PowerStone powerStone = null;

    @BeforeEach
    void setUp() {
        testPerson = new Person();
        powerStone = PowerStone.getInstance();
    }

    @AfterEach
    void tearDown() {
        testPerson = null;
        powerStone = null;
    }
    @Test
    void singletonTest(){
        String powerStoneTesting = powerStone.toString();
        assertEquals(powerStoneTesting, powerStone.toString());
        System.out.println("Pretest: " + powerStone);
        powerStone = PowerStone.getInstance();
        assertEquals(powerStoneTesting, powerStone.toString());
        System.out.println("Pretest: " + powerStone);
    }

    @Test
    void special() {
        double orginalPower = testPerson.getPower();
        assertEquals(orginalPower, testPerson.getPower());
        powerStone.special(testPerson);
        assertTrue(orginalPower<testPerson.getPower());
    }
}