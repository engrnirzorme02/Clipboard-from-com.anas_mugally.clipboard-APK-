package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.C3553a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzhii extends zzhgn implements RandomAccess, zzhip, zzhkb {
    private static final int[] zza;
    private static final zzhii zzb;
    private int[] zzc;
    private int zzd;

    static {
        int[] iArr = new int[0];
        zza = iArr;
        zzb = new zzhii(iArr, 0, false);
    }

    zzhii() {
        this(zza, 0, true);
    }

    public static zzhii zzd() {
        return zzb;
    }

    private static int zzk(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final void zzl(int i7) {
        if (i7 < 0 || i7 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzm(i7));
        }
    }

    private final String zzm(int i7) {
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
        int iIntValue = ((Integer) obj).intValue();
        zzea();
        if (i7 < 0 || i7 > (i8 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzm(i7));
        }
        int i9 = i7 + 1;
        int[] iArr = this.zzc;
        int length = iArr.length;
        if (i8 < length) {
            System.arraycopy(iArr, i7, iArr, i9, i8 - i7);
        } else {
            int[] iArr2 = new int[zzk(length)];
            System.arraycopy(this.zzc, 0, iArr2, 0, i7);
            System.arraycopy(this.zzc, i7, iArr2, i9, this.zzd - i7);
            this.zzc = iArr2;
        }
        this.zzc[i7] = iIntValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzea();
        byte[] bArr = zzhiu.zzb;
        collection.getClass();
        if (!(collection instanceof zzhii)) {
            return super.addAll(collection);
        }
        zzhii zzhiiVar = (zzhii) collection;
        int i7 = zzhiiVar.zzd;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.zzd;
        if (C3553a.e.API_PRIORITY_OTHER - i8 < i7) {
            throw new OutOfMemoryError();
        }
        int i9 = i8 + i7;
        int[] iArr = this.zzc;
        if (i9 > iArr.length) {
            this.zzc = Arrays.copyOf(iArr, i9);
        }
        System.arraycopy(zzhiiVar.zzc, 0, this.zzc, this.zzd, zzhiiVar.zzd);
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
        if (!(obj instanceof zzhii)) {
            return super.equals(obj);
        }
        zzhii zzhiiVar = (zzhii) obj;
        if (this.zzd != zzhiiVar.zzd) {
            return false;
        }
        int[] iArr = zzhiiVar.zzc;
        for (int i7 = 0; i7 < this.zzd; i7++) {
            if (this.zzc[i7] != iArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        zzl(i7);
        return Integer.valueOf(this.zzc[i7]);
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.zzd; i8++) {
            i7 = (i7 * 31) + this.zzc[i8];
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i7 = this.zzd;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.zzc[i8] == iIntValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        zzea();
        zzl(i7);
        int[] iArr = this.zzc;
        int i8 = iArr[i7];
        int i9 = this.zzd;
        if (i7 < i9 - 1) {
            System.arraycopy(iArr, i7 + 1, iArr, i7, (i9 - i7) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i8);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i7, int i8) {
        zzea();
        if (i8 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.zzc;
        System.arraycopy(iArr, i8, iArr, i7, this.zzd - i8);
        this.zzd -= i8 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        return Integer.valueOf(zzg(i7, ((Integer) obj).intValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhit, com.google.android.gms.internal.ads.zzhij
    /* JADX INFO: renamed from: zze */
    public final zzhip zzh(int i7) {
        if (i7 >= this.zzd) {
            return new zzhii(i7 == 0 ? zza : Arrays.copyOf(this.zzc, i7), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.zzhip
    public final int zzf(int i7) {
        zzl(i7);
        return this.zzc[i7];
    }

    @Override // com.google.android.gms.internal.ads.zzhip
    public final int zzg(int i7, int i8) {
        zzea();
        zzl(i7);
        int[] iArr = this.zzc;
        int i9 = iArr[i7];
        iArr[i7] = i8;
        return i9;
    }

    @Override // com.google.android.gms.internal.ads.zzhip
    public final void zzi(int i7) {
        zzea();
        int i8 = this.zzd;
        int length = this.zzc.length;
        if (i8 == length) {
            int[] iArr = new int[zzk(length)];
            System.arraycopy(this.zzc, 0, iArr, 0, this.zzd);
            this.zzc = iArr;
        }
        int[] iArr2 = this.zzc;
        int i9 = this.zzd;
        this.zzd = i9 + 1;
        iArr2[i9] = i7;
    }

    final void zzj(int i7) {
        int length = this.zzc.length;
        if (i7 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new int[Math.max(i7, 10)];
            return;
        }
        while (length < i7) {
            length = zzk(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zzhii(int[] iArr, int i7, boolean z7) {
        super(z7);
        this.zzc = iArr;
        this.zzd = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzi(((Integer) obj).intValue());
        return true;
    }
}
