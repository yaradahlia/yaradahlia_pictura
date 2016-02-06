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
    
    public Pixel(int r, int g, int b) {
        super(r, g, b);
    }

    public Pixel(int r, int g, int b, int a) {
        super(r, g, b, a);
    }

    public Pixel(int rgb) {
        super(rgb);
    }

    public Pixel(int rgba, boolean hasalpha) {
        super(rgba, hasalpha);
    }

    public Pixel(float r, float g, float b) {
        super(r, g, b);
    }

    public Pixel(float r, float g, float b, float a) {
        super(r, g, b, a);
    }

    public Pixel(ColorSpace cspace, float[] components, float alpha) {
        super(cspace, components, alpha);
    }
    
    public Pixel(Color color) {
        this(color.getRGB());
    }    
}
