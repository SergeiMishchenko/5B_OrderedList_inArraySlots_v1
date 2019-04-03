/** 
  OrderedList
  
  A list with the invariant the elements are in order by
  increasing value, implemented using a
  List_inArraySlots
 */

public interface OrderedList {

    /** 
      @return a string representation of this Orderedlist_iAS
     */
    String toString();

    
    /** 
      Put @value where it belongs in the list.
      @pre: the list is in increasing order
     */
    void add(int value);
}
