package week2.bigcodingfriday;

public class Triangle {
	
	// Write perimeterCalculator method 
    private int perimeterCalculator (int a, int b, int c) {
    	
    	int perimeter = a + b + c; /// the formula for the perimeter of a triangle is the sum of the three sides
    	return perimeter;			// method returns sum 
    }

    // Write areaCalculator method
    private int areaCalculator(int base, int height) {
		int area = (base  *height) /2;  ///the formula for the are of a triangle is 1/2 base times height
		return area;  //method returns computed
	} 
	

    // Do not modify the code below:

	public static void main(String[] args) {
		Triangle object = new Triangle();

		int a = 7;
        int b = 10;
        int c = 35;

        int perimeter = object.perimeterCalculator(a,b,c);
        int area = object.areaCalculator(7,10);

        System.out.println("Perimeter of the triangle is: " + perimeter + "\nThe Area of the Triangle is: " + area);

	}

}
