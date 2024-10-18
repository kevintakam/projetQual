package isen.library;
import static org.junit.Assert.*;
import org.junit.Test;



public class PersonTest {

    @Test
    public void testConstructor() {
        Person person = new Person();
        assertEquals("unknown", person.getName());
        assertEquals(22, person.getYears());
    }

    @Test
    public void testSetName() {
        Person person = new Person();
        person.setName("Kevin");
        assertEquals("Kevin", person.getName());
    }

    @Test
    public void testSetYears() {
        Person person = new Person();
        person.setYears(30);
        assertEquals(30, person.getYears());
    }
}
