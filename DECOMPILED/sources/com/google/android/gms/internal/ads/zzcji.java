package com.google.android.gms.internal.ads;

import p036E2.AbstractC0339e;
import p036E2.C0306A;
import p036E2.InterfaceC0337d;

/* JADX INFO: loaded from: classes2.dex */
final class zzcji implements InterfaceC0337d {
    private final zzcih zza;
    private zzcvb zzb;
    private C0306A zzc;

    /* synthetic */ zzcji(zzcih zzcihVar, byte[] bArr) {
        this.zza = zzcihVar;
    }

    @Override // p036E2.InterfaceC0337d
    public final AbstractC0339e zza() {
        zzhqf.zzc(this.zzb, zzcvb.class);
        zzhqf.zzc(this.zzc, C0306A.class);
        return new zzcjj(this.zza, this.zzc, new zzcry(), new zzctz(), new zzdtb(), this.zzb, null, null);
    }

    @Override // p036E2.InterfaceC0337d
    public final /* bridge */ /* synthetic */ InterfaceC0337d zzb(C0306A c0306a) {
        this.zzc = c0306a;
        return this;
    }

    @Override // p036E2.InterfaceC0337d
    public final /* bridge */ /* synthetic */ InterfaceC0337d zzc(zzcvb zzcvbVar) {
        this.zzb = zzcvbVar;
        return this;
    }
}
