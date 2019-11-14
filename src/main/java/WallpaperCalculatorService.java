public class WallpaperCalculatorService {

    public int calculateWithDisplacement(double widthRoom, double lengthRoom, double heightRoom, double widthWallpaper, double lengthWallpaper, double offsetLength) {
        if (widthRoom <= 0) {
            return 0;
        }
        if (lengthRoom <= 0) {
            return 0;
        }
        if (heightRoom <= 0) {
            return 0;
        }
        if (widthWallpaper <= 0) {
            return 0;
        }
        if (lengthWallpaper <= 0) {
            return 0;
        }
        if (offsetLength <= 0) {
            return 0;
        }
        double stockForLevelingAndTrimmingHeight = 0.10;
            double perimeterRoom = (widthRoom * lengthRoom) * 2;
            double calculationOfPanels = Math.ceil(perimeterRoom / widthWallpaper);
        double numberOfRolls = Math.ceil(calculationOfPanels / (lengthWallpaper / (heightRoom + stockForLevelingAndTrimmingHeight + offsetLength)));
            int intNumberOfRolls = (int) numberOfRolls;
            return intNumberOfRolls;
    }
}
