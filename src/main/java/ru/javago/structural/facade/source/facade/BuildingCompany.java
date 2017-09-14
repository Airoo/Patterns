package ru.javago.structural.facade.source.facade;

import ru.javago.structural.facade.source.base.Builder;
import ru.javago.structural.facade.source.base.Carpenter;
import ru.javago.structural.facade.source.base.Plumber;

public class BuildingCompany {
    private Builder builder;
    private Carpenter carpenter;
    private Plumber plumber;

    public BuildingCompany() {
        builder = new Builder();
        carpenter = new Carpenter();
        plumber = new Plumber();
    }

    public void buildHouse(){
        builder.createWall();
        builder.createFloor();
        carpenter.createRoof();
        plumber.doPlumbing();
    }
}
