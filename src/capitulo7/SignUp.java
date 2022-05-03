package capitulo7;

public
class SignUp {
    public
    SignUp () {
    }
    public
    SignUp (String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public
    SignUp (String fname, String lname, int age) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }

    private String fname;
    private String lname;
    private int age;



    public
    String getFname ( ) {
        return fname;
    }

    public
    void setFname (String fname) {
        this.fname = fname;
    }

    public
    String getLname ( ) {
        return lname;
    }

    public
    void setLname (String lname) {
        this.lname = lname;
    }

    public
    int getAge ( ) {
        return age;
    }

    public
    void setAge (int age) {
        this.age = age;
    }

    @Override
    public
    String toString ( ) {
        return "First Name: " + fname + '\n' +
               "Last Name: " + lname + '\n' +
               "Age: " + age + '\n';
    }
}
