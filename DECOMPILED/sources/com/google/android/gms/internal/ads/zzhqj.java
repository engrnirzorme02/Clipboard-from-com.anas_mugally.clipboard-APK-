package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhqj implements zzhpx {
    private final List zza;
    private final List zzb;

    static {
        zzhpy.zza(Collections.EMPTY_SET);
    }

    /* synthetic */ zzhqj(List list, List list2, zzhqh zzhqhVar) {
        this.zza = list;
        this.zzb = list2;
    }

    public static zzhqi zza(int i7, int i8) {
        return new zzhqi(i7, i8, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final Set zzb() {
        List list = this.zza;
        int size = list.size();
        List list2 = this.zzb;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            Collection collection = (Collection) ((zzhqg) list2.get(i7)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSetZzb = zzhpu.zzb(size);
        int size3 = list.size();
        for (int i8 = 0; i8 < size3; i8++) {
            Object objZzb = ((zzhqg) list.get(i8)).zzb();
            objZzb.getClass();
            hashSetZzb.add(objZzb);
        }
        int size4 = arrayList.size();
        for (int i9 = 0; i9 < size4; i9++) {
            for (Object obj : (Collection) arrayList.get(i9)) {
                obj.getClass();
                hashSetZzb.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSetZzb);
    }
}
