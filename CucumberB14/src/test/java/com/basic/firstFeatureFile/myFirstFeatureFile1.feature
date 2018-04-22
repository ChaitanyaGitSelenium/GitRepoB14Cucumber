#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Create account of Facebook4
As a user u need to open facebook home page and do the validations

Scenario: Validate First Name field41
Given User need to be on Facebook login page
When User enters user "Test" first name
Then User checks user "Test" first name is present

#Scenario: Validate create user multiple fields
#Given User need to be on Facebook login page
#When User enters user first name
#And User enters user surname
#Then User checks user first name is present
#But User Mobile field should be blank
#Then User check user first name is present
