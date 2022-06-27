Feature: Modify Return

Background:
Given User is navigated to the product returns page


  Scenario: User deletes an entry in the product log by selecting products
    
    When User selects the products to be returned and clicks on the delete button
    Then entry is deleted and message is displayed.


  Scenario:  User deletes an entry in the product log without selecting products 
    
    When User clicks on the delete button
    Then no entry is deleted and no message is deleted.
