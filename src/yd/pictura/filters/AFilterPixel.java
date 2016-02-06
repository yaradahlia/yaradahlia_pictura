package yd.pictura.filters;

import java.util.LinkedList;
import java.util.List;
import yd.pictura.Pixel;

/**
 * Base class for all filters that manipulates a pixel at a time.
 * 
 * @author yara dahlia
 */
public abstract class AFilterPixel {
    public abstract Pixel doFilter(Pixel pixel);
    
    public Pixel[] doFilter(Pixel[] pixels) {
        Pixel[] modifiedPixels = new Pixel[0];
        
        if (pixels != null && pixels.length > 0) {
            modifiedPixels = new Pixel[pixels.length];
            
            for (int i = 0; i < pixels.length; i++) {
                modifiedPixels[i] = this.doFilter((Pixel)pixels[i]);
            }
        }
        
        return modifiedPixels;
    }
    
    public List<Pixel> doFilter(List<Pixel> pixels) {
        List<Pixel> modifiedPixels = new LinkedList<>();
        
        if (pixels != null && pixels.size() > 0) {
            for (Pixel pixel : pixels) {
                modifiedPixels.add(this.doFilter(pixel));
            }
        }
        
        return modifiedPixels;
    }
    
    public Pixel doFilter(int rgba, boolean hasAlpha) {
        return this.doFilter(new Pixel(rgba, hasAlpha));
    }
    
    public Pixel doFilter(int red, int green, int blue, int alpha) {
        return this.doFilter(new Pixel(red, green, blue, alpha));
    }
}
