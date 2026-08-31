package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class zzhpf extends zzhpi implements zzaqs {
    protected final String zza = "moov";

    public zzhpf(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaqs
    public final void zzb(zzhpj zzhpjVar, ByteBuffer byteBuffer, long j7, zzaqp zzaqpVar) {
        zzhpjVar.zzc();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.zzc = zzhpjVar;
        this.zze = zzhpjVar.zzc();
        zzhpjVar.zzd(zzhpjVar.zzc() + j7);
        this.zzf = zzhpjVar.zzc();
        this.zzb = zzaqpVar;
    }
}
