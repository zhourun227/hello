package demo4;

import java.io.File;
import java.io.FilenameFilter;

public class java25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("C:\\Windows");//构造File对象时，既可以传入绝对路径，也可以传入相对路径
		//File的路径返回值:一种是getPath()，返回构造方法传入的路径，一种是getAbsolutePath()，返回绝对路径，
		//一种是getCanonicalPath，它和绝对路径类似，但是返回的是规范路径
		//规范路径就是把.和..转换成标准的绝对路径后的路径
		
		//File对象既可以表示文件，也可以表示目录。
		System.out.println(f.isFile());//是否是一个已存在的文件
        System.out.println(f.isDirectory());//是否是一个已存在的目录
        
        //File对象获取到一个文件时，还可以进一步判断文件的权限和大小
        /*
         * boolean canRead()：是否可读；
			boolean canWrite()：是否可写；
			boolean canExecute()：是否可执行；
			long length()：文件字节大小。
         */
        //当File对象表示一个文件时，可以通过createNewFile()创建一个新文件，用delete()删除该文件
        //File对象提供了createTempFile()来创建一个临时文件，以及deleteOnExit()在JVM退出时自动删除该文件
        
        //当File对象表示一个目录时，可以使用list()和listFiles()列出目录下的文件和子目录名
        File[] fs1 = f.listFiles(); // 列出所有文件和子目录
        printFiles(fs1);
        
        File[] fs2 = f.listFiles(new FilenameFilter() { // 仅列出.exe文件
            public boolean accept(File dir, String name) {
                return name.endsWith(".exe"); // 返回true表示接受该文件
            }
        });
        printFiles(fs2);
	}

	private static void printFiles(File[] files) {
		// TODO Auto-generated method stub
		System.out.println("==========");
        if (files != null) {
            for (File f : files) {
                System.out.println(f);
            }
        }
        System.out.println("==========");
    }
	

}
