
package entities;

import java.util.ArrayList;

public class Timetable {

    ArrayList<Interval> intervals;

    public Timetable(ArrayList<Interval> intervals) {
        this.intervals = intervals;
    }


    public ArrayList<Interval> getIntervals() { return this.intervals; }

    public void addInterval(Interval interval) {
        this.intervals.add(interval);
    }

}

