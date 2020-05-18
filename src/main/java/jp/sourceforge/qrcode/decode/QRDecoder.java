package jp.sourceforge.qrcode.decode;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;

import javax.imageio.ImageIO;

import jp.sourceforge.qrcode.QRCodeDecoder;

public class QRDecoder {
	public static String decode(InputStream is) throws Exception {
        BufferedImage bufferedImage=ImageIO.read(is);
        QRCodeDecoder codeDecoder=new QRCodeDecoder();
        String result=new String(codeDecoder.decode(new MyQRCodeImage(bufferedImage)),"utf-8");
        return result;
	}
	public static String decode(String qrFilePath) throws Exception {
		File file=new File(qrFilePath);
		BufferedImage bufferedImage=ImageIO.read(file);
		QRCodeDecoder codeDecoder=new QRCodeDecoder();
		String result=new String(codeDecoder.decode(new MyQRCodeImage(bufferedImage)),"utf-8");
		return result;
	}
}
