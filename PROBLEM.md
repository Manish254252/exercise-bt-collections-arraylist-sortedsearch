## Problem Statement: Search a specific value from a sorted catalog List

**Given two integers find the fraction and handle runtime exception using try and catch**

**This exercise contains a class named CatalogSortedListSearch with the following methods:**

     +catalogSearcher(List <String>, String) : String  
         - Should take a list and String as input and return a string as result
         - Should validate the List and return error message when it is null or empty and contains value like empty or blank space or null
         - Should return error message when the String is null or empty or blank space  
         - Should sort the List using Collections            
         - Should save the sorted List in a global class List varaible and iterate the sorted to check String existence  
--------------------------------------------------------
     +getSortedCatalogList() : String
         - Should return the global class List varaible      


## Example
    Sample Input:
    [Nike, Puma, Adidas, Reebok, UnderArmour, NBalance, SuperDry], reebok      
    
    Expected Output:
    Found: Reebok
    [Adidas, NBalance, Nike, Puma, Reebok, SuperDry, UnderArmour]
--------------------------------------------------------
    Sample Input:
    [Nike, Puma, Adidas, Reebok, UnderArmour, NBalance, SuperDry], Lee
        
    Expected Output:
    "Not Found"
--------------------------------------------------------
    Sample Input:
    [Nike, Puma, Adidas, Reebok, UnderArmour, NBalance, SuperDry], null
        
    Expected Output:
    "Input is not accepted"
--------------------------------------------------------
    Sample Input:
    [], "Adidas"
        
    Expected Output:
    "The catalog list is empty"

## Instructions

- Avoid printing unnecessary values other than expected output as given in sample
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Follow best practices while coding