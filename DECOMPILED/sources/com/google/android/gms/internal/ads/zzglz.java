package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public final class zzglz {
    public static zzgly zza(Set set, Set set2) {
        zzghc.zzk(set, "set1");
        zzghc.zzk(set2, "set2");
        return new zzglu(set, set2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Set zzb(Set set, zzghd zzghdVar) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof zzglv)) {
                set.getClass();
                return new zzglv(set, zzghdVar);
            }
            zzglv zzglvVar = (zzglv) set;
            return new zzglv((Set) zzglvVar.zza, zzghf.zza(zzglvVar.zzb, zzghdVar));
        }
        SortedSet sortedSet = (SortedSet) set;
        if (!(sortedSet instanceof zzglv)) {
            sortedSet.getClass();
            return new zzglw(sortedSet, zzghdVar);
        }
        zzglv zzglvVar2 = (zzglv) sortedSet;
        return new zzglw((SortedSet) zzglvVar2.zza, zzghf.zza(zzglvVar2.zzb, zzghdVar));
    }

    static int zzc(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    static boolean zzd(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size() && set.containsAll(set2)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    static boolean zze(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    static boolean zzf(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof zzglg) {
            collection = ((zzglg) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return zze(set, collection.iterator());
        }
        Iterator it = set.iterator();
        collection.getClass();
        boolean z7 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z7 = true;
            }
        }
        return z7;
    }
}
