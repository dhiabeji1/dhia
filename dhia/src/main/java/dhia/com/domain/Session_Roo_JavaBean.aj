// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package dhia.com.domain;

import dhia.com.domain.Session;

privileged aspect Session_Roo_JavaBean {
    
    public Number Session.getSession_key() {
        return this.session_key;
    }
    
    public void Session.setSession_key(Number session_key) {
        this.session_key = session_key;
    }
    
    public String Session.getSecret() {
        return this.secret;
    }
    
    public void Session.setSecret(String secret) {
        this.secret = secret;
    }
    
    public String Session.getExpiry() {
        return this.expiry;
    }
    
    public void Session.setExpiry(String expiry) {
        this.expiry = expiry;
    }
    
    public String Session.getS_data() {
        return this.s_data;
    }
    
    public void Session.setS_data(String s_data) {
        this.s_data = s_data;
    }
    
    public String Session.getInactive_expiry() {
        return this.inactive_expiry;
    }
    
    public void Session.setInactive_expiry(String inactive_expiry) {
        this.inactive_expiry = inactive_expiry;
    }
    
}
