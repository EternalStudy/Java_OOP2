import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class main {
   public main() {
   }

   public static void main(String[] args) throws IOException {
      try {
         makeRecord();
         System.out.println("success");
      } catch (Exception var2) {
         System.out.println(var2.getStackTrace());
      }

   }

   public static void makeRecord() throws Exception {
      System.out.println("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u0444\u0430\u043c\u0438\u043b\u0438\u044e, \u0438\u043c\u044f, \u043e\u0442\u0447\u0435\u0441\u0442\u0432\u043e, \u0434\u0430\u0442\u0443 \u0440\u043e\u0436\u0434\u0435\u043d\u0438\u044f (\u0432 \u0444\u043e\u0440\u043c\u0430\u0442\u0435 dd.mm.yyyy), \u043d\u043e\u043c\u0435\u0440 \u0442\u0435\u043b\u0435\u0444\u043e\u043d\u0430 (\u0447\u0438\u0441\u043b\u043e \u0431\u0435\u0437 \u0440\u0430\u0437\u0434\u0435\u043b\u0438\u0442\u0435\u043b\u0435\u0439) \u0438 \u043f\u043e\u043b(\u0441\u0438\u043c\u0432\u043e\u043b \u043b\u0430\u0442\u0438\u043d\u0438\u0446\u0435\u0439 f \u0438\u043b\u0438 m), \u0440\u0430\u0437\u0434\u0435\u043b\u0435\u043d\u043d\u044b\u0435 \u043f\u0440\u043e\u0431\u0435\u043b\u043e\u043c");

      String text;
      try {
         BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

         try {
            text = bf.readLine();
         } catch (Throwable var18) {
            try {
               bf.close();
            } catch (Throwable var15) {
               var18.addSuppressed(var15);
            }

            throw var18;
         }

         bf.close();
      } catch (IOException var19) {
         throw new IOException("\u041f\u0440\u043e\u0438\u0437\u043e\u0448\u043b\u0430 \u043e\u0448\u0438\u0431\u043a\u0430 \u043f\u0440\u0438 \u0440\u0430\u0431\u043e\u0442\u0435 \u0441 \u043a\u043e\u043d\u0441\u043e\u043b\u044c\u044e");
      }

      String[] array = text.split(" ");
      if (array.length != 6) {
         throw new Exception("\u0412\u0432\u0435\u0434\u0435\u043d\u043e \u043d\u0435\u0432\u0435\u0440\u043d\u043e\u0435 \u043a\u043e\u043b\u0438\u0447\u0435\u0441\u0442\u0432\u043e \u043f\u0430\u0440\u0430\u043c\u0435\u0442\u0440\u043e\u0432");
      } else {
         String surname = array[0];
         String name = array[1];
         String patronymic = array[2];
         SimpleDateFormat format = new SimpleDateFormat("dd.mm.yyyy");

         Date birthdate;
         try {
            birthdate = format.parse(array[3]);
         } catch (ParseException var17) {
            throw new ParseException("\u041d\u0435\u0432\u0435\u0440\u043d\u044b\u0439 \u0444\u043e\u0440\u043c\u0430\u0442 \u0434\u0430\u0442\u044b \u0440\u043e\u0436\u0434\u0435\u043d\u0438\u044f", var17.getErrorOffset());
         }

         int phone;
         try {
            phone = Integer.parseInt(array[4]);
         } catch (NumberFormatException var16) {
            throw new NumberFormatException("\u041d\u0435\u0432\u0435\u0440\u043d\u044b\u0439 \u0444\u043e\u0440\u043c\u0430\u0442 \u0442\u0435\u043b\u0435\u0444\u043e\u043d\u0430");
         }

         String sex = array[5];
         if (!sex.toLowerCase().equals("m") && !sex.toLowerCase().equals("f")) {
            throw new RuntimeException("\u041d\u0435\u0432\u0435\u0440\u043d\u043e \u0432\u0432\u0435\u0434\u0435\u043d \u043f\u043e\u043b");
         } else {
            String fileName = "files\\" + surname.toLowerCase() + ".txt";
            File file = new File(fileName);

            try {
               FileWriter fileWriter = new FileWriter(file, true);

               try {
                  if (file.length() > 0L) {
                     fileWriter.write(10);
                  }

                  fileWriter.write(String.format("%s %s %s %s %s %s", surname, name, patronymic, format.format(birthdate), phone, sex));
               } catch (Throwable var20) {
                  try {
                     fileWriter.close();
                  } catch (Throwable var14) {
                     var20.addSuppressed(var14);
                  }

                  throw var20;
               }

               fileWriter.close();
            } catch (IOException var21) {
               throw new IOException("\u0412\u043e\u0437\u043d\u0438\u043a\u043b\u0430 \u043e\u0448\u0438\u0431\u043a\u0430 \u043f\u0440\u0438 \u0440\u0430\u0431\u043e\u0442\u0435 \u0441 \u0444\u0430\u0439\u043b\u043e\u043c");
            }
         }
      }
   }
}