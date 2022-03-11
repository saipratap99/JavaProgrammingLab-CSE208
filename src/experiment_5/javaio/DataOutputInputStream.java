/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author DELL
 */
// ****************************************************************************

// DataOutputStream is used to write primitive data types to the stream
// DataInputStream is used to read primitive data types from the stream

// ****************************************************************************


public class DataOutputInputStream {
    public static void main(String args[])throws Exception{
        
        // writing primitive data type to the file
        FileOutputStream fout = new FileOutputStream("DataOutput.txt");
        DataOutputStream d = new DataOutputStream(fout);
        d.writeInt(54);
        d.writeChar(68);
        d.writeChars("saipratap99");
        fout.close();
        d.flush();
        d.close();
        // writing primitive data type to the file
        FileInputStream fin = new FileInputStream("DataOutput.txt");
        DataInputStream din = new DataInputStream(fin);
        
        System.out.println(din.readInt());
        System.out.println(din.readChar());
        fin.close();
        din.close();
        
    }
}
