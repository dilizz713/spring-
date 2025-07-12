package lk.ijse.gdse71.dto;

public class UserDTO {
    private String uid;
    private String uname;
    private String uaddress;
    private UCity ucity;

    public UserDTO() {
    }

    public UserDTO(String uid, String uname, String uaddress, UCity ucity) {
        this.uid = uid;
        this.uname = uname;
        this.uaddress = uaddress;
        this.ucity = ucity;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUaddress() {
        return uaddress;
    }

    public void setUaddress(String uaddress) {
        this.uaddress = uaddress;
    }

    public UCity getUcity() {
        return ucity;
    }

    public void setUcity(UCity ucity) {
        this.ucity = ucity;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "uid='" + uid + '\'' +
                ", uname='" + uname + '\'' +
                ", uaddress='" + uaddress + '\'' +
                ", ucity=" + ucity +
                '}';
    }
}
