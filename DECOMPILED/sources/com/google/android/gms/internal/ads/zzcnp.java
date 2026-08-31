package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.common.util.InterfaceC3750e;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcnp implements zzayi {
    private zzcek zza;
    private final Executor zzb;
    private final zzcnb zzc;
    private final InterfaceC3750e zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcne zzg = new zzcne();

    public zzcnp(Executor executor, zzcnb zzcnbVar, InterfaceC3750e interfaceC3750e) {
        this.zzb = executor;
        this.zzc = zzcnbVar;
        this.zzd = interfaceC3750e;
    }

    private final void zzg() {
        try {
            final JSONObject jSONObjectZzb = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcno
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzf(jSONObjectZzb);
                    }
                });
            }
        } catch (JSONException e7) {
            AbstractC3490o0.m17546l("Failed to call video active view js", e7);
        }
    }

    public final void zza(zzcek zzcekVar) {
        this.zza = zzcekVar;
    }

    public final void zzb() {
        this.zze = false;
    }

    public final void zzd() {
        this.zze = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zzdo(zzayh zzayhVar) {
        boolean z7 = this.zzf ? false : zzayhVar.zzj;
        zzcne zzcneVar = this.zzg;
        zzcneVar.zza = z7;
        zzcneVar.zzd = this.zzd.mo18161c();
        zzcneVar.zzf = zzayhVar;
        if (this.zze) {
            zzg();
        }
    }

    public final void zze(boolean z7) {
        this.zzf = z7;
    }

    final /* synthetic */ void zzf(JSONObject jSONObject) {
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder(string.length() + 31);
        sb.append("Calling AFMA_updateActiveView(");
        sb.append(string);
        sb.append(")");
        String string2 = sb.toString();
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33326a(string2);
        this.zza.zzb("AFMA_updateActiveView", jSONObject);
    }
}
