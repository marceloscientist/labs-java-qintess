package capitulo5.lab1;

public
class Employee {

    private String name;


    private String lastname;
    private String role;
    private double wage;

    public
    Employee (String name, String lastname, String role, double wage) {
        this.name = name;
        this.lastname = lastname;
        this.role = role;
        this.wage = wage;
    }


    public
    String getName ( ) {
        return name;
    }

    public
    void setName (String name) {
        this.name = name;
    }

    public
    String getLastname ( ) {
        return lastname;
    }

    public
    void setLastname (String lastname) {
        this.lastname = lastname;
    }

    public
    String getRole ( ) {
        return role;
    }

    public
    void setRole (String role) {
        this.role = role;
    }

    public
    double getWage ( ) {
        return wage;
    }

    public
    void setWage (double wage) {
        this.wage = wage;
    }

    @Override
    public
    String toString ( ) {
        return  "name: " + name + '\n' +
                "lastname: " + lastname + '\n' +
                "role=: " + role + '\n' +
                "wage: " + wage;
    }

}
