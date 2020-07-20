import java.util.HashMap;

class ResistorColor {
    String[] bandColors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

    int colorCode(String color) {

        int i = 0;
        while (i < bandColors.length){
            if (bandColors[i] == color){
                return i;
            }else
                i++;
        }
        return -1;
    }

    String[] colors() {

        return bandColors;
    }

}
