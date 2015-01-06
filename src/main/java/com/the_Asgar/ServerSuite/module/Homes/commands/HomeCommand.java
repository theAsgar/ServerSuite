package com.the_Asgar.ServerSuite.module.Homes.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class HomeCommand implements CommandExecutor
{

  @Override
  public boolean onCommand(
      CommandSender sender,Command command,String label,String[] args)
  {
    if (args.length == 0)
    {
      HomesManager.sendHome(
          sender, "home");
    }
    else
    {
      HomesManager.sendHome(
          sender, args[0]);
    }
    return true;
  }

}
