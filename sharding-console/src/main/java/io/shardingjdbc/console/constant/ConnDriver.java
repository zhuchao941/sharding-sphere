package io.shardingjdbc.console.constant;

import lombok.Getter;

@Getter
public enum ConnDriver {

    MySQLDriver("mysql", "com.mysql.jdbc.Driver"),
    OracleDriver("oracle", "oracle.jdbc.driver.OracleDriver");

    private String dbName;
    private String driverName;

    ConnDriver(final String dbName, final String driverName) {
        this.dbName = dbName;
        this.driverName = driverName;
    }
}