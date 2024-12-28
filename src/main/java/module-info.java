module com.golubovicluka.projectmanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.golubovicluka.projectmanagementsystem to javafx.fxml;
    exports com.golubovicluka.projectmanagementsystem;
}