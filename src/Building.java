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

    public int getNumberOfResidents(){
        int num = 0;

        if(mResident != null){
            num = mResident.size();
        }

        return num;
    }

    public void addResident(String resident) {
        mResident.add(resident);
    }

    public void removeResident(String resident) {
        mResident.remove(resident);
    }
}
