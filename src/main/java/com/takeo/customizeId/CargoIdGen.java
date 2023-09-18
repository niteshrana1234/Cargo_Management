package com.takeo.customizeId;

import com.takeo.model.Cargo;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.util.Random;

public class CargoIdGen implements IdentifierGenerator {
    @Override
    public Object generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object object) {

        Cargo cargo =(Cargo) object;
        String cargoId = cargo.getName().substring(0,1).toUpperCase()+cargo.getName().substring(2,3).toUpperCase();

        int random = new Random().nextInt(10000);

        cargoId = cargoId+"-"+random;

        return cargoId;
    }
}
