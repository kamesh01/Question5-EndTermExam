package main;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class ToughQuestion2 {
            public static void main(String[] args) throws NumberFormatException, IOException {
                        Integer bread;
                        Integer butter;
                        Integer jam;
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        Calories cal=new Calories();
                        System.out.println("1.Bread only\n2.Bread+Jam\n3.Bread+Jam+Butter");
                        System.out.println("Enter the choice");
                        Integer choice = Integer.parseInt(br.readLine());
                        switch(choice)
                        {
                        case 1 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for only bread
                        	System.out.println();
                        	System.out.printf("%.3f",cal.calculateEnergy(cal.calculateCalories(bread)));
                        	System.out.println(" kJ of energy generated from " + cal.returnCalories()+" calories");
                        	break;
                        case 2 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for only bread & jam
                        	System.out.println();
                        	System.out.printf("%.3f",cal.calculateEnergy(cal.calculateCalories(bread, jam)));
                        	System.out.println(" kJ of energy generated from "+cal.returnCalories()+" calories");                        	
                        	break;
                        case 3 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Butter");
                        	butter = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for  bread,jam & butter
                        	System.out.printf("%.3f",cal.calculateEnergy(cal.calculateCalories(bread, jam, butter)));
                        	System.out.println(" kJ of energy generated from "+cal.returnCalories()+" calories");
                        	System.out.println();
                        	break;
                        }
                        //System.out.printf("%.3f",ca.calculateEnergy());
                        //System.out.println(" kJ of energy generated from "+ca.returnCalories()+" calories");
            }
}
class Calories {
            private int calories;
            int calculateCalories(int breadNum) {
            //you have to overload this function for three parameters refer the question
            	calories = 74 * breadNum;
            	return calories;
            }
            int calculateCalories(int breadNum, int jamNum) {
                //you have to overload this function for three parameters refer the question
                	calories = 74 * breadNum + 26 * jamNum;
                	return calories;
            }
            int calculateCalories(int breadNum, int jamNum, int butterNum) {
                //you have to overload this function for three parameters refer the question
                	calories = 74 * breadNum + 26 * jamNum + 102 * butterNum;
                	return calories;
            }
            double calculateEnergy(int calories) {
            	// given that , 1 kcal = 4.1868 kJ
            	// so energy = calories * 4.1868
            	double energy = calories * 4.1868;
            	return energy ;
            }
            int returnCalories() {
            	// returning the calculated calories
            	return calories;
            }

            
            
            
}