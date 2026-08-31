package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfff {
    private final HashMap zza = new HashMap();

    public final zzffe zza(zzfev zzfevVar, Context context, zzfen zzfenVar, zzffk zzffkVar) {
        HashMap map = this.zza;
        zzffe zzffeVar = (zzffe) map.get(zzfevVar);
        if (zzffeVar != null) {
            return zzffeVar;
        }
        zzfes zzfesVar = new zzfes(zzfey.zza(zzfevVar, context));
        zzffe zzffeVar2 = new zzffe(zzfesVar, new zzffn(zzfesVar, zzfenVar, zzffkVar));
        map.put(zzfevVar, zzffeVar2);
        return zzffeVar2;
    }
}
