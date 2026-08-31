package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.android.gms.common.api.C3553a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzaks extends zzajp<Double> implements zzalm<Double>, RandomAccess {
    private static final double[] zza;
    private double[] zzb;
    private int zzc;

    static {
        double[] dArr = new double[0];
        zza = dArr;
        new zzaks(dArr, 0, false);
    }

    zzaks() {
        this(zza, 0, true);
    }

    private static int zzd(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final String zze(int i7) {
        return "Index:" + i7 + ", Size:" + this.zzc;
    }

    private final void zzf(int i7) {
        if (i7 < 0 || i7 >= this.zzc) {
            throw new IndexOutOfBoundsException(zze(i7));
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzajp, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i8;
        double dDoubleValue = ((Double) obj).doubleValue();
        zza();
        if (i7 < 0 || i7 > (i8 = this.zzc)) {
            throw new IndexOutOfBoundsException(zze(i7));
        }
        double[] dArr = this.zzb;
        if (i8 < dArr.length) {
            System.arraycopy(dArr, i7, dArr, i7 + 1, i8 - i7);
        } else {
            double[] dArr2 = new double[zzd(dArr.length)];
            System.arraycopy(this.zzb, 0, dArr2, 0, i7);
            System.arraycopy(this.zzb, i7, dArr2, i7 + 1, this.zzc - i7);
            this.zzb = dArr2;
        }
        this.zzb[i7] = dDoubleValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzajp, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        zza();
        zzalh.zza(collection);
        if (!(collection instanceof zzaks)) {
            return super.addAll(collection);
        }
        zzaks zzaksVar = (zzaks) collection;
        int i7 = zzaksVar.zzc;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.zzc;
        if (C3553a.e.API_PRIORITY_OTHER - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        double[] dArr = this.zzb;
        if (i9 > dArr.length) {
            this.zzb = Arrays.copyOf(dArr, i9);
        }
        System.arraycopy(zzaksVar.zzb, 0, this.zzb, this.zzc, zzaksVar.zzc);
        this.zzc = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzajp, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaks)) {
            return super.equals(obj);
        }
        zzaks zzaksVar = (zzaks) obj;
        if (this.zzc != zzaksVar.zzc) {
            return false;
        }
        double[] dArr = zzaksVar.zzb;
        for (int i7 = 0; i7 < this.zzc; i7++) {
            if (Double.doubleToLongBits(this.zzb[i7]) != Double.doubleToLongBits(dArr[i7])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        return Double.valueOf(zzb(i7));
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzajp, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZza = 1;
        for (int i7 = 0; i7 < this.zzc; i7++) {
            iZza = (iZza * 31) + zzalh.zza(Double.doubleToLongBits(this.zzb[i7]));
        }
        return iZza;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (this.zzb[i7] == dDoubleValue) {
                return i7;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzajp, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i7) {
        zza();
        zzf(i7);
        double[] dArr = this.zzb;
        double d7 = dArr[i7];
        int i8 = this.zzc;
        if (i7 < i8 - 1) {
            System.arraycopy(dArr, i7 + 1, dArr, i7, (i8 - i7) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d7);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i7, int i8) {
        zza();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.zzb;
        System.arraycopy(dArr, i8, dArr, i7, this.zzc - i8);
        this.zzc -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzajp, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i7, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        zza();
        zzf(i7);
        double[] dArr = this.zzb;
        double d7 = dArr[i7];
        dArr[i7] = dDoubleValue;
        return Double.valueOf(d7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzalm
    public final /* synthetic */ zzalm<Double> zza(int i7) {
        if (i7 >= this.zzc) {
            return new zzaks(i7 == 0 ? zza : Arrays.copyOf(this.zzb, i7), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final double zzb(int i7) {
        zzf(i7);
        return this.zzb[i7];
    }

    final void zzc(int i7) {
        double[] dArr = this.zzb;
        if (i7 <= dArr.length) {
            return;
        }
        if (dArr.length == 0) {
            this.zzb = new double[Math.max(i7, 10)];
            return;
        }
        int length = dArr.length;
        while (length < i7) {
            length = zzd(length);
        }
        this.zzb = Arrays.copyOf(this.zzb, length);
    }

    private zzaks(double[] dArr, int i7, boolean z7) {
        super(z7);
        this.zzb = dArr;
        this.zzc = i7;
    }

    public final void zza(double d7) {
        zza();
        int i7 = this.zzc;
        double[] dArr = this.zzb;
        if (i7 == dArr.length) {
            double[] dArr2 = new double[zzd(dArr.length)];
            System.arraycopy(this.zzb, 0, dArr2, 0, this.zzc);
            this.zzb = dArr2;
        }
        double[] dArr3 = this.zzb;
        int i8 = this.zzc;
        this.zzc = i8 + 1;
        dArr3[i8] = d7;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzajp, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zza(((Double) obj).doubleValue());
        return true;
    }
}
