package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3324b1;
import com.google.android.gms.ads.internal.client.C3377o2;
import com.google.android.gms.ads.internal.client.InterfaceC3301U0;
import java.util.concurrent.atomic.AtomicReference;
import p396y2.InterfaceC7536x;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeyj implements zzcvv, zzcxr, zzezy, InterfaceC7536x, zzcyj, zzcwi, zzddz {
    private final zzfen zza;
    private final AtomicReference zzb = new AtomicReference();
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private zzeyj zzh = null;

    public zzeyj(zzfen zzfenVar) {
        this.zza = zzfenVar;
    }

    public static zzeyj zzn(zzeyj zzeyjVar) {
        zzeyj zzeyjVar2 = new zzeyj(zzeyjVar.zza);
        zzeyjVar2.zzh = zzeyjVar;
        return zzeyjVar2;
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdA() {
        zzeyj zzeyjVar = this.zzh;
        if (zzeyjVar != null) {
            zzeyjVar.zzdA();
        } else {
            zzezq.zza(this.zzf, zzexw.zza);
        }
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdB() {
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdC() {
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdD() {
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdE() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final void zzdN(final C3324b1 c3324b1) {
        zzeyj zzeyjVar = this.zzh;
        if (zzeyjVar != null) {
            zzeyjVar.zzdN(c3324b1);
            return;
        }
        AtomicReference atomicReference = this.zzb;
        zzezq.zza(atomicReference, new zzezp() { // from class: com.google.android.gms.internal.ads.zzexz
            @Override // com.google.android.gms.internal.ads.zzezp
            public final /* synthetic */ void zza(Object obj) {
                ((zzbae) obj).zzd(c3324b1);
            }
        });
        zzezq.zza(atomicReference, new zzezp() { // from class: com.google.android.gms.internal.ads.zzeya
            @Override // com.google.android.gms.internal.ads.zzezp
            public final /* synthetic */ void zza(Object obj) {
                ((zzbae) obj).zzc(c3324b1.f13918a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddz
    public final void zzdV() {
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdX() {
        zzeyj zzeyjVar = this.zzh;
        if (zzeyjVar != null) {
            zzeyjVar.zzdX();
        } else {
            zzezq.zza(this.zzf, zzexv.zza);
        }
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdY(final int i7) {
        zzeyj zzeyjVar = this.zzh;
        if (zzeyjVar != null) {
            zzeyjVar.zzdY(i7);
        } else {
            zzezq.zza(this.zzf, new zzezp() { // from class: com.google.android.gms.internal.ads.zzeyb
                @Override // com.google.android.gms.internal.ads.zzezp
                public final /* synthetic */ void zza(Object obj) {
                    ((InterfaceC7536x) obj).zzdY(i7);
                }
            });
        }
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdt() {
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdu() {
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdv() {
    }

    @Override // com.google.android.gms.internal.ads.zzddz
    public final void zzdz() {
        zzeyj zzeyjVar = this.zzh;
        if (zzeyjVar != null) {
            zzeyjVar.zzdz();
        } else {
            zzezq.zza(this.zzd, zzeyh.zza);
        }
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzh() {
        zzeyj zzeyjVar = this.zzh;
        if (zzeyjVar != null) {
            zzeyjVar.zzh();
            return;
        }
        zzezq.zza(this.zzf, zzexx.zza);
        AtomicReference atomicReference = this.zzd;
        zzezq.zza(atomicReference, zzeyf.zza);
        zzezq.zza(atomicReference, zzeyg.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzj(final C3324b1 c3324b1) {
        zzeyj zzeyjVar = this.zzh;
        if (zzeyjVar != null) {
            zzeyjVar.zzj(c3324b1);
        } else {
            zzezq.zza(this.zzd, new zzezp() { // from class: com.google.android.gms.internal.ads.zzeyc
                @Override // com.google.android.gms.internal.ads.zzezp
                public final /* synthetic */ void zza(Object obj) {
                    ((zzbai) obj).zze(c3324b1);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxr
    public final void zzl() {
        zzeyj zzeyjVar = this.zzh;
        if (zzeyjVar != null) {
            zzeyjVar.zzl();
        } else {
            zzezq.zza(this.zze, zzexu.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyj
    public final void zzm(final C3377o2 c3377o2) {
        zzeyj zzeyjVar = this.zzh;
        if (zzeyjVar != null) {
            zzeyjVar.zzm(c3377o2);
        } else {
            zzezq.zza(this.zzg, new zzezp() { // from class: com.google.android.gms.internal.ads.zzeyd
                @Override // com.google.android.gms.internal.ads.zzezp
                public final /* synthetic */ void zza(Object obj) {
                    ((InterfaceC3301U0) obj).mo17215j0(c3377o2);
                }
            });
        }
    }

    public final void zzo(zzbae zzbaeVar) {
        this.zzb.set(zzbaeVar);
    }

    public final void zzp(zzbai zzbaiVar) {
        this.zzd.set(zzbaiVar);
    }

    public final void zzq(InterfaceC7536x interfaceC7536x) {
        this.zzf.set(interfaceC7536x);
    }

    public final void zzr(InterfaceC3301U0 interfaceC3301U0) {
        this.zzg.set(interfaceC3301U0);
    }

    public final void zzs(final zzbab zzbabVar) {
        zzeyj zzeyjVar = this.zzh;
        if (zzeyjVar != null) {
            zzeyjVar.zzs(zzbabVar);
        } else {
            zzezq.zza(this.zzb, new zzezp() { // from class: com.google.android.gms.internal.ads.zzexy
                @Override // com.google.android.gms.internal.ads.zzezp
                public final /* synthetic */ void zza(Object obj) {
                    ((zzbae) obj).zzb(zzbabVar);
                }
            });
        }
    }

    public final void zzt() {
        zzeyj zzeyjVar = this.zzh;
        if (zzeyjVar != null) {
            zzeyjVar.zzt();
            return;
        }
        this.zza.zzb();
        zzezq.zza(this.zzc, zzeye.zza);
        zzezq.zza(this.zzd, zzeyi.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzezy
    public final void zzu(zzezy zzezyVar) {
        this.zzh = (zzeyj) zzezyVar;
    }
}
