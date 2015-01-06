package com.the_Asgar.ServerSuite.module.Homes.tasks;

import java.io.ByteArrayOutputStream;

import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

import com.the_Asgar.ServerSuite.module.Homes.BungeeSuiteHomes;

public class PluginMessageTask extends BukkitRunnable
{

  private final ByteArrayOutputStream bytes;

  public PluginMessageTask(
      ByteArrayOutputStream bytes)
  {
    this.bytes = bytes;
  }

  @Override
  public void run()
  {
    Bukkit.getOnlinePlayers()[0].sendPluginMessage(
        BungeeSuiteHomes.instance, BungeeSuiteHomes.OUTGOING_PLUGIN_CHANNEL, bytes.toByteArray());

  }

}
