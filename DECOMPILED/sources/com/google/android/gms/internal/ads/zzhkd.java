package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzhkd extends zzhgn implements RandomAccess {
    private static final Object[] zza;
    private static final zzhkd zzb;
    private Object[] zzc;
    private int zzd;

    static {
        Object[] objArr = new Object[0];
        zza = objArr;
        zzb = new zzhkd(objArr, 0, false);
    }

    zzhkd() {
        this(zza, 0, true);
    }

    public static zzhkd zzd() {
        return zzb;
    }

    private static int zzf(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final void zzg(int i7) {
        if (i7 < 0 || i7 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzi(i7));
        }
    }

    private final String zzi(int i7) {
        int i8 = this.zzd;
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 13 + String.valueOf(i8).length());
        sb.append("Index:");
        sb.append(i7);
        sb.append(", Size:");
        sb.append(i8);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i8;
        zzea();
        if (i7 < 0 || i7 > (i8 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzi(i7));
        }
        int i9 = i7 + 1;
        Object[] objArr = this.zzc;
        int length = objArr.length;
        if (i8 < length) {
            System.arraycopy(objArr, i7, objArr, i9, i8 - i7);
        } else {
            Object[] objArr2 = new Object[zzf(length)];
            System.arraycopy(this.zzc, 0, objArr2, 0, i7);
            System.arraycopy(this.zzc, i7, objArr2, i9, this.zzd - i7);
            this.zzc = objArr2;
        }
        this.zzc[i7] = obj;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        zzg(i7);
        return this.zzc[i7];
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        zzea();
        zzg(i7);
        Object[] objArr = this.zzc;
        Object obj = objArr[i7];
        int i8 = this.zzd;
        if (i7 < i8 - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (i8 - i7) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        zzea();
        zzg(i7);
        Object[] objArr = this.zzc;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    final void zze(int i7) {
        int length = this.zzc.length;
        if (i7 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new Object[Math.max(i7, 10)];
            return;
        }
        while (length < i7) {
            length = zzf(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    @Override // com.google.android.gms.internal.ads.zzhit, com.google.android.gms.internal.ads.zzhij
    public final /* bridge */ /* synthetic */ zzhit zzh(int i7) {
        if (i7 >= this.zzd) {
            return new zzhkd(i7 == 0 ? zza : Arrays.copyOf(this.zzc, i7), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    private zzhkd(Object[] objArr, int i7, boolean z7) {
        super(z7);
        this.zzc = objArr;
        this.zzd = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zzea();
        int i7 = this.zzd;
        int length = this.zzc.length;
        if (i7 == length) {
            this.zzc = Arrays.copyOf(this.zzc, zzf(length));
        }
        Object[] objArr = this.zzc;
        int i8 = this.zzd;
        this.zzd = i8 + 1;
        objArr[i8] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
