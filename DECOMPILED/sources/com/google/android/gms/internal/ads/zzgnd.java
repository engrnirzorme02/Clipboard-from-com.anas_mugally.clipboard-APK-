package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.Spliterators;

/* JADX INFO: loaded from: classes2.dex */
final class zzgnd extends AbstractList implements RandomAccess, Serializable {
    final int[] zza;
    final int zzb;
    final int zzc;

    zzgnd(int[] iArr, int i7, int i8) {
        this.zza = iArr;
        this.zzb = i7;
        this.zzc = i8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && zzgne.zzi(this.zza, ((Integer) obj).intValue(), this.zzb, this.zzc) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgnd)) {
            return super.equals(obj);
        }
        zzgnd zzgndVar = (zzgnd) obj;
        int i7 = this.zzc;
        int i8 = this.zzb;
        int i9 = zzgndVar.zzc;
        int i10 = zzgndVar.zzb;
        int i11 = i7 - i8;
        if (i9 - i10 != i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.zza[i8 + i12] != zzgndVar.zza[i10 + i12]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i7) {
        int i8 = this.zzc;
        int i9 = this.zzb;
        zzghc.zzm(i7, i8 - i9, "index");
        return Integer.valueOf(this.zza[i9 + i7]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashCode = 1;
        for (int i7 = this.zzb; i7 < this.zzc; i7++) {
            iHashCode = (iHashCode * 31) + Integer.hashCode(this.zza[i7]);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int[] iArr = this.zza;
        int iIntValue = ((Integer) obj).intValue();
        int i7 = this.zzb;
        int iZzi = zzgne.zzi(iArr, iIntValue, i7, this.zzc);
        if (iZzi >= 0) {
            return iZzi - i7;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.zza;
            int iIntValue = ((Integer) obj).intValue();
            int i7 = this.zzb;
            int i8 = this.zzc - 1;
            while (i8 >= i7) {
                if (iArr[i8] != iIntValue) {
                    i8--;
                } else if (i8 >= 0) {
                    return i8 - i7;
                }
            }
            i8 = -1;
            if (i8 >= 0) {
                return i8 - i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        int i8 = this.zzc;
        int i9 = this.zzb;
        Integer num = (Integer) obj;
        zzghc.zzm(i7, i8 - i9, "index");
        int[] iArr = this.zza;
        int i10 = i9 + i7;
        int i11 = iArr[i10];
        num.getClass();
        iArr[i10] = num.intValue();
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc - this.zzb;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return Spliterators.spliterator(this.zza, this.zzb, this.zzc, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i7, int i8) {
        int i9 = this.zzc;
        int i10 = this.zzb;
        zzghc.zzo(i7, i8, i9 - i10);
        return i7 == i8 ? Collections.EMPTY_LIST : new zzgnd(this.zza, i7 + i10, i10 + i8);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        int i7 = this.zzc;
        int i8 = this.zzb;
        StringBuilder sb = new StringBuilder((i7 - i8) * 5);
        sb.append('[');
        int[] iArr = this.zza;
        sb.append(iArr[i8]);
        while (true) {
            i8++;
            if (i8 >= i7) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i8]);
        }
    }
}
