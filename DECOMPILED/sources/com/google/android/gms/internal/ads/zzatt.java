package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class zzatt {
    static boolean zza = false;
    public static final /* synthetic */ int zzc = 0;
    private static MessageDigest zzd;
    private static final Object zze = new Object();
    private static final Object zzf = new Object();
    static final CountDownLatch zzb = new CountDownLatch(1);

    static void zza() {
        synchronized (zzf) {
            try {
                if (!zza) {
                    zza = true;
                    new Thread(new zzats(null)).start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static String zzb(byte[] bArr, String str) {
        zzatj zzatjVarZzc = zzc(bArr, str);
        return zzatn.zza(zzatjVarZzc == null ? zzh(zzg(4096).zzaN(), str, true) : ((zzatk) zzatjVarZzc.zzbu()).zzaN(), true);
    }

    static zzatj zzc(byte[] bArr, String str) {
        Vector vectorZzd = zzd(bArr, 255);
        if (vectorZzd == null || vectorZzd.isEmpty()) {
            return null;
        }
        zzatj zzatjVarZza = zzatk.zza();
        int size = vectorZzd.size();
        for (int i7 = 0; i7 < size; i7++) {
            zzatjVarZza.zza(zzhhb.zzr(zzh((byte[]) vectorZzd.get(i7), str, false), 0, 256));
        }
        byte[] bArrZze = zze(bArr);
        zzhhb zzhhbVar = zzhhb.zzb;
        zzatjVarZza.zzb(zzhhb.zzr(bArrZze, 0, bArrZze.length));
        return zzatjVarZza;
    }

    static Vector zzd(byte[] bArr, int i7) {
        int length = bArr.length;
        if (length <= 0) {
            return null;
        }
        int i8 = length + 254;
        Vector vector = new Vector();
        for (int i9 = 0; i9 < i8 / 255; i9++) {
            int i10 = i9 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i10 > 255) {
                    length2 = i10 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i10, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    public static byte[] zze(byte[] bArr) {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        synchronized (zze) {
            try {
                zza();
                MessageDigest messageDigest2 = null;
                try {
                    if (zzb.await(2L, TimeUnit.SECONDS) && (messageDigest = zzd) != null) {
                        messageDigest2 = messageDigest;
                    }
                } catch (InterruptedException unused) {
                }
                if (messageDigest2 == null) {
                    throw new NoSuchAlgorithmException("Cannot compute hash");
                }
                messageDigest2.reset();
                messageDigest2.update(bArr);
                bArrDigest = zzd.digest();
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrDigest;
    }

    static zzast zzg(int i7) {
        zzarw zzarwVarZzi = zzast.zzi();
        zzarwVarZzi.zzl(4096L);
        return (zzast) zzarwVarZzi.zzbu();
    }

    private static byte[] zzh(byte[] bArr, String str, boolean z7) {
        byte[] bArrArray;
        int length = bArr.length;
        int i7 = true != z7 ? 255 : 239;
        if (length > i7) {
            bArr = zzg(4096).zzaN();
        }
        int i8 = i7 + 1;
        int length2 = bArr.length;
        byte b7 = (byte) length2;
        if (length2 < i7) {
            byte[] bArr2 = new byte[i7 - length2];
            new SecureRandom().nextBytes(bArr2);
            bArrArray = ByteBuffer.allocate(i8).put(b7).put(bArr).put(bArr2).array();
        } else {
            bArrArray = ByteBuffer.allocate(i8).put(b7).put(bArr).array();
        }
        if (z7) {
            bArrArray = ByteBuffer.allocate(256).put(zze(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        zzatu[] zzatuVarArr = new zzauh().zzcG;
        int length3 = zzatuVarArr.length;
        for (int i9 = 0; i9 < 12; i9++) {
            zzatuVarArr[i9].zza(bArrArray, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzatl(str.getBytes("UTF-8")).zza(bArr3);
        }
        return bArr3;
    }
}
