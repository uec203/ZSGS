import java.util.*;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        HashMap<String,String> h = new HashMap<String,String>();
        h.put("AUG","Methionine");
        h.put("UUU","Phenylalanine");
        h.put("UUC","Phenylalanine");
        h.put("UUA","Leucine");
        h.put("UUG","Leucine");
        h.put("UCU","Serine");
        h.put("UCC","Serine");
        h.put("UCA","Serine");
        h.put("UCG","Serine");
        h.put("UAU","Tyrosine");
        h.put("UAC","Tyrosine");
        h.put("UGU","Cysteine");
        h.put("UGC","Cysteine");
        h.put("UGG","Tryptophan");
        h.put("UAA","STOP");
        h.put("UAG","STOP");
        h.put("UGA","STOP");
        List<String> l = new ArrayList<String>();
        for(int i=0;i<rnaSequence.length();i+=3){
            if(i+3>rnaSequence.length()) throw new IllegalArgumentException("Invalid codon");
            String codon = rnaSequence.substring(i,i+3);
            if(!h.containsKey(codon)) throw new IllegalArgumentException("Invalid codon");
            if(h.get(codon).equals("STOP")) break;
            l.add(h.get(codon));
        }
        return l;
    }
}