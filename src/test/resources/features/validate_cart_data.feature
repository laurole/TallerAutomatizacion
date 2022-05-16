Feature: Select products by category and section add to cart and remove products from cart
  as a user,I need to purchase several products.

  @scenario1
  Scenario: validate cart data
    Given the user is on the page https://www.linio.com.co/
    When the user selects the Home category and then the section Mattresses, bed bases and pillows.
    And  the user selects the product "Super Mega Combo Azul Queen 160x190 Resortado Marshall " "3"
    Then the user click on add to cart
    And the user should see in the cart the product, the quantity and the new value match the total of products


  @scenario2
  Scenario: Remove products from cart
    Given the user is on the page https://www.linio.com.co/
    When the user selects the Home category and then the section Mattresses, bed bases and pillows.
    And  the user selects the product "Super Mega Combo Azul Queen 160x190 Resortado Marshall " "3"
    Then the user goes to the cart and removes the products
    And the user should see the message "No hay productos en tu carrito"




