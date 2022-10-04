package com.acme.university.model;

public class Enrollment extends BaseModel{
    private int grade;
    private Unit unit;

    public Enrollment(long id, int grade, Unit unit) {
        super(id);
        this.grade = grade;
        this.unit = unit;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "grade=" + grade +
                ", unit=" + unit +
                '}' + super.toString();
    }
}
