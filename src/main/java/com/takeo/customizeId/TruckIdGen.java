package com.takeo.customizeId;

import com.takeo.model.Truck;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.util.Random;

public class TruckIdGen implements IdentifierGenerator {
    @Override
    public Object generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object object) {
        Truck truck =(Truck) object;

        String truckId = truck.getMake().substring(0,1).toUpperCase()+truck.getMake().substring(2,3).toUpperCase();

        int random = new Random().nextInt(10000);

        truckId = truckId+"-"+random;

        return truckId;
    }
}
