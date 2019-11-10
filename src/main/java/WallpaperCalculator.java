public class WallpaperCalculator {


    public int calculateWithoutAlignment(double widthRoom, double lengthRoom, double heightRoom, double widthWallpaper, double lengthWallpaper) {
        if (widthRoom <= 0 && lengthRoom <= 0 && heightRoom <= 0 && widthWallpaper <= 0 && lengthWallpaper <= 0) {
            return 0;
        } else {
            double perimeterRoom = widthRoom * lengthRoom * 2;
            double calculationOfPanels = Math.ceil(perimeterRoom / widthWallpaper);
            double numberOfRolls = Math.ceil(calculationOfPanels / lengthWallpaper / (heightRoom + 10.0));
            int intNumberOfRolls = (int) numberOfRolls;
            return intNumberOfRolls;
        }
    }

    public int calculateWithDisplacement(double widthRoom, double lengthRoom, double heightRoom, double widthWallpaper, double lengthWallpaper, double offsetLength) {
        if (widthRoom <= 0 && lengthRoom <= 0 && heightRoom <= 0 && widthWallpaper <= 0 && lengthWallpaper <= 0 && offsetLength <= 0) {
            return 0;
        } else {
            double perimeterRoom = (widthRoom * lengthRoom) * 2;
            double calculationOfPanels = Math.ceil(perimeterRoom / widthWallpaper);
            double numberOfRolls = Math.ceil(calculationOfPanels / lengthWallpaper / (heightRoom + 10.0 + offsetLength));
            int intNumberOfRolls = (int) numberOfRolls;
            return intNumberOfRolls;
        }
    }
}
