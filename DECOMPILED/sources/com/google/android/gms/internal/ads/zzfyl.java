package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfyl {
    private static Cipher zza;
    private static final Object zzb = new Object();
    private static final Object zzc = new Object();

    private static final Cipher zzc() {
        Cipher cipher;
        synchronized (zzc) {
            try {
                if (zza == null) {
                    zza = Cipher.getInstance("AES/CBC/PKCS5Padding");
                }
                cipher = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cipher;
    }

    public final byte[] zza(byte[] bArr, String str) throws zzfyk {
        byte[] bArrDoFinal;
        int length = bArr.length;
        try {
            byte[] bArrZza = zzfva.zza(str, false);
            int length2 = bArrZza.length;
            if (length2 <= 16) {
                throw new zzfyk();
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(bArrZza);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (zzb) {
                zzc().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = zzc().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException e7) {
            e = e7;
            throw new zzfyk(e);
        } catch (InvalidAlgorithmParameterException e8) {
            e = e8;
            throw new zzfyk(e);
        } catch (InvalidKeyException e9) {
            e = e9;
            throw new zzfyk(e);
        } catch (NoSuchAlgorithmException e10) {
            e = e10;
            throw new zzfyk(e);
        } catch (BadPaddingException e11) {
            e = e11;
            throw new zzfyk(e);
        } catch (IllegalBlockSizeException e12) {
            e = e12;
            throw new zzfyk(e);
        } catch (NoSuchPaddingException e13) {
            e = e13;
            throw new zzfyk(e);
        }
    }

    public final String zzb(byte[] bArr, String str) {
        return new String(zza(bArr, str), "UTF-8");
    }
}
