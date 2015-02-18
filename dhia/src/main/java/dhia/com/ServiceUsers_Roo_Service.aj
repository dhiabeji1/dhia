// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package dhia.com;

import dhia.com.ServiceUsers;
import dhia.com.domain.Users;
import java.math.BigInteger;
import java.util.List;

privileged aspect ServiceUsers_Roo_Service {
    
    public abstract long ServiceUsers.countAllUserses();    
    public abstract void ServiceUsers.deleteUsers(Users users);    
    public abstract Users ServiceUsers.findUsers(BigInteger id);    
    public abstract List<Users> ServiceUsers.findAllUserses();    
    public abstract List<Users> ServiceUsers.findUsersEntries(int firstResult, int maxResults);    
    public abstract void ServiceUsers.saveUsers(Users users);    
    public abstract Users ServiceUsers.updateUsers(Users users);    
}