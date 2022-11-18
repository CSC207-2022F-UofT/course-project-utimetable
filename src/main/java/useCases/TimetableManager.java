package useCases;

import entities.Interval;
import entities.Timetable;

import java.util.ArrayList;
import java.util.TreeMap;

public class TimetableManager {

    public ArrayList<Interval> compareTimetable(ArrayList<Timetable> timetables) {

        TreeMap<Integer, Boolean> intervalTree = new TreeMap<>();

        intervalTree.put(0, true);
        intervalTree.put(Integer.MAX_VALUE, false);

        for (Timetable t : timetables) {
            for (Interval i : t.getIntervals()) {
                int x = i.start();
                int y = i.end();
                int gx = intervalTree.ceilingKey(x);
                int ly = intervalTree.floorKey(y);
                Boolean w = intervalTree.get(gx);

                if (gx == ly) {
                    intervalTree.remove(gx);
                    if (w) {
                        // { ] } [
                        intervalTree.put(y, true);
                    } else {
                        // ] { [ }
                        intervalTree.put(x, false);
                    }
                } else if (w) {
                    if (gx < ly) {
                        // { ] [ }
                        intervalTree.remove(gx);
                        intervalTree.remove(ly);
                    }
                    // [ { } ]
                } else {
                    // ] { } [
                    intervalTree.put(x, false);
                    intervalTree.put(y, true);
                }
            }
        }

        ArrayList<Integer> intervalTreeKeys = new ArrayList<>(intervalTree.keySet());
        ArrayList<Interval> intervals = new ArrayList<>();


        for (int i = 0; i < intervalTree.size(); i += 2) {
            intervals.add(new Interval("#", intervalTreeKeys.get(i), intervalTreeKeys.get(i + 1)));
        }

        return intervals;
    }


}


