package pf.pfranklin0.insertion_sort;

/**
 * InsertionSort is a class where data can be sorted using an insertion sort algorithm.
 *
 * Any insertion sort algorithm used in this java class file is based upon the algorithm found in Introduction to algorithms (3rd ed.).
 * Cormen, T. H., Leiserson, C. E., Rivest, R. L., & Stein, C. (2009). Introduction to algorithms (3rd ed.). Massachusetts Institute of Technology.
 * 
 */
public class InsertionSort 
{
    private boolean sorted;

    public InsertionSort() {
        this.sorted = false;
    }

    public boolean getSorted() {
        return this.sorted;
    }
}
