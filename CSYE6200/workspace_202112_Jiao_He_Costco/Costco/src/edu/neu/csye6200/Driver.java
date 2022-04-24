package edu.neu.csye6200;
import java.io.IOException;

public class Driver {

        public static void main (String args[]) throws IOException {
        	Costco.demo();


    }
}

/*
 * edu.neu.csye6200.Midterm.main()...

	 demoAbstraction...
This is the <show> function of Student class: 
【Absstraction】 Name: Jojo , Age: 21

This is the <show> function of Student class: 
【Absstraction】 Name: Diandian , Age: 18

This is the <show> function of Student class: 
【Absstraction】 Name: Jimmy , Age: 20


	 demoEncapsulation...
【Encapsulation】 Name : Jojo He, Age : 18
【Encapsulation】 Name : Diandian, Age : 8

	 demoInheritance...
This is the method of the Subclass:
10 KM equals 10 Inches.

【Inheritance】 This is the method from its Parent Class:
10 KG equals 22.0 Lbs.

	 demoPolymorphism...
Animals make sound when they bark!
【Polymorphism】  The cat barks: meow meow meow!
【Polymorphism】  The dog barks: woof woof woof!

	 demoStaticData...
Static data: MidtermExam

	 demoImmutableData...
Immutable data: 10

【 Item Imformations 】

*******  Sorted by ID Ascending *******

Item:  [ Id: 1    Price: 2.49    Name: Cheese    Description:Provolone cheese ]
Item:  [ Id: 2    Price: 3.49    Name: OJ    Description:Tropicana Oriage Juice ]
Item:  [ Id: 3    Price: 1.49    Name: Milk    Description:Almond Milk ]
Item:  [ Id: 4    Price: 0.89    Name: Snack    Description:Mounds chocolate bar ]
Item:  [ Id: 5    Price: 12.49    Name: Chair    Description: folding chair    Weight: 2.89    WeightUnit: Lbs ]
Item:  [ Id: 6    Price: 384.49    Name: Treadmill    Description: Voyager Pro Treadmill    Weight: 98.3    WeightUnit: kg ]
Item:  [ Id: 7    Price: 101.49    Name: Mattress    Description: Air Mattress    Weight: 27.6    WeightUnit: kg ]
Item:  [ Id: 8    Price: 6.89    Name: Slippers    Description: bath slippers    Weight: 2.5    WeightUnit: oz ]

*******  Sorted by ID Descending *******

Item:  [ Id: 8    Price: 6.89    Name: Slippers    Description: bath slippers    Weight: 2.5    WeightUnit: oz ]
Item:  [ Id: 7    Price: 101.49    Name: Mattress    Description: Air Mattress    Weight: 27.6    WeightUnit: kg ]
Item:  [ Id: 6    Price: 384.49    Name: Treadmill    Description: Voyager Pro Treadmill    Weight: 98.3    WeightUnit: kg ]
Item:  [ Id: 5    Price: 12.49    Name: Chair    Description: folding chair    Weight: 2.89    WeightUnit: Lbs ]
Item:  [ Id: 4    Price: 0.89    Name: Snack    Description:Mounds chocolate bar ]
Item:  [ Id: 3    Price: 1.49    Name: Milk    Description:Almond Milk ]
Item:  [ Id: 2    Price: 3.49    Name: OJ    Description:Tropicana Oriage Juice ]
Item:  [ Id: 1    Price: 2.49    Name: Cheese    Description:Provolone cheese ]

*******  Sorted by Price Ascending *******

Item:  [ Id: 4    Price: 0.89    Name: Snack    Description:Mounds chocolate bar ]
Item:  [ Id: 3    Price: 1.49    Name: Milk    Description:Almond Milk ]
Item:  [ Id: 1    Price: 2.49    Name: Cheese    Description:Provolone cheese ]
Item:  [ Id: 2    Price: 3.49    Name: OJ    Description:Tropicana Oriage Juice ]
Item:  [ Id: 8    Price: 6.89    Name: Slippers    Description: bath slippers    Weight: 2.5    WeightUnit: oz ]
Item:  [ Id: 5    Price: 12.49    Name: Chair    Description: folding chair    Weight: 2.89    WeightUnit: Lbs ]
Item:  [ Id: 7    Price: 101.49    Name: Mattress    Description: Air Mattress    Weight: 27.6    WeightUnit: kg ]
Item:  [ Id: 6    Price: 384.49    Name: Treadmill    Description: Voyager Pro Treadmill    Weight: 98.3    WeightUnit: kg ]

*******  Sorted by Price Descending *******

Item:  [ Id: 6    Price: 384.49    Name: Treadmill    Description: Voyager Pro Treadmill    Weight: 98.3    WeightUnit: kg ]
Item:  [ Id: 7    Price: 101.49    Name: Mattress    Description: Air Mattress    Weight: 27.6    WeightUnit: kg ]
Item:  [ Id: 5    Price: 12.49    Name: Chair    Description: folding chair    Weight: 2.89    WeightUnit: Lbs ]
Item:  [ Id: 8    Price: 6.89    Name: Slippers    Description: bath slippers    Weight: 2.5    WeightUnit: oz ]
Item:  [ Id: 2    Price: 3.49    Name: OJ    Description:Tropicana Oriage Juice ]
Item:  [ Id: 1    Price: 2.49    Name: Cheese    Description:Provolone cheese ]
Item:  [ Id: 3    Price: 1.49    Name: Milk    Description:Almond Milk ]
Item:  [ Id: 4    Price: 0.89    Name: Snack    Description:Mounds chocolate bar ]

*******  Sorted by Name Ascending *******

Item:  [ Id: 5    Price: 12.49    Name: Chair    Description: folding chair    Weight: 2.89    WeightUnit: Lbs ]
Item:  [ Id: 1    Price: 2.49    Name: Cheese    Description:Provolone cheese ]
Item:  [ Id: 7    Price: 101.49    Name: Mattress    Description: Air Mattress    Weight: 27.6    WeightUnit: kg ]
Item:  [ Id: 3    Price: 1.49    Name: Milk    Description:Almond Milk ]
Item:  [ Id: 2    Price: 3.49    Name: OJ    Description:Tropicana Oriage Juice ]
Item:  [ Id: 8    Price: 6.89    Name: Slippers    Description: bath slippers    Weight: 2.5    WeightUnit: oz ]
Item:  [ Id: 4    Price: 0.89    Name: Snack    Description:Mounds chocolate bar ]
Item:  [ Id: 6    Price: 384.49    Name: Treadmill    Description: Voyager Pro Treadmill    Weight: 98.3    WeightUnit: kg ]

*******  Sorted by Name Descending *******

Item:  [ Id: 6    Price: 384.49    Name: Treadmill    Description: Voyager Pro Treadmill    Weight: 98.3    WeightUnit: kg ]
Item:  [ Id: 4    Price: 0.89    Name: Snack    Description:Mounds chocolate bar ]
Item:  [ Id: 8    Price: 6.89    Name: Slippers    Description: bath slippers    Weight: 2.5    WeightUnit: oz ]
Item:  [ Id: 2    Price: 3.49    Name: OJ    Description:Tropicana Oriage Juice ]
Item:  [ Id: 3    Price: 1.49    Name: Milk    Description:Almond Milk ]
Item:  [ Id: 7    Price: 101.49    Name: Mattress    Description: Air Mattress    Weight: 27.6    WeightUnit: kg ]
Item:  [ Id: 1    Price: 2.49    Name: Cheese    Description:Provolone cheese ]
Item:  [ Id: 5    Price: 12.49    Name: Chair    Description: folding chair    Weight: 2.89    WeightUnit: Lbs ]

*******  Sorted by Description Ascending  *******

Item:  [ Id: 7    Price: 101.49    Name: Mattress    Description: Air Mattress    Weight: 27.6    WeightUnit: kg ]
Item:  [ Id: 3    Price: 1.49    Name: Milk    Description:Almond Milk ]
Item:  [ Id: 8    Price: 6.89    Name: Slippers    Description: bath slippers    Weight: 2.5    WeightUnit: oz ]
Item:  [ Id: 5    Price: 12.49    Name: Chair    Description: folding chair    Weight: 2.89    WeightUnit: Lbs ]
Item:  [ Id: 4    Price: 0.89    Name: Snack    Description:Mounds chocolate bar ]
Item:  [ Id: 1    Price: 2.49    Name: Cheese    Description:Provolone cheese ]
Item:  [ Id: 2    Price: 3.49    Name: OJ    Description:Tropicana Oriage Juice ]
Item:  [ Id: 6    Price: 384.49    Name: Treadmill    Description: Voyager Pro Treadmill    Weight: 98.3    WeightUnit: kg ]

*******  Sorted by Description Descending  *******

Item:  [ Id: 6    Price: 384.49    Name: Treadmill    Description: Voyager Pro Treadmill    Weight: 98.3    WeightUnit: kg ]
Item:  [ Id: 2    Price: 3.49    Name: OJ    Description:Tropicana Oriage Juice ]
Item:  [ Id: 1    Price: 2.49    Name: Cheese    Description:Provolone cheese ]
Item:  [ Id: 4    Price: 0.89    Name: Snack    Description:Mounds chocolate bar ]
Item:  [ Id: 5    Price: 12.49    Name: Chair    Description: folding chair    Weight: 2.89    WeightUnit: Lbs ]
Item:  [ Id: 8    Price: 6.89    Name: Slippers    Description: bath slippers    Weight: 2.5    WeightUnit: oz ]
Item:  [ Id: 3    Price: 1.49    Name: Milk    Description:Almond Milk ]
Item:  [ Id: 7    Price: 101.49    Name: Mattress    Description: Air Mattress    Weight: 27.6    WeightUnit: kg ]

edu.neu.csye6200.Midterm.main()... done!
 */

