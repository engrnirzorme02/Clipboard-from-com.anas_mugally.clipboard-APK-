package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.InterfaceC3494q0;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcla implements zzcky {
    private final InterfaceC3494q0 zza;

    public zzcla(InterfaceC3494q0 interfaceC3494q0) {
        this.zza = interfaceC3494q0;
    }

    @Override // com.google.android.gms.internal.ads.zzcky
    public final void zza(Map map) {
        this.zza.zzb(Boolean.parseBoolean((String) map.get("content_url_opted_out")));
    }
}
