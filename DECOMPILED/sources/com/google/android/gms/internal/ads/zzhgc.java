package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhgc implements zzhbw {
    private final ThreadLocal zza;
    private final String zzb;
    private final Key zzc;
    private final int zzd;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    public zzhgc(String str, Key key) throws GeneralSecurityException {
        byte b7;
        int i7;
        zzhgb zzhgbVar = new zzhgb(this);
        this.zza = zzhgbVar;
        if (!zzgxd.zza(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zzb = str;
        this.zzc = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str) {
            case "HMACSHA1":
                b7 = 0;
                break;
            case "HMACSHA224":
                b7 = 1;
                break;
            case "HMACSHA256":
                b7 = 2;
                break;
            case "HMACSHA384":
                b7 = 3;
                break;
            case "HMACSHA512":
                b7 = 4;
                break;
            default:
                b7 = -1;
                break;
        }
        if (b7 == 0) {
            i7 = 20;
        } else if (b7 == 1) {
            i7 = 28;
        } else if (b7 == 2) {
            i7 = 32;
        } else if (b7 == 3) {
            i7 = 48;
        } else {
            if (b7 != 4) {
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
            }
            i7 = 64;
        }
        this.zzd = i7;
        zzhgbVar.get();
    }

    @Override // com.google.android.gms.internal.ads.zzhbw
    public final byte[] zza(byte[] bArr, int i7) throws InvalidAlgorithmParameterException {
        if (i7 > this.zzd) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ThreadLocal threadLocal = this.zza;
        ((Mac) threadLocal.get()).update(bArr);
        return Arrays.copyOf(((Mac) threadLocal.get()).doFinal(), i7);
    }

    final /* synthetic */ String zzb() {
        return this.zzb;
    }

    final /* synthetic */ Key zzc() {
        return this.zzc;
    }
}
