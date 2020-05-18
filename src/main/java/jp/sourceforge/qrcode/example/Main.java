package jp.sourceforge.qrcode.example;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import jp.sourceforge.qrcode.QRCodeDecoder;

public class Main {
	public static void main(String[] args) throws Exception {
		File file=new File("D:/wxqr.jpg");
        BufferedImage bufferedImage=ImageIO.read(file);
        QRCodeDecoder codeDecoder=new QRCodeDecoder();
        String result=new String(codeDecoder.decode(new MyQRCodeImage(bufferedImage)),"utf-8");

        System.out.println(result);

	}
}
