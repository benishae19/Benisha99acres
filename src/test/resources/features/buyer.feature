Feature: buy a home
  I want to use this template for my feature file


Scenario: For buying a home
  Given user is on the 99Acres website homepage.
  When user selects the for buyer option on website it shows a dropdown
  And select the property in hyderabad option and clicks under construction option
  Then select the Arkala Life flat.

Scenario: To buy a Plot
  Given user is on the 99Acres website homepage.
  When user selects buyer option 
  And click on Plot and click on East facing option 
  Then view the available properties page

Scenario: To buy a commercial property
  Given user is on the 99Acres website homepage.
  When user selects buyer option then clicks on commercial sale in Hyderabad
  And user selects shop option 
  Then user selects the Vasavis MPM Grand.
  
  Scenario: To buy a popular areas
  Given user is on the 99Acres website homepage.
  When user selects buyer option then clicks on popular areas
  And user selects Property in Kondapur 
  Then user selects the Sumadhura Horizon.

Scenario Outline: Calculate EMI
  Given user is on the 99Acres website homepage.
  When user clicks on for buyers and clicks on Insights option
  And select home loans and tools
  And selects the calculate EMI bar
  And send values for <"Loan amount"> <"Tenure"> <"Rate of Interest">
  Then it should display pie chart

Examples:
  |   Loan amount   |   Tenure   |   Rate of Interest   |
  |   300000        |   10       |   8                  |
  |   500000        |   20       |   8.9                |
  |   900000        |   30       |   9                  |
