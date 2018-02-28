package com.technerder.entities;

import com.technerder.blockgame.objects.Location;

public class Player {

  private final String name;
  private Location location;

  public Player(String name) {
    this.name = name;
  }

  public void teleport(Location newLocation) {
    this.location = newLocation;
  }

  public String getName() {
    return this.name;
  }

  public Location getLocation() {
    return this.location;
  }
}