/**
 * 
 */
package org.example.multi.classLoaders;

/**
 * 
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CustomClassLoader extends ClassLoader {
    private String classDir;

    public CustomClassLoader(String classDir) {
        this.classDir = classDir;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] classData = loadClassData(name);
        if (classData == null) {
            throw new ClassNotFoundException("Class " + name + " not found.");
        }
        return defineClass(name, classData, 0, classData.length);
    }

    private byte[] loadClassData(String className) throws ClassNotFoundException {
        String filePath = classDir + File.separator + className.replace('.', File.separatorChar) + ".class";
        try (InputStream inputStream = new FileInputStream(filePath)) {
            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            return buffer;
        } catch (IOException e) {
            throw new ClassNotFoundException("Class " + className + " not found at " + filePath, e);
        }
    }
}

