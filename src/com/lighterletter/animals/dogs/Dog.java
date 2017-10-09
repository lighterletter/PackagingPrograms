package com.lighterletter.animals.dogs;

public class Dog extends Canine {

    // fields should be private
    private String name;

    // constructor usually caps the class
    public Dog(String name) {
        this.name = name;
    }

    /* public methods up top */

    //region Public Methods
    public void beGoodDog() {
    }

    // Accessor methods (getters and setters)
    public String getName() {
        return name;
    }

    /**
     * This is a javadoc comment, used to give explanations for complex methods
     *
     * @param name dogs name.
     */
    public void setName(String name) { // gray because it is not used
        this.name = name;
    }
    //endregion


    /* private methods at bottom */

    //region Private Methods
    private void calculateInfinity() {
    }

    private void chaseOwnTail() {
    }

    private void doTaxes() {
    }
    //endregion

    // overrides usually come before or after accessors based on preference
    // unless you choose to group methods by functionality.
    @Override
    public String bark() {
        return null;
    }

    class InnerClass {
        //inner classes at the end
    }
}
