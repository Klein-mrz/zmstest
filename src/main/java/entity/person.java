package entity;

public class person {
    private String firstname;
    private String lastname;
    private String sex;
    private String disposition;

    @Override
    public String toString() {
        return ""+firstname+" "+lastname+": "+sex+"  "+disposition;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDisposition() {
        return disposition;
    }

    public void setDisposition(String disposition) {
        this.disposition = disposition;
    }
}
