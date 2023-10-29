@smoke
Feature: Contact feature
  User Story: As a user, I should be able to contact

  Background: User is expected to be on the contact page for the scenarios on the feature file
    Given user is on the contact page

  Scenario Outline: "Invalid Phone Number" display verification for invalid phone number on validation message
    Given user enters valid name "<name>" to name input on the contact page
    And user enters valid email "<email>" to email input on the contact page
    And user enters invalid phone number "<phone number>" to phone number input on the contact page
    And user clicks to send button on the contact page
    Then user sees Invalid Phone Number message on validation message
    Examples:
      | name | email         | phone number  |
      | Alex | abc@gmail.ccc | ++12506548576 |
      | Sam  | bbb@yahoo.ccc | 0556548*45488 |
      | Jack | yyy@gmail.ccc | 047856r328514 |
      | John | zzz@asde.ccc  | 012506548576+ |

