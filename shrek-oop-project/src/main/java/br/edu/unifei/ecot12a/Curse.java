package br.edu.unifei.ecot12a;

import java.util.Calendar;

public class Curse {
    private String name;
    private Calendar start;
    private Calendar end;
    private String transformation;
    private String breakCondition;
    private String duration;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Calendar getStart() {
        return start;
    }
    public void setStart(Calendar start) {
        this.start = start;
    }
    public Calendar getEnd() {
        return end;
    }
    public void setEnd(Calendar end) {
        this.end = end;
    }
    public String getTransformation() {
        return transformation;
    }
    public void setTransformation(String transformation) {
        this.transformation = transformation;
    }
    public String getBreakCondition() {
        return breakCondition;
    }
    public void setBreakCondition(String breakCondition) {
        this.breakCondition = breakCondition;
    }
    public String getDuration() {
        return duration;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }
}
