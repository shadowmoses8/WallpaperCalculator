public class WallpaperCalculator {


    public int calculateWithoutAlignment(double widthRoom, double lengthRoom, double heightRoom, double widthWallpaper, double lengthWallpaper) {
        if (widthRoom <= 0 && lengthRoom <= 0 && heightRoom <= 0 && widthWallpaper <= 0 && lengthWallpaper <= 0) {
            return 0;
        } else {
            double perimeterRoom = widthRoom * lengthRoom * 2;
            double calculationOfPanels = Math.ceil(perimeterRoom / widthWallpaper);//31
            double numberOfRolls = Math.ceil(calculationOfPanels / (lengthWallpaper / (heightRoom + 0.10)));//   31/10/3.1
            int intNumberOfRolls = (int) numberOfRolls;
            // 4, 4, 3, 1.06, 10
            return intNumberOfRolls;
        }
    }

    public int calculateWithDisplacement(double widthRoom, double lengthRoom, double heightRoom, double widthWallpaper, double lengthWallpaper, double offsetLength) {
        if (widthRoom <= 0 && lengthRoom <= 0 && heightRoom <= 0 && widthWallpaper <= 0 && lengthWallpaper <= 0 && offsetLength <= 0) {
            return 0;
        } else {
            double perimeterRoom = (widthRoom * lengthRoom) * 2;
            double calculationOfPanels = Math.ceil(perimeterRoom / widthWallpaper);
            double numberOfRolls = Math.ceil(calculationOfPanels / (lengthWallpaper / (heightRoom + 0.10 + offsetLength)));
            int intNumberOfRolls = (int) numberOfRolls;
            return intNumberOfRolls;
        }
    }
}
