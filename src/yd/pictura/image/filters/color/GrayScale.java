package yd.pictura.image.filters.color;

import yd.pictura.Pixel;
import yd.pictura.image.filters.AFilterPixel;

/**
 * Defines a custom grey scale filter.
 * @author aaa
 */
public class GrayScale extends AFilterPixel {

    public static final float MIN_COEFFICIENT_VALUE = 0.0F;
    public static final float MAX_COEFFICIENT_VALUE = 1.0F;
    
    private float redCoefficient = 0.0F;
    private float greenCoefficient = 0.0F;
    private float blueCoefficient = 0.0F;

    public GrayScale(float redCoefficient, float greenCoefficient, float blueCoefficient) {
        this.redCoefficient = Math.max(MIN_COEFFICIENT_VALUE, Math.min(redCoefficient, MAX_COEFFICIENT_VALUE));
        this.greenCoefficient = Math.max(MIN_COEFFICIENT_VALUE, Math.min(greenCoefficient, MAX_COEFFICIENT_VALUE));
        this.blueCoefficient = Math.max(MIN_COEFFICIENT_VALUE, Math.min(blueCoefficient, MAX_COEFFICIENT_VALUE));
    }
    
    public float getRedCoefficient() {
        return redCoefficient;
    }

    public float getGreenCoefficient() {
        return greenCoefficient;
    }

    public float getBlueCoefficient() {
        return blueCoefficient;
    }
    
    @Override
    public Pixel doFilter(Pixel pixel) {
        int alpha = pixel.getAlpha();
        int red = pixel.getRed();
        int green = pixel.getGreen();
        int blue = pixel.getBlue();
        
        float color = this.redCoefficient * red + this.greenCoefficient * green + this.blueCoefficient * blue;
        
        return new Pixel(color, color, color, alpha);
    }
    
}
