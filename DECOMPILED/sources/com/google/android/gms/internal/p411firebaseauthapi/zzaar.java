package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.firebase.auth.C4833Q;
import com.google.firebase.auth.C4856h;
import com.google.firebase.auth.C4861j0;
import p192Z3.AbstractC2137o;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaar {
    private final zzaft zza;

    public zzaar(zzaft zzaftVar) {
        this.zza = (zzaft) AbstractC3718s.m18083l(zzaftVar);
    }

    public final void zzb(String str, String str2, zzael zzaelVar) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18077f(str2);
        AbstractC3718s.m18083l(zzaelVar);
        zza(str, new zzacj(this, str2, zzaelVar));
    }

    public final void zzc(String str, String str2, zzael zzaelVar) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18077f(str2);
        AbstractC3718s.m18083l(zzaelVar);
        zza(str, new zzacm(this, str2, zzaelVar));
    }

    public final void zzd(String str, String str2, zzael zzaelVar) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18083l(zzaelVar);
        this.zza.zza(new zzaic(str, null, str2), new zzabe(this, zzaelVar));
    }

    public final void zze(String str, String str2, zzael zzaelVar) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18083l(zzaelVar);
        this.zza.zza(new zzags(str, str2), new zzabc(this, zzaelVar));
    }

    public final void zzf(String str, zzael zzaelVar) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18083l(zzaelVar);
        zza(str, new zzabn(this, zzaelVar));
    }

    static /* synthetic */ void zza(zzaar zzaarVar, zzajd zzajdVar, zzael zzaelVar, zzafs zzafsVar) {
        Status statusM8742a;
        if (zzajdVar.zzo()) {
            C4861j0 c4861j0Zzb = zzajdVar.zzb();
            String strZzc = zzajdVar.zzc();
            String strZzj = zzajdVar.zzj();
            if (zzajdVar.zzm()) {
                statusM8742a = new Status(17012);
            } else {
                statusM8742a = AbstractC2137o.m8742a(zzajdVar.zzd());
            }
            zzaelVar.zza(new zzaap(statusM8742a, c4861j0Zzb, strZzc, strZzj));
            return;
        }
        zzaarVar.zza(new zzahv(zzajdVar.zzi(), zzajdVar.zze(), Long.valueOf(zzajdVar.zza()), "Bearer"), zzajdVar.zzh(), zzajdVar.zzg(), Boolean.valueOf(zzajdVar.zzn()), zzajdVar.zzb(), zzaelVar, zzafsVar);
    }

    public final void zzf(String str, String str2, zzael zzaelVar) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18077f(str2);
        AbstractC3718s.m18083l(zzaelVar);
        zza(str2, new zzabq(this, str, zzaelVar));
    }

    private final void zzd(zzahm zzahmVar, zzael zzaelVar) {
        AbstractC3718s.m18083l(zzahmVar);
        AbstractC3718s.m18083l(zzaelVar);
        this.zza.zza(zzahmVar, new zzacf(this, zzaelVar));
    }

    public final void zzb(String str, zzael zzaelVar) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18083l(zzaelVar);
        this.zza.zza(new zzahj(str), new zzaau(this, zzaelVar));
    }

    public final void zzc(String str, zzael zzaelVar) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18083l(zzaelVar);
        zza(str, new zzacc(this, zzaelVar));
    }

    public final void zze(String str, zzael zzaelVar) {
        AbstractC3718s.m18083l(zzaelVar);
        this.zza.zza(new zzaim(str), new zzaci(this, zzaelVar));
    }

    public final void zzc(zzahm zzahmVar, zzael zzaelVar) {
        zzd(zzahmVar, zzaelVar);
    }

    public final void zzd(String str, zzael zzaelVar) {
        AbstractC3718s.m18083l(zzaelVar);
        this.zza.zza(str, new zzacg(this, zzaelVar));
    }

    public final void zzb(zzahm zzahmVar, zzael zzaelVar) {
        AbstractC3718s.m18077f(zzahmVar.zzc());
        AbstractC3718s.m18083l(zzaelVar);
        this.zza.zza(zzahmVar, new zzabb(this, zzaelVar));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzael zzaelVar) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18077f(str2);
        AbstractC3718s.m18083l(zzaelVar);
        this.zza.zza(new zzaje(str, str2, str3, str4), new zzaaw(this, zzaelVar));
    }

    static /* synthetic */ void zza(zzaar zzaarVar, zzael zzaelVar, zzaim zzaimVar, zzafs zzafsVar) {
        AbstractC3718s.m18083l(zzaelVar);
        AbstractC3718s.m18083l(zzaimVar);
        AbstractC3718s.m18083l(zzafsVar);
        zzaarVar.zza.zza(zzaimVar, new zzabk(zzaarVar, zzaelVar, zzafsVar));
    }

    static /* synthetic */ void zza(zzaar zzaarVar, zzael zzaelVar, zzahv zzahvVar, zzail zzailVar, zzafs zzafsVar) {
        AbstractC3718s.m18083l(zzaelVar);
        AbstractC3718s.m18083l(zzahvVar);
        AbstractC3718s.m18083l(zzailVar);
        AbstractC3718s.m18083l(zzafsVar);
        zzaarVar.zza.zza(new zzahi(zzahvVar.zzc()), new zzaax(zzaarVar, zzafsVar, zzaelVar, zzahvVar, zzailVar));
    }

    static /* synthetic */ void zza(zzaar zzaarVar, zzael zzaelVar, zzahv zzahvVar, zzahk zzahkVar, zzail zzailVar, zzafs zzafsVar) {
        AbstractC3718s.m18083l(zzaelVar);
        AbstractC3718s.m18083l(zzahvVar);
        AbstractC3718s.m18083l(zzahkVar);
        AbstractC3718s.m18083l(zzailVar);
        AbstractC3718s.m18083l(zzafsVar);
        zzaarVar.zza.zza(zzailVar, new zzaba(zzaarVar, zzailVar, zzahkVar, zzaelVar, zzahvVar, zzafsVar));
    }

    public final void zza(String str, String str2, zzael zzaelVar) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18083l(zzaelVar);
        zzail zzailVar = new zzail();
        zzailVar.zze(str);
        zzailVar.zzh(str2);
        this.zza.zza(zzailVar, new zzacl(this, zzaelVar));
    }

    public final void zza(zzaic zzaicVar, zzael zzaelVar) {
        AbstractC3718s.m18077f(zzaicVar.zzb());
        AbstractC3718s.m18083l(zzaelVar);
        this.zza.zza(zzaicVar, new zzabg(this, zzaelVar));
    }

    public final void zza(String str, String str2, String str3, String str4, zzael zzaelVar) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18077f(str2);
        AbstractC3718s.m18083l(zzaelVar);
        this.zza.zza(new zzaim(str, str2, null, str3, str4, null), new zzaat(this, zzaelVar));
    }

    public final void zza(String str, zzael zzaelVar) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18083l(zzaelVar);
        zza(str, new zzace(this, zzaelVar));
    }

    private final void zza(String str, zzafv<zzahv> zzafvVar) {
        AbstractC3718s.m18083l(zzafvVar);
        AbstractC3718s.m18077f(str);
        zzahv zzahvVarZzb = zzahv.zzb(str);
        if (zzahvVarZzb.zzg()) {
            zzafvVar.zza(zzahvVarZzb);
        } else {
            this.zza.zza(new zzahj(zzahvVarZzb.zzd()), new zzaco(this, zzafvVar));
        }
    }

    public final void zza(zzagz zzagzVar, String str, zzael zzaelVar) {
        AbstractC3718s.m18083l(zzagzVar);
        AbstractC3718s.m18083l(zzaelVar);
        zza(str, new zzabw(this, zzagzVar, zzaelVar));
    }

    public final void zza(zzahb zzahbVar, zzael zzaelVar) {
        AbstractC3718s.m18083l(zzahbVar);
        AbstractC3718s.m18083l(zzaelVar);
        this.zza.zza(zzahbVar, new zzaby(this, zzaelVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzagx zzagxVar, zzael zzaelVar) {
        AbstractC3718s.m18083l(zzagxVar);
        AbstractC3718s.m18083l(zzaelVar);
        this.zza.zza(zzagxVar, new zzaay(this, zzaelVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzahv zzahvVar, String str, String str2, Boolean bool, C4861j0 c4861j0, zzael zzaelVar, zzafs zzafsVar) {
        AbstractC3718s.m18083l(zzahvVar);
        AbstractC3718s.m18083l(zzafsVar);
        AbstractC3718s.m18083l(zzaelVar);
        this.zza.zza(new zzahi(zzahvVar.zzc()), new zzaaz(this, zzafsVar, str2, str, bool, c4861j0, zzaelVar, zzahvVar));
    }

    public final void zza(zzaho zzahoVar, zzael zzaelVar) {
        AbstractC3718s.m18083l(zzahoVar);
        AbstractC3718s.m18083l(zzaelVar);
        this.zza.zza(zzahoVar, new zzabz(this, zzaelVar));
    }

    public final void zza(zzaht zzahtVar, zzael zzaelVar) {
        AbstractC3718s.m18083l(zzahtVar);
        AbstractC3718s.m18083l(zzaelVar);
        this.zza.zza(zzahtVar, new zzaca(this, zzaelVar));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzael zzaelVar) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18077f(str2);
        AbstractC3718s.m18077f(str3);
        AbstractC3718s.m18083l(zzaelVar);
        zza(str3, new zzabh(this, str, str2, str4, str5, zzaelVar));
    }

    public final void zza(String str, zzajb zzajbVar, zzael zzaelVar) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18083l(zzajbVar);
        AbstractC3718s.m18083l(zzaelVar);
        zza(str, new zzabl(this, zzajbVar, zzaelVar));
    }

    public final void zza(String str, zzajg zzajgVar, zzael zzaelVar) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18083l(zzajgVar);
        AbstractC3718s.m18083l(zzaelVar);
        zza(str, new zzabj(this, zzajgVar, zzaelVar));
    }

    public final void zza(zzaie zzaieVar, zzael zzaelVar) {
        this.zza.zza(zzaieVar, new zzach(this, zzaelVar));
    }

    public final void zza(zzahm zzahmVar, zzael zzaelVar) {
        AbstractC3718s.m18077f(zzahmVar.zzd());
        AbstractC3718s.m18083l(zzaelVar);
        zzd(zzahmVar, zzaelVar);
    }

    public final void zza(zzaij zzaijVar, zzael zzaelVar) {
        AbstractC3718s.m18077f(zzaijVar.zzd());
        AbstractC3718s.m18083l(zzaelVar);
        this.zza.zza(zzaijVar, new zzabf(this, zzaelVar));
    }

    public final void zza(zzajb zzajbVar, zzael zzaelVar) {
        AbstractC3718s.m18083l(zzajbVar);
        AbstractC3718s.m18083l(zzaelVar);
        zzajbVar.zzb(true);
        this.zza.zza(zzajbVar, new zzabu(this, zzaelVar));
    }

    public final void zza(zzajc zzajcVar, zzael zzaelVar) {
        AbstractC3718s.m18083l(zzajcVar);
        AbstractC3718s.m18083l(zzaelVar);
        this.zza.zza(zzajcVar, new zzabd(this, zzaelVar));
    }

    public final void zza(C4856h c4856h, String str, zzael zzaelVar) {
        AbstractC3718s.m18083l(c4856h);
        AbstractC3718s.m18083l(zzaelVar);
        if (c4856h.zzg()) {
            zza(c4856h.m22037X(), new zzaav(this, c4856h, str, zzaelVar));
        } else {
            zza(new zzagx(c4856h, null, str), zzaelVar);
        }
    }

    public final void zza(zzajg zzajgVar, zzael zzaelVar) {
        AbstractC3718s.m18083l(zzajgVar);
        AbstractC3718s.m18083l(zzaelVar);
        this.zza.zza(zzajgVar, new zzabi(this, zzaelVar));
    }

    public final void zza(zzaio zzaioVar, zzael zzaelVar) {
        AbstractC3718s.m18083l(zzaioVar);
        AbstractC3718s.m18083l(zzaelVar);
        this.zza.zza(zzaioVar, new zzabt(this, zzaioVar, zzaelVar));
    }

    public final void zza(zzaiq zzaiqVar, zzael zzaelVar) {
        AbstractC3718s.m18083l(zzaiqVar);
        AbstractC3718s.m18083l(zzaelVar);
        this.zza.zza(zzaiqVar, new zzabx(this, zzaelVar));
    }

    public final void zza(String str, String str2, String str3, zzael zzaelVar) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18077f(str2);
        AbstractC3718s.m18083l(zzaelVar);
        zza(str, new zzabs(this, str2, str3, zzaelVar));
    }

    public final void zza(String str, C4833Q c4833q, zzael zzaelVar) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18083l(c4833q);
        AbstractC3718s.m18083l(zzaelVar);
        zza(str, new zzack(this, c4833q, zzaelVar));
    }
}
