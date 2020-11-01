
import gui.MainWindow;

import java.util.HashMap;
import java.util.Scanner;
import Polynoms.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*Scanner in = new Scanner(System.in);
        HashMap<Double,Double> v = new HashMap<Double, Double>();
        v.put(0.0, 0.0);
        v.put(1.0, 1.0);
        v.put(2.0, 4.0);
        Newton nw = new Newton(v);
        System.out.println(nw.polin);
        System.out.println(nw.invoke(5.4));
        System.out.println("Ведите новый узел:");
        System.out.print("x = ");
        Double x = in.nextDouble();
        System.out.println(x);
        System.out.print("y = ");
        Double y = in.nextDouble();
        System.out.println(y);
        nw.AddUzel(x,y);
        System.out.println(nw.polin);
        System.out.println(nw.invoke(5.4));*/
        var vnd = new MainWindow();
        vnd.setVisible(true);
    }
}
