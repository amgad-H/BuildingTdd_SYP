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

    @Test
    void testAddingResidentToABuildingWhereResidentAlreadyExisted(){
        String[] residents = {"r1", "r2"};
        Building building = new Building(1, residents);

        building.addResident("r2");

        List<String> gottenResidents = building.getResident();

        assertEquals(1, building.getId());
        int i = 0;
        for (String s: residents) {
            assertEquals(s, gottenResidents.get(i));
            i++;
        }
    }

    @Test
    void testRemovingResidentFromABuilding(){
        String[] residents = {"r1", "r2"};
        Building building = new Building(1, residents);

        building.removeResident("r1");

        List<String> gottenResidents = building.getResident();

        assertEquals(1, building.getId());
        assertEquals("r2", gottenResidents.get(0));
    }

    @Test
    void testRemovingResidentFromABuildingThatTheResidentIsNotIn(){
        String[] residents = {"r1", "r2"};
        Building building = new Building(1, residents);

        building.removeResident("r3");

        List<String> gottenResidents = building.getResident();

        assertEquals(1, building.getId());
        int i = 0;
        for (String s: residents) {
            assertEquals(s, gottenResidents.get(i));
            i++;
        }
    }

    @Test
    void testGetTheNumberOfResidentsOfABuildingReturnsRightNumber(){
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
        assertEquals(3, building.getNumberOfResidents());
    }

    @Test
    void testGetRightNumberOfResidentsOfABuildingAfterRemovingAResident(){
        String[] residents = {"r1", "r2", "r3"};
        String[] lesserResidents = {"r1", "r3"};
        Building building = new Building(1, residents);

        List<String> gottenResidents = building.getResident();


        assertEquals(1, building.getId());
        int i = 0;
        for (String s: residents) {
            assertEquals(s, gottenResidents.get(i));
            i++;
        }
        assertEquals(3, building.getNumberOfResidents());

        building.removeResident("r2");

        List<String> gottenLesserResidents = building.getResident();

        i = 0;
        for (String s: lesserResidents) {
            assertEquals(s, gottenLesserResidents.get(i));
            i++;
        }
        assertEquals(2, building.getNumberOfResidents());
    }

}
