package com.technerder.blockgame.objects;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class World {

  private final String name;
  private final Map<Block, Location> blocksInWorld;

  public World(String name) {
    this.name = name;
    this.blocksInWorld = new HashMap<>();
  }

  public String getName() {
    return name;
  }

  public Map<Block, Location> getBlocksInWorld() {
    return Collections.unmodifiableMap(blocksInWorld);
  }

}