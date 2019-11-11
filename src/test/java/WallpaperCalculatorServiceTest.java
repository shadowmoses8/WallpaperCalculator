import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class WallpaperCalculatorServiceTest {
    @Test
    public void calculateWithoutAlignmentTest() {
        WallpaperCalculatorService wallpaperCalculator = new WallpaperCalculatorService();
        assertEquals(10, wallpaperCalculator.calculateWithoutAlignment(4, 4, 3, 1.06, 10));
    }

    @Test
    public void calculateWithDisplacementTest() {
        WallpaperCalculatorService wallpaperCalculator = new WallpaperCalculatorService();
        assertEquals(11, wallpaperCalculator.calculateWithDisplacement(4, 4, 3, 1.06, 10, 0.30));
    }

    @Test
    public void calculateWithDisplacementTestAttNull() {
        WallpaperCalculatorService wallpaperCalculator = new WallpaperCalculatorService();
        assertEquals(0, wallpaperCalculator.calculateWithDisplacement(-10, -10, -200, -300, -1, -10));
    }

    @Test
    public void calculateWithoutAlignmentTestAttNull() {
        WallpaperCalculatorService wallpaperCalculator = new WallpaperCalculatorService();
        assertEquals(0, wallpaperCalculator.calculateWithoutAlignment(0, 0, 0, 0, 0));
    }

}