# Adapter-Design-Pattern
Example for Adapter design pattern
This pattern basically used for make communication between 2 differnt interfaces.
Suppose we have Assignment class that write the assigment using iPen.
Here we have iPen as Interface
But we have another class PilotPen 
So we already have writtern PilotPen class , but in our Assigmnet class we are using iPen where iPen is Interface
So we make an Adapter class via which we dont nedd to provide implementation for iPen interface and we use PilotPen class but it will return iPen to Assignment class.
