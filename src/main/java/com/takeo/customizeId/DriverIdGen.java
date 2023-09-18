package com.takeo.customizeId;

import com.takeo.model.Driver;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.util.Random;

public class DriverIdGen implements IdentifierGenerator {
    @Override
    public Object generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object object) {
        Driver driver =(Driver)object;
        String dname = driver.getName();
        String str = dname.substring(0,1).toUpperCase()+dname.substring(2,3).toUpperCase();

        Random random = new Random();
        int ran = random.nextInt(10000);

        str = str+"-"+ran;

        return str;
    }
}
