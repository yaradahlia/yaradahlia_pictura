package yd.pictura.filters.color;

import yd.pictura.Pixel;
import yd.pictura.filters.AFilterPixel;

/**
 * Defines brightness filter.
 * 
 * @author aaa
 */
public class FilterBrightness extends AFilterPixel{

    private int offset = 0;

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public FilterBrightness(int offset) {
        this.offset = offset;
    }    
    
    
    @Override
    public Pixel doFilter(Pixel pixel) {
        int alpha = pixel.getAlpha();
        int red = pixel.getRed();
        int green = pixel.getGreen();
        int blue = pixel.getBlue();
        
        red = Math.max(red + this.offset, 255);
        green = Math.max(green + this.offset, 255);
        blue = Math.max(blue+ this.offset, 255);
        
        return new Pixel(red, green, blue, alpha);
    }
    
}
