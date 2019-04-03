import Dealership.Car.Component.Door;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DoorTest {

    Door door;

    @Before
    public void before() {
        door = new Door();
    }

    @Test
    public void canOpenDoor() {
        door.open();
        assertFalse(door.getIsDoorClosed());
    }

    @Test
    public void canCloseDoor() {
        door.open();
        door.close();
        assertTrue(door.getIsDoorClosed());
    }
}
