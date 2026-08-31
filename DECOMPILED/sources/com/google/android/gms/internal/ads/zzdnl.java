package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.InterfaceC3318a;
import p396y2.InterfaceC7516d;
import p396y2.InterfaceC7536x;

/* JADX INFO: loaded from: classes2.dex */
public class zzdnl implements InterfaceC3318a, zzbib, InterfaceC7536x, zzbid, InterfaceC7516d {
    private InterfaceC3318a zza;
    private zzbib zzb;
    private InterfaceC7536x zzc;
    private zzbid zzd;
    private InterfaceC7516d zze;

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3318a
    public final synchronized void onAdClicked() {
        InterfaceC3318a interfaceC3318a = this.zza;
        if (interfaceC3318a != null) {
            interfaceC3318a.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbib
    public final synchronized void zza(String str, Bundle bundle) {
        zzbib zzbibVar = this.zzb;
        if (zzbibVar != null) {
            zzbibVar.zza(str, bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbid
    public final synchronized void zzb(String str, String str2) {
        zzbid zzbidVar = this.zzd;
        if (zzbidVar != null) {
            zzbidVar.zzb(str, str2);
        }
    }

    @Override // p396y2.InterfaceC7536x
    public final synchronized void zzdA() {
        InterfaceC7536x interfaceC7536x = this.zzc;
        if (interfaceC7536x != null) {
            interfaceC7536x.zzdA();
        }
    }

    @Override // p396y2.InterfaceC7536x
    public final synchronized void zzdB() {
        InterfaceC7536x interfaceC7536x = this.zzc;
        if (interfaceC7536x != null) {
            interfaceC7536x.zzdB();
        }
    }

    @Override // p396y2.InterfaceC7536x
    public final synchronized void zzdC() {
        InterfaceC7536x interfaceC7536x = this.zzc;
        if (interfaceC7536x != null) {
            interfaceC7536x.zzdC();
        }
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdD() {
        InterfaceC7536x interfaceC7536x = this.zzc;
        if (interfaceC7536x != null) {
            interfaceC7536x.zzdD();
        }
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdE() {
        InterfaceC7536x interfaceC7536x = this.zzc;
        if (interfaceC7536x != null) {
            interfaceC7536x.zzdE();
        }
    }

    @Override // p396y2.InterfaceC7536x
    public final synchronized void zzdX() {
        InterfaceC7536x interfaceC7536x = this.zzc;
        if (interfaceC7536x != null) {
            interfaceC7536x.zzdX();
        }
    }

    @Override // p396y2.InterfaceC7536x
    public final synchronized void zzdY(int i7) {
        InterfaceC7536x interfaceC7536x = this.zzc;
        if (interfaceC7536x != null) {
            interfaceC7536x.zzdY(i7);
        }
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdt() {
        InterfaceC7536x interfaceC7536x = this.zzc;
        if (interfaceC7536x != null) {
            interfaceC7536x.zzdt();
        }
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdu() {
        InterfaceC7536x interfaceC7536x = this.zzc;
        if (interfaceC7536x != null) {
            interfaceC7536x.zzdu();
        }
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdv() {
        InterfaceC7536x interfaceC7536x = this.zzc;
        if (interfaceC7536x != null) {
            interfaceC7536x.zzdv();
        }
    }

    @Override // p396y2.InterfaceC7536x
    public final synchronized void zzh() {
        InterfaceC7536x interfaceC7536x = this.zzc;
        if (interfaceC7536x != null) {
            interfaceC7536x.zzh();
        }
    }

    @Override // p396y2.InterfaceC7516d
    public final synchronized void zzl() {
        InterfaceC7516d interfaceC7516d = this.zze;
        if (interfaceC7516d != null) {
            interfaceC7516d.zzl();
        }
    }

    protected final synchronized void zzm(InterfaceC3318a interfaceC3318a, zzbib zzbibVar, InterfaceC7536x interfaceC7536x, zzbid zzbidVar, InterfaceC7516d interfaceC7516d) {
        this.zza = interfaceC3318a;
        this.zzb = zzbibVar;
        this.zzc = interfaceC7536x;
        this.zzd = zzbidVar;
        this.zze = interfaceC7516d;
    }
}
