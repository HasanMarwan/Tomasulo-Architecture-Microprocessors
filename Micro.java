import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Micro{

    List<Instruction> instructionQueue = new ArrayList<>();
    Register[] registerFile;
    MemRS[] memRSs;
    ArthRS[] arthRSs;

    int[] memory;

    // initialize the size of buffers and RSs
    public void sizeInit(int registerFileSize, int memRSsize, int arthRSsize, int memorySize){
        registerFile = new Register[registerFileSize];
        memRSs = new MemRS[memRSsize];
        arthRSs = new ArthRS[arthRSsize];
        memory = new int[memorySize];
    }

    // function to parse the text files and initialize the size of all components
    public void populateInstructionQueue(String filePath){
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
                String[] parts = line.split(" ", -1);
                System.out.println(parts.length);
                for(int i =0;i<parts.length;i++)
                    System.out.println(parts[i]);
                System.out.println("----------------------------");
                //FP arithmetic instruction
                if(parts[1].startsWith("ADD") || parts[1].startsWith("SUB") || parts[1].startsWith("MUL") || parts[1].startsWith("DIV")){
                    instructionQueue.add(new Instruction(parts[0], parts[1], parts[2], parts[3], parts[4]));
                }
                // load and store
                else if(parts[1].startsWith("L") || parts[1].startsWith("S")){
                    if(parts[3].startsWith("R") || parts[3].startsWith("F"))
                    instructionQueue.add(new Instruction(parts[0], parts[1], parts[2], parts[3]));
                    else
                    instructionQueue.add(new Instruction(parts[0], parts[1], parts[2], Integer.parseInt(parts[3])));
                }
                else if (parts[1].startsWith("D")){
                    instructionQueue.add(new Instruction(parts[0], parts[1], parts[2], parts[3], Integer.parseInt(parts[4])));
                }
                else{
                    instructionQueue.add(new Instruction(parts[0], parts[1], parts[2], parts[3], parts[4]));
                }
                System.out.println("----------------------------");


            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        Micro m = new Micro();
        m.populateInstructionQueue("C:/Users/T14/Desktop/micro project/instructions.txt");
        List<Instruction> q = m.instructionQueue;
        for (Instruction inst : q) {
            System.out.println("instruction " + inst.toString());
        }
       
    }
}