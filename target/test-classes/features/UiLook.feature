@UI @greencart
Feature: To check UI components in greenkart
@reg
Scenario: To check title in items page
Given customer is on the items page
When customer sees all the items
Then title of the page should be displayed
@reg
Scenario: To check item details in items page
Given customer is on the items page
When customer sees any particular item
Then all the details should be displayed
|Itemimage|Itemtext|itemprice|Addtocartbutton|
@reg
Scenario: To check footer details in items page
Given customer is on the items page
When customer sees the footer
Then footer text "© 2019 GreenKart - buy veg and fruits online" should be displayed

 