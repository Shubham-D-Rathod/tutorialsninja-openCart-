Feature: Application Checkout
@Checkout
Background: 
Given Open Browser and enter URL for the website 

Scenario Outline: checkout the products as a guest user 

                          
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

Scenario Outline: checkout the products as a guest user with invalid delivery details

                          
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


Scenario Outline: checkout the products as a guest user with no fill in delivery details
                           
And Search the product (HP)from search option(Header)                
Then Add them to Add to cart                             
And The product is successfully added into shopping cart                               
Then Click on the shopping cart button                         
And Click on the checkoutbutton                     
Then Click on the as a guest user                                     
And click on the continue button in step one
Then message is displayed please fill all delivery details

