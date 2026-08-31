package com.google.android.gms.internal.p411firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaku {
    static final zzaku zza = new zzaku(true);
    private static volatile boolean zzb = false;
    private final Map<zzakt, zzalf.zzf<?, ?>> zzc;

    zzaku() {
        this.zzc = new HashMap();
    }

    public static zzaku zza() {
        return zza;
    }

    public final <ContainingType extends zzamm> zzalf.zzf<ContainingType, ?> zza(ContainingType containingtype, int i7) {
        return (zzalf.zzf) this.zzc.get(new zzakt(containingtype, i7));
    }

    private zzaku(boolean z7) {
        this.zzc = Collections.EMPTY_MAP;
    }
}
