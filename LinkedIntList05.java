// Class LinkedIntList can be used to store a list of integers.

public class LinkedIntList05 {

    /*
    Write a method called countDuplicates that returns the number of duplicates in a sorted list. The list will be in
    sorted order, so all of the duplicates will be grouped together. For example, if a variable list stores the values
    [1, 1, 1, 3, 3, 6, 9, 15, 15, 23, 23, 23, 40, 40] , the call of list.countDuplicates() should return 7 because there
    are 2 duplicates of 1 , 1 duplicate of 3 , 1 duplicate of 15 , 2 duplicates of 23 , and 1 duplicate of 40.
     */

    public int countDuplicates() {
        ListNode05 current = front;
        int counter = 0;

        while (current.next != null) {
            if (current.data == current.next.data) {
                counter++;
            }
            current = current.next;
        }

        return counter;
    }

    // Everything below is copied from the book

    private ListNode05 front; // first value in the list

    // post: constructs an empty list
    public LinkedIntList05() {
        front = null;
    }

    // post: returns the current number of elements in the list
    public int size() {
        int count = 0;
        ListNode05 current = front;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    // pre : 0 <= index < size()
    // post: returns the integer at the given index in the list
    public int get(int index) {
        return nodeAt(index).data;
    }

    // post: returns comma-separated, bracketed version of list
    public String toString() {
        if (front == null) {
            return "[]";
        } else {
            String result = "[" + front.data;
            ListNode05 current = front.next;
            while (current != null) {
                result += ", " + current.data;
                current = current.next;
            }
            result += "]";
            return result;
        }
    }

    // post: returns the position of the first occurrence of the
    // given value (-1 if not found)
    public int indexOf(int value) {
        int index = 0;
        ListNode05 current = front;
        while (current != null) {
            if (current.data == value) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    // post: appends the given value to the end of the list
    public void add(int value) {
        if (front == null) {
            front = new ListNode05(value);
        } else {
            ListNode05 current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode05(value);
        }
    }

    // pre: 0 <= index <= size()
    // post: inserts the given value at the given index
    public void add(int index, int value) {
        if (index == 0) {
            front = new ListNode05(value, front);
        } else {
            ListNode05 current = nodeAt(index - 1);
            current.next = new ListNode05(value, current.next);
        }
    }

    // pre : 0 <= index < size()
    // post: removes value at the given index
    public void remove(int index) {
        if (index == 0) {
            front = front.next;
        } else {
            ListNode05 current = nodeAt(index - 1);
            current.next = current.next.next;
        }
    }

    // pre : 0 <= i < size()
    // post: returns a reference to the node at the given index
    private ListNode05 nodeAt(int index) {
        ListNode05 current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

}