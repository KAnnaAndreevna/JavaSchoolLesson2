public class Car implements Comparable<Car>{
    Long id;
    String marka;
    String type;

    public Car(Long id, String marka, String type){
        this.id = id;
        this.marka = marka;
        this.type = type;
    }
    public Long getId(){return id;}

    public String getMarka() {
        return marka;
    }

    public String toString(){
        return "Car{id="+this.getId()+";marka="+this.getMarka()+";type="+this.getType()+"}";
    }

    public String getType(){return type;}

    @Override
    public int compareTo(Car c) {return this.getType().compareTo(c.getType());}
}
