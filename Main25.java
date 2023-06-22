

enum Level {
  jan,
  feb,
mar,
apr,
may,
jun,
july,
aug,
sep,
oct,
nov,
dec
}

public class Main25 {
  public static void main(String[] args) {


    Level myVar = Level.jun;

    switch(myVar) {
      case jan:
        System.out.println("January");
        break;
      case feb:
         System.out.println("February");
        break;
      case mar:
        System.out.println("March");
        break;
 case apr:
        System.out.println("April");
        break;
 case may:
        System.out.println("May");
        break;
 case jun:
        System.out.println("June");
	break;
 case july:
        System.out.println("july");
        break;
 case aug:
        System.out.println("August");
        break;
 case sep:
        System.out.println("September");
        break;
 case oct:
        System.out.println("October");
        break;
 case nov:
        System.out.println("November");
        break;
 case dec:
        System.out.println("December");
        break;


        

    }
  }
}