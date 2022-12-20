package list.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncronizedArrayList {
    public static void main(String[] args) {
        // HOW TO MAKE NON-SYNCRONIZED ARRAYLIST TO SYNCRONIZED ARRAYLIST

        ArrayList<Object> l = new ArrayList<>(); // NOT SYNCRONIZED YET
        List<Object> synList = Collections.synchronizedList(l); // NOW IT'S SYNCRONIZED

        
    }
}
