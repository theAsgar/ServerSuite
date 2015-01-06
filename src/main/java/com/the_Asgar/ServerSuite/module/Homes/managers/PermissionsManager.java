package com.the_Asgar.ServerSuite.module.Homes.managers;

import org.bukkit.entity.Player;

import com.the_Asgar.ServerSuite.module.Homes.BungeeSuiteHomes;

public class PermissionsManager
{

  public static void addAllPermissions(
      Player player)
  {
    player.addAttachment(
        BungeeSuiteHomes.instance, "bungeesuite.homes.*", true);
  }

  public static void addAdminPermissions(
      Player player)
  {
    player.addAttachment(
        BungeeSuiteHomes.instance, "bungeesuite.homes.admin", true);
  }

  public static void addUserPermissions(
      Player player)
  {
    player.addAttachment(
        BungeeSuiteHomes.instance, "bungeesuite.homes.user", true);
  }
}
