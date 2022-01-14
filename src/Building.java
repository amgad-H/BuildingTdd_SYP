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

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Building {
    private int mId;
    private List<String> mResident;
    Building(int id, String resident){
        mId = id;
        if(mResident == null){
            mResident = new LinkedList<>();
        }
        mResident.add(resident);
    }
    Building(int id, String[] residents){
        mId = id;
        if(mResident == null){
            mResident = new LinkedList<>();
        }
        Arrays.stream(residents)
                .forEach(s -> addResident(s));
    }

    public int getId() {
        return mId;
    }

    public List<String> getResident() {
        return mResident;
    }

    public void addResident(String resident) {
        mResident.add(resident);
    }
}
