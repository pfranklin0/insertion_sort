package pf.pfranklin0.insertion_sort;

/**
 * InsertionSort is a class where data can be sorted using an insertion sort algorithm.
 *
 * Any insertion sort algorithm used in this java class file is based upon the algorithm found in Introduction to algorithms (3rd ed.).
 * Cormen, T. H., Leiserson, C. E., Rivest, R. L., & Stein, C. (2009). Introduction to algorithms (3rd ed.). Massachusetts Institute of Technology.
 * 
 */
public class InsertionSort implements InsertionSortInterface
{
    private boolean sorted; // Boolean variable maintains state regarding whether the class has sorted the data

    /**
     * The default constructor initializes sorted in the false state.
     */
    public InsertionSort() {
        this.sorted = false;
    }

    /**
     * The method isSorted has zero inputs and returns a boolean value showing whether the object has been sorted.
     * @return boolean. Returns whether the object has been sorted.
     */
    public boolean isSorted() {
        return this.sorted;
    }
}
