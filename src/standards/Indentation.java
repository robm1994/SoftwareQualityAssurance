package standards;

public class Indentation {

	//Here are some examples of breaking method calls:

		someMethod(longExpression1, longExpression2, longExpression3, 
		        longExpression4, longExpression5);
		 
		var = someMethod1(longExpression1,
		                someMethod2(longExpression2,
		                        longExpression3)); 
		Following are two examples of breaking an arithmetic expression. The first is preferred, since the break occurs outside the parenthesized expression, which is at a higher level.

		longName1 = longName2 * (longName3 + longName4 - longName5)
		           + 4 * longname6; // PREFER

		longName1 = longName2 * (longName3 + longName4
		                       - longName5) + 4 * longname6; // AVOID 
		Following are two examples of indenting method declarations. The first is the conventional case. The second would shift the second and third lines to the far right if it used conventional indentation, so instead it indents only 8 spaces.

		//CONVENTIONAL INDENTATION
		someMethod(int anArg, Object anotherArg, String yetAnotherArg,
		           Object andStillAnother) {
		    ...
		}

		//INDENT 8 SPACES TO AVOID VERY DEEP INDENTS
		private static synchronized horkingLongMethodName(int anArg,
		        Object anotherArg, String yetAnotherArg,
		        Object andStillAnother) {
		    ...
		}
		Line wrapping for if statements should generally use the 8-space rule, since conventional (4 space) indentation makes seeing the body difficult. For example:

		//DON'T USE THIS INDENTATION
		if ((condition1 && condition2)
		    || (condition3 && condition4)
		    ||!(condition5 && condition6)) { //BAD WRAPS
		    doSomethingAboutIt();            //MAKE THIS LINE EASY TO MISS
		} 

		//USE THIS INDENTATION INSTEAD
		if ((condition1 && condition2)
		        || (condition3 && condition4)
		        ||!(condition5 && condition6)) {
		    doSomethingAboutIt();
		} 

		//OR USE THIS
		if ((condition1 && condition2) || (condition3 && condition4)
		        ||!(condition5 && condition6)) {
		    doSomethingAboutIt();
		} 
		Here are three acceptable ways to format ternary expressions:

		alpha = (aLongBooleanExpression) ? beta : gamma;  

		alpha = (aLongBooleanExpression) ? beta
		                                 : gamma;  

		alpha = (aLongBooleanExpression)
		        ? beta 
		        : gamma;  
	
}
