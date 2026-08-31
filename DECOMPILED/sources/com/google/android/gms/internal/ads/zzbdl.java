package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Objects;
import org.json.JSONException;
import p060H2.AbstractC0497b;
import p060H2.C0496a;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
final class zzbdl extends AbstractC0497b {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbdn zzb;

    zzbdl(zzbdn zzbdnVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzbdnVar);
        this.zzb = zzbdnVar;
    }

    @Override // p060H2.AbstractC0497b
    public final void onFailure(String str) {
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33331f("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
        try {
            zzbdn zzbdnVar = this.zzb;
            zzbdnVar.zzi().m10216g(zzbdnVar.zze(this.zza, str).toString(), null);
        } catch (JSONException e7) {
            AbstractC7599p.m33329d("Error creating PACT Error Response JSON: ", e7);
        }
    }

    @Override // p060H2.AbstractC0497b
    public final void onSuccess(C0496a c0496a) {
        String strM2109b = c0496a.m2109b();
        try {
            zzbdn zzbdnVar = this.zzb;
            zzbdnVar.zzi().m10216g(zzbdnVar.zzf(this.zza, strM2109b).toString(), null);
        } catch (JSONException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Error creating PACT Signal Response JSON: ", e7);
        }
    }
}
