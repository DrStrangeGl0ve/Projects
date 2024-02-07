1. Start
2. import scanner utility
3. Define the class 'GroceWaterwell'
4. Define the main method
6. Inside the main method:
    a. Initialize the scanner variable for user inputs. Give it a value of new Scanner(Scanner.in)
    b. Prompt user for radius with System.out and initialize variable "radius" to have the value of the next float input.
    c. Prompt user for depth of the well and initialize variable "depth" to have the value of the next float input.
    d. Declare a volume variable and give it a value using the CalculateVolume() method declared below.
    e. Declare a gallons variable and give it a value using the CalculateGallons() method declared below.
    f. Print "The number of gallons stored in the well is: " + the gallons variable.
7. After the main method:
    a. Declare the CalculateVolume(double radius, double depth) method.
        i. calculates the volume by multiplying (depth * r^2 * pi)
        ii.returns the volume. 
    b. Declare the CalculateGallons(double volume) method.
        i. Calculates gallons by multiplying: volume * 7.48
        ii. Round the gallons to the hundredths place by using math.round(volume * 100) / 100
        iii. returns the gallons. 
8. End
