package SearchFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class FileSearch {

    private String path;
    private String regex;
    private String zipFileName;

    public static void main(String[] args) {

        FileSearch app = new FileSearch();

        switch (Math.min(args.length, 3)){

            case 0:
                System.out.println("USAGE: FileSearch path [regex] [zipfile]");
                return;
            case 3:
                app.setZipFileName(args[2]);
            case 2:
                app.setRegex(args[1]);
            case 1:
                app.setPath(args[0]);
        }
        try {
            app.walkDirectoryJava6(app.getPath());
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private void walkDirectory(String file) {

        System.out.println("walkDirectory: " + file);
        searchFile(null);
        addFile(null);
    }

    private void addFile(File file) {
        System.out.println("searchFile: " + file);
    }

    private void searchFile(File file) {
        System.out.println("addFileToZip: " + file);
        
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public String getZipFileName() {
        return zipFileName;
    }

    public void setZipFileName(String zipFileName) {
        this.zipFileName = zipFileName;
    }

    /*
    * Here we have a method that accepts a string representing a directory path. And then we use the Java IO.file class to
    * get a list of files in that directory. And then we do something with each file that we find.
    * A few points of interest in this code. First, we're passing a string instead of a file as a parameter
    * because we got a string as a command line argument telling us which directory to walk. It's better to
    * encapsulate all the file handling logic in this method instead of forcing the main method to figure
    * out how to convert a string into a file. This will also make it easier to substitute this method
    * with the other methods we're going to write for Java 7 and Java 8, as we'll see in a minute.
    * */
    public void walkDirectoryJava6(String path) throws IOException{
        File dir = new File(path);
        File[] files = dir.listFiles();

        for(File file: files){
            if(file.isDirectory()){
                walkDirectoryJava6(file.getAbsolutePath());
            }else{
                processFile(file);
            }
        }

    }

    /*
    *
    * n Java 7 we have the new Java NIO files class that has some nice built-in functionality for copying files,
    * processing files in a directory and more. We can use the methods in this class to replace a lot of common
    * file operations that used to require a fair amount of boilerplate code using the java.io.file class.
    * Here's an example of writing the code to walk the directory in Java 7. First, the Files Walk Tree method has a checked
    * exception. So we need to either use a try-catch block inside the method, or throw an IOException in the method signature.
    * It's almost always better to throw the exception in this case. So the calling method, the one that gave us
    * the path in the first place, can deal with it. You can see that we throw the exception here in the method signature.
    * Second, the first parameter of the walkFileTree method takes a path object, not a file. The Path Class was new in Java 7.
    * Since we're getting the original path as a string when this method is called, we can easily convert the string to a
    * path using the call to Paths.get. Next, the second parameter of the walkFileTree method is a file visitor object.
    * This class was also new in Java 7. We can either create a brand new implementation of FileVisitor, or as we see in
    * our example code, we can also implement SimpleFileVisitor and override whatever methods we need. In this case, t
    * he only method that's important is the visitFile method. And that's called once for each file in the directory being walked.
    *  So every time we visit a file, we can call processFile, and then we need to return FileVisitResult.CONTINUE
    * */
    public void walkDirectoryJava7(String path) throws IOException{

         Files.walkFileTree(Paths.get(path), new SimpleFileVisitor<Path>() {

             @Override
             public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException{
                 processFile(file.toFile());
                 return FileVisitResult.CONTINUE;
             }
        });
    }

    /*
    *
    * If you're using Java 8, all of this becomes even easier using streams and lamda functions.
    * We can shorten everything to a single line of code like this. Java 8 introduced the Files.walk method,
    * which returns a stream. We can then operate on each item in the stream with the forEach method.
    * If this syntax looks unusual to you, now is a great time for you to learn about Lamda Expressions in Java 8.
    * We'll also talk about lamda functions in a little more detail in chapter three of this course. To test this out,
    * just change the main method code so it points to one of the new walk directory methods
    * */
    public void walkDirectoryJava8(String path) throws IOException {

        Files.walk(Paths.get(path))
                .forEach(f -> processFile(f.toFile()));

    }
    private void processFile(File file) {

        System.out.println("processFile: "+file);
    }


}
