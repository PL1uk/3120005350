package TC;

import java.io.*;

public class FileInput {

    public String readString(String FI){
        int len=0;
        StringBuilder str=new StringBuilder();
        File file = new File(FI);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line;
            while((line=bufferedReader.readLine())!=null){
                if (len!=0){
                    str.append("\r\n").append(line);
                }else {
                    str.append(line);
                }
                len++;
            }
            bufferedReader.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str.toString();
    }

    public static void main(String[] args) {
        FileInput fileInput = new FileInput();
        String s = fileInput.readString("I:\\软件工程\\3120005350\\ThesisCheck\\src\\Test\\Sample\\1\\orig.txt");
        System.out.println(s);
    }

}