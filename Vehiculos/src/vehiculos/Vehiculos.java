/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

/**
 *
 * @author iphoeniix
 */
public class Vehiculos 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        System.out.println("-------------------<< Clase Padre Transporte >>-----------------------");
        Transporte miTransporte = new Transporte();
        miTransporte.nombreVehiculo="El Gran Transportador";
        System.out.println("usando miVehiculo, nombreVehiculo : "+miTransporte.nombreVehiculo);
        System.out.println("usando miVehiculo llama a: "+miTransporte.transportar());
        System.out.println("--------------------------------------------------------------------");
        System.out.println();
        
        System.out.println("----------<< SubClase hija Vehiculos Extiende de Transporte >>---------");
        Automobile miAutomobile= new Automobile();
        miAutomobile.nombreVehiculo="Automovil";
        System.out.println("usando miAutomobile, nombreVehiculo : "+miAutomobile.nombreVehiculo);
        System.out.println("usando miAutomobile llama a : "+miAutomobile.transportar());
        System.out.println("usando miAutomobile llama a : "+miAutomobile.cochesito());
        System.out.println("---------------------------------------------------------------------");
        System.out.println();
        
        System.out.println("----------<< SubClase hija Bicycle Extiende de Transporte >>---------");
        Bicycle miBicycle= new Bicycle();
        miBicycle.nombreVehiculo="Bicileta";
        System.out.println("usando miBicycle, nombreVehiculo : "+miBicycle.nombreVehiculo);
        System.out.println("usando miBicycle llama a : "+miBicycle.transportar());
        System.out.println("usando miBicycle llama a : "+miBicycle.dosLlantas());
        System.out.println("---------------------------------------------------------------------");
        System.out.println();
        
        System.out.println("----------<< SubClase hija Plane Extiende de Transporte >>---------");
        Plane miPlane= new Plane();
        miPlane.nombreVehiculo="Avion";
        System.out.println("usando miPlane, nombreVehiculo : "+miPlane.nombreVehiculo);
        System.out.println("usando miPlane llama a : "+miPlane.transportar());
        System.out.println("usando miPlane llama a : "+miPlane.volar());
        System.out.println("---------------------------------------------------------------------");
        System.out.println();
        
        System.out.println("-----<< SubClases hijas extienden de la Subclase Padre Car>-----");
        Car miCar=new Car();
        miCar.nombreVehiculo="MODELO i236";
        System.out.println("usando miCar, nombreVehiculo : "+miCar.nombreVehiculo);
        System.out.println("usando miCar llama a : "+miCar.transportar());
        System.out.println("usando miCar llama a : "+miCar.cochesito());
        System.out.println("usando miCar llama a : "+miCar.cocheBMW());
        System.out.println();
        
        System.out.println("-----<< SubClases hijas extienden de la Subclase Padre Car>-----");
        Truck miTruck=new Truck();
        miTruck.nombreVehiculo="MODELO DINA";
        System.out.println("usando miTruck, nombreVehiculo : "+miTruck.nombreVehiculo);
        System.out.println("usando miTruck llama a : "+miTruck.transportar());
        System.out.println("usando miTruck llama a : "+miTruck.cochesito());
        System.out.println("usando miTruck llama a : "+miTruck.cargarCajas());
        System.out.println();
        
        System.out.println("-----<< SubClases hijas extienden de la Subclase Padre Bicycle>-----");
        Mountain miMountain=new Mountain();
        miMountain.nombreVehiculo="MODELO ESPECIALIZED";
        System.out.println("usando miMountain, nombreVehiculo : "+miMountain.nombreVehiculo);
        System.out.println("usando miMountain llama a : "+miMountain.transportar());
        System.out.println("usando miMountain llama a : "+miMountain.dosLlantas());
        System.out.println("usando miMountain llama a : "+miMountain.rodarMontaña());
        System.out.println();
        
        System.out.println("-----<< SubClases hijas extienden de la Subclase Padre Bicycle>-----");
        Road miRoad=new Road();
        miRoad.nombreVehiculo="MODELO CLASICO";
        System.out.println("usando miRoad, nombreVehiculo : "+miRoad.nombreVehiculo);
        System.out.println("usando miRoad llama a : "+miRoad.transportar());
        System.out.println("usando miRoad llama a : "+miRoad.dosLlantas());
        System.out.println("usando miRoad llama a : "+miRoad.rodarCiudad());
        System.out.println();
        
        System.out.println("-----<< SubClases hijas extienden de la Subclase Padre Plane>-----");
        Comercial miComercial=new Comercial();
        miComercial.nombreVehiculo="MODELO A1235 JUMBO";
        System.out.println("usando miComercial, nombreVehiculo : "+miComercial.nombreVehiculo);
        System.out.println("usando miComercial llama a : "+miComercial.transportar());
        System.out.println("usando miComercial llama a : "+miComercial.volar());
        System.out.println("usando miComercial llama a : "+miComercial.avionChafa());
        System.out.println();
        
        System.out.println("-----<< SubClases hijas extienden de la Subclase Padre Plane>-----");
        Privado miPrivado=new Privado();
        miPrivado.nombreVehiculo="MODELO LA MANCION QUE VUELA";
        System.out.println("usando miPrivado, nombreVehiculo : "+miPrivado.nombreVehiculo);
        System.out.println("usando miPrivado llama a : "+miPrivado.transportar());
        System.out.println("usando miPrivado llama a : "+miPrivado.volar());
        System.out.println("usando miPrivado llama a : "+miPrivado.avionPeña());
        System.out.println();
    }
    
}
