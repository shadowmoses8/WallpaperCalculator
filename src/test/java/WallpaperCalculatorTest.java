import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WallpaperCalculatorTest {
    @Test
    public void calculateWithoutAlignmentTest() {
        WallpaperCalculator wallpaperCalculator = new WallpaperCalculator();
        assertEquals(10, wallpaperCalculator.calculateWithoutAlignment(4, 4, 3, 1.06, 10));
    }

    @Test
    public void calculateWithDisplacementTest() {
        WallpaperCalculator wallpaperCalculator = new WallpaperCalculator();
        assertEquals(11, wallpaperCalculator.calculateWithDisplacement(4, 4, 3, 1.06, 10, 0.30));
    }

}