package yd.pictura.filters;

import yd.pictura.Pixel;

/**
 * Base class for all filters.
 * 
 * @author yara dahlia
 */
public abstract class AFilter {
    public abstract void doFilter(Pixel pixel);
    
    public void doFilter(Pixel[] pixels) {        
        for (Pixel pixel : pixels) {
            
        }
    }
}
