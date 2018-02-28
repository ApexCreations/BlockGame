package com.technerder.blockgame.objects;

public enum Block {

  STONE("Stone", true, "stone.png"),
  GRASS("Grass", true, "grass.png"),
  DIRT("Dirt", true, "dirt.png");

  private final String name;
  private final boolean isSolid;
  private final String texture;

  Block(String name, boolean isSolid, String texture) {
    this.name = name;
    this.isSolid = isSolid;
    this.texture = texture;
  }

  public String getName() {
    return this.name;
  }

  public boolean isSolid() {
    return this.isSolid;
  }

  public String getTexture() {
    return this.texture;
  }
}