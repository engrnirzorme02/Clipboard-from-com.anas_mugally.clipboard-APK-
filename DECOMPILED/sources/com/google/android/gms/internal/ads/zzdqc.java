package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import org.json.JSONException;
import org.json.JSONObject;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdqc {
    private final zzfdy zza;
    private final zzdpz zzb;

    zzdqc(zzfdy zzfdyVar, zzdpz zzdpzVar) {
        this.zza = zzfdyVar;
        this.zzb = zzdpzVar;
    }

    public final zzfea zza(String str, JSONObject jSONObject) {
        zzbpa zzbpaVarZzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzbpaVarZzb = new zzbpy(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzbpaVarZzb = new zzbpy(new zzbrp());
            } else {
                zzbox zzboxVarZzd = zzd();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        if (zzboxVarZzd.zzc(string)) {
                            zzbpaVarZzb = zzboxVarZzd.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                        } else {
                            zzbpaVarZzb = zzboxVarZzd.zzd(string) ? zzboxVarZzd.zzb(string) : zzboxVarZzd.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                        }
                    } catch (JSONException e7) {
                        int i7 = AbstractC3490o0.f14278b;
                        AbstractC7599p.m33329d("Invalid custom event.", e7);
                        zzbpaVarZzb = zzboxVarZzd.zzb(str);
                    }
                } else {
                    zzbpaVarZzb = zzboxVarZzd.zzb(str);
                }
            }
            zzfea zzfeaVar = new zzfea(zzbpaVarZzb);
            this.zzb.zza(str, zzfeaVar);
            return zzfeaVar;
        } catch (Throwable th) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzkf)).booleanValue()) {
                this.zzb.zza(str, null);
            }
            throw new zzfdj(th);
        }
    }

    public final zzbqw zzb(String str) {
        zzbqw zzbqwVarZze = zzd().zze(str);
        this.zzb.zzb(str, zzbqwVarZze);
        return zzbqwVarZze;
    }

    public final boolean zzc() {
        return this.zza.zzd() != null;
    }

    final zzbox zzd() throws RemoteException {
        zzbox zzboxVarZzd = this.zza.zzd();
        if (zzboxVarZzd != null) {
            return zzboxVarZzd;
        }
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33331f("Unexpected call to adapter creator.");
        throw new RemoteException();
    }
}
