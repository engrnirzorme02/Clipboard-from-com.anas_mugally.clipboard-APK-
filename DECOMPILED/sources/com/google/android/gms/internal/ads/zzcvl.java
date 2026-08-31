package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.AbstractBinderC3320a1;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3385q2;
import java.util.List;
import org.json.JSONException;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcvl extends AbstractBinderC3320a1 {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final List zze;
    private final long zzf;
    private final String zzg;
    private final zzeee zzh;
    private final Bundle zzi;
    private final double zzj;

    public zzcvl(zzfcj zzfcjVar, String str, zzeee zzeeeVar, zzfcm zzfcmVar, String str2) {
        String string = null;
        this.zzb = zzfcjVar == null ? null : zzfcjVar.zzab;
        this.zzc = str2;
        this.zzd = zzfcmVar == null ? null : zzfcmVar.zzb;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && zzfcjVar != null) {
            try {
                string = zzfcjVar.zzv.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.zza = string != null ? string : str;
        this.zze = zzeeeVar.zzh();
        this.zzh = zzeeeVar;
        this.zzj = zzfcjVar == null ? 0.0d : zzfcjVar.zzaz;
        this.zzf = C7351t.m32357o().mo18159a() / 1000;
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzhi)).booleanValue() || zzfcmVar == null) {
            this.zzi = new Bundle();
        } else {
            this.zzi = zzfcmVar.zzk;
        }
        this.zzg = (!((Boolean) C3250D.m17200c().zzd(zzbci.zzjZ)).booleanValue() || zzfcmVar == null || TextUtils.isEmpty(zzfcmVar.zzi)) ? "" : zzfcmVar.zzi;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3328c1
    public final String zze() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3328c1
    public final String zzf() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3328c1
    public final List zzg() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3328c1
    public final C3385q2 zzh() {
        zzeee zzeeeVar = this.zzh;
        if (zzeeeVar != null) {
            return zzeeeVar.zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3328c1
    public final Bundle zzi() {
        return this.zzi;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3328c1
    public final String zzj() {
        return this.zzc;
    }

    public final String zzk() {
        return this.zzd;
    }

    public final double zzl() {
        return this.zzj;
    }
}
