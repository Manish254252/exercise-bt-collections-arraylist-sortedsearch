package com.stackroute.exercises;

import org.junit.jupiter.api.*;


import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatalogSortedListSearchTests {

    private CatalogSortedListSearch catalogSortedListSearch;
    private String message = "Check the logic in method fractionCalculator";

    @BeforeEach
    public void setUp() {
        catalogSortedListSearch = new CatalogSortedListSearch();
    }

    @AfterEach
    public void tearDown() {
        catalogSortedListSearch = null;
    }

    @Test
    public void givenAStringListAndStringThenReturnAStringResult() {
        ArrayList<String> catalogListDemo = new ArrayList<>();
        catalogListDemo.add("Nike");
        catalogListDemo.add("Puma");
        catalogListDemo.add("Adidas");
        catalogListDemo.add("Reebok");
        catalogListDemo.add("UnderArmour");
        catalogListDemo.add("NBalance");
        catalogListDemo.add("SuperDry");
        assertEquals("Found: Reebok", catalogSortedListSearch.catalogSearcher(catalogListDemo, "Reebok"), message);
        assertEquals("Found: Reebok", catalogSortedListSearch.catalogSearcher(catalogListDemo, "reebok"), message);
        assertEquals("[Adidas, NBalance, Nike, Puma, Reebok, SuperDry, UnderArmour]", catalogSortedListSearch.getSortedCatalogList(), message);
    }

    @Test
    public void givenAStringListAndWrongStringThenReturnAnErrorString() {
        ArrayList<String> catalogListDemo = new ArrayList<>();
        catalogListDemo.add("Nike");
        catalogListDemo.add("Puma");
        catalogListDemo.add("Adidas");
        catalogListDemo.add("Reebok");
        catalogListDemo.add("UnderArmour");
        catalogListDemo.add("NBalance");
        catalogListDemo.add("SuperDry");
        assertEquals("Not Found", catalogSortedListSearch.catalogSearcher(catalogListDemo, "Levis"), message);
        assertEquals("[Adidas, NBalance, Nike, Puma, Reebok, SuperDry, UnderArmour]", catalogSortedListSearch.getSortedCatalogList(), message);
    }

    @Test
    public void givenANullStringListOrANullStringThenReturnAnErrorString() {
        ArrayList<String> catalogListDemo = new ArrayList<>();
        catalogListDemo.add("Nike");
        catalogListDemo.add("Puma");
        catalogListDemo.add("Adidas");
        catalogListDemo.add("Reebok");
        catalogListDemo.add("UnderArmour");
        catalogListDemo.add("NBalance");
        catalogListDemo.add("SuperDry");
        assertEquals("Input is not accepted", catalogSortedListSearch.catalogSearcher(catalogListDemo, null), message);
        assertEquals("The catalog list is null", catalogSortedListSearch.catalogSearcher(null, "Adidas"), message);

    }

    @Test
    public void givenAStringListThatContainEmptyValueOrAEmptyStringThenReturnAnErrorString() {
        ArrayList<String> catalogListDemo = new ArrayList<>();
        catalogListDemo.add("Nike");
        catalogListDemo.add("Puma");
        catalogListDemo.add("Adidas");
        catalogListDemo.add("Reebok");
        catalogListDemo.add("UnderArmour");
        catalogListDemo.add("NBalance");
        catalogListDemo.add("SuperDry");
        assertEquals("Input is not accepted", catalogSortedListSearch.catalogSearcher(catalogListDemo, ""), message);
        catalogListDemo.add("");
        assertEquals("The catalog List contains empty or nul or blank space as a value", catalogSortedListSearch.catalogSearcher(catalogListDemo, "Adidas"), message);
    }

    @Test
    public void givenAStringListThatContainBlankSpaceValueOrABlankSpaceStringThenReturnAnErrorString() {
        ArrayList<String> catalogListDemo = new ArrayList<>();
        catalogListDemo.add("Nike");
        catalogListDemo.add("Puma");
        catalogListDemo.add("Adidas");
        catalogListDemo.add("Reebok");
        catalogListDemo.add("UnderArmour");
        catalogListDemo.add("NBalance");
        catalogListDemo.add("SuperDry");
        assertEquals("Input is not accepted", catalogSortedListSearch.catalogSearcher(catalogListDemo, " "), message);
        catalogListDemo.add(" ");
        assertEquals("The catalog List contains empty or nul or blank space as a value", catalogSortedListSearch.catalogSearcher(catalogListDemo, "Adidas"), message);
    }

    @Test
    public void givenAStringListThatContainNullValueAndAStringThenReturnAnErrorString() {
        ArrayList<String> catalogListDemo = new ArrayList<>();
        catalogListDemo.add("Nike");
        catalogListDemo.add("Puma");
        catalogListDemo.add(null);
        catalogListDemo.add("Reebok");
        catalogListDemo.add("UnderArmour");
        catalogListDemo.add("NBalance");
        catalogListDemo.add("SuperDry");
        assertEquals("The catalog List contains empty or nul or blank space as a value", catalogSortedListSearch.catalogSearcher(catalogListDemo, "Adidas"), message);
    }

}
