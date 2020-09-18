/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment_1;

/**
 *
 * @author DELL
 */
class Laptop{
    public static int count = 0;
    private double cost,CameraPixel;
    private String ModelNumber,ManufactureName,Color;
    private double[] ScreenSize;
    private int Ram,Hdd,ProcessorSpeed;
    
    // Default contructor
    public Laptop(){
        count++;
        this.cost = 0.00;
        this.CameraPixel = 00.0;
        this.ModelNumber = "XXXXXXXXXXX";
        this.ManufactureName = "XXXX";
        this.Color = "No color";
        this.Ram = 0;
        this.Hdd = 0;
        this.ProcessorSpeed = 0;
        this.ScreenSize =new double[] {0.0,0.0};
    };
    
    // 2 arguments constructor
    public Laptop(double cost, String manufacturer){
        count++;
        this.cost = cost;
        this.CameraPixel = 5;
        this.ManufactureName = manufacturer;
        this.Color = "Grey";
        this.Ram = 8;
        this.Hdd = 2;
        this.ProcessorSpeed = 32;
        this.ScreenSize =new double[] {14,15};
        this.ModelNumber = this.ManufactureName + "000" + count;
    }
    
    // 3 arguments constructor
    public Laptop(double cost, String manufacturer,String color){
        count++;
        this.cost = cost;
        this.CameraPixel = 5;
        this.ManufactureName = manufacturer;
        this.Color = color;
        this.Ram = 8;
        this.Hdd = 2;
        this.ProcessorSpeed = 32;
        this.ScreenSize =new double[] {14,15};
        this.ModelNumber = ManufactureName + Color + "000" + count;
    }
    
     // 5 arguments constructor
    public Laptop(double cost, String manufacturer,String color,int ram,int hdd){
        this.cost = cost;
        this.CameraPixel = 5;
        this.ManufactureName = manufacturer;
        this.Color = color;
        this.Ram = 8;
        this.Hdd = 2;
        this.ProcessorSpeed = 32;
        this.ScreenSize =new double[] {14,15};
        this.ModelNumber = ManufactureName + Color + Ram + Hdd + "000" + count;
    }
    
    // Displays the laptop details
    public void DispLaptopDetails(){
        String str; 
        str = "Cost(Rs): " + cost +
              "\nModel number:" + this.ModelNumber +
              "\nManufacturer: " + this.ManufactureName + 
              "\nColor: " + this.Color +
              "\nCamera(MP):" + this.CameraPixel + 
              "\nRAM(GB):" + this.Ram +
              "\nHDD(TB):" + this.Hdd +
              "\nProcessorSpeed(GHz):" + this.ProcessorSpeed +
              "\nScreen Size(lxb):" + this.ScreenSize[0] + "x" + this.ScreenSize[0];  
        
        System.out.println(str);
    }
}

public class ConstructorOverloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Laptop defaultConstructor = new Laptop();
        Laptop Constructor_2Params = new Laptop(50000,"DELL");
        Laptop Constructor_3Params = new Laptop(60000,"HP","BLACK");
        Laptop Constructor_5Params = new Laptop(55000,"LENOVO","RED",8,2);
        //created using default constructor 
        System.out.println("\n******Default*********\n");
        defaultConstructor.DispLaptopDetails();
        //created using 2 params constructor 
        System.out.println("\n******2 Params*********\n");
        Constructor_2Params.DispLaptopDetails();
        //created using 3 params constructor 
        System.out.println("\n******3 Prams*********\n");
        Constructor_3Params.DispLaptopDetails();
        //created using 5 params constructor 
        System.out.println("\n******5 Prams*********\n");
        Constructor_5Params.DispLaptopDetails();
    }
    
}
