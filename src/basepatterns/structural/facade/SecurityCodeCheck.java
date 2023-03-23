package basepatterns.structural.facade;

public class SecurityCodeCheck {
    private int securityCode;

    public int getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }

    public boolean isCodeCorrect() {
        if (getSecurityCode() == 1234) {
            return true;
        } else {
            return false;
        }
    }
}
