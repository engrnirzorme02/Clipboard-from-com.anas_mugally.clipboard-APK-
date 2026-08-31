package com.google.android.gms.internal.ads;

import java.util.LinkedList;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
final class zzfeq {
    private final int zzb;
    private final int zzc;
    private final LinkedList zza = new LinkedList();
    private final zzffp zzd = new zzffp();

    public zzfeq(int i7, int i8) {
        this.zzb = i7;
        this.zzc = i8;
    }

    private final void zzi() {
        while (true) {
            LinkedList linkedList = this.zza;
            if (linkedList.isEmpty()) {
                return;
            }
            if (C7351t.m32357o().mo18159a() - ((zzffa) linkedList.getFirst()).zzd < this.zzc) {
                return;
            }
            this.zzd.zzc();
            linkedList.remove();
        }
    }

    public final boolean zza(zzffa zzffaVar) {
        this.zzd.zza();
        zzi();
        LinkedList linkedList = this.zza;
        if (linkedList.size() == this.zzb) {
            return false;
        }
        linkedList.add(zzffaVar);
        return true;
    }

    public final zzffa zzb() {
        zzffp zzffpVar = this.zzd;
        zzffpVar.zza();
        zzi();
        LinkedList linkedList = this.zza;
        if (linkedList.isEmpty()) {
            return null;
        }
        zzffa zzffaVar = (zzffa) linkedList.remove();
        if (zzffaVar != null) {
            zzffpVar.zzb();
        }
        return zzffaVar;
    }

    public final int zzc() {
        zzi();
        return this.zza.size();
    }

    public final long zzd() {
        return this.zzd.zzd();
    }

    public final long zze() {
        return this.zzd.zze();
    }

    public final int zzf() {
        return this.zzd.zzf();
    }

    public final String zzg() {
        return this.zzd.zzh();
    }

    public final zzffo zzh() {
        return this.zzd.zzg();
    }
}
