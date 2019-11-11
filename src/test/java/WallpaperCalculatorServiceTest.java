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
    public void calculateWithDisplacementTestAttNullwidthRoom() {
        WallpaperCalculatorService wallpaperCalculator = new WallpaperCalculatorService();
        assertEquals(0, wallpaperCalculator.calculateWithDisplacement(-10, -10, -200, -300, -1, -10));
    }

    @Test
    public void calculateWithDisplacementTestAttNulllengthRoom() {
        WallpaperCalculatorService wallpaperCalculator = new WallpaperCalculatorService();
        assertEquals(0, wallpaperCalculator.calculateWithDisplacement(1, -300, -200, -300, -1, -10));
    }

    @Test
    public void calculateWithDisplacementTestAttNullheightRoom() {
        WallpaperCalculatorService wallpaperCalculator = new WallpaperCalculatorService();
        assertEquals(0, wallpaperCalculator.calculateWithDisplacement(1, 1, -200, -300, -1, -10));
    }

    @Test
    public void calculateWithDisplacementTestAttNullwidthWallpaper() {
        WallpaperCalculatorService wallpaperCalculator = new WallpaperCalculatorService();
        assertEquals(0, wallpaperCalculator.calculateWithDisplacement(1, 1, 1, -300, -1, -10));
    }

    @Test
    public void calculateWithDisplacementTestAttNulllengthWallpaper() {
        WallpaperCalculatorService wallpaperCalculator = new WallpaperCalculatorService();
        assertEquals(0, wallpaperCalculator.calculateWithDisplacement(1, 1, 1, 1, -1, -10));
    }

    @Test
    public void calculateWithDisplacementTestAttNulloffsetLength() {
        WallpaperCalculatorService wallpaperCalculator = new WallpaperCalculatorService();
        assertEquals(0, wallpaperCalculator.calculateWithDisplacement(1, 1, 1, 1, 1, -10));
    }

    @Test
    public void calculateWithoutAlignmentTestAttNullwidthRoom() {
        WallpaperCalculatorService wallpaperCalculator = new WallpaperCalculatorService();
        assertEquals(0, wallpaperCalculator.calculateWithoutAlignment(-10, -20, -20, -30, -5));
    }

    @Test
    public void calculateWithoutAlignmentTestAttNulllengthRoom() {
        WallpaperCalculatorService wallpaperCalculator = new WallpaperCalculatorService();
        assertEquals(0, wallpaperCalculator.calculateWithoutAlignment(1, -20, -20, -30, -5));
    }

    @Test
    public void calculateWithoutAlignmentTestAttNullheightRoom() {
        WallpaperCalculatorService wallpaperCalculator = new WallpaperCalculatorService();
        assertEquals(0, wallpaperCalculator.calculateWithoutAlignment(1, 1, -20, -30, -5));
    }

    @Test
    public void calculateWithoutAlignmentTestAttNullwidthWallpaper() {
        WallpaperCalculatorService wallpaperCalculator = new WallpaperCalculatorService();
        assertEquals(0, wallpaperCalculator.calculateWithoutAlignment(1, 1, 1, -30, -5));
    }

    @Test
    public void calculateWithoutAlignmentTestAttNulllengthWallpaper() {
        WallpaperCalculatorService wallpaperCalculator = new WallpaperCalculatorService();
        assertEquals(0, wallpaperCalculator.calculateWithoutAlignment(1, 1, 1, 1, -5));
    }

}