package Model;

public class Member {
    private int ID;
    private String USERNAME;
    private String PASSWORD;
    private String PHONE;

     public Member(){}
    
    public Member(String USERNAME, String PASSWORD, String PHONE) {
        this.USERNAME = USERNAME;
        this.PASSWORD = PASSWORD;
        this.PHONE = PHONE;
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public String getPHONE() {
        return PHONE;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE;
    }
}
