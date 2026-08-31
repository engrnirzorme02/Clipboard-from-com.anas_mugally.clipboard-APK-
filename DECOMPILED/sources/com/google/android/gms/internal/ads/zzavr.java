package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzavr implements zzfqb {
    private final zzfoj zza;
    private final zzfox zzb;
    private final zzawe zzc;
    private final zzavq zzd;
    private final zzava zze;
    private final zzawg zzf;
    private final zzavy zzg;
    private final zzavp zzh;

    zzavr(zzfoj zzfojVar, zzfox zzfoxVar, zzawe zzaweVar, zzavq zzavqVar, zzava zzavaVar, zzawg zzawgVar, zzavy zzavyVar, zzavp zzavpVar) {
        this.zza = zzfojVar;
        this.zzb = zzfoxVar;
        this.zzc = zzaweVar;
        this.zzd = zzavqVar;
        this.zze = zzavaVar;
        this.zzf = zzawgVar;
        this.zzg = zzavyVar;
        this.zzh = zzavpVar;
    }

    private final Map zzf() {
        HashMap map = new HashMap();
        zzfoj zzfojVar = this.zza;
        zzast zzastVarZzb = this.zzb.zzb();
        map.put("v", zzfojVar.zza());
        map.put("gms", Boolean.valueOf(zzfojVar.zzc()));
        map.put("gv", Long.valueOf(zzastVarZzb.zzc()));
        map.put("int", zzastVarZzb.zzb());
        map.put("attts", Long.valueOf(zzastVarZzb.zzg().zzb()));
        map.put("att", zzastVarZzb.zzg().zzd());
        map.put("attkid", zzastVarZzb.zzg().zzc());
        map.put("up", Boolean.valueOf(this.zzd.zza()));
        map.put("t", new Throwable());
        zzavy zzavyVar = this.zzg;
        if (zzavyVar != null) {
            map.put("tcq", Long.valueOf(zzavyVar.zze()));
            map.put("tpq", Long.valueOf(zzavyVar.zzd()));
            map.put("tcv", Long.valueOf(zzavyVar.zzf()));
            map.put("tpv", Long.valueOf(zzavyVar.zzg()));
            map.put("tchv", Long.valueOf(zzavyVar.zzi()));
            map.put("tphv", Long.valueOf(zzavyVar.zzh()));
            map.put("tcc", Long.valueOf(zzavyVar.zzj()));
            map.put("tpc", Long.valueOf(zzavyVar.zzk()));
            zzava zzavaVar = this.zze;
            if (zzavaVar != null) {
                map.put("nt", Long.valueOf(zzavaVar.zzc()));
            }
            zzawg zzawgVar = this.zzf;
            if (zzawgVar != null) {
                map.put("vs", Long.valueOf(zzawgVar.zzc()));
                map.put("vf", Long.valueOf(zzawgVar.zzd()));
            }
        }
        return map;
    }

    final void zza(View view) {
        this.zzc.zza(view);
    }

    @Override // com.google.android.gms.internal.ads.zzfqb
    public final Map zzb() {
        return zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzfqb
    public final Map zzc() {
        zzavp zzavpVar = this.zzh;
        Map mapZzf = zzf();
        if (zzavpVar != null) {
            mapZzf.put("vst", zzavpVar.zzb());
        }
        return mapZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzfqb
    public final Map zzd() {
        zzawe zzaweVar = this.zzc;
        Map mapZzf = zzf();
        mapZzf.put("lts", Long.valueOf(zzaweVar.zzc()));
        return mapZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzfqb
    public final Map zze() {
        HashMap map = new HashMap();
        map.put("t", new Throwable());
        return map;
    }
}
