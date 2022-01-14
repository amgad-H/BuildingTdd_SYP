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

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BuildingTests {

    @Test
    void testCreateABuildingWithAnIdAndResident(){
        Building building = new Building(1, "resident");

        List<String> gottenResidents = building.getResident();

        assertEquals(1, building.getId());
        assertEquals("resident", gottenResidents.get(0));
    }

    @Test
    void testCreateABuildingWithAnIdAndAnArrayOfResidents(){
        String[] residents = {"r1", "r2"};
        Building building = new Building(1, residents);

        List<String> gottenResidents = building.getResident();

        assertEquals(1, building.getId());
        int i = 0;
        for (String s: residents) {
            assertEquals(s, gottenResidents.get(i));
            i++;
        }
    }

    @Test
    void testAddingResidentsAfterTheCreationOfBuilding(){
        String[] residents = {"r1", "r2"};
        Building building = new Building(1, residents);

        building.addResident("r3");

        List<String> gottenResidents = building.getResident();

        assertEquals(1, building.getId());
        int i = 0;
        for (String s: residents) {
            assertEquals(s, gottenResidents.get(i));
            i++;
        }
    }

}
