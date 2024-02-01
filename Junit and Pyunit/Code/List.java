package junit;

import java.util.*;

public class List {
    ArrayList<Integer> newList=new ArrayList<Integer>();

    public boolean find(int item) {
        return newList.contains(item);
    }

    public void insert(int item) {
        newList.add(item);
    }
}
