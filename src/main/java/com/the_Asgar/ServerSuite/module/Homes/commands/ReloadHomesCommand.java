package com.the_Asgar.ServerSuite.module.Homes.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ReloadHomesCommand implements CommandExecutor
{

  @Override
  public boolean onCommand(
      CommandSender sender,Command command,String label,String[] args)
  {
    HomesManager.reloadHomes(sender);
    return true;
  }

}
