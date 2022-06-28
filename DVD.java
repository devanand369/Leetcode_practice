DVD[] dvdCollection = new DVD[12];  // create an array for hold DVD

// a DVD class for simple definition of a DVD
public class DVD {
    public String name;
    public int relYear;
    public String director;

    //consturctor
    public DVD(String name, int relYear, String director) {
        this.name = name;
        this.relYear = relYear;
        this.director = director;
    }

    public String toString() {
        return this.name + ", directed by " + this.director + ", released in " + this.relYear;
        
    }


}