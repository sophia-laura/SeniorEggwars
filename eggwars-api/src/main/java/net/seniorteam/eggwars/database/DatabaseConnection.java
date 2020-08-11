package net.seniorteam.eggwars.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public interface DatabaseConnection {

    Connection getConnection();

    boolean isConnected();

    void setupConnection();

    default void createTables() {
        try (Statement stmt = getConnection().createStatement()) {
            stmt.execute("CREATE TABLE IF NOT EXISTS `statistics` (`id` INT NOT NULL AUTO_INCREMENT, `uniqueId` " +
                    "VARCHAR(36) NOT NULL, `wins` INT(8) NOT NULL DEFAULT 0, `played` INT(8) NOT NULL DEFAULT 0, `eggsDestroyed` " +
                    "INT(8) NOT NULL DEFAULT 0, `kills` INT(8) NOT NULL DEFAULT 0, `deaths` INT(8) NOT NULL DEFAULT 0, " +
                    "`coins` INT(8) NOT NULL DEFAULT 0, `rank` INT(8) NOT NULL DEFAULT 0, PRIMARY KEY (`id`)) " +
                    "ENGINE='InnoDB'");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
