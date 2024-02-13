public class Grove {
    public Tree[] Trees = new Tree[12];
    public String groveName;

    public Grove(String groveName){
        this.groveName = groveName;
 
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
    public Tree removeTree(int index){
        Tree a = Trees[index];
        Trees[index] = null;
        return a;
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
