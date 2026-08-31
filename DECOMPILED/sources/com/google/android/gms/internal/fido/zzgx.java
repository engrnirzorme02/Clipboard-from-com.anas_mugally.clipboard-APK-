package com.google.android.gms.internal.fido;

import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgx implements Iterable<Byte>, Serializable {
    private static final Comparator zza;
    public static final zzgx zzb = new zzgu(zzhc.zzd);
    private static final zzgw zzd;
    private int zzc = 0;

    static {
        int i7 = zzgn.zza;
        zzd = new zzgw(null);
        zza = new zzgp();
    }

    zzgx() {
    }

    static int zzj(int i7, int i8, int i9) {
        int i10 = i8 - i7;
        if ((i7 | i8 | i10 | (i9 - i8)) >= 0) {
            return i10;
        }
        if (i7 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i7 + " < 0");
        }
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i7 + ", " + i8);
        }
        throw new IndexOutOfBoundsException("End index: " + i8 + " >= " + i9);
    }

    public static zzgx zzl(byte[] bArr, int i7, int i8) {
        zzj(0, i8, bArr.length);
        byte[] bArr2 = new byte[i8];
        System.arraycopy(bArr, 0, bArr2, 0, i8);
        return new zzgu(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzf = this.zzc;
        if (iZzf == 0) {
            int iZzd = zzd();
            iZzf = zzf(iZzd, 0, iZzd);
            if (iZzf == 0) {
                iZzf = 1;
            }
            this.zzc = iZzf;
        }
        return iZzf;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new zzgo(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzd()), zzd() <= 50 ? zzhe.zza(this) : zzhe.zza(zzg(0, 47)).concat("..."));
    }

    public abstract byte zza(int i7);

    abstract byte zzb(int i7);

    public abstract int zzd();

    protected abstract void zze(byte[] bArr, int i7, int i8, int i9);

    protected abstract int zzf(int i7, int i8, int i9);

    public abstract zzgx zzg(int i7, int i8);

    public abstract InputStream zzh();

    public abstract ByteBuffer zzi();

    protected final int zzk() {
        return this.zzc;
    }

    public final byte[] zzm() {
        int iZzd = zzd();
        if (iZzd == 0) {
            return zzhc.zzd;
        }
        byte[] bArr = new byte[iZzd];
        zze(bArr, 0, 0, iZzd);
        return bArr;
    }
}
