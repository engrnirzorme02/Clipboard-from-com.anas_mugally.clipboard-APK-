package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Iterator;
import p380w2.C7351t;
import p404z2.AbstractC7599p;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeds {
    private final Context zza;
    private final C7584a zzb;
    private final zzfcj zzc;
    private final zzcek zzd;
    private final zzdsm zze;
    private zzflv zzf;

    zzeds(Context context, C7584a c7584a, zzfcj zzfcjVar, zzcek zzcekVar, zzdsm zzdsmVar) {
        this.zza = context;
        this.zzb = c7584a;
        this.zzc = zzfcjVar;
        this.zzd = zzcekVar;
        this.zze = zzdsmVar;
    }

    public final synchronized boolean zza(boolean z7) {
        zzcek zzcekVar;
        zzfcj zzfcjVar = this.zzc;
        if (zzfcjVar.zzT) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfJ)).booleanValue()) {
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfM)).booleanValue() && (zzcekVar = this.zzd) != null) {
                    if (this.zzf != null) {
                        int i7 = AbstractC3490o0.f14278b;
                        AbstractC7599p.m33331f("Omid javascript session service already started for ad.");
                        return false;
                    }
                    if (!C7351t.m32367y().zza(this.zza)) {
                        int i8 = AbstractC3490o0.f14278b;
                        AbstractC7599p.m33331f("Unable to initialize omid.");
                        return false;
                    }
                    if (zzfcjVar.zzV.zzb()) {
                        zzflv zzflvVarZzi = C7351t.m32367y().zzi(this.zzb, zzcekVar.zzD(), true);
                        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfN)).booleanValue()) {
                            zzdsm zzdsmVar = this.zze;
                            String str = zzflvVarZzi != null ? "1" : "0";
                            zzdsl zzdslVarZza = zzdsmVar.zza();
                            zzdslVarZza.zzc("omid_js_session_success", str);
                            zzdslVarZza.zzd();
                        }
                        if (zzflvVarZzi == null) {
                            int i9 = AbstractC3490o0.f14278b;
                            AbstractC7599p.m33331f("Unable to create javascript session service.");
                            return false;
                        }
                        int i10 = AbstractC3490o0.f14278b;
                        AbstractC7599p.m33330e("Created omid javascript session service.");
                        this.zzf = zzflvVarZzi;
                        zzcekVar.zzal(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized boolean zzb() {
        return this.zzf != null;
    }

    public final synchronized void zzc() {
        zzcek zzcekVar;
        try {
            zzflv zzflvVar = this.zzf;
            if (zzflvVar == null || (zzcekVar = this.zzd) == null) {
                return;
            }
            Iterator it = zzcekVar.zzF().iterator();
            while (it.hasNext()) {
                C7351t.m32367y().zzk(zzflvVar, (View) it.next());
            }
            zzcekVar.zze("onSdkLoaded", zzgkc.zza());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd() {
        zzcek zzcekVar;
        if (this.zzf == null || (zzcekVar = this.zzd) == null) {
            return;
        }
        zzcekVar.zze("onSdkImpression", zzgkc.zza());
    }

    public final synchronized void zze(zzflu zzfluVar) {
        zzcek zzcekVar;
        zzflv zzflvVar = this.zzf;
        if (zzflvVar == null || (zzcekVar = this.zzd) == null) {
            return;
        }
        C7351t.m32367y().zzj(zzflvVar, zzfluVar);
        this.zzf = null;
        zzcekVar.zzal(null);
    }

    public final synchronized void zzf(View view) {
        zzflv zzflvVar = this.zzf;
        if (zzflvVar != null) {
            C7351t.m32367y().zzk(zzflvVar, view);
        }
    }
}
