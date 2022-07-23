/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construction.Class;

/**
 *
 * @author faisa
 */
public class EmployeeAttendance {
    private int EntryNo;
    private String Date;
    private String Time;
    private String ID;
    private String Weekday;

    public EmployeeAttendance(int EntryNo, String Date, String Time, String ID, String Weekday) {
        this.EntryNo = EntryNo;
        this.Date = Date;
        this.Time = Time;
        this.ID = ID;
        this.Weekday = Weekday;
    }

    public int getEntryNo() {
        return EntryNo;
    }

    public String getDate() {
        return Date;
    }

    public String getTime() {
        return Time;
    }

    public String getID() {
        return ID;
    }

    public String getWeekday() {
        return Weekday;
    }

    public void setEntryNo(int EntryNo) {
        this.EntryNo = EntryNo;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setWeekday(String Weekday) {
        this.Weekday = Weekday;
    }
    
}
