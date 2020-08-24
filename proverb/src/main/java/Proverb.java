class Proverb {
    public String[] wordArray;

    Proverb(String[] words) {
        wordArray = words;
    }

    String recite() {
        StringBuilder sentence = new StringBuilder();
        for(int i =1; i<= wordArray.length; i++){
            if(i == wordArray.length){
                sentence.append("And all for the want of a ").append(wordArray[0]).append(".");


            }else{
                sentence.append("For want of a ").append(wordArray[i-1]).append(" the ").append(wordArray[i]).append(" was lost.\n");
            }
        }
        return sentence.toString();
    }



}


