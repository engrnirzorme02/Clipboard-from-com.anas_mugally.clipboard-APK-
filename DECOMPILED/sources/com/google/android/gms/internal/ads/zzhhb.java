package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.C3553a;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzhhb implements Iterable<Byte>, Serializable {
    public static final zzhhb zzb = new zzhgz(zzhiu.zzb);
    private int zza = 0;

    static {
        int i7 = zzhgo.zza;
    }

    zzhhb() {
    }

    static int zzA(int i7, int i8, int i9) {
        int i10 = i8 - i7;
        if ((i7 | i8 | i10 | (i9 - i8)) >= 0) {
            return i10;
        }
        if (i7 < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 21);
            sb.append("Beginning index: ");
            sb.append(i7);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i8 < i7) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 44 + String.valueOf(i8).length());
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i7);
            sb2.append(", ");
            sb2.append(i8);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i8).length() + 15 + String.valueOf(i9).length());
        sb3.append("End index: ");
        sb3.append(i8);
        sb3.append(" >= ");
        sb3.append(i9);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    private static zzhhb zzd(Iterator it, int i7) {
        if (i7 <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i7)));
        }
        if (i7 == 1) {
            return (zzhhb) it.next();
        }
        int i8 = i7 >>> 1;
        zzhhb zzhhbVarZzd = zzd(it, i8);
        zzhhb zzhhbVarZzd2 = zzd(it, i7 - i8);
        if (C3553a.e.API_PRIORITY_OTHER - zzhhbVarZzd.zzc() >= zzhhbVarZzd2.zzc()) {
            return zzhkj.zzd(zzhhbVarZzd, zzhhbVarZzd2);
        }
        int iZzc = zzhhbVarZzd.zzc();
        int iZzc2 = zzhhbVarZzd2.zzc();
        StringBuilder sb = new StringBuilder(String.valueOf(iZzc).length() + 31 + String.valueOf(iZzc2).length());
        sb.append("ByteString would be too long: ");
        sb.append(iZzc);
        sb.append("+");
        sb.append(iZzc2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static zzhhb zzr(byte[] bArr, int i7, int i8) {
        zzA(i7, i7 + i8, bArr.length);
        byte[] bArr2 = new byte[i8];
        System.arraycopy(bArr, i7, bArr2, 0, i8);
        return new zzhgz(bArr2);
    }

    public static zzhhb zzs(String str) {
        return new zzhgz(str.getBytes(zzhiu.zza));
    }

    public static zzhhb zzt(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? zzb : zzd(iterable.iterator(), size);
    }

    public static zzhha zzx() {
        return new zzhha(128);
    }

    static void zzz(int i7, int i8) {
        if (((i8 - (i7 + 1)) | i7) < 0) {
            if (i7 < 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 11);
                sb.append("Index < 0: ");
                sb.append(i7);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 18 + String.valueOf(i8).length());
            sb2.append("Index > length: ");
            sb2.append(i7);
            sb2.append(", ");
            sb2.append(i8);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzo = this.zza;
        if (iZzo == 0) {
            int iZzc = zzc();
            iZzo = zzo(iZzc, 0, iZzc);
            if (iZzo == 0) {
                iZzo = 1;
            }
            this.zza = iZzo;
        }
        return iZzo;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzc()), zzc() <= 50 ? zzhkt.zza(this) : zzhkt.zza(zzi(0, 47)).concat("..."));
    }

    public abstract byte zza(int i7);

    abstract byte zzb(int i7);

    public abstract int zzc();

    protected abstract void zze(byte[] bArr, int i7, int i8, int i9);

    protected abstract int zzf();

    protected abstract boolean zzg();

    public abstract zzhhb zzi(int i7, int i8);

    public abstract ByteBuffer zzj();

    abstract void zzk(zzhgs zzhgsVar);

    protected abstract String zzl(Charset charset);

    public abstract boolean zzm();

    protected abstract int zzn(int i7, int i8, int i9);

    protected abstract int zzo(int i7, int i8, int i9);

    public abstract zzhhg zzp();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: zzq, reason: merged with bridge method [inline-methods] */
    public zzhgw iterator() {
        return new zzhgt(this);
    }

    @Deprecated
    public final void zzu(byte[] bArr, int i7, int i8, int i9) {
        zzA(0, i9, zzc());
        zzA(i8, i8 + i9, bArr.length);
        if (i9 > 0) {
            zze(bArr, 0, i8, i9);
        }
    }

    public final byte[] zzv() {
        int iZzc = zzc();
        if (iZzc == 0) {
            return zzhiu.zzb;
        }
        byte[] bArr = new byte[iZzc];
        zze(bArr, 0, 0, iZzc);
        return bArr;
    }

    public final String zzw() {
        return zzc() == 0 ? "" : zzl(zzhiu.zza);
    }

    protected final int zzy() {
        return this.zza;
    }
}
