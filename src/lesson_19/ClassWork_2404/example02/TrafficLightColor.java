package lesson_19.ClassWork_2404.example02;

public enum TrafficLightColor {

    RED("Red", false),
    YELLOW("Yellow", false),
    GREEN("Green", true);


    private String colorName;
    private boolean canGo;

    TrafficLightColor(String colorName, boolean canGo) {
        this.colorName = colorName;
        this.canGo = canGo;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public boolean canGo() {
        return canGo;
    }

    public void setCanGo(boolean canGo) {
        this.canGo = canGo;
    }
}
