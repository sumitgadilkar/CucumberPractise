 Feature: Sign in into amazon website
 
 Scenario Outline: User to create a new account on amazon website
 
 Given user navigates to amazon website
 When user clicks on Signin link
 Then Amazon signin page opens
 And user clicks on create a new account
 And user provides "<Name>" and "<Email>" and "<Password>" and "<Re-enterPassword>"
 And user clicks on Continue button
 
 Examples:
 |Name|Email|Password|Re-enterPassword|
 |ZabcSumit|sumitflipkartt@gmail.com|ZabcSumit@123456|ZabcSumit@123456|
 
 