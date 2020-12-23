// *This class is completed*

package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Employer {
    private int id;
    private static int nextId = 1; // < value is not stored in any Employer obj
    private String value;

    public Employer() {
        id = nextId;
        nextId++;

        // ^ = constructor:
        //        - assigns val of nextId to id
        //        - adds 1 to nextId
        //        - every id is a diff #
        //        - no args

    }

    // why do we need 2 constructors?
    //      - called overloading the constructor
    //      - allows us to make a default behavior by initializing vars
    //      - parameters have to be different
    //      -


    public Employer(String value) {
        this(); // > = calls the 1st constructor
        this.value = value;

        // ^ = constructor
        //        - accepts string val as arg
        //        - assigns a value to the val field
        //        - initializes id (puts the val in the id var) as a default behavior

    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }

    // ^ = toString method
    //          - returns the value instead of that weird "org.launchcode.java.demos.classes2.Student@61bbe9ba"

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true; // if obj o == o put true
        if (!(o instanceof Employer)) return false; // if obj o is not of type Employer put false
        Employer employer = (Employer) o; // converts the input o to be of type Employer
        return getId() == employer.getId(); // returns id
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
