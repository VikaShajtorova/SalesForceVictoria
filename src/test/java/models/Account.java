package models;

public class Account {
    String accountName;
    String webSite;

    public Account(String accountName, String webSite) {
        this.accountName = accountName;
        this.webSite = webSite;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }
}
