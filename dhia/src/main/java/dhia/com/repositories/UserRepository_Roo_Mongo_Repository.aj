// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package dhia.com.repositories;

import dhia.com.domain.Users;
import dhia.com.repositories.UserRepository;
import java.math.BigInteger;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

privileged aspect UserRepository_Roo_Mongo_Repository {
    
    declare parents: UserRepository extends PagingAndSortingRepository<Users, BigInteger>;
    
    declare @type: UserRepository: @Repository;
    
}
