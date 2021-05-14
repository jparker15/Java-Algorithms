package InterviewPrep;

public class BearGene {

    public static int steadyGene(String gene) {
    // Write your code here
    HashMap<String, Integer> genes = new HashMap<String, Integer>();

    String[] splitGenes = gene.split("");

    for(String s: splitGenes){
        if(!genes.containsKey(s)){
             genes.put(s,1);
        }
        genes.put(s, genes.get(s) + 1);
    }

    System.out.println(gene);
    return 0;
    }

}
}
