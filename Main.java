/********************************************
*	AUTHOR:	<name>
* COLLABORATORS: <names>
*	COURSE:	CS 111 Intro to CS I - Java
*	LAST MODIFIED:	<date>
********************************************/

public class Main 
{
  public static void main(String[] args)
  {
    int[] values = {12, 16, 26, 42, 53, 77, 84};

    System.out.println("Test :" + ArrayMethods.arrayString(values));

    ArrayMethods.swap(values, 0, 6);
    System.out.println("Test after swap (12and84):" + ArrayMethods.arrayString(values));

    int[] numbers = {42, 16, 84, 12, 77, 26, 53};
    int minIndex1 = ArrayMethods.indexOfMin(numbers, 0);
    int minIndex2 = ArrayMethods.indexOfMin(numbers, 4);

    System.out.println("TEST: min indices should be 3 and 5, we got: " + minIndex1 + " and " + minIndex2);

    System.out.println("Test before reversal:" + ArrayMethods.arrayString(numbers));

    ArrayMethods.reverse(numbers);

    System.out.println("Test after reversal:" + ArrayMethods.arrayString(numbers));

    System.out.println("Test before sorting:" + ArrayMethods.arrayString(numbers));

    ArrayMethods.selectionSort(numbers);

    System.out.println("Test after sorting:" + ArrayMethods.arrayString(numbers));

  }
}

