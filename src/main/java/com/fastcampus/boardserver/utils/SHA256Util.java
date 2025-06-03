package com.fastcampus.boardserver.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SHA256Util {
  public static final String ENCRYPTION_KEY = "SHA-256";
  public static String encryptSHA256(String str) {
    String SHA = null;

    MessageDigest sh;
    try {
      sh = MessageDigest.getInstance(ENCRYPTION_KEY);
      sh.update(str.getBytes());
      byte[] byteData = sh.digest();
      StringBuilder sb = new StringBuilder();
      for (byte aByteData : byteData) {
        sb.append(Integer.toString((aByteData & 0xff) + 0x100, 16).substring(1));
      }
      SHA = sb.toString();

    } catch (NoSuchAlgorithmException e) {
      log.error("encryptSHA256 error : {}", e.getMessage());
      SHA = null;
    }
    return SHA;
  }
}
