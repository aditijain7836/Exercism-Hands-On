class RnaTranscription {

    String transcribe(String dnaStrand) {
        String s = "";
        for(int i=0; i<dnaStrand.length(); i++){
            if(dnaStrand.charAt(i) == 'G')
                s += 'C';
            else if(dnaStrand.charAt(i) == 'C')
                s += 'G';
            else if(dnaStrand.charAt(i) == 'T')
                s += 'A';
            else if(dnaStrand.charAt(i) == 'A')
                s += 'U';
            else
                s += dnaStrand.charAt(i);
        }
        return s;
    }

}
