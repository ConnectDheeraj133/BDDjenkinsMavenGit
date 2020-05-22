@sanity @navigations @greencart
Feature: To check UI components in greenkart
@reg @san
Scenario: To check naviagtion from itesm page to booking details page
Given customer is on the items page
When customer adds an item to cart
Then cart should be updated with items
And Able to navigate to booking details page
@reg @san
Scenario: To check naviagtion from booking details page to items page
Given customer is on the items page
When customer adds an item to cart
Then cart should be updated with items
And Able to navigate to booking details page
When customer clicks on back button
Then items page should be dispalyed
@reg @san
Scenario: To check navigation to country details page
Given customer is on the items page
When customer adds an item to cart
Then cart should be updated with items
And Able to navigate to booking details page
When clicks on "Place order" button
Then country page should eb dispalyed
