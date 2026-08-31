package com.google.android.gms.internal.ads;

import androidx.collection.C2400k;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdje {
    public static final zzdje zza = new zzdje(new zzdjd());
    private final zzbgx zzb;
    private final zzbgu zzc;
    private final zzbhk zzd;
    private final zzbhh zze;
    private final zzbmf zzf;
    private final C2400k zzg;
    private final C2400k zzh;

    /* synthetic */ zzdje(zzdjd zzdjdVar, byte[] bArr) {
        this(zzdjdVar);
    }

    public final zzbgx zza() {
        return this.zzb;
    }

    public final zzbgu zzb() {
        return this.zzc;
    }

    public final zzbhk zzc() {
        return this.zzd;
    }

    public final zzbhh zzd() {
        return this.zze;
    }

    public final zzbmf zze() {
        return this.zzf;
    }

    public final zzbhd zzf(String str) {
        if (str == null) {
            return null;
        }
        return (zzbhd) this.zzg.get(str);
    }

    public final zzbha zzg(String str) {
        return (zzbha) this.zzh.get(str);
    }

    public final ArrayList zzh() {
        ArrayList arrayList = new ArrayList();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    public final ArrayList zzi() {
        C2400k c2400k = this.zzg;
        ArrayList arrayList = new ArrayList(c2400k.size());
        for (int i7 = 0; i7 < c2400k.size(); i7++) {
            arrayList.add((String) c2400k.m10300f(i7));
        }
        return arrayList;
    }

    private zzdje(zzdjd zzdjdVar) {
        this.zzb = zzdjdVar.zza;
        this.zzc = zzdjdVar.zzb;
        this.zzd = zzdjdVar.zzc;
        this.zzg = new C2400k(zzdjdVar.zzf);
        this.zzh = new C2400k(zzdjdVar.zzg);
        this.zze = zzdjdVar.zzd;
        this.zzf = zzdjdVar.zze;
    }
}
