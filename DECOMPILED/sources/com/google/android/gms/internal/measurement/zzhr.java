package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhr extends zzmb implements zznn {
    private zzhr() {
        throw null;
    }

    public final List zza() {
        return Collections.unmodifiableList(((zzhs) this.zza).zza());
    }

    public final int zzb() {
        return ((zzhs) this.zza).zzb();
    }

    public final zzhw zzc(int i7) {
        return ((zzhs) this.zza).zzc(i7);
    }

    public final zzhr zzd(int i7, zzhw zzhwVar) {
        zzaX();
        ((zzhs) this.zza).zzm(i7, zzhwVar);
        return this;
    }

    public final zzhr zze(int i7, zzhv zzhvVar) {
        zzaX();
        ((zzhs) this.zza).zzm(i7, (zzhw) zzhvVar.zzbc());
        return this;
    }

    public final zzhr zzf(zzhw zzhwVar) {
        zzaX();
        ((zzhs) this.zza).zzn(zzhwVar);
        return this;
    }

    public final zzhr zzg(zzhv zzhvVar) {
        zzaX();
        ((zzhs) this.zza).zzn((zzhw) zzhvVar.zzbc());
        return this;
    }

    public final zzhr zzh(Iterable iterable) {
        zzaX();
        ((zzhs) this.zza).zzo(iterable);
        return this;
    }

    public final zzhr zzi() {
        zzaX();
        ((zzhs) this.zza).zzp();
        return this;
    }

    public final zzhr zzj(int i7) {
        zzaX();
        ((zzhs) this.zza).zzq(i7);
        return this;
    }

    public final String zzk() {
        return ((zzhs) this.zza).zzd();
    }

    public final zzhr zzl(String str) {
        zzaX();
        ((zzhs) this.zza).zzr(str);
        return this;
    }

    public final boolean zzm() {
        return ((zzhs) this.zza).zze();
    }

    public final long zzn() {
        return ((zzhs) this.zza).zzf();
    }

    public final zzhr zzo(long j7) {
        zzaX();
        ((zzhs) this.zza).zzs(j7);
        return this;
    }

    public final long zzp() {
        return ((zzhs) this.zza).zzh();
    }

    public final zzhr zzq(long j7) {
        zzaX();
        ((zzhs) this.zza).zzt(j7);
        return this;
    }

    public final zzhr zzr(long j7) {
        zzaX();
        ((zzhs) this.zza).zzu(j7);
        return this;
    }

    /* synthetic */ zzhr(byte[] bArr) {
        super(zzhs.zzj);
    }
}
