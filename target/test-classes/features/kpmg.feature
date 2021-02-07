@kpmg
Feature: KPMG Scenarios

  Background: Homepage
    Given the user allows all cokies
    And the user able to see page title as "John Lewis & Partners | Homeware, Fashion, Electricals & More"
    Then the user clicks sign in buttton
    And the user able to see the sign in page subtitle as "SIGN IN"
    When fills credentials and clicks on the create an account button
    Then the user navigate to create an account page
    And the user selects the subscribe to all button
    And then the user clicks create account button
    Then the user navigate to account created page and see page subtitle as "ACCOUNT CREATED"
    And clicks joinn for free button
    Then the user insert all valid information on the form
    And clicks I agree button
    When the user clicks join for free button
    Then the user navigate to welcome page and see page subtitle as "WELCOME"
    And clicks start shopping button
    And the user able to see page title as "John Lewis & Partners | Homeware, Fashion, Electricals & More"

  Scenario Outline: Positive scenario one
    And hover to "<typeNameOfProduct>" module
    And the user selects for "<product>" product
    And then the user navigates to shampoo page and see the part of page subtitle as "<partOfpageSubtitle>"
    When the user clicks particular product's name start with "<partNameOfParticularProduct>"
    Then reaches the quantity page named "<pasticularProductPageSubtitle>"
    And the user select size for product
    And clicks plus sign
    And adds to basket
    When goes to basket
    Then finally the user reach to basket page and see page subtitle as "BASKET"
    And but the user remove this product
    And the user able to see that basket is empty

    Examples:

      | typeNameOfProduct | product | partOfpageSubtitle | partNameOfParticularProduct | pasticularProductPageSubtitle     |
      #| Beauty            | Shampoo | SHAMPOO            | Aveda Shampure              | Aveda Shampure™ Nurturing Shampoo |
      | Electricals       | Kettles | KETTLES            | Dualit Dom                  | Dualit Dome Kettle, Black/Steel   |

#  Scenario: Positive scenario two

#    And hover to "Electricals" module
#    And the user selects for "Kettles" product
#    And then the user navigates to shampoo page and see the part of page subtitle as "KETTLES"
#    When the user clicks particular product's name start with "Dualit Dome"
#    Then reaches the quantity page named "Dualit Dome Kettle, Black/Steel"
#    And the user select size for product
#    And clicks plus sign
#    And adds to basket
#    When goes to basket
#    Then finally the user reach to basket page and see page subtitle as "BASKET"
#    And but the user remove this product
#    And the user able to see that basket is empty


  # @negative
  # Important:  just for demo purpose, negative scenarios not finalized yet.

#  Scenario Outline: Positive scenario
#    When the user insert invalid "<title>" or "<firstName>" or "<lastName>" or "<phoneNumber>" or "<houseNameOrNumber>" or "<addressLine1>" or "<townOrCity>" or "<postcode>"
#    Then an error is displayed
#
#    Examples:
#      | title | firstName | lastName | phoneNumber     | houseNameOrNumber | addressLine1  | townOrCity | postcode |
#      #title
#      | -Mr   | Goksal    | Cavdar   | 07776094567     | 56                | Lansdowne Rd  | Manchester | M8 5SH   |
#      | 1Mr   | Goksal    | Cavdar   | 07776094567     | 56                | Lansdowne Rd  | Manchester | M8 5SH   |
#      | Mr?   | Goksal    | Cavdar   | 07776094567     | 56                | Lansdowne Rd  | Manchester | M8 5SH   |
#      |       | Goksal    | Cavdar   | 07776094567     | 56                | Lansdowne Rd  | Manchester | M8 5SH   |
#      #firstName
#      | Mr    | Goksa1    | Cavdar   | 07776094567     | 56                | Lansdowne Rd  | Manchester | M8 5SH   |
#      | Mr    | Goks?     | Cavdar   | 07776094567     | 56                | Lansdowne Rd  | Manchester | M8 5SH   |
#      | Mr    | @oksa     | Cavdar   | 07776094567     | 56                | Lansdowne Rd  | Manchester | M8 5SH   |
#      | Mr    |           | Cavdar   | 07776094567     | 56                | Lansdowne Rd  | Manchester | M8 5SH   |
#      | Mr    | 8oksa     | Cavdar   | 07776094567     | 56                | Lansdowne Rd  | Manchester | M8 5SH   |
#      #lastName
#      | Mr    | Goksal    | Cav7ar   | 07776094567     | 56                | Lansdowne Rd  | Manchester | M8 5SH   |
#      | Mr    | Goksal    | @avdar   | 07776094567     | 56                | Lansdowne Rd  | Manchester | M8 5SH   |
#      | Mr    | Goksal    | Cavda;   | 07776094567     | 56                | Lansdowne Rd  | Manchester | M8 5SH   |
#      | Mr    | Goksal    |          | 07776094567     | 56                | Lansdowne Rd  | Manchester | M8 5SH   |
#      | Mr    | Goksal    | 9avdar   | 07776094567     | 56                | Lansdowne Rd  | Manchester | M8 5SH   |
#
#      #phoneNumber
#      | Mr    | Goksal    | Cavdar   | a7776084567     | 56                | Lansdowne Rd  | Manchester | M8 5SH   |
#      | Mr    | Goksal    | Cavdar   | ?7776084567     | 56                | Lansdowne Rd  | Manchester | M8 5SH   |
#      | Mr    | Goksal    | Cavdar   | 0777608uu67     | 56                | Lansdowne Rd  | Manchester | M8 5SH   |
#      | Mr    | Goksal    | Cavdar   | 0777608456?     | 56                | Lansdowne Rd  | Manchester | M8 5SH   |
#      | Mr    | Goksal    | Cavdar   | 077760845679768 | 56                | Lansdowne Rd  | Manchester | M8 5SH   |
#      | Mr    | Goksal    | Cavdar   | 87776084567     | 56                | Lansdowne Rd  | Manchester | M8 5SH   |
#      | Mr    | Goksal    | Cavdar   | +7776084567     | 56                | Lansdowne Rd  | Manchester | M8 5SH   |
#      | Mr    | Goksal    | Cavdar   |                 | 56                | Lansdowne Rd  | Manchester | M8 5SH   |
#
#      #houseNameOrNumber
#      | Mr    | Goksal    | Cavdar   | 07776094567     | -56               | Lansdowne Rd  | Manchester | M8 5SH   |
#      | Mr    | Goksal    | Cavdar   | 07776094567     | 56/               | Lansdowne Rd  | Manchester | M8 5SH   |
#      | Mr    | Goksal    | Cavdar   | 07776094567     |                   | Lansdowne Rd  | Manchester | M8 5SH   |
#
#      #addressLine1
#      | Mr    | Goksal    | Cavdar   | 07776094567     | 56                | -Lansdowne Rd | Manchester | M8 5SH   |
#      | Mr    | Goksal    | Cavdar   | 07776094567     | 56                |               | Manchester | M8 5SH   |
#
#      #townOrCity
#      | Mr    | Goksal    | Cavdar   | 07776094567     | 56                | Lansdowne Rd  | 11111      | M8 5SH   |
#      | Mr    | Goksal    | Cavdar   | 07776094567     | 56                | Lansdowne Rd  | Koln       | M8 5SH   |
#      | Mr    | Goksal    | Cavdar   | 07776094567     | 56                | Lansdowne Rd  |            | M8 5SH   |
#
#      #postcode
#      | Mr    | Goksal    | Cavdar   | 07776094567     | 56                | Lansdowne Rd  | Manchester | 88 5SH    |
#      | Mr    | Goksal    | Cavdar   | 07776094567     | 56                | Lansdowne Rd  | Manchester | M8 5S1    |
#      | Mr    | Goksal    | Cavdar   | 07776094567     | 56                | Lansdowne Rd  | Manchester | M8 -5SH   |
#      | Mr    | Goksal    | Cavdar   | 07776094567     | 56                | Lansdowne Rd  | Manchester | M8 5S:    |
#      | Mr    | Goksal    | Cavdar   | 07776094567     | 56                | Lansdowne Rd  | Manchester | ^8 5SH    |
#      | Mr    | Goksal    | Cavdar   | 07776094567     | 56                | Lansdowne Rd  | Manchester |           |
#
#
#
#







