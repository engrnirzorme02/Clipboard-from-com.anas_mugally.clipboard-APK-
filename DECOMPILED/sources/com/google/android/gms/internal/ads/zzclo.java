package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.AbstractC3467d;
import com.google.android.gms.ads.internal.util.InterfaceC3494q0;
import java.util.Map;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzclo implements zzcky {
    private final Context zza;
    private final InterfaceC3494q0 zzb = C7351t.m32354l().zzo();

    public zzclo(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzcky
    public final void zza(Map map) {
        String str;
        if (map.isEmpty() || (str = (String) map.get("gad_idless")) == null) {
            return;
        }
        InterfaceC3494q0 interfaceC3494q0 = this.zzb;
        boolean z7 = Boolean.parseBoolean(str);
        interfaceC3494q0.zzw(z7);
        if (z7) {
            AbstractC3467d.m17522a(this.zza);
        }
    }
}
