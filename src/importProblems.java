/**
 * Created by Daniel Killen on 31/05/2024
 * Program to search for addresses of problems in LeetCode folders and save them to an HTML file
 **/

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class importProblems {
   public static void main(String[] args) {
      // Change the root directory path as needed
      File root = new File("C:\\Users\\laptop\\OneDrive Ulster University\\Desktop\\Coding\\NeetCode");
      File outputFile = new File("output.html");
      try (FileWriter writer = new FileWriter(outputFile)) {
         writer.write("<html><body>\n");
         processDirectory(root, writer);
         writer.write("</body></html>");
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public static void processDirectory(File directory, FileWriter writer) throws IOException {
      if (directory.isDirectory()) {
         File[] files = directory.listFiles();
         if (files != null) {
            for (File file : files) {
               if (file.isDirectory()) {
                  processDirectory(file, writer);
               } else if (file.isFile() && file.getName().endsWith(".txt")) {
                  processFile(file, directory.getName(), writer);
               }
            }
         }
      }
   }

   public static void processFile(File file, String directoryName, FileWriter writer) throws IOException {
      try (BufferedReader br = new BufferedReader(new FileReader(file))) {
         String line;
         List<String> links = new ArrayList<>();
         while ((line = br.readLine()) != null) {
            links.addAll(extractHttpSentences(line));
         }
         if (!links.isEmpty()) {
            writer.write("<h3>Directory: " + directoryName + "</h3>\n");
            writer.write("<ul>\n");
            for (String link : links) {
               writer.write("<li><a href=\"" + link + "\">" + link + "</a></li>\n");
            }
            writer.write("</ul>\n");
         }
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public static List<String> extractHttpSentences(String text) {
      List<String> httpSentences = new ArrayList<>();
      String[] sentences = text.split("\\n");
      for (String sentence : sentences) {
         if (sentence.startsWith("http")) {
            httpSentences.add(sentence.trim());
         }
      }
      return httpSentences;
   }
}
