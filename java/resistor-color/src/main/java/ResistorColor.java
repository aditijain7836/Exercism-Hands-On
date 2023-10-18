class ResistorColor {
    String[] colorArray = new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    
    int colorCode(String color) {
        for(int i=0 ; i<colorArray.length ; i++){
            if(colorArray[i].toLowerCase() == color.toLowerCase())
                return i;
        }
        return 9;
    }

    String[] colors() {
        return colorArray;
    }
}
