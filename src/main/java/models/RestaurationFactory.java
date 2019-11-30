package models;

public class RestaurationFactory {
    private String email;
    private String password;
    private String restaurationName;

    public RestaurationFactory(String email, String password, String restaurationName) {
        this.email = email;
        this.password = password;
        this.restaurationName = restaurationName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRestaurationName() {
        return restaurationName;
    }

    public void setRestaurationName(String restaurationName) {
        this.restaurationName = restaurationName;
    }
}
