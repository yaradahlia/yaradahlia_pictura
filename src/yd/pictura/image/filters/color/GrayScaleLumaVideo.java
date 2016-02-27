package yd.pictura.image.filters.color;

/**
 *
 * @author aaa
 */
public class GrayScaleLumaVideo extends GrayScale {

    public static final float RED_COEFFICIENT = 0.299F;
    public static final float GREEN_COEFFICIENT = 0.587F;
    public static final float BLUE_COEFFICIENT = 0.114F;
    
    public GrayScaleLumaVideo() {
        super(RED_COEFFICIENT, GREEN_COEFFICIENT, BLUE_COEFFICIENT);
    }
    
}
