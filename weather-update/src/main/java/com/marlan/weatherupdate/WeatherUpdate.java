package com.marlan.weatherupdate;

import com.marlan.shared.utilities.DirHandler;
import com.marlan.shared.utilities.Log;
import com.marlan.weatherupdate.controller.WeatherUpdateController;

import java.io.IOException;

/**
 * Entry Point for the Weather Update module of DCS Dynamic Weather
 * Extracts mission file from DCS *.miz and replaces values based on AVWX API's METAR return
 * or based on customized user input from DCS.
 *
 * @author Chad Penarsky
 */
public class WeatherUpdate {
    private static final Log log = Log.getInstance();

    public static void main(String[] args) {
        String workingDirectory;
        try {
            workingDirectory = DirHandler.getWorkingDir(args);
        } catch (IOException ioe) {
            ioe.printStackTrace();
            workingDirectory = "";
        }

        log.open(workingDirectory);
        WeatherUpdateController.run(workingDirectory); // Start of the Weather Update program
        log.close();
    }
}
