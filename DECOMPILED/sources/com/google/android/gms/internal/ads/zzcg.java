package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzcg implements zzcf {
    protected zzcc zzb;
    protected zzcc zzc;
    private zzcc zzd;
    private zzcc zze;
    private ByteBuffer zzf;
    private ByteBuffer zzg;
    private boolean zzh;

    public zzcg() {
        ByteBuffer byteBuffer = zzcf.zza;
        this.zzf = byteBuffer;
        this.zzg = byteBuffer;
        zzcc zzccVar = zzcc.zza;
        this.zzd = zzccVar;
        this.zze = zzccVar;
        this.zzb = zzccVar;
        this.zzc = zzccVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    public final zzcc zzb(zzcc zzccVar) {
        this.zzd = zzccVar;
        this.zze = zzm(zzccVar);
        return zzc() ? this.zze : zzcc.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    public boolean zzc() {
        return this.zze != zzcc.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    public final void zze() {
        this.zzh = true;
        zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    public ByteBuffer zzf() {
        ByteBuffer byteBuffer = this.zzg;
        this.zzg = zzcf.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    public boolean zzg() {
        return this.zzh && this.zzg == zzcf.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    @Deprecated
    public final void zzh() {
        zzcd zzcdVar = zzcd.zza;
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    public final void zzi(zzcd zzcdVar) {
        this.zzg = zzcf.zza;
        this.zzh = false;
        this.zzb = this.zzd;
        this.zzc = this.zze;
        zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzcf
    public final void zzj() {
        ByteBuffer byteBuffer = zzcf.zza;
        this.zzg = byteBuffer;
        this.zzh = false;
        this.zzf = byteBuffer;
        zzcc zzccVar = zzcc.zza;
        this.zzd = zzccVar;
        this.zze = zzccVar;
        this.zzb = zzccVar;
        this.zzc = zzccVar;
        zzp();
    }

    protected final ByteBuffer zzk(int i7) {
        if (this.zzf.capacity() < i7) {
            this.zzf = ByteBuffer.allocateDirect(i7).order(ByteOrder.nativeOrder());
        } else {
            this.zzf.clear();
        }
        ByteBuffer byteBuffer = this.zzf;
        this.zzg = byteBuffer;
        return byteBuffer;
    }

    protected final boolean zzl() {
        return this.zzg.hasRemaining();
    }

    protected zzcc zzm(zzcc zzccVar) {
        throw null;
    }

    protected void zzn() {
    }

    @Deprecated
    protected void zzo() {
    }

    protected void zzp() {
    }
}
