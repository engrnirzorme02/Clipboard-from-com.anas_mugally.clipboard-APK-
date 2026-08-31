package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3459Y;
import java.util.Map;
import java.util.Objects;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
final class zzbmv implements zzbjl {
    final /* synthetic */ zzbmk zza;
    final /* synthetic */ C3459Y zzb;
    final /* synthetic */ zzbnp zzc;

    zzbmv(zzbnp zzbnpVar, zzauu zzauuVar, zzbmk zzbmkVar, C3459Y c3459y) {
        this.zza = zzbmkVar;
        this.zzb = c3459y;
        Objects.requireNonNull(zzbnpVar);
        this.zzc = zzbnpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        AbstractC3490o0.m17545k("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
        zzbnp zzbnpVar = this.zzc;
        synchronized (zzbnpVar.zzf()) {
            try {
                AbstractC3490o0.m17545k("loadJavascriptEngine > /requestReload handler: Lock acquired");
                AbstractC7599p.m33330e("JS Engine is requesting an update");
                if (zzbnpVar.zzj() == 0) {
                    AbstractC7599p.m33330e("Starting reload.");
                    zzbnpVar.zzk(2);
                    zzbnpVar.zza(null);
                }
                this.zza.zzn("/requestReload", (zzbjl) this.zzb.m17508a());
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC3490o0.m17545k("loadJavascriptEngine > /requestReload handler: Lock released");
    }
}
