package com.mwb.create.Builder;


public class SxtAirShipBuilder implements AirShipBuilder {
	//StringBuilder, 以后学习XML解析中，JDOM库中的类：DomBuilder,SaxBuilder
	@Override
	public Engine builderEngine() {
		System.out.println("构建MWB牌发动机！");
		return new Engine("MWB牌发动机！");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		
		System.out.println("构建逃逸塔");
		return new EscapeTower("MWB牌逃逸塔");
	}

	@Override
	public OrbitalModule builderOrbitalModule() {
		System.out.println("构建轨道舱");
		return new OrbitalModule("MWB牌轨道舱");
	}	
	
}
