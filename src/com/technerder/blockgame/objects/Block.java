package com.technerder.blockgame.objects;

public enum Block {

	STONE("Stone", true, "stone.png"), 
	GRASS("Grass", true, "grass.png"),
	DIRT("Dirt" , true, "dirt.png");
	
	private final String name;
	private final boolean isSolid;
	private final String texture;

	Block(String name, boolean isSoid, String texture) {

		this.name = name;
		this.isSolid = isSoid;
		this.texture = texture;

	}

	public String getName() {

		return name;

	}

	public boolean isSolid() {

		return isSolid;

	}

	public String getTexture() {

		return texture;

	}

}