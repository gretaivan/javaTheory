package theory;


/*
* Features use of constructor chaining
if 2 params passed all constructors will be triggered
1. 2 params is called
2. 
*
*/
public class ChainingConstructors {
    int freeBags, checkedBags;
    double perBagFee; 

    ChainingConstructors(int freeBags) {
        this(freeBags > 1 ? 25.0 : 50.0);
        this.freeBags = freeBags;
    }
    ChainingConstructors (int freeBags, int checkedBags) {
        this(freeBags); 
        this.checkedBags = checkedBags; 
    }

    ChainingConstructors(double perBagFee){
        this.perBagFee = perBagFee;
    }
}
