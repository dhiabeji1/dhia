// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package dhia.com.domain;

import dhia.com.domain.User_detail;
import java.math.BigInteger;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Persistent;

privileged aspect User_detail_Roo_Mongo_Entity {
    
    declare @type: User_detail: @Persistent;
    
    @Id
    private BigInteger User_detail.id;
    
    public BigInteger User_detail.getId() {
        return this.id;
    }
    
    public void User_detail.setId(BigInteger id) {
        this.id = id;
    }
    
}
