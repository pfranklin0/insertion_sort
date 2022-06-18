package pf.pfranklin0.insertion_sort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Unit tests will be written for the InsertionSort class.
 */
public class InsertionSortTest 
{
    /**
     * When the InsertionSort is initialized, the isSorted method should return the value false.
     */
    @Test
    public void InsertionSort_isSorted_InitializesFalse()
    {
        // Arrange
        InsertionSort is;
    
        // Act
        is = new InsertionSort();

        // Assert
        assertFalse(is.isSorted());
    }
}
