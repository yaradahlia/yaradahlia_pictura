package yd.pictura;

import java.awt.Color;
import java.awt.color.ColorSpace;

/**
 * This class represents a rgba pixel.
 * @author aaa
 */
public class Pixel extends Color {
    
    public static final int MAX_VALUE = 255;
    public static final int MIN_VALUE = 0;
    
    public Pixel(int red, int green, int blue) {
        super(red, green, blue);
    }

    public Pixel(int red, int green, int blue, int alpha) {
        super(red, green, blue, alpha);
    }

    public Pixel(int rgb) {
        super(rgb);
    }

    public Pixel(int rgba, boolean hasalpha) {
        super(rgba, hasalpha);
    }

    public Pixel(float red, float green, float blue) {
        super(red, green, blue);
    }

    public Pixel(float red, float green, float blue, float alpha) {
        super(red, green, blue, alpha);
    }

    public Pixel(ColorSpace cspace, float[] components, float alpha) {
        super(cspace, components, alpha);
    }
    
    public Pixel(Color color) {
        this(color.getRGB());
    }    
}
