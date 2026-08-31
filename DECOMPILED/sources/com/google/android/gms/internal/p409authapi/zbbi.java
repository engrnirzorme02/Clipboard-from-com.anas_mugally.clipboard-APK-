package com.google.android.gms.internal.p409authapi;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zbbi extends zbbf implements List, RandomAccess {
    private static final zbbl zba = new zbbg(zbbj.zba, 0);

    zbbi() {
    }

    public static zbbi zbi(Collection collection) {
        if (collection instanceof zbbf) {
            zbbi zbbiVarZbe = ((zbbf) collection).zbe();
            if (!zbbiVarZbe.zbf()) {
                return zbbiVarZbe;
            }
            Object[] array = zbbiVarZbe.toArray();
            return zbj(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (array2[i7] == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 9);
                sb.append("at index ");
                sb.append(i7);
                throw new NullPointerException(sb.toString());
            }
        }
        return zbj(array2, array2.length);
    }

    static zbbi zbj(Object[] objArr, int i7) {
        return i7 == 0 ? zbbj.zba : new zbbj(objArr, i7);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i7, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof RandomAccess) {
            for (int i7 = 0; i7 < size; i7++) {
                if (!Objects.equals(get(i7), list.get(i7))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !Objects.equals(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i7 = 0; i7 < size; i7++) {
            iHashCode = (iHashCode * 31) + get(i7).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
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

    @Override // com.google.android.gms.internal.p409authapi.zbbf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
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
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.p409authapi.zbbf
    /* JADX INFO: renamed from: zba */
    public final zbbk iterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.p409authapi.zbbf
    @Deprecated
    public final zbbi zbe() {
        return this;
    }

    @Override // com.google.android.gms.internal.p409authapi.zbbf
    int zbg(Object[] objArr, int i7) {
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            objArr[i8] = get(i8);
        }
        return size;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zbh, reason: merged with bridge method [inline-methods] */
    public zbbi subList(int i7, int i8) {
        zbbc.zbc(i7, i8, size());
        int i9 = i8 - i7;
        if (i9 == size()) {
            return this;
        }
        return i9 == 0 ? zbbj.zba : new zbbh(this, i7, i9);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zbk, reason: merged with bridge method [inline-methods] */
    public final zbbl listIterator(int i7) {
        zbbc.zbb(i7, size(), "index");
        return isEmpty() ? zba : new zbbg(this, i7);
    }
}
