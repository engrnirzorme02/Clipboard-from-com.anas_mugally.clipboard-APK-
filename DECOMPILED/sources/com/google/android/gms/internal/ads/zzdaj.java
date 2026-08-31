package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.C3324b1;
import com.google.android.gms.ads.internal.client.C3377o2;
import com.google.android.gms.ads.internal.client.InterfaceC3318a;
import p068I2.InterfaceC0606a;
import p324p2.InterfaceC6738e;
import p396y2.InterfaceC7536x;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdaj implements InterfaceC6738e, InterfaceC0606a, zzcvs, InterfaceC3318a, zzcyj, zzcwm, zzcxr, InterfaceC7536x, zzcwi, zzddz {
    private final zzczi zza = new zzczi(this, null);
    private zzeli zzb;
    private zzelm zzc;
    private zzeyj zzd;
    private zzfbn zze;

    private static void zzs(Object obj, zzdai zzdaiVar) {
        if (obj != null) {
            zzdaiVar.zza(obj);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3318a
    public final void onAdClicked() {
        zzs(this.zzb, zzczn.zza);
        zzs(this.zzc, zzdaa.zza);
    }

    @Override // p068I2.InterfaceC0606a
    public final void onAdMetadataChanged() {
        zzs(this.zze, zzdag.zza);
    }

    @Override // p324p2.InterfaceC6738e
    public final void onAppEvent(final String str, final String str2) {
        zzs(this.zzb, new zzdai() { // from class: com.google.android.gms.internal.ads.zzcza
            @Override // com.google.android.gms.internal.ads.zzdai
            public final /* synthetic */ void zza(Object obj) {
                ((zzeli) obj).onAppEvent(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzd(final zzbvh zzbvhVar, final String str, final String str2) {
        zzs(this.zzb, new zzdai(zzbvhVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzczh
            @Override // com.google.android.gms.internal.ads.zzdai
            public final /* synthetic */ void zza(Object obj) {
            }
        });
        zzs(this.zze, new zzdai() { // from class: com.google.android.gms.internal.ads.zzcyz
            @Override // com.google.android.gms.internal.ads.zzdai
            public final /* synthetic */ void zza(Object obj) {
                ((zzfbn) obj).zzd(zzbvhVar, str, str2);
            }
        });
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdA() {
        zzs(this.zzd, zzczv.zza);
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdB() {
        zzs(this.zzd, zzczw.zza);
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdC() {
        zzs(this.zzd, zzczx.zza);
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdD() {
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdE() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdO() {
        zzs(this.zzb, zzczk.zza);
        zzs(this.zze, zzdac.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzddz
    public final void zzdV() {
        zzs(this.zzb, zzczo.zza);
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdX() {
        zzs(this.zzd, zzczu.zza);
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzdY(final int i7) {
        zzs(this.zzd, new zzdai() { // from class: com.google.android.gms.internal.ads.zzczg
            @Override // com.google.android.gms.internal.ads.zzdai
            public final /* synthetic */ void zza(Object obj) {
                ((zzeyj) obj).zzdY(i7);
            }
        });
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

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdw() {
        zzs(this.zzb, zzczq.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdx() {
        zzs(this.zzb, zzczj.zza);
        zzs(this.zze, zzdab.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzdy() {
        zzs(this.zzb, zzczr.zza);
        zzs(this.zze, zzdah.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzddz
    public final void zzdz() {
        zzs(this.zzb, zzczp.zza);
        zzs(this.zzc, zzczz.zza);
        zzs(this.zze, zzdaf.zza);
        zzs(this.zzd, zzczy.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zze() {
        zzs(this.zzb, zzczl.zza);
        zzs(this.zze, zzdad.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    public final void zzf() {
        zzs(this.zzb, zzczm.zza);
        zzs(this.zze, zzdae.zza);
    }

    @Override // p396y2.InterfaceC7536x
    public final void zzh() {
        zzs(this.zzd, zzczt.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzj(final C3324b1 c3324b1) {
        zzs(this.zze, new zzdai() { // from class: com.google.android.gms.internal.ads.zzcze
            @Override // com.google.android.gms.internal.ads.zzdai
            public final /* synthetic */ void zza(Object obj) {
                ((zzfbn) obj).zzj(c3324b1);
            }
        });
        zzs(this.zzb, new zzdai() { // from class: com.google.android.gms.internal.ads.zzczf
            @Override // com.google.android.gms.internal.ads.zzdai
            public final /* synthetic */ void zza(Object obj) {
                ((zzeli) obj).zzj(c3324b1);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxr
    public final void zzl() {
        zzs(this.zzd, zzczs.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcyj
    public final void zzm(final C3377o2 c3377o2) {
        zzs(this.zzb, new zzdai() { // from class: com.google.android.gms.internal.ads.zzczb
            @Override // com.google.android.gms.internal.ads.zzdai
            public final /* synthetic */ void zza(Object obj) {
                ((zzeli) obj).zzm(c3377o2);
            }
        });
        zzs(this.zze, new zzdai() { // from class: com.google.android.gms.internal.ads.zzczc
            @Override // com.google.android.gms.internal.ads.zzdai
            public final /* synthetic */ void zza(Object obj) {
                ((zzfbn) obj).zzm(c3377o2);
            }
        });
        zzs(this.zzd, new zzdai() { // from class: com.google.android.gms.internal.ads.zzczd
            @Override // com.google.android.gms.internal.ads.zzdai
            public final /* synthetic */ void zza(Object obj) {
                ((zzeyj) obj).zzm(c3377o2);
            }
        });
    }

    public final zzczi zzn() {
        return this.zza;
    }

    final /* synthetic */ void zzo(zzeli zzeliVar) {
        this.zzb = zzeliVar;
    }

    final /* synthetic */ void zzp(zzelm zzelmVar) {
        this.zzc = zzelmVar;
    }

    final /* synthetic */ void zzq(zzeyj zzeyjVar) {
        this.zzd = zzeyjVar;
    }

    final /* synthetic */ void zzr(zzfbn zzfbnVar) {
        this.zze = zzfbnVar;
    }
}
