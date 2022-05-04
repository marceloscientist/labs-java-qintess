package capitulo7;

public
class SignUp {
    public
    SignUp () {
    }
    public
    SignUp (String fname, String lname) {
        setFname(fname);
        setLname(lname);
    }

    public
    SignUp (String fname, String lname, int age) {
        setFname(fname);
        setLname(lname);
        setAge(age);
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
        return "First Name: " + getFname() + '\n' +
               "Last Name: " + getLname() + '\n' +
               "Age: " + getAge() + '\n';
    }
}
