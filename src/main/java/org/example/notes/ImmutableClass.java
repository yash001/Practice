/**
 * 
 */
package org.example.notes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *1. Immutable classes - 

Design Problem - Write down an Immutable class? Write on a blank paper
	Item
		itemId:	string
		itemName: string
		tags: List<String>
		groups: List<List<String>>
		
SOlutions :

Explanation:
- final Class: The Item class is declared as final to prevent inheritance.
- final Fields: All fields (itemId, itemName, tags, groups) are declared as private final to ensure they can only be assigned once.
- Constructor: The constructor initializes all fields. It performs a deep copy of the groups list to prevent external modifications.
- No Setters: No setter methods are provided, ensuring that the fields remain immutable after the object is created.
- Deep Copy: The groups field, being a List<List<String>>, requires a deep copy to avoid modifications to the internal state of the object.
- Unmodifiable List: The tags and groups are wrapped with Collections.unmodifiableList() to ensure they cannot be modified.
- This design ensures that the Item class is immutable and thread-safe, as its state cannot be changed after construction.

		 
 */
public final class ImmutableClass {
    
    private final String itemId;
    private final String itemName;
    private final List<String> tags;
    private final List<List<String>> groups;
    
    public ImmutableClass(String itemId, String itemName, List<String> tags, List<List<String>> groups) {
        if (itemId == null || itemName == null || tags == null || groups == null) {
            throw new IllegalArgumentException("Arguments cannot be null");
        }
        this.itemId = itemId;
        this.itemName = itemName;
        this.tags = Collections.unmodifiableList(tags);
        
        // Perform a deep copy for the groups list
        List<List<String>> deepCopyGroups = new ArrayList<>();
        for (List<String> group : groups) {
            deepCopyGroups.add(Collections.unmodifiableList(new ArrayList<>(group)));
        }
        this.groups = Collections.unmodifiableList(deepCopyGroups);
    }

    public String getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public List<String> getTags() {
        return tags;
    }

    public List<List<String>> getGroups() {
        return groups;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId='" + itemId + '\'' +
                ", itemName='" + itemName + '\'' +
                ", tags=" + tags +
                ", groups=" + groups +
                '}';
    }
}
