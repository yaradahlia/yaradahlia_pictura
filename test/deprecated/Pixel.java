package deprecated;

/**
 * This class represents a rgba pixel.
 * 
 * @author aaa
 */
public class Pixel {

    public static final int MAX_VALUE = 255;
    public static final int MIN_VALUE = 0;
    
    private int value;

    public Pixel(int rgba, boolean hasAlpha) {
        if (hasAlpha) {
            value = rgba;
        } else {
            value = 0xFF000000 | rgba;
        }
    }
    
    public Pixel(int red, int green, int blue) {
        this(red, green, blue, 255);
    }

    public Pixel(int red, int green, int blue, int alpha) {
        value = computePixelValue(red, green, blue, alpha);
    }
    
    private int computePixelValue(int red, int green, int blue, int alpha) {
        validatePixel(red, green, blue, alpha);
        
        @SuppressWarnings("PointlessBitwiseExpression")
        int pixelValue = 
            ((alpha & 0xFF) << 24) |
            ((red & 0xFF) << 16) |
            ((green & 0xFF) << 8)  |
            ((blue & 0xFF) << 0);
        
        return pixelValue;
    }
    
    private void validatePixel(int red, int green, int blue, int alpha) {
        String badComponents = "";
        
        if (alpha < MIN_VALUE || alpha > MAX_VALUE) {
            badComponents += " alpha";
        }
        
        if (red < MIN_VALUE || red > MAX_VALUE ) {
            badComponents += " red";
        }
        
        if (green < MIN_VALUE || green > MAX_VALUE ) {
            badComponents += " green";
        }
        
        if (blue < MIN_VALUE || blue > MAX_VALUE ) {
            badComponents += " blue";
        }
        
        if (badComponents.length() > 0) {
            throw new IllegalArgumentException(
                "Values specified for" + badComponents + " are not between bounds !");
        }
    }
    
    public int getValue() {
        return value;
    }
    
    public int getAlpha() {
        return (getValue() >> 24) & 0xFF;
    }
    
    public void setAlpha(int alpha) {
        value = computePixelValue(getRed(), getGreen(), getBlue(), alpha);
    }
    
    public int getRed() {
        return (getValue() >> 16) & 0xFF;
    }    
    
    public void setRed(int red) {
        value = computePixelValue(red, getGreen(), getBlue(), getAlpha());
    }
    
    public int getGreen() {
        return (getValue()>> 8) & 0xFF;
    }
    
    public void setGreen(int green) {
        value = computePixelValue(getRed(), green, getBlue(), getAlpha());
    }
    
    @SuppressWarnings("PointlessBitwiseExpression")
    public int getBlue() {
        return (getValue() >> 0) & 0xFF;
    }
    
    public void setBlue(int blue) {
        value = computePixelValue(getRed(), getGreen(), blue, getAlpha());
    }
}
