public class Sugar extends Cookie {

    /* instance variables */
    private String shape;
    private boolean isDecorated;

    /**
     * Default constructor.
     */
    public Sugar() {
        this.shape = "";
        this.isDecorated = false;
    }

    /**
     * Constructor with parameters.
     */
    public Sugar(String s) {
        this.shape = s;
        this.isDecorated = false;
    }

    /**
     * getter for shape instance variable.
     */
    public String getShape() {
        return this.shape;
    }

    /**
     * setter for shape instance variable.
     */
    public void setShape(String s) {
        this.shape = s;
    }

    /**
     * cut out cookies.
     */
    public void cutOutShapes(String s, int num) {
        this.shape = s;
        //this.numCookies = num;
        this.setNumCookies(num);

        //print out the results
        System.out.println(num + " cookies were cut into " + s);
    }

    /**
     * decorate the cookies.
     */
    public void decorate() {
        if (this.isReadyToEat()) {
            this.isDecorated = true;
            //print out the results
            System.out.println("The cookies were decorated");
        } else {
            System.out.println("Make sure to bake the cookies first");
        }
    }

}