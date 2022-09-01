package ptow;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		
		String res = new PdfToWord().pdftoword("E:\\kejian\\大三下\\软件体系\\论文\\一种基于层次聚类的软件架构恢复方法.pdf");
		System.out.println(res);
	}
	
}
