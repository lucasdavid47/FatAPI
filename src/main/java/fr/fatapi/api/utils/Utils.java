package fr.fatapi.api.utils;

import fr.fatapi.api.API;

/**
 * Created by Loul on 3rd November 2018.
 */
public class Utils {

    /**
     * Method used to send an error message to console.
     * @param str
     */
    public static void severe(String str) {
        API.getLogger().severe(str);
    }

    /**
     * Method used to send a message to the console.
     * @param str
     */
    public static void info(String str) {
        API.getLogger().info(str);
    }
}
