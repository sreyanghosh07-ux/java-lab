class Program3 {
double celsius; 
void convert() { 
double fahrenheit = (celsius * 9/5) + 32; 
System.out.println("Temperature in Fahrenheit = " + fahrenheit);
}
public static void main(String[] args) {
Program3 obj = new Program3(); 
obj.celsius = 37; 
obj.convert(); 
}
}


