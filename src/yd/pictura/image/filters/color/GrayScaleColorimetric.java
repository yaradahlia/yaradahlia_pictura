package yd.pictura.image.filters.color;

/**
 * Colorimetric (luminance-preserving) conversion to gray-scale.
 * @author aaa
 */
public class GrayScaleColorimetric extends GrayScale {
    public static final float RED_COEFFICIENT = 0.2126F;
    public static final float GREEN_COEFFICIENT = 0.7152F;
    public static final float BLUE_COEFFICIENT = 0.0722F;

    public GrayScaleColorimetric() {
        super(RED_COEFFICIENT, GREEN_COEFFICIENT, BLUE_COEFFICIENT);
    }
}
