package pf.pfranklin0.insertion_sort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Unit tests will be written for the InsertionSort class.
 * 
 * 3A is a test design pattern that is usually studied by developers. Each part of 3A has a different responsibility, which can be identified at:
 * https://java-design-patterns.com/patterns/arrange-act-assert/
 * 
 */
public class InsertionSortTest 
{
    /**
     * When the InsertionSort is initialized, the isSorted method should return the value false.
     */
    @Test
    public void InsertionSort_isSorted_InitializesFalse()
    {
        InsertionSort is = new InsertionSort();

        assertFalse(is.isSorted());
    }
}
