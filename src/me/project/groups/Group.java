package me.project.groups;

import me.project.customers.Customers;

import java.util.Objects;

public class Group {
    private Grade grade;
    private Parameter parameter;

    public Group() {
        this.grade = null;
        this.parameter = null;
    }

    public Group(Grade grade) {
        this.grade = grade;
    }

    public Group(Grade grade, Parameter parameter) {
        this.grade = grade;
        this.parameter = parameter;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Parameter getParameter() {
        return parameter;
    }

    public void setParameter(Parameter parameter) {
        this.parameter = parameter;
    }

    public Customers getCustomers () {
        return Customers.getInstance().findCustomers(this);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return grade == group.grade && Objects.equals(parameter, group.parameter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grade, parameter);
    }

    @Override
    public String toString() {
        if(this.grade == null) {
            return "NO Group!";
        } else if (this.parameter == null) {
            return "==============================" + "\n"
                    + "GroupType: " + this.grade + "\n"
                    + "==============================" + "\n"
                    + "Parameter: null";
        } else
            return "==============================" + "\n"
                    + "GroupType: " + this.grade + "\n"
                    + "==============================" + "\n"
                    + "Parameter: " + this.parameter;
    }
}
