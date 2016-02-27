package yd.pictura.image.filters.color;

/**
 * The ITU-R BT.709 standard used for HDTV developed by the ATSC gray-scale color coefficients, computing the Luma component.
 * Url: https://en.wikipedia.org/wiki/Rec._709
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
