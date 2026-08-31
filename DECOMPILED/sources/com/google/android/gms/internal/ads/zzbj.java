package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.C3553a;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public class zzbj {
    private int zza;
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private zzgjz zzi;
    private zzgjz zzj;
    private zzgjz zzk;
    private zzgjz zzl;
    private zzgjz zzm;
    private int zzn;
    private int zzo;
    private zzgjz zzp;
    private zzbi zzq;
    private zzgjz zzr;
    private boolean zzs;
    private zzgjz zzt;
    private HashMap zzu;
    private HashSet zzv;

    public zzbj() {
        this.zza = C3553a.e.API_PRIORITY_OTHER;
        this.zzb = C3553a.e.API_PRIORITY_OTHER;
        this.zzc = C3553a.e.API_PRIORITY_OTHER;
        this.zzd = C3553a.e.API_PRIORITY_OTHER;
        this.zze = C3553a.e.API_PRIORITY_OTHER;
        this.zzf = C3553a.e.API_PRIORITY_OTHER;
        this.zzg = true;
        this.zzh = true;
        this.zzi = zzgjz.zzi();
        this.zzj = zzgjz.zzi();
        this.zzk = zzgjz.zzi();
        this.zzl = zzgjz.zzi();
        this.zzm = zzgjz.zzi();
        this.zzn = C3553a.e.API_PRIORITY_OTHER;
        this.zzo = C3553a.e.API_PRIORITY_OTHER;
        this.zzp = zzgjz.zzi();
        this.zzq = zzbi.zza;
        this.zzr = zzgjz.zzi();
        this.zzs = true;
        this.zzt = zzgjz.zzi();
        this.zzu = new HashMap();
        this.zzv = new HashSet();
    }

    private final void zzx(zzbk zzbkVar) {
        this.zza = zzbkVar.zza;
        this.zzb = zzbkVar.zzb;
        this.zzc = zzbkVar.zzc;
        this.zzd = zzbkVar.zzd;
        this.zze = zzbkVar.zzi;
        this.zzf = zzbkVar.zzj;
        this.zzg = zzbkVar.zzk;
        this.zzh = zzbkVar.zzl;
        this.zzj = zzbkVar.zzn;
        this.zzi = zzbkVar.zzm;
        this.zzk = zzbkVar.zzo;
        this.zzl = zzbkVar.zzq;
        this.zzm = zzbkVar.zzr;
        this.zzn = zzbkVar.zzt;
        this.zzo = zzbkVar.zzu;
        this.zzp = zzbkVar.zzv;
        this.zzq = zzbkVar.zzw;
        this.zzr = zzbkVar.zzy;
        this.zzs = zzbkVar.zzB;
        this.zzt = zzbkVar.zzz;
        this.zzv = new HashSet(zzbkVar.zzI);
        this.zzu = new HashMap(zzbkVar.zzH);
    }

    protected final zzbj zza(zzbk zzbkVar) {
        zzx(zzbkVar);
        return this;
    }

    final /* synthetic */ int zzb() {
        return this.zza;
    }

    final /* synthetic */ int zzc() {
        return this.zzb;
    }

    final /* synthetic */ int zzd() {
        return this.zzc;
    }

    final /* synthetic */ int zze() {
        return this.zzd;
    }

    final /* synthetic */ int zzf() {
        return this.zze;
    }

    final /* synthetic */ int zzg() {
        return this.zzf;
    }

    final /* synthetic */ boolean zzh() {
        return this.zzg;
    }

    final /* synthetic */ boolean zzi() {
        return this.zzh;
    }

    final /* synthetic */ zzgjz zzj() {
        return this.zzi;
    }

    final /* synthetic */ zzgjz zzk() {
        return this.zzj;
    }

    final /* synthetic */ zzgjz zzl() {
        return this.zzk;
    }

    final /* synthetic */ zzgjz zzm() {
        return this.zzl;
    }

    final /* synthetic */ zzgjz zzn() {
        return this.zzm;
    }

    final /* synthetic */ int zzo() {
        return this.zzn;
    }

    final /* synthetic */ int zzp() {
        return this.zzo;
    }

    final /* synthetic */ zzgjz zzq() {
        return this.zzp;
    }

    final /* synthetic */ zzbi zzr() {
        return this.zzq;
    }

    final /* synthetic */ zzgjz zzs() {
        return this.zzr;
    }

    final /* synthetic */ boolean zzt() {
        return this.zzs;
    }

    final /* synthetic */ zzgjz zzu() {
        return this.zzt;
    }

    final /* synthetic */ HashMap zzv() {
        return this.zzu;
    }

    final /* synthetic */ HashSet zzw() {
        return this.zzv;
    }

    protected zzbj(zzbk zzbkVar) {
        zzx(zzbkVar);
    }
}
