package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.C3553a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzhgr extends zzhgn implements RandomAccess, zzhij, zzhkb {
    private static final boolean[] zza;
    private static final zzhgr zzb;
    private boolean[] zzc;
    private int zzd;

    static {
        boolean[] zArr = new boolean[0];
        zza = zArr;
        zzb = new zzhgr(zArr, 0, false);
    }

    zzhgr() {
        this(zza, 0, true);
    }

    public static zzhgr zzd() {
        return zzb;
    }

    private static int zzi(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final void zzj(int i7) {
        if (i7 < 0 || i7 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzk(i7));
        }
    }

    private final String zzk(int i7) {
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
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zzea();
        if (i7 < 0 || i7 > (i8 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzk(i7));
        }
        int i9 = i7 + 1;
        boolean[] zArr = this.zzc;
        int length = zArr.length;
        if (i8 < length) {
            System.arraycopy(zArr, i7, zArr, i9, i8 - i7);
        } else {
            boolean[] zArr2 = new boolean[zzi(length)];
            System.arraycopy(this.zzc, 0, zArr2, 0, i7);
            System.arraycopy(this.zzc, i7, zArr2, i9, this.zzd - i7);
            this.zzc = zArr2;
        }
        this.zzc[i7] = zBooleanValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzea();
        byte[] bArr = zzhiu.zzb;
        collection.getClass();
        if (!(collection instanceof zzhgr)) {
            return super.addAll(collection);
        }
        zzhgr zzhgrVar = (zzhgr) collection;
        int i7 = zzhgrVar.zzd;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.zzd;
        if (C3553a.e.API_PRIORITY_OTHER - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        boolean[] zArr = this.zzc;
        if (i9 > zArr.length) {
            this.zzc = Arrays.copyOf(zArr, i9);
        }
        System.arraycopy(zzhgrVar.zzc, 0, this.zzc, this.zzd, zzhgrVar.zzd);
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
        if (!(obj instanceof zzhgr)) {
            return super.equals(obj);
        }
        zzhgr zzhgrVar = (zzhgr) obj;
        if (this.zzd != zzhgrVar.zzd) {
            return false;
        }
        boolean[] zArr = zzhgrVar.zzc;
        for (int i7 = 0; i7 < this.zzd; i7++) {
            if (this.zzc[i7] != zArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        zzj(i7);
        return Boolean.valueOf(this.zzc[i7]);
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZzb = 1;
        for (int i7 = 0; i7 < this.zzd; i7++) {
            iZzb = (iZzb * 31) + zzhiu.zzb(this.zzc[i7]);
        }
        return iZzb;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i7 = this.zzd;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.zzc[i8] == zBooleanValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        zzea();
        zzj(i7);
        boolean[] zArr = this.zzc;
        boolean z7 = zArr[i7];
        int i8 = this.zzd;
        if (i7 < i8 - 1) {
            System.arraycopy(zArr, i7 + 1, zArr, i7, (i8 - i7) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z7);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i7, int i8) {
        zzea();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzc;
        System.arraycopy(zArr, i8, zArr, i7, this.zzd - i8);
        this.zzd -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zzea();
        zzj(i7);
        boolean[] zArr = this.zzc;
        boolean z7 = zArr[i7];
        zArr[i7] = zBooleanValue;
        return Boolean.valueOf(z7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhit, com.google.android.gms.internal.ads.zzhij
    /* JADX INFO: renamed from: zze */
    public final zzhij zzh(int i7) {
        if (i7 >= this.zzd) {
            return new zzhgr(i7 == 0 ? zza : Arrays.copyOf(this.zzc, i7), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final boolean zzf(int i7) {
        zzj(i7);
        return this.zzc[i7];
    }

    public final void zzg(boolean z7) {
        zzea();
        int i7 = this.zzd;
        int length = this.zzc.length;
        if (i7 == length) {
            boolean[] zArr = new boolean[zzi(length)];
            System.arraycopy(this.zzc, 0, zArr, 0, this.zzd);
            this.zzc = zArr;
        }
        boolean[] zArr2 = this.zzc;
        int i8 = this.zzd;
        this.zzd = i8 + 1;
        zArr2[i8] = z7;
    }

    private zzhgr(boolean[] zArr, int i7, boolean z7) {
        super(z7);
        this.zzc = zArr;
        this.zzd = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Boolean) obj).booleanValue());
        return true;
    }
}
