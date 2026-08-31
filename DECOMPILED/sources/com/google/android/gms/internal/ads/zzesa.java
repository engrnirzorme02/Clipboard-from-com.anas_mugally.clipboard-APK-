package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzesa implements zzeup {
    private final Context zza;
    private final Intent zzb;

    zzesa(Context context, Intent intent) {
        this.zza = context;
        this.zzb = intent;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final InterfaceFutureC1673e zza() {
        AbstractC3490o0.m17545k("HsdpMigrationSignal.produce");
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zznE)).booleanValue()) {
            return zzgot.zza(new zzesb(null));
        }
        boolean z7 = false;
        try {
            if (this.zzb.resolveActivity(this.zza.getPackageManager()) != null) {
                AbstractC3490o0.m17545k("HSDP intent is supported");
                z7 = true;
            }
        } catch (Exception e7) {
            C7351t.m32354l().zzg(e7, "HsdpMigrationSignal.isHsdpMigrationSupported");
        }
        return zzgot.zza(new zzesb(Boolean.valueOf(z7)));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 60;
    }
}
