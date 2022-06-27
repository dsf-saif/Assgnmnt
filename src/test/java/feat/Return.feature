Feature: Product Return

  Background: 
    Given Admin is navigated to the Product Return page and clicks the + button.

  Scenario Outline: Add a product return in the Product Return Log with Valid Details
    When user enters Valid Order ID "<order_id>" First Name "<firstname>" Last Name"<lastname>" Email"<email>" and Telephone"<telephone>"
    And and Enter Valid Product "<product>" and Model "<model>"
    And click on the Save button
    Then Admin is navigated to Product Return Page with the new entry registered

    Examples: 
      | order_id | firstname | lastname | email     | telephone    | product      | model         |
      |     4129 | Mohammed  | Saif     | gef@H.com | 098765432345 | Laptop       | Dell-Latitude |
      
  Scenario Outline: Add a product return in the Product Return Log with Invalid Details
    When user enters Invalid Order ID "<order_id>" First Name "<firstname>" Last Name"<lastname>" Email"<email>" and Telephone"<telephone>"
    And and Enter Invalid Product "<product>" and Model "<model>"
    And click on the Save button
    Then Admin stays on the same page

    Examples: 
      | order_id | firstname | lastname | email  | telephone    | product | model |
      | abcd     |    214132 |    65214 | dcbjkc | klnewyyvhj   | ew      | we    |
     
