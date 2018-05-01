package com.ulap.basic.type.algo.impl;

import com.ulap.basic.type.algo.AbstractDecryption;
import com.ulap.basic.type.algo.AbstractEncryption;
import com.ulap.basic.type.types.AlgoDataTypes;
import com.ulap.basic.type.types.Data;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class BowFishAlgorithm implements AbstractDecryption,AbstractEncryption {

  /**
   *
   * @return
   */
  @Override
  public Data<AlgoDataTypes> doDecrypt()
  {
    return null;
  }

  /**
   *
   * @return
   */
  @Override
  public Data<AlgoDataTypes> doEncrypt()
  {
    return null;
  }


  public static String encryptBlowfish(String to_encrypt, String strkey) {
    try {
      SecretKeySpec key = new SecretKeySpec(strkey.getBytes(), "Blowfish");
      Cipher cipher = Cipher.getInstance("Blowfish");
      cipher.init(Cipher.ENCRYPT_MODE, key);
      return new String(cipher.doFinal(to_encrypt.getBytes()));
    } catch (Exception e) { return null; }
  }

  public static String decryptBlowfish(String to_decrypt, String strkey) {
    try {
      SecretKeySpec key = new SecretKeySpec(strkey.getBytes(), "Blowfish");
      Cipher cipher = Cipher.getInstance("Blowfish");
      cipher.init(Cipher.DECRYPT_MODE, key);
      byte[] decrypted = cipher.doFinal(to_decrypt.getBytes());
      return new String(decrypted);
    } catch (Exception e) { return null; }
  }
}
