import java.io.*;


public class FileFinder {
    public static void main(String[] args){
        try {
            FindJavaFiles("src");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    private static void FindJavaFiles(String path) {
        File file = new File(path);
        if (!file.exists())
            System.out.println(path + "directory doesn't exist");
        File[] listFiles = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".java")){
                    return true;
                }
                return false;
            }
        });
        for (File f:listFiles){
            InputStream is = null;
            try{
                is = new FileInputStream(f);
                byte content[] = new  byte[2*1024];
                int readCount = 0;
                while((readCount = is.read(content)) > 0){
                    System.out.println(new String(content, 0, readCount-1));
                }
            } catch (FileNotFoundException e){
                e.printStackTrace();
            } catch (IOException e){
                e.printStackTrace();
            } finally {
                try {
                    if(is!=null)
                        is.close();
                }catch (Exception e){

                }
            }

        }
    }
}
