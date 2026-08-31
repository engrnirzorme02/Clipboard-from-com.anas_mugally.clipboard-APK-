package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgkf {
    public static boolean zza(Iterable iterable, zzghd zzghdVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            zzghdVar.getClass();
            return zzc((List) iterable, zzghdVar);
        }
        Iterator it = iterable.iterator();
        zzghdVar.getClass();
        boolean z7 = false;
        while (it.hasNext()) {
            if (zzghdVar.zza(it.next())) {
                it.remove();
                z7 = true;
            }
        }
        return z7;
    }

    public static Object zzb(Iterable iterable, Object obj) {
        zzgmd it = ((zzglu) iterable).iterator();
        return it.hasNext() ? it.next() : obj;
    }

    private static boolean zzc(List list, zzghd zzghdVar) {
        int i7 = 0;
        int i8 = 0;
        while (i7 < list.size()) {
            Object obj = list.get(i7);
            if (!zzghdVar.zza(obj)) {
                if (i7 > i8) {
                    try {
                        list.set(i8, obj);
                    } catch (IllegalArgumentException unused) {
                        zzd(list, zzghdVar, i8, i7);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        zzd(list, zzghdVar, i8, i7);
                        return true;
                    }
                }
                i8++;
            }
            i7++;
        }
        list.subList(i8, list.size()).clear();
        return i7 != i8;
    }

    private static void zzd(List list, zzghd zzghdVar, int i7, int i8) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i8) {
                break;
            } else if (zzghdVar.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i8--;
            if (i8 < i7) {
                return;
            } else {
                list.remove(i8);
            }
        }
    }
}
