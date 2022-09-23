package com.marlan.weatheroutput.model;

import lombok.Data;

@Data
public class Config {
    private String spreadsheetId;
    private String spreadsheetRange;
    private boolean outputToSheets;
    private boolean outputToDiscord;
}
