package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfxt {
    private MessageDigest zza;
    private final zzgea zzb;
    private final Object zzc = new Object();
    private boolean zzd = false;
    private SecureRandom zze;

    public zzfxt(zzgea zzgeaVar) {
        this.zzb = zzgeaVar;
    }

    public final void zza() {
        if (zzc()) {
            return;
        }
        zzb(new SecureRandom());
    }

    final synchronized void zzb(SecureRandom secureRandom) {
        zzgdy zzgdyVarZza = this.zzb.zza(202);
        try {
            try {
                try {
                    zzgdyVarZza.zza();
                    this.zze = secureRandom;
                    this.zza = MessageDigest.getInstance("MD5");
                    this.zzd = true;
                } catch (Throwable th) {
                    zzgdyVarZza.zzb(th);
                    throw th;
                }
            } catch (NoSuchAlgorithmException e7) {
                zzgdyVarZza.zzb(e7);
            }
            zzgdyVarZza.zzc();
        } catch (Throwable th2) {
            zzgdyVarZza.zzc();
            throw th2;
        }
    }

    public final synchronized boolean zzc() {
        return this.zzd;
    }

    final byte[] zzd(byte[] bArr, String str, boolean z7) {
        int length = bArr.length;
        int i7 = true != z7 ? 255 : 239;
        zzghc.zza(length <= i7);
        ByteBuffer byteBufferPut = ByteBuffer.allocate(i7 + 1).put((byte) length);
        if (length < i7) {
            int i8 = i7 - length;
            byte[] bArr2 = new byte[i8];
            this.zze.nextBytes(bArr2);
            bArr = Arrays.copyOf(bArr, length + i8);
            System.arraycopy(bArr2, 0, bArr, length, i8);
        }
        byte[] bArrArray = byteBufferPut.put(bArr).array();
        if (z7) {
            bArrArray = ByteBuffer.allocate(256).put(zze(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        zzfxw[] zzfxwVarArr = new zzfyj().zzcG;
        int length2 = zzfxwVarArr.length;
        for (int i9 = 0; i9 < 12; i9++) {
            zzfxwVarArr[i9].zza(bArrArray, bArr3);
        }
        if (!zzghs.zzc(str)) {
            new zzfxv(str.length() > 32 ? str.substring(0, 32).getBytes(StandardCharsets.UTF_8) : str.getBytes(StandardCharsets.UTF_8)).zza(bArr3);
        }
        return bArr3;
    }

    public final byte[] zze(byte[] bArr) {
        byte[] bArrDigest;
        synchronized (this.zzc) {
            this.zza.reset();
            this.zza.update(bArr);
            bArrDigest = this.zza.digest();
        }
        return bArrDigest;
    }

    public final zzatj zzf(byte[] bArr, String str) {
        zzatj zzatjVarZza = zzatk.zza();
        byte[] bArrZze = zze(bArr);
        zzhhb zzhhbVar = zzhhb.zzb;
        zzatjVarZza.zzb(zzhhb.zzr(bArrZze, 0, bArrZze.length));
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (true) {
            int length = bArr.length;
            if (i7 >= ((length - 1) / 255) + 1) {
                break;
            }
            int i8 = i7 * 255;
            int i9 = i8 + 255;
            if (length > i9) {
                length = i9;
            }
            arrayList.add(Arrays.copyOfRange(bArr, i8, length));
            i7++;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zzatjVarZza.zza(zzhhb.zzr(zzd((byte[]) it.next(), str, false), 0, 256));
        }
        return zzatjVarZza;
    }

    public final String zzg(int i7, String str) {
        zzarw zzarwVarZzi = zzast.zzi();
        zzarwVarZzi.zzl(i7);
        return Base64.encodeToString(zzd(((zzast) zzarwVarZzi.zzbu()).zzaN(), str, true), 11);
    }
}
