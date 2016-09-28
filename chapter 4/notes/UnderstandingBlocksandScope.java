// understand blocks and scope page 158:
/* Notes:
	I. Understand Blocks and scope:
		block: The code between a pair of curly braces.
		outer, or outside block: The outside block of code that contains another block. 

		a. You can not declare the same variable name more than once within a block, even if a block contains other blocks.
			i. when you declare a variable more than once in a block, you are attempting to redeclare the variable- an illegal action. 
		b. Although you cannot declare a variable twice within the same block, you can declare a variable within one method of a class and use the same variable name within another method of the class.
*/

public class UnderstandingBlocksandScope {
	public static void main(String[] args) {
		// this is the first block:

		// example:
		int one = 1;


			System.out.println("This is the outside block!");

		{// this is the first inner block
			// this is a different block then the last one. 
			// this is the second block. What is in this block is not in the outer block. 
			int two = 3;

			System.out.println(two);

			System.out.println(one);
		}

		{// this is the second inner block:
			// these are two different blocks 
			int two = 2;

			System.out.println(two);
		}

		// so the outside block does not have access to the inside blocks however the inside blocks have access to the outside blocks. Interesting seems like it 
	}
}s