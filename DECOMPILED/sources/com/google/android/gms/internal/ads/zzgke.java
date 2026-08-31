package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgke extends zzgjv implements Set {
    private transient zzgjz zza;

    zzgke() {
    }

    public static zzgke zzh() {
        return zzglq.zza;
    }

    public static zzgke zzi(Object obj) {
        return new zzgma(obj);
    }

    public static zzgke zzj(Object obj, Object obj2) {
        return zzv(2, obj, obj2);
    }

    public static zzgke zzk(Object obj, Object obj2, Object obj3) {
        return zzv(3, obj, obj2, obj3);
    }

    public static zzgke zzl(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return zzv(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static zzgke zzm(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        int length = objArr.length;
        int i7 = length + 6;
        Object[] objArr2 = new Object[i7];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return zzv(i7, objArr2);
    }

    static int zzn(int i7) {
        int iMax = Math.max(i7, 2);
        if (iMax >= 751619276) {
            zzghc.zzb(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static zzgke zzo(Collection collection) {
        if ((collection instanceof zzgke) && !(collection instanceof SortedSet)) {
            zzgke zzgkeVar = (zzgke) collection;
            if (!zzgkeVar.zzf()) {
                return zzgkeVar;
            }
        }
        Object[] array = collection.toArray();
        return zzv(array.length, array);
    }

    public static zzgke zzp(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? zzv(length, (Object[]) objArr.clone()) : new zzgma(objArr[0]);
        }
        return zzglq.zza;
    }

    public static zzgkd zzs(int i7) {
        return new zzgkd(i7, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzgke zzv(int i7, Object... objArr) {
        if (i7 == 0) {
            return zzglq.zza;
        }
        if (i7 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzgma(obj);
        }
        int iZzn = zzn(i7);
        Object[] objArr2 = new Object[iZzn];
        int i8 = iZzn - 1;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            Object obj2 = objArr[i11];
            zzgli.zzb(obj2, i11);
            int iHashCode = obj2.hashCode();
            int iZza = zzgjs.zza(iHashCode);
            while (true) {
                int i12 = iZza & i8;
                Object obj3 = objArr2[i12];
                if (obj3 == null) {
                    objArr[i10] = obj2;
                    objArr2[i12] = obj2;
                    i9 += iHashCode;
                    i10++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iZza++;
            }
        }
        Arrays.fill(objArr, i10, i7, (Object) null);
        if (i10 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzgma(obj4);
        }
        if (zzn(i10) < iZzn / 2) {
            return zzv(i10, objArr);
        }
        if (zzw(i10, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i10);
        }
        return new zzglq(objArr, i9, objArr2, i8, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzw(int i7, int i8) {
        return i7 < (i8 >> 1) + (i8 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzgke) && zzq() && ((zzgke) obj).zzq() && hashCode() != obj.hashCode()) {
            return false;
        }
        return zzglz.zzd(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzglz.zzc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgjv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public abstract zzgmd iterator();

    @Override // com.google.android.gms.internal.ads.zzgjv
    public zzgjz zze() {
        zzgjz zzgjzVar = this.zza;
        if (zzgjzVar != null) {
            return zzgjzVar;
        }
        zzgjz zzgjzVarZzr = zzr();
        this.zza = zzgjzVarZzr;
        return zzgjzVarZzr;
    }

    boolean zzq() {
        return false;
    }

    zzgjz zzr() {
        Object[] array = toArray();
        int i7 = zzgjz.zzd;
        return zzgjz.zzt(array, array.length);
    }
}
