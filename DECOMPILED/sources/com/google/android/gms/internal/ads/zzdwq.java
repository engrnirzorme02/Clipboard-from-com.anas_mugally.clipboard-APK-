package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.nativead.C3521b;
import p314o2.C6555g;
import p314o2.C6556h;
import p314o2.C6574z;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdwq {
    private C6555g zza;
    private C3521b zzb;
    private C6574z zzc;
    private C6556h zzd = C6556h.f24740i;
    private String zze = "";
    private String zzf = "";
    private boolean zzg = false;

    public zzdwq() {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        this.zza = ((C6555g.a) new C6555g.a().m27799c(AdMobAdapter.class, bundle)).m27825k();
    }

    public final String zza() {
        return this.zze;
    }

    public final String zzb() {
        return this.zzf;
    }

    public final C6555g zzc() {
        return this.zza;
    }

    public final C6556h zzd() {
        return this.zzd;
    }

    public final C3521b zze() {
        return this.zzb;
    }

    public final C6574z zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        return this.zzg;
    }

    public final void zzh(String str) {
        this.zze = str;
    }

    public final void zzi(String str) {
        this.zzf = str;
    }

    public final void zzj(C6555g c6555g) {
        this.zza = c6555g;
    }

    public final void zzk(C6556h c6556h) {
        this.zzd = c6556h;
    }

    public final void zzl(C3521b c3521b) {
        this.zzb = c3521b;
    }

    public final void zzm(C6574z c6574z) {
        this.zzc = c6574z;
    }

    public final void zzn(boolean z7) {
        this.zzg = z7;
    }
}
