// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package dhia.com.domain;

import dhia.com.domain.Users;
import java.math.BigInteger;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Persistent;

privileged aspect Users_Roo_Mongo_Entity {
    
    declare @type: Users: @Persistent;
    
    @Id
    private BigInteger Users.id;
    
    public BigInteger Users.getId() {
        return this.id;
    }
    
    public void Users.setId(BigInteger id) {
        this.id = id;
    }
    
}
