/**
 * 
 */
package org.example.designPatterns;

/**
 * 
 */
public class MidLevelHandler extends Handler {

	@Override
    public void handleRequest(String request) {
        if (request.equals("Mid")) {
            System.out.println("MidLevelHandler: Handling request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }

}
