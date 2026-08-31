package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3324b1;
import com.google.android.gms.ads.internal.client.C3377o2;
import com.google.android.gms.ads.internal.client.InterfaceC3301U0;
import java.util.concurrent.atomic.AtomicReference;
import p068I2.InterfaceC0606a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfbn implements InterfaceC0606a, zzcxg, zzcvv, zzcvs, zzcwi, zzcyj, zzezy, zzddz {
    private final zzfen zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicReference zzh = new AtomicReference();
    private zzfbn zzi = null;

    public zzfbn(zzfen zzfenVar) {
        this.zza = zzfenVar;
    }

    @Override // p068I2.InterfaceC0606a
    public final void onAdMetadataChanged() {
        zzfbn zzfbnVar = this.zzi;
        if (zzfbnVar != null) {
            zzfbnVar.onAdMetadataChanged();
        } else {
            zzezq.zza(this.zzb, zzfbm.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzd(final zzbvh zzbvhVar, final String str, final String str2) {
        zzfbn zzfbnVar = this.zzi;
        if (zzfbnVar != null) {
            zzfbnVar.zzd(zzbvhVar, str, str2);
            return;
        }
        zzezq.zza(this.zzd, new zzezp() { // from class: com.google.android.gms.internal.ads.zzfat
            @Override // com.google.android.gms.internal.ads.zzezp
            public final /* synthetic */ void zza(Object obj) {
                zzbvh zzbvhVar2 = zzbvhVar;
                ((zzbwd) obj).zzg(new zzbwr(zzbvhVar2.zzb(), zzbvhVar2.zzc()));
            }
        });
        zzezq.zza(this.zzf, new zzezp() { // from class: com.google.android.gms.internal.ads.zzfau
            @Override // com.google.android.gms.internal.ads.zzezp
            public final /* synthetic */ void zza(Object obj) {
                zzbvh zzbvhVar2 = zzbvhVar;
                ((zzbwi) obj).zze(new zzbwr(zzbvhVar2.zzb(), zzbvhVar2.zzc()), str, str2);
            }
        });
        zzezq.zza(this.zze, new zzezp() { // from class: com.google.android.gms.internal.ads.zzfav
            @Override // com.google.android.gms.internal.ads.zzezp
            public final /* synthetic */ void zza(Object obj) {
                ((zzbvn) obj).zzi(zzbvhVar);
            }
        });
        zzezq.zza(this.zzg, new zzezp() { // from class: com.google.android.gms.internal.ads.zzfaw
            @Override // com.google.android.gms.internal.ads.zzezp
            public final /* synthetic */ void zza(Object obj) {
                ((zzbvi) obj).zze(zzbvhVar, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final void zzdN(final C3324b1 c3324b1) {
        zzfbn zzfbnVar = this.zzi;
        if (zzfbnVar != null) {
            zzfbnVar.zzdN(c3324b1);
            return;
        }
        final int i7 = c3324b1.f13918a;
        AtomicReference atomicReference = this.zzc;
        zzezq.zza(atomicReference, new zzezp() { // from class: com.google.android.gms.internal.ads.zzfba
            @Override // com.google.android.gms.internal.ads.zzezp
            public final /* synthetic */ void zza(Object obj) {
                ((zzbwh) obj).zzg(c3324b1);
            }
        });
        zzezq.zza(atomicReference, new zzezp() { // from class: com.google.android.gms.internal.ads.zzfar
            @Override // com.google.android.gms.internal.ads.zzezp
            public final /* synthetic */ void zza(Object obj) {
                ((zzbwh) obj).zzf(i7);
            }
        });
        zzezq.zza(this.zze, new zzezp() { // from class: com.google.android.gms.internal.ads.zzfas
            @Override // com.google.android.gms.internal.ads.zzezp
            public final /* synthetic */ void zza(Object obj) {
                ((zzbvn) obj).zzk(i7);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdO() {
        zzfbn zzfbnVar = this.zzi;
        if (zzfbnVar != null) {
            zzfbnVar.zzdO();
        } else {
            zzezq.zza(this.zze, zzfbi.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddz
    public final void zzdV() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdx() {
        zzfbn zzfbnVar = this.zzi;
        if (zzfbnVar != null) {
            zzfbnVar.zzdx();
            return;
        }
        this.zza.zzb();
        zzezq.zza(this.zzd, zzfbc.zza);
        zzezq.zza(this.zze, zzfbh.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdy() {
        zzfbn zzfbnVar = this.zzi;
        if (zzfbnVar != null) {
            zzfbnVar.zzdy();
            return;
        }
        AtomicReference atomicReference = this.zzd;
        zzezq.zza(atomicReference, zzfbe.zza);
        zzezq.zza(this.zze, zzfbg.zza);
        zzezq.zza(atomicReference, zzfbb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzddz
    public final void zzdz() {
        zzfbn zzfbnVar = this.zzi;
        if (zzfbnVar != null) {
            zzfbnVar.zzdz();
        } else {
            zzezq.zza(this.zzd, zzfbd.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zze() {
        zzfbn zzfbnVar = this.zzi;
        if (zzfbnVar != null) {
            zzfbnVar.zze();
        } else {
            zzezq.zza(this.zze, zzfbj.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzf() {
        zzfbn zzfbnVar = this.zzi;
        if (zzfbnVar != null) {
            zzfbnVar.zzf();
        } else {
            zzezq.zza(this.zze, zzfbk.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzg() {
        zzfbn zzfbnVar = this.zzi;
        if (zzfbnVar != null) {
            zzfbnVar.zzg();
        } else {
            zzezq.zza(this.zzc, zzfbf.zza);
            zzezq.zza(this.zze, zzfbl.zza);
        }
    }

    public final void zzh(zzbwh zzbwhVar) {
        this.zzc.set(zzbwhVar);
    }

    public final void zzi(zzbwd zzbwdVar) {
        this.zzd.set(zzbwdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzj(final C3324b1 c3324b1) {
        zzfbn zzfbnVar = this.zzi;
        if (zzfbnVar != null) {
            zzfbnVar.zzj(c3324b1);
            return;
        }
        AtomicReference atomicReference = this.zzd;
        zzezq.zza(atomicReference, new zzezp() { // from class: com.google.android.gms.internal.ads.zzfax
            @Override // com.google.android.gms.internal.ads.zzezp
            public final /* synthetic */ void zza(Object obj) {
                ((zzbwd) obj).zzi(c3324b1);
            }
        });
        zzezq.zza(atomicReference, new zzezp() { // from class: com.google.android.gms.internal.ads.zzfay
            @Override // com.google.android.gms.internal.ads.zzezp
            public final /* synthetic */ void zza(Object obj) {
                ((zzbwd) obj).zzh(c3324b1.f13918a);
            }
        });
    }

    public final void zzk(InterfaceC0606a interfaceC0606a) {
        this.zzb.set(interfaceC0606a);
    }

    public final void zzl(InterfaceC3301U0 interfaceC3301U0) {
        this.zzh.set(interfaceC3301U0);
    }

    @Override // com.google.android.gms.internal.ads.zzcyj
    public final void zzm(final C3377o2 c3377o2) {
        zzfbn zzfbnVar = this.zzi;
        if (zzfbnVar != null) {
            zzfbnVar.zzm(c3377o2);
        } else {
            zzezq.zza(this.zzh, new zzezp() { // from class: com.google.android.gms.internal.ads.zzfaz
                @Override // com.google.android.gms.internal.ads.zzezp
                public final /* synthetic */ void zza(Object obj) {
                    ((InterfaceC3301U0) obj).mo17215j0(c3377o2);
                }
            });
        }
    }

    @Deprecated
    public final void zzn(zzbvn zzbvnVar) {
        this.zze.set(zzbvnVar);
    }

    public final void zzo(zzbwi zzbwiVar) {
        this.zzf.set(zzbwiVar);
    }

    @Deprecated
    public final void zzp(zzbvi zzbviVar) {
        this.zzg.set(zzbviVar);
    }

    @Override // com.google.android.gms.internal.ads.zzezy
    public final void zzu(zzezy zzezyVar) {
        this.zzi = (zzfbn) zzezyVar;
    }
}
