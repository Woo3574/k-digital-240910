package 회원가입_DB;

public class SignUpVo {
    private String userId;
    private String userPassword;
    private String name;
    private String userPhone;

    public SignUpVo(String userId, String userPassword, String name, String userPhone) {
        this.userId = userId;
        this.userPassword = userPassword;
        this.name = name;
        this.userPhone = userPhone;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getName() {
        return name;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
}
