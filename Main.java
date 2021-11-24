public class Main {

    /**
     * Main method.
     */
    public static void main(String[] args) {

        //declare and initialize a Sugar cookie with String param constructor
        Sugar tree = new Sugar("tree");

        //cut out 10 tree shapes
        tree.cutOutShapes(tree.getShape(), 10);

        //bake the tree object at 350 degrees for 12 min
        tree.bakeCookies(12, 350);

        //decorate the tree object
        tree.decorate();

        //make new Sugar object with default constructor
        Sugar aCookie = new Sugar();

        //decorate it and see what happens
        aCookie.decorate();

    }

}
