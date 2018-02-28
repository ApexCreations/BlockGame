package com.technerder.blockgame.objects;

public class Location {

  private final World world;
  private int x, y, z, yaw, pitch;

  public Location(World world, int x, int y, int z) {
    this.world = world;
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public World getWorld() {
    return world;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public int getZ() {
    return z;
  }

  public void setZ(int z) {
    this.z = z;
  }

  public int getYaw() {
    return yaw;
  }

  public void setYaw(int yaw) {
    this.yaw = yaw;
  }

  public int getPitch() {
    return pitch;
  }

  public void setPitch(int pitch) {
    this.pitch = pitch;
  }
}