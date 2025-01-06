module com.golubovicluka.passwordmanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.golubovicluka.passwordmanagementsystem to javafx.fxml;
    opens com.golubovicluka.passwordmanagementsystem.controller to javafx.fxml;
    opens com.golubovicluka.passwordmanagementsystem.model to javafx.base;
    
    exports com.golubovicluka.passwordmanagementsystem;
    exports com.golubovicluka.passwordmanagementsystem.controller;
    exports com.golubovicluka.passwordmanagementsystem.model;

}
