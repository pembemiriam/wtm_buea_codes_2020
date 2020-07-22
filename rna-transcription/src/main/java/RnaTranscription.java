

class RnaTranscription {



    String transcribe(String dnaStrand) {
        String rna = "";

        for (int i = 0; i < dnaStrand.length(); i++) {
            if (dnaStrand.isEmpty())
                return dnaStrand;
            else if (dnaStrand.charAt(i) == 'G')
                rna = rna + "C";
            else if (dnaStrand.charAt(i) == 'C')
                rna = rna + "G";
            else if (dnaStrand.charAt(i) == 'T')
                rna = rna + "A";
            else if (dnaStrand.charAt(i) == 'A')
                rna = rna + "U";

        }

        return rna;

    }

}
