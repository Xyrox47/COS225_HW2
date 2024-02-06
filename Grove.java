public class Grove {
    public Tree[] Trees;
    public String groveName;

    public Grove(String groveName){
        this.groveName = groveName;
        this.Trees = new Tree[12];
 
    }

    public int plantTree(Tree tree){
        for (int i = 0; i < 13; i++){
            if (i == 12) {
                return -1;
            }
            else if (Trees[i] == null){
                Trees[i] = tree;
                return i;
            }
        }
        return -1;
    }
    public void removeTree(int index){
        Trees[index] = null;
    }

    public String toString(){
        int numOfTree = 0;
        for (int i = 0; i < 12; i++){
            if (Trees[i] == null||Trees[i].IDNumber == -1){
                numOfTree+=0;
            }
            else{
                numOfTree+=1;
            }
        }
        System.out.println(numOfTree);
        return "";

    }
}
