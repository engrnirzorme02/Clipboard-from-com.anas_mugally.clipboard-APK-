package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.AbstractBinderC3355j0;
import com.google.android.gms.ads.internal.client.C3296S1;
import com.google.android.gms.ads.internal.client.InterfaceC3312Y;
import com.google.android.gms.ads.internal.client.InterfaceC3339f0;
import com.google.android.gms.ads.internal.client.InterfaceC3347h0;
import java.util.List;
import java.util.Map;
import p177X2.AbstractC1949e;
import p314o2.EnumC6551c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfki extends AbstractBinderC3355j0 {
    private final zzfko zza;
    private final zzfkb zzb;

    zzfki(zzfko zzfkoVar, zzfkb zzfkbVar) {
        this.zza = zzfkoVar;
        this.zzb = zzfkbVar;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3359k0
    public final void zze(List list, InterfaceC3339f0 interfaceC3339f0) {
        this.zza.zza(list, interfaceC3339f0);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3359k0
    public final boolean zzf(String str) {
        return this.zza.zzb(str);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3359k0
    public final zzbwa zzg(String str) {
        return this.zza.zzc(str);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3359k0
    public final boolean zzh(String str) {
        return this.zza.zzd(str);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3359k0
    public final zzbab zzi(String str) {
        return this.zza.zze(str);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3359k0
    public final boolean zzj(String str) {
        return this.zza.zzf(str);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3359k0
    public final InterfaceC3312Y zzk(String str) {
        return this.zza.zzg(str);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3359k0
    public final void zzl(zzbox zzboxVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3359k0
    public final boolean zzm(String str, C3296S1 c3296s1, InterfaceC3347h0 interfaceC3347h0) {
        return this.zzb.zza(str, c3296s1, interfaceC3347h0);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3359k0
    public final boolean zzn(int i7, String str) {
        EnumC6551c enumC6551cM27812c = EnumC6551c.m27812c(i7);
        if (enumC6551cM27812c == null) {
            return false;
        }
        return this.zzb.zzb(enumC6551cM27812c, str);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3359k0
    public final InterfaceC3312Y zzo(String str) {
        return this.zzb.zze(str);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3359k0
    public final zzbab zzp(String str) {
        return this.zzb.zzd(str);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3359k0
    public final zzbwa zzq(String str) {
        return this.zzb.zzc(str);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3359k0
    public final C3296S1 zzr(int i7, String str) {
        EnumC6551c enumC6551cM27812c = EnumC6551c.m27812c(i7);
        if (enumC6551cM27812c == null) {
            return null;
        }
        return this.zzb.zzf(enumC6551cM27812c, str);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3359k0
    public final Bundle zzs(int i7) {
        Map mapZzh = this.zzb.zzh(i7);
        Bundle bundle = new Bundle();
        for (Map.Entry entry : mapZzh.entrySet()) {
            bundle.putByteArray((String) entry.getKey(), AbstractC1949e.m8082d((C3296S1) entry.getValue()));
        }
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3359k0
    public final int zzt(int i7, String str) {
        EnumC6551c enumC6551cM27812c = EnumC6551c.m27812c(i7);
        if (enumC6551cM27812c == null) {
            return 0;
        }
        return this.zzb.zzg(enumC6551cM27812c, str);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3359k0
    public final boolean zzu(int i7, String str) {
        EnumC6551c enumC6551cM27812c = EnumC6551c.m27812c(i7);
        if (enumC6551cM27812c == null) {
            return false;
        }
        return this.zzb.zzi(enumC6551cM27812c, str);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3359k0
    public final void zzv(int i7) {
        this.zzb.zzj(i7);
    }
}
