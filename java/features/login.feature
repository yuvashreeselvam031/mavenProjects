Feature: login functionality of LeafTaps

Scenario: Login with positive credentials

Given open the chrome browser

And Load the application url

And enter user name as Demosalesmanager

And enter password as crmsfa

When click on login button

Then homepage should be displayed