Feature: Application Ordering Products



Scenario Outline: Ordering Products is Displayed in Order History

Given Open Browsers and enter URL for the website                         
And Search the product (HP)from search option(Header)                
Then Add them to Add to cart                             
And The product is successfully added into shopping cart                               
Then Click on the shopping cart button                         
And Click on the checkoutbutton                     
Then Click on the as a guest user                                     
And click on the continue button in step one
Then fill in the delivery details 
Then click on the continue button in step two
Then click on the continue button in step four
Then click on the term and condition button 
Then click on the continue button in step five
Then click on the confirm order button in step six
Then order is placed message is displayed
Then click on the continue button
Then click on the Order History button on Home Page
Then Ordering Products is Displayed