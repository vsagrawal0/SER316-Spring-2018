package main.java.memoranda;

import main.java.memoranda.date.CalendarDate;


//TASK 2-1 SMELL WITHIN A CLASS
public class TaskParameters {
    CalendarDate startDate;
    CalendarDate endDate;
    String text;
    int priority;
    long effort;
    String description;
    String parentTaskId;
    
    public TaskParameters(CalendarDate sd, CalendarDate ed, String text) {
        startDate = sd;
        endDate = ed;
        this.text = text;
    }

    public CalendarDate getStartDate() {
        return startDate;
    }

    public CalendarDate getEndDate() {
        return endDate;
    }

    public String getText() {
        return text;
    }

    public int getPriority() {
        return priority;
    }

    public long getEffort() {
        return effort;
    }

    public String getDescription() {
        return description;
    }

    public String getParentTaskId() {
        return parentTaskId;
    }

    public void setStartDate(CalendarDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(CalendarDate endDate) {
        this.endDate = endDate;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setParentTaskId(String parentTaskId) {
        this.parentTaskId = parentTaskId;
    }
    
    public void setPriority(int p) {
        priority = p;
    }
    
    public void setEffort(long e) {
        effort = e;
    }
    
    public void setDescription(String d) {
        description = d;
    }

}
