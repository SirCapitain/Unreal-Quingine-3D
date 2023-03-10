package quinn.world.obj.Quectangal;

import quinn.world.obj.Qulane;
import quinn.world.obj.Quobject3D;

import java.awt.*;

/**
 * The main class for a rectangular prism.
 * The very cool 3D object that looks 3D
 *
 * @author Quinn Graham
 */

public class QuectangularQuism extends Quobject3D {
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int BOTTOM = 2;
    public static final int TOP = 3;
    public static final int BACK = 4;
    public static final int FRONT = 5;

    /**
     * The Quectangular Quism is like the Rectangular Prism but better.
     * @param x Center of Shape
     * @param y Center of Shape
     * @param z Center of Shape
     * @param width How Wide
     * @param height How Tall
     * @param depth How backwardy it goes.
     */
    public QuectangularQuism(double x, double y, double z, double width, double height, double depth){
        super(x, y, z, new Qulane[]{new Qulane(depth, height, x-width/2, y, z,Qulane.RECTANGLE), //Left
                                    new Qulane(depth, height,x+width/2, y, z,Qulane.RECTANGLE), //Right
                                    new Qulane(depth, width, x, y+height/2, z,Qulane.RECTANGLE), //Bottom
                                    new Qulane(depth, width, x, y-height/2, z,Qulane.RECTANGLE), //Top
                                    new Qulane(width, height, x, y, z-depth/2,Qulane.RECTANGLE), //Back
                                    new Qulane(width, height, x, y, z+depth/2,Qulane.RECTANGLE)}); //Front
        getPlanes()[0].rotate(90,0,1,0);//Left
        getPlanes()[1].rotate(-90,0,1,0);//Right
        getPlanes()[2].rotate(90,1,0,0);//Bottom
        getPlanes()[3].rotate(-90,1,0,0);//Top
        getPlanes()[2].rotate(90,0,1,0);//Bottom
        getPlanes()[3].rotate(-90,0,1,0);//Top

    }

    /**
     * Sometimes, you need a fresh code of paint.
     * @param color What color you want it to be
     * @param face What face you want to change its color
     */
    public void setFaceColor(Color color, int face){
        getPlanes()[face].setFillColor(color);
    }

    public double width, height, depth;
    /**
     * Everything needs dimensions
     * @param width how much along the x
     * @param height how much along the y
     * @param depth how much along the z
     */
    public void setDimensions(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
}
