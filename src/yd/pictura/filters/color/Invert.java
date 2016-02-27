package yd.pictura.filters.color;

import yd.pictura.Pixel;
import yd.pictura.filters.AFilterPixel;

/**
 * Defines invert filter.
 * 
 * @author aaa
 */
public class Invert extends AFilterPixel {
    public final int INVERT_OFFSET = 255;
    
    @Override
    public Pixel doFilter(Pixel pixel) {
        int alpha = pixel.getAlpha();
        int red = pixel.getRed();
        int green = pixel.getGreen();
        int blue = pixel.getBlue();
        
        red = INVERT_OFFSET - red;
        green = INVERT_OFFSET - green;
        blue = INVERT_OFFSET - blue;
        
        return new Pixel(red, green, blue, alpha);
    }
    
}
