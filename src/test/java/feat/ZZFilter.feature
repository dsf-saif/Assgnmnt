Feature: To filter out data entries

Background: 
Given User is navigated to the products return page

  Scenario Outline: User filters data using ReturnID 
    
    When User Enters a valid Return ID "<return_id>"
    And Clicks on the filter button
    Then valid returnID entry are displayed 
    
   Examples: 
   |return_id|
   |505|


  Scenario Outline: User filters data using OrderID
   
    When user enters a valid Order_ID "<order_id>"
    Then valid orderID entry are displayed
    
       Examples: 
   |order_id|
   |786|
   |789|

Scenario Outline: User filters data using Customer
    
    When User Enters a valid Customer "<customer>"
    And Clicks on the filter button
    Then valid customer entry are displayed 
    
   Examples: 
   |customer|
   |Mohammed Saif|
   
   Scenario Outline: User filters data using Product
    
    When User Enters a valid Product "<product>"
    And Clicks on the filter button
    Then valid product entry are displayed 
    
   Examples: 
   | product|
   |Air Conditioner|
   Scenario Outline: User filters data using Model
    
    When User Enters a valid Model "<model>"
    And Clicks on the filter button
    Then valid model entry are displayed 
    
   Examples: 
   |model|
   |Daikin|

