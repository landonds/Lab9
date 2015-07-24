package lab9;

import javafx.geometry.*;
import javafx.scene.shape.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Lab9 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        int width = 300;
        int height = 300;
        double x1 = Math.random()*(width - 12);
        double x2 = Math.random()*(width - 12);
        double y1 = Math.random()*(height - 12);
        double y2 = Math.random()*(height - 12);
        
        Circle c1 = new Circle(x1, y1, 15);
        Circle c2 = new Circle(x2, y2, 15);
        Line l = new Line(x1, y1, x2, y2);
        double d = (new Point2D(x1, y1).distance(x2, y2));
        Text t = new Text(((x1+x2)/2), ((y1+y2)/2), d + "");
        
        pane.getChildren().addAll(c1, c2, l, t);
        
        Scene scene = new Scene(pane, width, height);
        primaryStage.setTitle("Lab9");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }//main
    
}//class