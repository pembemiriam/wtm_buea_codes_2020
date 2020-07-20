class ResistorColorDuo {
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

    int value(String[] colors) {
        int colorCode1 = colorCode(colors[0]);
        int colorCode2 = colorCode(colors[1]);

        return colorCode1 * 10 + colorCode2;


    }
}
