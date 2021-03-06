// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package dhia.com.web;

import dhia.com.ServiceUsers;
import dhia.com.domain.Users;
import dhia.com.web.ApplicationConversionServiceFactoryBean;
import java.math.BigInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;

privileged aspect ApplicationConversionServiceFactoryBean_Roo_ConversionService {
    
    declare @type: ApplicationConversionServiceFactoryBean: @Configurable;
    
    @Autowired
    ServiceUsers ApplicationConversionServiceFactoryBean.serviceUsers;
    
    public Converter<Users, String> ApplicationConversionServiceFactoryBean.getUsersToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<dhia.com.domain.Users, java.lang.String>() {
            public String convert(Users users) {
                return new StringBuilder().append(users.getUserName()).append(' ').append(users.getPassword()).append(' ').append(users.getFirstName()).append(' ').append(users.getLastName()).toString();
            }
        };
    }
    
    public Converter<BigInteger, Users> ApplicationConversionServiceFactoryBean.getIdToUsersConverter() {
        return new org.springframework.core.convert.converter.Converter<java.math.BigInteger, dhia.com.domain.Users>() {
            public dhia.com.domain.Users convert(java.math.BigInteger id) {
                return serviceUsers.findUsers(id);
            }
        };
    }
    
    public Converter<String, Users> ApplicationConversionServiceFactoryBean.getStringToUsersConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, dhia.com.domain.Users>() {
            public dhia.com.domain.Users convert(String id) {
                return getObject().convert(getObject().convert(id, BigInteger.class), Users.class);
            }
        };
    }
    
    public void ApplicationConversionServiceFactoryBean.installLabelConverters(FormatterRegistry registry) {
        registry.addConverter(getUsersToStringConverter());
        registry.addConverter(getIdToUsersConverter());
        registry.addConverter(getStringToUsersConverter());
    }
    
    public void ApplicationConversionServiceFactoryBean.afterPropertiesSet() {
        super.afterPropertiesSet();
        installLabelConverters(getObject());
    }
    
}
