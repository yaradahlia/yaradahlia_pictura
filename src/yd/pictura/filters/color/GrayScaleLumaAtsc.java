package yd.pictura.filters.color;

/**
 *
 * @author aaa
 */
public class GrayScaleLumaAtsc extends GrayScale {

    public static final float RED_COEFFICIENT = 0.2126F;
    public static final float GREEN_COEFFICIENT = 0.7152F;
    public static final float BLUE_COEFFICIENT = 0.0722F;
    
    public GrayScaleLumaAtsc() {
        super(RED_COEFFICIENT, GREEN_COEFFICIENT, BLUE_COEFFICIENT);
    }
    
}