package standards;

public class Declarations {

	
	//One declaration per line is recommended since it encourages commenting. In other words,

	int level; // indentation level
	int size;  // size of table
	is preferred over

	int level, size;
	
	
	
	
	//Don't wait to declare variables until their first use; it can confuse the unwary programmer and hamper code portability within the scope.

	void myMethod() {
	    int int1 = 0;         // beginning of method block

	    if (condition) {
	        int int2 = 0;     // beginning of "if" block
	        ...
	    }
	}
	
}
