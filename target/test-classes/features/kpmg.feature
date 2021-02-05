Feature: KPMG Scenarios

  Background: Homepage
    Given the user allows all cokies
    And the user on the home page
    Then the user clicks sign in buttton
    And the user is on the sign in page
    When fills credentials and clicks on the create an account button
    Then the user navigate to create an account page
    And the user selects the subscribe to all button
    And then the user clicks create account button
    Then the user navigate to account created page
    And clicks joinn for free button

  @kpmg
  Scenario: Positive scenario
    Then the user insert all valid information on the form
    And clicks I agree button
    When the user clicks join for free button
    Then the user navigate to welcome page
    And clicks start shopping button
    Then the user reach to main products page
    And hover to "Beauty" module
    And the user selects for shampoo product
    And then the user navigates to shampoo page
    When the user clicks Aveda Shampure
    Then reaching to quantity page
    And the user select size for aveda shapure
    And clicks plus sign
    And adds to basket
    When goes to basket
    Then finally the user reach to basket page
    And but the user remove this product
    And the user able to see that basket is empty

 # @negative

  # Important:  just for demo purpose, not negative scenarios not finalized yet.

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







