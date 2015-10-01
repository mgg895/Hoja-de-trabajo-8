# Hoja-de-trabajo-8
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.*;
import java.util.Arrays;

public class main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here

       String [] vectorCadenas = new String[5];
       int n = 0;
     
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
      
      try {
         archivo = new File ("Pacientes.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         String linea="a";
         while(linea !=null){
            linea=br.readLine();
            vectorCadenas[n]=linea;
            n++;
        }
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
      
      System.out.println(vectorCadenas[0]);
      System.out.println(vectorCadenas[1]);
      System.out.println(vectorCadenas[2]);
      System.out.println(vectorCadenas[3]);
      
      String[] paciente1;
      String[] paciente2;
      String[] paciente3;
      String[] paciente4;
      
      paciente1 = vectorCadenas[0].split(",");
      paciente2 = vectorCadenas[1].split(",");
      paciente3 = vectorCadenas[2].split(",");
      paciente4 = vectorCadenas[3].split(",");
      
      paciente Paciente1 = new paciente(paciente1[0],paciente1[1],paciente1[2]);
      paciente Paciente2 = new paciente(paciente2[0],paciente2[1],paciente2[2]);
      paciente Paciente3 = new paciente(paciente3[0],paciente3[1],paciente3[2]);
      paciente Paciente4 = new paciente(paciente4[0],paciente4[1],paciente4[2]);
      
      VectorHeap heap = new VectorHeap();
      heap.add(Paciente1);
      heap.add(Paciente2);
      heap.add(Paciente3);
      heap.add(Paciente4);
      paciente [] ArrayHeap = (paciente[]) heap.toArray();
      System.out.println(ArrayHeap[1].toString());
   }
}
