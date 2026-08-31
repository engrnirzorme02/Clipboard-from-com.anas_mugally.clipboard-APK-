package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.C2390a;
import com.google.android.gms.ads.internal.client.C3250D;
import java.util.Iterator;
import p380w2.C7351t;
import p396y2.InterfaceC7536x;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdgq implements zzcxg, InterfaceC7536x, zzcwm {
    zzedu zza;
    private final Context zzb;
    private final zzcek zzc;
    private final zzfcj zzd;
    private final C7584a zze;
    private final zzeds zzf;

    public zzdgq(Context context, zzcek zzcekVar, zzfcj zzfcjVar, C7584a c7584a, zzeds zzedsVar) {
        this.zzb = context;
        this.zzc = zzcekVar;
        this.zzd = zzfcjVar;
        this.zze = c7584a;
        this.zzf = zzedsVar;
    }

    private final boolean zzl() {
        return ((Boolean) C3250D.m17200c().zzd(zzbci.zzfM)).booleanValue() && this.zzf.zzb();
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdA() {
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdB() {
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdC() {
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdD() {
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdE() {
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdX() {
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdY(int i7) {
        this.zza = null;
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdt() {
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdu() {
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdv() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdw() {
        zzcek zzcekVar;
        if (zzl()) {
            this.zzf.zzd();
        } else {
            if (this.zza == null || (zzcekVar = this.zzc) == null) {
                return;
            }
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfP)).booleanValue()) {
                zzcekVar.zze("onSdkImpression", new C2390a());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzg() {
        zzcek zzcekVar;
        zzedr zzedrVar;
        zzedq zzedqVar;
        zzfcj zzfcjVar = this.zzd;
        if (!zzfcjVar.zzT || (zzcekVar = this.zzc) == null) {
            return;
        }
        if (C7351t.m32367y().zza(this.zzb)) {
            if (zzl()) {
                this.zzf.zzc();
                return;
            }
            C7584a c7584a = this.zze;
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
                zzedrVar = zzfcjVar.zzY == 2 ? zzedr.UNSPECIFIED : zzedr.BEGIN_TO_RENDER;
                zzedqVar = zzedq.HTML_DISPLAY;
            }
            zzedu zzeduVarZzc = C7351t.m32367y().zzc(string, zzcekVar.zzD(), "", "javascript", strZza, zzedrVar, zzedqVar, zzfcjVar.zzal);
            this.zza = zzeduVarZzc;
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
                zzcekVar.zzak(this.zza);
                C7351t.m32367y().zze(zzfljVarZza);
                zzcekVar.zze("onSdkLoaded", new C2390a());
            }
        }
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzh() {
        zzcek zzcekVar;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzfP)).booleanValue() || (zzcekVar = this.zzc) == null) {
            return;
        }
        if (this.zza != null || zzl()) {
            if (this.zza != null) {
                zzcekVar.zze("onSdkImpression", new C2390a());
            } else {
                this.zzf.zzd();
            }
        }
    }
}
