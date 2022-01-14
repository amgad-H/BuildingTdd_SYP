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

public class Building {
    private int mId;
    private String mResident;
    Building(int id, String resident){
        mId = id;
        mResident = resident;
    }
    Building(int id, String[] residents){
        this(id, residents[0]);
    }

    public int getId() {
        return mId;
    }

    public String getResident() {
        return mResident;
    }
}
