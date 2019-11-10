public class Main {
    public static void main(String[] args) {
        WallpaperCalculator wallpaperCalculator = new WallpaperCalculator();
        System.out.println(wallpaperCalculator.calculateWithoutAlignment(4, 4, 3, 1.06, 10));
        System.out.println(wallpaperCalculator.calculateWithDisplacement(4, 4, 3, 1.06, 10, 0.30));
    }
}
