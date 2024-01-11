package PBO;

public class Celcius {
     public static void main(String[] args) {
        Celcius a = new Celcius();
        a.tampilkelvin();
        System.out.println(a.kelvin(14));
    }    
    

    public void tampilkelvin(){
        int Celcius = 14;
        System.out.println("Celcius : "+ Celcius);
    }

    public int kelvin (int Celcius){
        int kelvin = Celcius + 273;
        return kelvin;
    }
  
}

