public class GroveTester {
    Grove grove;

    public static void main(String []args){
        Grove grove = new Grove("Grove 1");

        grove.toString();

        for(int i = 0;i<7;i++){
            Tree spruce = new Tree(i, 37, "Spruce");
            spruce.IDNumber = grove.plantTree(spruce);
        }

        grove.toString();

        grove.removeTree(3);
        grove.removeTree(5);

        grove.toString();

        Tree Maple = new Tree(0, 13, "Maple");
        Maple.IDNumber = grove.plantTree(Maple);    

        grove.toString();

    }
}
