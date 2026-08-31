package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.InterfaceC3260G0;
import com.google.android.gms.ads.internal.client.InterfaceC3272K0;
import com.google.android.gms.ads.internal.client.InterfaceC3301U0;
import com.google.android.gms.ads.internal.client.InterfaceC3328c1;
import com.google.android.gms.ads.internal.client.InterfaceC3340f1;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.dynamic.BinderC3773b;
import com.google.android.gms.dynamic.InterfaceC3772a;
import java.util.Collections;
import java.util.List;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdni extends zzbhp {
    private final String zza;
    private final zzdip zzb;
    private final zzdiu zzc;
    private final zzdsm zzd;

    public zzdni(String str, zzdip zzdipVar, zzdiu zzdiuVar, zzdsm zzdsmVar) {
        this.zza = str;
        this.zzb = zzdipVar;
        this.zzc = zzdiuVar;
        this.zzd = zzdsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final boolean zzA() {
        zzdiu zzdiuVar = this.zzc;
        return (zzdiuVar.zzE().isEmpty() || zzdiuVar.zzF() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzB(InterfaceC3272K0 interfaceC3272K0) {
        this.zzb.zzA(interfaceC3272K0);
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzC(InterfaceC3260G0 interfaceC3260G0) {
        this.zzb.zzB(interfaceC3260G0);
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzD() {
        this.zzb.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzE() {
        this.zzb.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final zzbft zzF() {
        return this.zzb.zzP().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final boolean zzG() {
        return this.zzb.zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final InterfaceC3328c1 zzH() {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzhg)).booleanValue()) {
            return this.zzb.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzI(InterfaceC3301U0 interfaceC3301U0) {
        try {
            if (!interfaceC3301U0.zzf()) {
                this.zzd.zzb();
            }
        } catch (RemoteException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33327b("Error in making CSI ping for reporting paid event callback", e7);
        }
        this.zzb.zzQ(interfaceC3301U0);
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzJ(Bundle bundle) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zznO)).booleanValue()) {
            this.zzb.zzR(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final long zzK() {
        zzdip zzdipVar = this.zzb;
        if (zzdipVar == null || zzdipVar.zzo() == null) {
            return 0L;
        }
        return zzdipVar.zzo().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzL(long j7) {
        zzdip zzdipVar = this.zzb;
        if (zzdipVar == null || zzdipVar.zzo() == null) {
            return;
        }
        zzdipVar.zzo().zzb(j7);
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final String zze() {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final List zzf() {
        return this.zzc.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final String zzg() {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final zzbfw zzh() {
        return this.zzc.zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final String zzi() {
        return this.zzc.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final String zzj() {
        return this.zzc.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final double zzk() {
        return this.zzc.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final String zzl() {
        return this.zzc.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final String zzm() {
        return this.zzc.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final InterfaceC3340f1 zzn() {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final String zzo() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzp() {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final zzbfp zzq() {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzr(Bundle bundle) {
        this.zzb.zzc(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final boolean zzs(Bundle bundle) {
        return this.zzb.zze(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzt(Bundle bundle) {
        this.zzb.zzf(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final InterfaceC3772a zzu() {
        return BinderC3773b.m18221N0(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final InterfaceC3772a zzv() {
        return this.zzc.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final Bundle zzw() {
        return this.zzc.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzx(zzbhn zzbhnVar) {
        this.zzb.zzy(zzbhnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzy() {
        this.zzb.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final List zzz() {
        return zzA() ? this.zzc.zzE() : Collections.EMPTY_LIST;
    }
}
