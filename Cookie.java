public class Cookie {

    /* instance variables */
    private int bakeTime;
    private int bakeTemp;
    private int numCookies;
    private boolean isReady;

    /**
     * Default constructor.
     */
    public Cookie() {
        this.bakeTemp = 0;
        this.bakeTime = 0;
        this.numCookies = 0;
        this.isReady = false;
    }

    /**
     * Constructor with parameters.
     */
    public Cookie(int time, int temp, int num) {
        this.bakeTime = time;
        this.bakeTemp = temp;
        this.numCookies = num;
        this.isReady = false;
    }

    /**
     * getter for isReady instance variable. REQURED METHOD.
     */
    public boolean isReadyToEat() {
        return this.isReady;
    }

    /**
     * setter for number of cookies to make. REQUIRED.
     */
    public void setNumCookies(int num) {
        this.numCookies = num;
    }

    /**
     * bake the cookies at the given time and temperature.
     */
    public void bakeCookies(int time, int temp) {
        this.bakeTime = time;
        this.bakeTemp = temp;

        //print out the results
        System.out.print(this.numCookies + " cookies were baked at ");
        System.out.print(this.bakeTemp + " F degrees for ");
        System.out.println(this.bakeTime + " minutes");

        this.isReady = true;
    }

    /**
     * setter for isReady instance variable.
     */
    public void setIsReady(boolean ready) {
        this.isReady = ready;
    }
}

