package fr.fatapi.api;

import fr.fatapi.api.utils.Utils;
import lombok.Getter;

import java.util.logging.Logger;

/**
 * Created by Loul on 3rd November 2018.
 */
public class API {

    @Getter
    private static Logger logger;
    @Getter
    private Object bukkitPlugin;
    @Getter
    private Object bungeePlugin;

    /**
     * Method used initializing a bukkit plugin using API.
     * @param bukkitPlugin
     */
    public void setBukkitPlugin(Object bukkitPlugin) {
        if (org.bukkit.plugin.java.JavaPlugin.class.isAssignableFrom(bukkitPlugin.getClass())) {
            this.bukkitPlugin = bukkitPlugin;
            logger = ((org.bukkit.plugin.java.JavaPlugin) bukkitPlugin).getLogger();
            Utils.info("FatAPI launched successfully with bukkit plugin.");
        }
    }

    /**
     * Method used initializing a bungee plugin using API.
     * @param bungeePlugin
     */
    public void setBungeePlugin(Object bungeePlugin) {
        if (net.md_5.bungee.api.plugin.Plugin.class.isAssignableFrom(bungeePlugin.getClass())) {
            this.bungeePlugin = bungeePlugin;
            logger = ((net.md_5.bungee.api.plugin.Plugin) bungeePlugin).getLogger();
            Utils.info("FatAPI launched successfully with bungee plugin.");
        }
    }
}
