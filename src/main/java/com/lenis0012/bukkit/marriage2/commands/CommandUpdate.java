package com.lenis0012.bukkit.marriage2.commands;

import com.lenis0012.bukkit.marriage2.Marriage;

public class CommandUpdate extends Command {

    public CommandUpdate(Marriage marriage) {
        super(marriage, "update");
        setHidden(true);
    }

    @Override
    public void execute() {
        reply("&cUpdater was removed!");
    }
}
