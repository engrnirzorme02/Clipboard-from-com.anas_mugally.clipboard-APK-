package com.google.android.gms.internal.p411firebaseauthapi;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzah<E> extends zzag<E> implements List<E>, RandomAccess {
    private static final zzax<Object> zza = new zzaj(zzap.zza, 0);

    zzah() {
    }

    static <E> zzah<E> zzb(Object[] objArr, int i7) {
        return i7 == 0 ? (zzah<E>) zzap.zza : new zzap(objArr, i7);
    }

    public static <E> zzak<E> zzf() {
        return new zzak<>();
    }

    public static <E> zzah<E> zzg() {
        return (zzah<E>) zzap.zza;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i7, E e7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i7, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzag, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == zzu.zza(this)) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i7 = 0; i7 < size; i7++) {
                        if (Objects.equals(get(i7), list.get(i7))) {
                        }
                    }
                    return true;
                }
                int size2 = size();
                Iterator<E> it = list.iterator();
                int i8 = 0;
                while (i8 < size2) {
                    if (it.hasNext()) {
                        E e7 = get(i8);
                        i8++;
                        if (Objects.equals(e7, it.next())) {
                        }
                    }
                }
                if (!it.hasNext()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i7 = 1;
        for (int i8 = 0; i8 < size; i8++) {
            i7 = ~(~((i7 * 31) + get(i8).hashCode()));
        }
        return i7;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (obj.equals(get(i7))) {
                return i7;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzag, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator() {
        return (zzax) listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i7, E e7) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzag
    int zza(Object[] objArr, int i7) {
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            objArr[i7 + i8] = get(i8);
        }
        return i7 + size;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzag
    @Deprecated
    public final zzah<E> zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzag
    /* JADX INFO: renamed from: zzd */
    public final zzay<E> iterator() {
        return (zzax) listIterator();
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator(int i7) {
        zzu.zzb(i7, size());
        return isEmpty() ? zza : new zzaj(this, i7);
    }

    static <E> zzah<E> zza(Object[] objArr) {
        return zzb(objArr, objArr.length);
    }

    public static <E> zzah<E> zza(E e7, E e8, E e9, E e10, E e11, E e12, E e13, E e14) {
        Object[] objArr = {e7, e8, e9, e10, e11, e12, e13, e14};
        for (int i7 = 0; i7 < 8; i7++) {
            if (objArr[i7] == null) {
                throw new NullPointerException("at index " + i7);
            }
        }
        return zzb(objArr, 8);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public zzah<E> subList(int i7, int i8) {
        zzu.zza(i7, i8, size());
        int i9 = i8 - i7;
        if (i9 == size()) {
            return this;
        }
        if (i9 == 0) {
            return (zzah<E>) zzap.zza;
        }
        return new zzam(this, i7, i9);
    }
}
