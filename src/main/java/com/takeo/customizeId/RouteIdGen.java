package com.takeo.customizeId;

import com.takeo.model.Route;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.util.Locale;
import java.util.Random;

public class RouteIdGen implements IdentifierGenerator {
    @Override
    public Object generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object object) {
        Route route =(Route) object;
        String routeId = route.getInitialAddress().substring(0,1).toUpperCase()+ route.getDestinationAddress().substring(0,1).toUpperCase();

        int random = new Random().nextInt(10000);

        routeId = routeId+"-"+Integer.toString(random);

        return routeId;
    }
}
