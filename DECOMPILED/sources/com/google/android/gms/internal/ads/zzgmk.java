package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgmk {
    private static final zzgmk zza = new zzgmh("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final zzgmk zzb = new zzgmh("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    private static final zzgmk zzc;

    static {
        new zzgmj("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new zzgmj("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        zzc = new zzgmg("base16()", "0123456789ABCDEF");
    }

    zzgmk() {
    }

    public static zzgmk zzl() {
        return zza;
    }

    public static zzgmk zzm() {
        return zzb;
    }

    public static zzgmk zzn() {
        return zzc;
    }

    abstract void zza(Appendable appendable, byte[] bArr, int i7, int i8);

    abstract int zzb(byte[] bArr, CharSequence charSequence);

    abstract int zzd(int i7);

    abstract int zzf(int i7);

    CharSequence zzg(CharSequence charSequence) {
        throw null;
    }

    public abstract zzgmk zzh();

    public abstract zzgmk zzi();

    public final String zzj(byte[] bArr, int i7, int i8) {
        zzghc.zzo(0, i8, bArr.length);
        StringBuilder sb = new StringBuilder(zzd(i8));
        try {
            zza(sb, bArr, 0, i8);
            return sb.toString();
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }

    public final byte[] zzk(CharSequence charSequence) {
        try {
            CharSequence charSequenceZzg = zzg(charSequence);
            int iZzf = zzf(charSequenceZzg.length());
            byte[] bArr = new byte[iZzf];
            int iZzb = zzb(bArr, charSequenceZzg);
            if (iZzb == iZzf) {
                return bArr;
            }
            byte[] bArr2 = new byte[iZzb];
            System.arraycopy(bArr, 0, bArr2, 0, iZzb);
            return bArr2;
        } catch (zzgmi e7) {
            throw new IllegalArgumentException(e7);
        }
    }
}
