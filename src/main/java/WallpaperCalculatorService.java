public class WallpaperCalculatorService {


    public int calculateWithoutAlignment(double widthRoom, double lengthRoom, double heightRoom, double widthWallpaper, double lengthWallpaper) {
        if (widthRoom <= 0) {
            return 0;
        } else if (lengthRoom <= 0) {
            return 0;
        } else if (heightRoom <= 0) {
            return 0;
        } else if (widthWallpaper <= 0) {
            return 0;
        } else if (lengthWallpaper <= 0) {
            return 0;
        }
            double perimeterRoom = widthRoom * lengthRoom * 2;
            double calculationOfPanels = Math.ceil(perimeterRoom / widthWallpaper);//31
            double numberOfRolls = Math.ceil(calculationOfPanels / (lengthWallpaper / (heightRoom + 0.10)));//   31/10/3.1
            int intNumberOfRolls = (int) numberOfRolls;
            return intNumberOfRolls;
    }

    public int calculateWithDisplacement(double widthRoom, double lengthRoom, double heightRoom, double widthWallpaper, double lengthWallpaper, double offsetLength) {
        if (widthRoom <= 0) {
            return 0;
        } else if (lengthRoom <= 0) {
            return 0;
        } else if (heightRoom <= 0) {
            return 0;
        } else if (widthWallpaper <= 0) {
            return 0;
        } else if (lengthWallpaper <= 0) {
            return 0;
        } else if (offsetLength <= 0) {
            return 0;
        }
            double perimeterRoom = (widthRoom * lengthRoom) * 2;
            double calculationOfPanels = Math.ceil(perimeterRoom / widthWallpaper);
            double numberOfRolls = Math.ceil(calculationOfPanels / (lengthWallpaper / (heightRoom + 0.10 + offsetLength)));
            int intNumberOfRolls = (int) numberOfRolls;
            return intNumberOfRolls;

    }
}
