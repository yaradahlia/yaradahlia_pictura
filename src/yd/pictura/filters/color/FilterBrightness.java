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

    public FilterBrightness(int offset) {
        this.offset = offset;
    }    
    
    @Override/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    public Pixel doFilter(Pixel pixel) {
        int alpha = pixel.getAlpha();
        int red = pixel.getRed();
        int green = pixel.getGreen();
        int blue = pixel.getBlue();
                
        red = Math.max(Pixel.MIN_VALUE, Math.min(red + this.offset, Pixel.MAX_VALUE));
        green = Math.max(Pixel.MIN_VALUE, Math.min(green + this.offset, Pixel.MAX_VALUE));
        blue = Math.max(Pixel.MIN_VALUE, Math.min(blue + this.offset, Pixel.MAX_VALUE));
        
        return new Pixel(red, green, blue, alpha);
    }
    
}
