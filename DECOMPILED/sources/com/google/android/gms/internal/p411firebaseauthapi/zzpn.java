package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzpn<P> {
    private final Map<zzaaj, List<P>> zza = new HashMap();

    public final zzpn<P> zza(zzaaj zzaajVar, P p7) throws GeneralSecurityException {
        List<P> list;
        if (zzaajVar.zza() != 0 && zzaajVar.zza() != 5) {
            throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
        }
        if (this.zza.containsKey(zzaajVar)) {
            list = this.zza.get(zzaajVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.zza.put(zzaajVar, arrayList);
            list = arrayList;
        }
        list.add(p7);
        return this;
    }

    public final zzpl<P> zza() {
        return new zzpl<>(this.zza);
    }
}
