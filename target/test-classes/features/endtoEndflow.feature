@smoke @greencart
Feature: To check UI components in greenkart
@1iteme2e
Scenario: To make booking with one item
Given customer is on the items page
When customer adds an item to cart
And clicks on proceed button
Then Booking details page should be displayed
And  clicks on place order button
Then countryselection page should eb displayed
When user seelcts country and tandc checkbox
When customer clickson continue button
Then confirmation page should be displayed

@manyitemse2e
Scenario: To make booking with many item
Given customer is on the items page
When customer ads many items to cart
And clicks on proceed button
Then Booking details page should be displayed
And  clicks on place order button
Then countryselection page should eb displayed
When user seelcts country and tandc checkbox
When customer clickson continue button
Then confirmation page should be displayed
