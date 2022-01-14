/*----------------------------------------------------------
 *                HTBLA-Leonding / Class: < 3CHIF >
 * ---------------------------------------------------------
 * Exercise Number: 0
 * Title:
 * Author: Amgad Hammash
 * ----------------------------------------------------------
 * Description:
 * ----------------------------------------------------------
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BuildingTests {

    @Test
    void testCreateABuildingWithAnIdAndResident(){
        Building building = new Building(1, "resident");

        assertEquals(1, building.getId());
        assertEquals("resident", building.getResident());
    }
}
