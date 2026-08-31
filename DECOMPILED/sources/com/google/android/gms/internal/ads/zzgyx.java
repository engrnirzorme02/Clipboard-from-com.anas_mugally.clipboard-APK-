package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgyx {
    private final Map zza = new HashMap();

    public final zzgyx zza(zzhgg zzhggVar, Object obj) throws GeneralSecurityException {
        List list;
        if (zzhggVar.zzd() != 0 && zzhggVar.zzd() != 5) {
            throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
        }
        Map map = this.zza;
        if (map.containsKey(zzhggVar)) {
            list = (List) map.get(zzhggVar);
        } else {
            ArrayList arrayList = new ArrayList();
            map.put(zzhggVar, arrayList);
            list = arrayList;
        }
        list.add(obj);
        return this;
    }

    public final zzgyz zzb() {
        return new zzgyz(this.zza, null);
    }
}
