package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.C3553a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzhho extends zzhgn implements RandomAccess, zzhik, zzhkb {
    private static final double[] zza;
    private static final zzhho zzb;
    private double[] zzc;
    private int zzd;

    static {
        double[] dArr = new double[0];
        zza = dArr;
        zzb = new zzhho(dArr, 0, false);
    }

    zzhho() {
        this(zza, 0, true);
    }

    public static zzhho zzd() {
        return zzb;
    }

    private static int zzj(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final void zzk(int i7) {
        if (i7 < 0 || i7 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzl(i7));
        }
    }

    private final String zzl(int i7) {
        int i8 = this.zzd;
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 13 + String.valueOf(i8).length());
        sb.append("Index:");
        sb.append(i7);
        sb.append(", Size:");
        sb.append(i8);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i8;
        double dDoubleValue = ((Double) obj).doubleValue();
        zzea();
        if (i7 < 0 || i7 > (i8 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzl(i7));
        }
        int i9 = i7 + 1;
        double[] dArr = this.zzc;
        int length = dArr.length;
        if (i8 < length) {
            System.arraycopy(dArr, i7, dArr, i9, i8 - i7);
        } else {
            double[] dArr2 = new double[zzj(length)];
            System.arraycopy(this.zzc, 0, dArr2, 0, i7);
            System.arraycopy(this.zzc, i7, dArr2, i9, this.zzd - i7);
            this.zzc = dArr2;
        }
        this.zzc[i7] = dDoubleValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzea();
        byte[] bArr = zzhiu.zzb;
        collection.getClass();
        if (!(collection instanceof zzhho)) {
            return super.addAll(collection);
        }
        zzhho zzhhoVar = (zzhho) collection;
        int i7 = zzhhoVar.zzd;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.zzd;
        if (C3553a.e.API_PRIORITY_OTHER - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        double[] dArr = this.zzc;
        if (i9 > dArr.length) {
            this.zzc = Arrays.copyOf(dArr, i9);
        }
        System.arraycopy(zzhhoVar.zzc, 0, this.zzc, this.zzd, zzhhoVar.zzd);
        this.zzd = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhho)) {
            return super.equals(obj);
        }
        zzhho zzhhoVar = (zzhho) obj;
        if (this.zzd != zzhhoVar.zzd) {
            return false;
        }
        double[] dArr = zzhhoVar.zzc;
        for (int i7 = 0; i7 < this.zzd; i7++) {
            if (Double.doubleToLongBits(this.zzc[i7]) != Double.doubleToLongBits(dArr[i7])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        zzk(i7);
        return Double.valueOf(this.zzc[i7]);
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.zzd; i8++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.zzc[i8]);
            byte[] bArr = zzhiu.zzb;
            i7 = (i7 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i7 = this.zzd;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.zzc[i8] == dDoubleValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        zzea();
        zzk(i7);
        double[] dArr = this.zzc;
        double d7 = dArr[i7];
        int i8 = this.zzd;
        if (i7 < i8 - 1) {
            System.arraycopy(dArr, i7 + 1, dArr, i7, (i8 - i7) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d7);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i7, int i8) {
        zzea();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.zzc;
        System.arraycopy(dArr, i8, dArr, i7, this.zzd - i8);
        this.zzd -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        zzea();
        zzk(i7);
        double[] dArr = this.zzc;
        double d7 = dArr[i7];
        dArr[i7] = dDoubleValue;
        return Double.valueOf(d7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhit, com.google.android.gms.internal.ads.zzhij
    /* JADX INFO: renamed from: zze */
    public final zzhik zzh(int i7) {
        if (i7 >= this.zzd) {
            return new zzhho(i7 == 0 ? zza : Arrays.copyOf(this.zzc, i7), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final double zzf(int i7) {
        zzk(i7);
        return this.zzc[i7];
    }

    public final void zzg(double d7) {
        zzea();
        int i7 = this.zzd;
        int length = this.zzc.length;
        if (i7 == length) {
            double[] dArr = new double[zzj(length)];
            System.arraycopy(this.zzc, 0, dArr, 0, this.zzd);
            this.zzc = dArr;
        }
        double[] dArr2 = this.zzc;
        int i8 = this.zzd;
        this.zzd = i8 + 1;
        dArr2[i8] = d7;
    }

    final void zzi(int i7) {
        int length = this.zzc.length;
        if (i7 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new double[Math.max(i7, 10)];
            return;
        }
        while (length < i7) {
            length = zzj(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zzhho(double[] dArr, int i7, boolean z7) {
        super(z7);
        this.zzc = dArr;
        this.zzd = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Double) obj).doubleValue());
        return true;
    }
}
