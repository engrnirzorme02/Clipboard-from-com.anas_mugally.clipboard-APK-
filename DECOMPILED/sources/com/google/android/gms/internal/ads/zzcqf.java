package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.C2390a;
import com.google.android.gms.ads.internal.client.C3250D;
import java.util.Iterator;
import p380w2.C7351t;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcqf implements zzcxg, zzcwm {
    private final Context zza;
    private final zzcek zzb;
    private final zzfcj zzc;
    private final C7584a zzd;
    private zzedu zze;
    private boolean zzf;
    private final zzeds zzg;

    public zzcqf(Context context, zzcek zzcekVar, zzfcj zzfcjVar, C7584a c7584a, zzeds zzedsVar) {
        this.zza = context;
        this.zzb = zzcekVar;
        this.zzc = zzfcjVar;
        this.zzd = c7584a;
        this.zzg = zzedsVar;
    }

    private final synchronized void zza() {
        zzcek zzcekVar;
        zzedr zzedrVar;
        zzedq zzedqVar;
        try {
            zzfcj zzfcjVar = this.zzc;
            if (zzfcjVar.zzT && (zzcekVar = this.zzb) != null) {
                if (C7351t.m32367y().zza(this.zza)) {
                    C7584a c7584a = this.zzd;
                    int i7 = c7584a.f30227b;
                    int i8 = c7584a.f30228c;
                    StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 1 + String.valueOf(i8).length());
                    sb.append(i7);
                    sb.append(".");
                    sb.append(i8);
                    String string = sb.toString();
                    zzfdf zzfdfVar = zzfcjVar.zzV;
                    String strZza = zzfdfVar.zza();
                    if (zzfdfVar.zzc() == 1) {
                        zzedqVar = zzedq.VIDEO;
                        zzedrVar = zzedr.DEFINED_BY_JAVASCRIPT;
                    } else {
                        int i9 = zzfcjVar.zze;
                        zzedq zzedqVar2 = zzedq.HTML_DISPLAY;
                        zzedrVar = i9 == 1 ? zzedr.ONE_PIXEL : zzedr.BEGIN_TO_RENDER;
                        zzedqVar = zzedqVar2;
                    }
                    zzedu zzeduVarZzc = C7351t.m32367y().zzc(string, zzcekVar.zzD(), "", "javascript", strZza, zzedrVar, zzedqVar, zzfcjVar.zzal);
                    this.zze = zzeduVarZzc;
                    if (zzeduVarZzc != null) {
                        zzflj zzfljVarZza = zzeduVarZzc.zza();
                        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfL)).booleanValue()) {
                            C7351t.m32367y().zzh(zzfljVarZza, zzcekVar.zzD());
                            Iterator it = zzcekVar.zzF().iterator();
                            while (it.hasNext()) {
                                C7351t.m32367y().zzg(zzfljVarZza, (View) it.next());
                            }
                        } else {
                            C7351t.m32367y().zzh(zzfljVarZza, zzcekVar.zzE());
                        }
                        zzcekVar.zzak(this.zze);
                        C7351t.m32367y().zze(zzfljVarZza);
                        this.zzf = true;
                        zzcekVar.zze("onSdkLoaded", new C2390a());
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final boolean zzb() {
        return ((Boolean) C3250D.m17200c().zzd(zzbci.zzfM)).booleanValue() && this.zzg.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final synchronized void zzdw() {
        zzcek zzcekVar;
        if (zzb()) {
            this.zzg.zzd();
            return;
        }
        if (!this.zzf) {
            zza();
        }
        if (!this.zzc.zzT || this.zze == null || (zzcekVar = this.zzb) == null) {
            return;
        }
        zzcekVar.zze("onSdkImpression", new C2390a());
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final synchronized void zzg() {
        if (zzb()) {
            this.zzg.zzc();
        } else {
            if (this.zzf) {
                return;
            }
            zza();
        }
    }
}
