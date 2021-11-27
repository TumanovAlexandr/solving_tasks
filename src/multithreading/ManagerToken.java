package multithreading;

public class ManagerToken {


    private volatile Integer token;

    public Integer getToken() {
        return token;
    }

    public void setToken(Integer token) {
        this.token = token;
    }
}
