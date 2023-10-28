## LeetCode

# About the repository
This repository holds answers to LeetCode problems. It was made to push code to Github
and to utilize the intellij IDE. It will contain the coded solution, the assertion, 
and a section to add inputs.

# Test the code with assertions
* To use the existing code, run in the terminal the following:
  * java -ea <PATH_TO_FILE>
    * Ex:  java -ea ./Arrays/RemoveDuplicatesFromSortedArray.java
  * if multiple classes are being used, first run the following:
    * javac <CLASSES_TO_COMPILE>
      * Ex: javac ./LinkedList/MergeTwoSortedLists.java ./LinkedList/ListNode.java
    * if the classes are all in the same directory, compiling just the file with the main is fine
      * Ex:  javac ./LinkedList/MergeTwoSortedLists.java
  * then run the following, specifying the class with the main method:
    * java -ea <CLASS_WITH_MAIN>
      * Ex: java -ea LinkedList.MergeTwoSortedLists
* To test other inputs:
  * inputs can be added to the "Test Inputs" section for the given file