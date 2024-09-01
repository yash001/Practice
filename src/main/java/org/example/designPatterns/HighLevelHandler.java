/**
 * 
 */
package org.example.designPatterns;

/**
 * 
 */
public class HighLevelHandler extends Handler {

	@Override
    public void handleRequest(String request) {
        if (request.equals("High")) {
            System.out.println("HighLevelHandler: Handling request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
