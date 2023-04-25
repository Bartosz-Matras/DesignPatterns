package pl.matrasbartosz.visitor_pattern.task2.transport;

import pl.matrasbartosz.visitor_pattern.task2.visitor.TransportVisitor;

public class Person implements Transportable {

    private String firstName;
    private String lastName;
    private boolean isRegularCustomer;

    public Person(String firstName, String lastName, boolean isRegularCustomer) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isRegularCustomer = isRegularCustomer;
    }

    @Override
    public void accept(TransportVisitor transportVisitor) {
        transportVisitor.visit(this);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isRegularCustomer() {
        return isRegularCustomer;
    }

    public void setRegularCustomer(boolean regularCustomer) {
        isRegularCustomer = regularCustomer;
    }
}
