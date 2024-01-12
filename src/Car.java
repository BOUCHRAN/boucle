public class Car {
    String namae;
    int maxspeed;
    float price;
    int model;
    void setName(String n){
        namae=n;
    }
    void setModel(int m){
        if(m>=2015)
            model = m;
        else
            System.out.println("we d'ont ");
    }
}
