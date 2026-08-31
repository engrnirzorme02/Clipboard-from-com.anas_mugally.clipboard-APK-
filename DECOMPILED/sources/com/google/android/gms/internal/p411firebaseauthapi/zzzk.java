package com.google.android.gms.internal.p411firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zzzk implements zzba {
    private final zzaaa zza;
    private final zzcc zzb;
    private final int zzc;
    private final byte[] zzd;

    private zzzk(zzaaa zzaaaVar, zzcc zzccVar, int i7, byte[] bArr) {
        this.zza = zzaaaVar;
        this.zzb = zzccVar;
        this.zzc = i7;
        this.zzd = bArr;
    }

    public static zzba zza(zzdd zzddVar) {
        return new zzzk(new zzyu(zzddVar.zzf().zza(zzbf.zza()), ((zzdi) ((zzcy) zzddVar.zza())).zzd()), new zzaag(new zzaae("HMAC" + String.valueOf(((zzdi) ((zzcy) zzddVar.zza())).zzg()), new SecretKeySpec(zzddVar.zzg().zza(zzbf.zza()), "HMAC")), ((zzdi) ((zzcy) zzddVar.zza())).zze()), ((zzdi) ((zzcy) zzddVar.zza())).zze(), zzddVar.zzd().zzb());
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzba
    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        byte[] bArrZzb = this.zza.zzb(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return zzyz.zza(this.zzd, bArrZzb, this.zzb.zza(zzyz.zza(bArr2, bArrZzb, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8))));
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzba
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i7 = this.zzc;
        byte[] bArr3 = this.zzd;
        if (length >= i7 + bArr3.length) {
            if (zzqn.zza(bArr3, bArr)) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, this.zzd.length, bArr.length - this.zzc);
                byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.zzc, bArr.length);
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                this.zzb.zza(bArrCopyOfRange2, zzyz.zza(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8)));
                return this.zza.zza(bArrCopyOfRange);
            }
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
    }
}
