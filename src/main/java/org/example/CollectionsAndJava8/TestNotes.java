/**
 * 
 */
package org.example.CollectionsAndJava8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 
 */
public class TestNotes {

    public static void main(String[] args) {

    List<Notes> noteLst = new ArrayList<>();
    noteLst.add(new Notes(1, "note1", 11));
    noteLst.add(new Notes(2, "note2", 22));
    noteLst.add(new Notes(3, "note3", 33));
    noteLst.add(new Notes(4, "note4", 44));
    noteLst.add(new Notes(5, "note5", 55));

    noteLst.add(new Notes(6, "note4", 66));


    Map<String, Integer> notesRecords = noteLst.stream()
//                                           // .sorted(Comparator
//                                           // .comparingInt(Notes::getTagId)
//                                           // .reversed()) // sorting is based on TagId 55,44,33,22,11
    											.sorted(Comparator
    		                                           .comparingInt(Notes::getTagId)) // sorting is based on TagId 55,44,33,22,11
                                            .collect(Collectors.toMap
                                            (Notes::getNotesName, Notes::getTagId,
                                            (oldValue, newValue) -> oldValue,LinkedHashMap::new));
// consider old value 44 for dupilcate key
// it keeps order
        System.out.println("Notes : " + notesRecords);
        
    }
    
   
}
