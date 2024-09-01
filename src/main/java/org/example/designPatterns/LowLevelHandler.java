/**
 * 
 */
package org.example.designPatterns;

/**
 * 
 */
public class LowLevelHandler extends Handler {

	@Override
    public void handleRequest(String request) {
        if (request.equals("Low")) {
            System.out.println("LowLevelHandler: Handling request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }

}
