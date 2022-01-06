module com.game.zelda {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.game.zelda to javafx.fxml;
    exports com.game.zelda;
}