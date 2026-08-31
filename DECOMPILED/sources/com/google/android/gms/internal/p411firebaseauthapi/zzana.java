package com.google.android.gms.internal.p411firebaseauthapi;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzana<E> extends zzajp<E> implements RandomAccess {
    private static final Object[] zza;
    private static final zzana<Object> zzb;
    private E[] zzc;
    private int zzd;

    static {
        Object[] objArr = new Object[0];
        zza = objArr;
        zzb = new zzana<>(objArr, 0, false);
    }

    zzana() {
        this(zza, 0, true);
    }

    private static int zzb(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final String zzc(int i7) {
        return "Index:" + i7 + ", Size:" + this.zzd;
    }

    public static <E> zzana<E> zzd() {
        return (zzana<E>) zzb;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzajp, java.util.AbstractList, java.util.List
    public final void add(int i7, E e7) {
        int i8;
        zza();
        if (i7 < 0 || i7 > (i8 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzc(i7));
        }
        E[] eArr = this.zzc;
        if (i8 < eArr.length) {
            System.arraycopy(eArr, i7, eArr, i7 + 1, i8 - i7);
        } else {
            E[] eArr2 = (E[]) new Object[zzb(eArr.length)];
            System.arraycopy(this.zzc, 0, eArr2, 0, i7);
            System.arraycopy(this.zzc, i7, eArr2, i7 + 1, this.zzd - i7);
            this.zzc = eArr2;
        }
        this.zzc[i7] = e7;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i7) {
        zzd(i7);
        return this.zzc[i7];
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzajp, java.util.AbstractList, java.util.List
    public final E remove(int i7) {
        zza();
        zzd(i7);
        E[] eArr = this.zzc;
        E e7 = eArr[i7];
        int i8 = this.zzd;
        if (i7 < i8 - 1) {
            System.arraycopy(eArr, i7 + 1, eArr, i7, (i8 - i7) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return e7;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzajp, java.util.AbstractList, java.util.List
    public final E set(int i7, E e7) {
        zza();
        zzd(i7);
        E[] eArr = this.zzc;
        E e8 = eArr[i7];
        eArr[i7] = e7;
        ((AbstractList) this).modCount++;
        return e8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzalm
    public final /* synthetic */ zzalm zza(int i7) {
        if (i7 >= this.zzd) {
            return new zzana(i7 == 0 ? zza : Arrays.copyOf(this.zzc, i7), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    private zzana(E[] eArr, int i7, boolean z7) {
        super(z7);
        this.zzc = eArr;
        this.zzd = i7;
    }

    private final void zzd(int i7) {
        if (i7 < 0 || i7 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzc(i7));
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzajp, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e7) {
        zza();
        int i7 = this.zzd;
        E[] eArr = this.zzc;
        if (i7 == eArr.length) {
            this.zzc = (E[]) Arrays.copyOf(this.zzc, zzb(eArr.length));
        }
        E[] eArr2 = this.zzc;
        int i8 = this.zzd;
        this.zzd = i8 + 1;
        eArr2[i8] = e7;
        ((AbstractList) this).modCount++;
        return true;
    }
}
