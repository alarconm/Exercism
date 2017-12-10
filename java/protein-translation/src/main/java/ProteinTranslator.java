import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {

        List<String> protiens = new ArrayList<>();

        HashMap<String, String> aminoAcids = new HashMap<>();
        aminoAcids.put("AUG", "Methionine");
        aminoAcids.put("UUU", "Phenylalanine");
        aminoAcids.put("UUC", "Phenylalanine");
        aminoAcids.put("UUA", "Leucine");
        aminoAcids.put("UUG", "Leucine");
        aminoAcids.put("UCU", "Serine");
        aminoAcids.put("UCC", "Serine");
        aminoAcids.put("UCA", "Serine");
        aminoAcids.put("UCG", "Serine");
        aminoAcids.put("UAU", "Tyrosine");
        aminoAcids.put("UAC", "Tyrosine");
        aminoAcids.put("UGU", "Cysteine");
        aminoAcids.put("UGC", "Cysteine");
        aminoAcids.put("UGG", "Tryptophan");

        for (int i = 0; i < rnaSequence.length(); i += 3) {

            StringBuilder codone = new StringBuilder();
            codone.append(rnaSequence.charAt(i));
            codone.append(rnaSequence.charAt(i+1));
            codone.append(rnaSequence.charAt(i+2));
            String codoneString = codone.toString();

            if(codoneString.equals("UAA") || codoneString.equals("UAG") || codoneString.equals("UGA")) {
                return protiens;
            }
            if(aminoAcids.containsKey(codoneString)) {
                protiens.add(aminoAcids.get(codoneString));
            }
        }

        return protiens;
    }


}