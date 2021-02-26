Feature: Product Checkout Feature

  Scenario Outline: Check the Product Price
    Given the price of "<product>" is <price>
    When I check the <quantity> of "<product>"
    Then the total price of "<product>" should be <total>




    Examples:
      | product | price | quantity | total |
      | banana  | 40    | 1        | 40    |
      | banana  | 40    | 2        | 80    |
      | apple   | 30    | 1        | 30    |
      | mango   | 50    | 2        | 100   |