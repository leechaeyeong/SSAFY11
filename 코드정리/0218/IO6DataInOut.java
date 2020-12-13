import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * DataInputStream & DataOutputStream
 */
public class IO6DataInOut {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			File outFile = new File((new File(".").getCanonicalPath())
													+"\\src\\dataout.dat");
			fos = new FileOutputStream(outFile);
			dos = new DataOutputStream(fos);
			dos.writeByte(127);dos.writeShort(1270);
			dos.writeInt(12700);dos.writeLong(127000L);
			dos.writeFloat(3.14F);dos.writeDouble(0.999);
			dos.writeBoolean(false);dos.writeChar('A');
			dos.writeUTF("data out stream...");
			fis = new FileInputStream(outFile);
			dis = new DataInputStream(fis);
			String tmp = dis.readByte()+" : "+dis.readShort()+" : "+
			dis.readInt()+" : "+dis.readLong()+" : "+
			dis.readFloat()+" : "+dis.readDouble()+" : "+
			dis.readBoolean()+" : "+dis.readChar()+" : "+
			dis.readUTF();
			System.out.println(tmp);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();
				fos.close();
				dis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}






