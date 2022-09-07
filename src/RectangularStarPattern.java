/*
To print:
*****
*****
*****
*****
*****
 */
package interviewprograms.src;

/*
    run:
    *	*	*	*	*	
    *	*	*	*	*	
    *	*	*	*	*	
    *	*	*	*	*	
    *	*	*	*	*	
 */
public class RectangularStarPattern {
    public static void main(String[] args) {
        int row=5;
        for(int i=1; i<=row; i++){
            for(int j=1; j<=5; j++){
                System.out.print("*\t");                
            }
            System.out.println("");
        }
    }
    
}

/*
    run:
    *	*	*	*	*	
    *	*	*	*	*	
    *	*	*	*	*	
    *	*	*	*	*	
    *	*	*	*	*	
 */