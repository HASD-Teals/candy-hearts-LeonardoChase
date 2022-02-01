public class Heart {
    // PROPERTIES
    private String color;
    //Add remaining heart properties here...
    private int size;
    private String sayings;
    private int calories;
    private double cost;
    private boolean avalible;
    private int stock;

    // CONSTRUCTORS
    public Heart() {
        this.color = "";
        this.size = 0;
        this.sayings = "";
        this.calories = 0;
        this.cost = 0.00;
        this.stock = 0;
    } // This is the default contructor
    //Add overloaded Constructor here...
    public Heart(String color, int size, String sayings, int calories, double cost, int stock) {
        this.color = color;
        this.size = size;
        this.sayings = sayings;
        this.calories = calories;
        this.cost = cost;
        this.stock = stock;
        if(this.stock>0) {
            this.avalible = true;
        }
    }

    // ACCESSORS
    public String getColor() {
        return this.color;
    }
    //Add remaining Accessor methods here...
    public int getSize() {
        return this.size;
    }
    public String getSayings() {
        return this.sayings;
    }
    public int getCalories() {
        return this.calories;
    }
    public double getCost() {
        return this.cost;
    }
    public boolean getAvalible() {
        return this.avalible;
    }
    public int getStock() {
        return this.stock;
    }
    public String getReport() {
        String report = "Color: "+ this.color + "\n" + "Size: "+ this.size + "\n" + "Saying: "+ this.sayings + "\n" + "Calories: "+ this.calories + "\n" + "Cost: "+ this.cost + "\n" + 
        "Avalible: "+ this.avalible + "\n" + "Stock: "+ this.stock + "\n";
        return report;
    }


    // MUTATORS
    public void adjCost(double percentage) {
        this.cost = this.cost + (this.cost*percentage/100);
    }
    public void inStock(int stock) {
        this.stock = stock;
        if (this.stock>0) {
            this.avalible = true;
        }
    }
}
