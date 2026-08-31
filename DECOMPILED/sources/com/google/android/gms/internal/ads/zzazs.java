package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public final class zzazs extends zzazk {
    private MessageDigest zzb;
    private final int zzc;
    private final int zzd;

    public zzazs(int i7) {
        int i8 = i7 >> 3;
        this.zzc = (i7 & 7) > 0 ? i8 + 1 : i8;
        this.zzd = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzazk
    public final byte[] zza(String str) {
        synchronized (this.zza) {
            try {
                MessageDigest messageDigestZzb = zzb();
                this.zzb = messageDigestZzb;
                if (messageDigestZzb == null) {
                    return new byte[0];
                }
                messageDigestZzb.reset();
                this.zzb.update(str.getBytes(Charset.forName("UTF-8")));
                byte[] bArrDigest = this.zzb.digest();
                int length = bArrDigest.length;
                int i7 = this.zzc;
                if (length > i7) {
                    length = i7;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(bArrDigest, 0, bArr, 0, length);
                int i8 = this.zzd & 7;
                if (i8 > 0) {
                    long j7 = 0;
                    for (int i9 = 0; i9 < length; i9++) {
                        if (i9 > 0) {
                            j7 <<= 8;
                        }
                        j7 += (long) (bArr[i9] & 255);
                    }
                    long j8 = j7 >>> (8 - i8);
                    while (true) {
                        i7--;
                        if (i7 < 0) {
                            break;
                        }
                        bArr[i7] = (byte) (255 & j8);
                        j8 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
