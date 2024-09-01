/**
 * 
 */
package org.example.designPatterns;

/**
 The Chain of Responsibility design pattern is a behavioral design pattern that allows a request to be passed along a chain of handlers. Each handler in the chain processes the request, decides whether to handle it or pass it to the next handler in the chain. This pattern decouples the sender of a request from its receiver by allowing multiple objects to handle the request.

Key Concepts of Chain of Responsibility Design Pattern
Handler: An abstract class or interface that defines a method for handling requests. It also holds a reference to the next handler in the chain.

Concrete Handler: Implements the handler interface or class. Each concrete handler either processes the request or passes it to the next handler.

Client: Initiates the request and passes it to the first handler in the chain.

Benefits
Flexibility in Request Handling: The request can be handled by any handler in the chain, allowing for dynamic and flexible request processing.
Decoupling of Request Sender and Receiver: The sender of a request does not need to know which handler will process it.
Example in Java
Let's implement a Chain of Responsibility pattern with an example where we have different levels of request handlers: LowLevelHandler, MidLevelHandler, and HighLevelHandler.

1 Define the Handler Interface

The Handler interface defines the method for handling requests and setting the next handler.

2 Create Concrete Handlers

Concrete handlers implement the handleRequest method, processing the request or passing it to the next handler.


Client Code

The client creates the chain of handlers and sends requests to the first handler in the chain.

Explanation
Handler Interface (Handler): This abstract class defines the method handleRequest() and a reference to the next handler in the chain (nextHandler).
Concrete Handlers (LowLevelHandler, MidLevelHandler, HighLevelHandler): Each concrete handler checks if it can process the request. If it can, it does so; otherwise, it passes the request to the next handler in the chain.
Client (ChainOfResponsibilityDemo): The client sets up the chain of handlers and sends requests to the first handler.
Output
When running the above code, the output will be:

Since there is no handler for the "Unknown" level, the request passes through all the handlers without being processed.

Advantages
Decoupling: The client does not need to know which handler will process the request.
Flexibility: The chain can be modified dynamically by adding, removing, or changing the order of handlers.
Responsibility Sharing: Multiple handlers can contribute to processing the request.
Summary
The Chain of Responsibility pattern is useful when multiple objects may handle a request, and the handler isn't known until runtime. It provides a way to pass the request along a chain of potential handlers, allowing for flexible and dynamic request processing.


 */
public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        // Create handlers
        Handler lowHandler = new LowLevelHandler();
        Handler midHandler = new MidLevelHandler();
        Handler highHandler = new HighLevelHandler();

        // Set the chain of handlers
        lowHandler.setNextHandler(midHandler);
        midHandler.setNextHandler(highHandler);

        // Send requests to the chain
        System.out.println("Sending Low-level request:");
        lowHandler.handleRequest("Low");

        System.out.println("\nSending Mid-level request:");
        lowHandler.handleRequest("Mid");

        System.out.println("\nSending High-level request:");
        lowHandler.handleRequest("High");

        System.out.println("\nSending Unknown-level request:");
        lowHandler.handleRequest("Unknown");
    }
}

