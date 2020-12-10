
public class ConstructorEample {
   
       int modelYear;
       String modelName;
       double modelCost;
         
       public ConstructorEample(int year,String name,double cost) {
    	   modelYear=year;
    	   modelName=name;
    	   modelCost=cost;
    	   
       }
       public static void main(String[] args) {
    	   ConstructorEample car = new ConstructorEample(1984,"Hyundai",6.79);
    	   System.out.println(car.modelYear);
    	   
       }
       
       
       
}
