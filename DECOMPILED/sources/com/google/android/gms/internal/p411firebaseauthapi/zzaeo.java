package com.google.android.gms.internal.p411firebaseauthapi;

import android.content.Context;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.firebase.auth.AbstractC4816B;
import com.google.firebase.auth.C4823G;
import com.google.firebase.auth.C4833Q;
import java.util.concurrent.ScheduledExecutorService;
import p164V3.C1762g;
import p191Z2.C2086a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaeo {
    private static final C2086a zza = new C2086a("FirebaseAuth", "FirebaseAuthFallback:");
    private final zzaar zzb;
    private final zzagc zzc;

    zzaeo(C1762g c1762g, ScheduledExecutorService scheduledExecutorService) {
        AbstractC3718s.m18083l(c1762g);
        Context contextM7405l = c1762g.m7405l();
        AbstractC3718s.m18083l(contextM7405l);
        this.zzb = new zzaar(new zzafb(c1762g, zzafc.zza()));
        this.zzc = new zzagc(contextM7405l, scheduledExecutorService);
    }

    public final void zza(String str, String str2, zzaem zzaemVar) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18083l(zzaemVar);
        this.zzb.zza(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zzb(String str, String str2, zzaem zzaemVar) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18077f(str2);
        AbstractC3718s.m18083l(zzaemVar);
        this.zzb.zzb(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zzc(String str, String str2, zzaem zzaemVar) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18077f(str2);
        AbstractC3718s.m18083l(zzaemVar);
        this.zzb.zzc(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zzd(String str, String str2, zzaem zzaemVar) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18083l(zzaemVar);
        this.zzb.zzd(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zze(String str, String str2, zzaem zzaemVar) {
        AbstractC3718s.m18077f(str);
        this.zzb.zze(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zzf(String str, String str2, zzaem zzaemVar) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18077f(str2);
        AbstractC3718s.m18083l(zzaemVar);
        this.zzb.zzf(str, str2, new zzael(zzaemVar, zza));
    }

    public final void zze(String str, zzaem zzaemVar) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18083l(zzaemVar);
        this.zzb.zzf(str, new zzael(zzaemVar, zza));
    }

    public final void zza(zzaic zzaicVar, zzaem zzaemVar) {
        AbstractC3718s.m18083l(zzaicVar);
        AbstractC3718s.m18077f(zzaicVar.zzb());
        AbstractC3718s.m18083l(zzaemVar);
        this.zzb.zza(zzaicVar, new zzael(zzaemVar, zza));
    }

    public final void zzd(String str, zzaem zzaemVar) {
        AbstractC3718s.m18083l(zzaemVar);
        this.zzb.zze(str, new zzael(zzaemVar, zza));
    }

    public final void zzb(String str, zzaem zzaemVar) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18083l(zzaemVar);
        this.zzb.zzb(str, new zzael(zzaemVar, zza));
    }

    public final void zzc(String str, zzaem zzaemVar) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18083l(zzaemVar);
        this.zzb.zzc(str, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, zzaem zzaemVar) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18077f(str2);
        AbstractC3718s.m18083l(zzaemVar);
        this.zzb.zza(str, str2, str3, str4, new zzael(zzaemVar, zza));
    }

    public final void zzb(zzahm zzahmVar, zzaem zzaemVar) {
        AbstractC3718s.m18083l(zzahmVar);
        AbstractC3718s.m18077f(zzahmVar.zzc());
        AbstractC3718s.m18083l(zzaemVar);
        this.zzb.zzb(zzahmVar, new zzael(zzaemVar, zza));
    }

    public final void zzc(zzahm zzahmVar, zzaem zzaemVar) {
        AbstractC3718s.m18083l(zzahmVar);
        this.zzb.zzc(zzahmVar, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, zzaem zzaemVar) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18083l(zzaemVar);
        this.zzb.zza(str, new zzael(zzaemVar, zza));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzaem zzaemVar) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18077f(str2);
        AbstractC3718s.m18083l(zzaemVar);
        AbstractC3718s.m18083l(zzaemVar);
        this.zzb.zzb(str, str2, str3, str4, new zzael(zzaemVar, zza));
    }

    public final void zza(AbstractC4816B abstractC4816B, String str, String str2, String str3, zzaem zzaemVar) {
        AbstractC3718s.m18083l(abstractC4816B);
        AbstractC3718s.m18078g(str, "cachedTokenState should not be empty.");
        AbstractC3718s.m18083l(zzaemVar);
        throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
    }

    public final void zza(String str, AbstractC4816B abstractC4816B, String str2, zzaem zzaemVar) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18083l(abstractC4816B);
        AbstractC3718s.m18083l(zzaemVar);
        throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
    }

    public final void zza(zzaho zzahoVar, zzaem zzaemVar) {
        AbstractC3718s.m18083l(zzahoVar);
        this.zzb.zza(zzahoVar, new zzael(zzaemVar, zza));
    }

    public final void zza(zzaht zzahtVar, zzaem zzaemVar) {
        AbstractC3718s.m18083l(zzahtVar);
        this.zzb.zza(zzahtVar, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzaem zzaemVar) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18077f(str2);
        AbstractC3718s.m18077f(str3);
        AbstractC3718s.m18083l(zzaemVar);
        this.zzb.zza(str, str2, str3, str4, str5, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, zzajb zzajbVar, zzaem zzaemVar) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18083l(zzajbVar);
        AbstractC3718s.m18083l(zzaemVar);
        this.zzb.zza(str, zzajbVar, new zzael(zzaemVar, zza));
    }

    public final void zza(zzahz zzahzVar, zzaem zzaemVar) {
        AbstractC3718s.m18083l(zzaemVar);
        AbstractC3718s.m18083l(zzahzVar);
        this.zzb.zza(AbstractC3718s.m18077f(zzahzVar.zzb()), zzahzVar.zza(), new zzael(zzaemVar, zza));
    }

    public final void zza(zzaie zzaieVar, zzaem zzaemVar) {
        AbstractC3718s.m18083l(zzaieVar);
        this.zzb.zza(zzaieVar, new zzael(zzaemVar, zza));
    }

    public final void zza(zzahm zzahmVar, zzaem zzaemVar) {
        AbstractC3718s.m18083l(zzahmVar);
        AbstractC3718s.m18077f(zzahmVar.zzd());
        AbstractC3718s.m18083l(zzaemVar);
        this.zzb.zza(zzahmVar, new zzael(zzaemVar, zza));
    }

    public final void zza(zzaij zzaijVar, zzaem zzaemVar) {
        AbstractC3718s.m18083l(zzaemVar);
        AbstractC3718s.m18083l(zzaijVar);
        String strZzd = zzaijVar.zzd();
        zzael zzaelVar = new zzael(zzaemVar, zza);
        if (this.zzc.zzc(strZzd)) {
            if (zzaijVar.zze()) {
                this.zzc.zzb(strZzd);
            } else {
                this.zzc.zzb(zzaelVar, strZzd);
                return;
            }
        }
        long jZzb = zzaijVar.zzb();
        boolean zZzf = zzaijVar.zzf();
        if (zza(jZzb, zZzf)) {
            zzaijVar.zza(new zzagm(this.zzc.zzb()));
        }
        this.zzc.zza(strZzd, zzaelVar, jZzb, zZzf);
        this.zzb.zza(zzaijVar, this.zzc.zza(zzaelVar, strZzd));
    }

    public final void zza(zzain zzainVar, zzaem zzaemVar) {
        AbstractC3718s.m18083l(zzainVar);
        AbstractC3718s.m18083l(zzaemVar);
        this.zzb.zzd(zzainVar.zza(), new zzael(zzaemVar, zza));
    }

    public final void zza(zzajb zzajbVar, zzaem zzaemVar) {
        AbstractC3718s.m18083l(zzajbVar);
        AbstractC3718s.m18083l(zzaemVar);
        this.zzb.zza(zzajbVar, new zzael(zzaemVar, zza));
    }

    public final void zza(zzajc zzajcVar, zzaem zzaemVar) {
        AbstractC3718s.m18083l(zzajcVar);
        AbstractC3718s.m18083l(zzaemVar);
        this.zzb.zza(zzajcVar, new zzael(zzaemVar, zza));
    }

    public final void zza(zzagx zzagxVar, zzaem zzaemVar) {
        AbstractC3718s.m18083l(zzaemVar);
        AbstractC3718s.m18083l(zzagxVar.zzb());
        this.zzb.zza(zzagxVar.zzb(), zzagxVar.zzc(), new zzael(zzaemVar, zza));
    }

    public final void zza(zzaan zzaanVar, zzaem zzaemVar) {
        AbstractC3718s.m18083l(zzaemVar);
        AbstractC3718s.m18083l(zzaanVar);
        this.zzb.zza(zzafw.zza((C4823G) AbstractC3718s.m18083l(zzaanVar.zza())), new zzael(zzaemVar, zza));
    }

    public final void zza(String str, String str2, String str3, long j7, boolean z7, boolean z8, String str4, String str5, String str6, boolean z9, zzaem zzaemVar) {
        AbstractC3718s.m18078g(str, "idToken should not be empty.");
        AbstractC3718s.m18083l(zzaemVar);
        zzael zzaelVar = new zzael(zzaemVar, zza);
        if (this.zzc.zzc(str2)) {
            if (z7) {
                this.zzc.zzb(str2);
            } else {
                this.zzc.zzb(zzaelVar, str2);
                return;
            }
        }
        zzais zzaisVarZza = zzais.zza(str, str2, str3, str4, str5, str6, null);
        if (zza(j7, z9)) {
            zzaisVarZza.zza(new zzagm(this.zzc.zzb()));
        }
        this.zzc.zza(str2, zzaelVar, j7, z9);
        this.zzb.zza(zzaisVarZza, this.zzc.zza(zzaelVar, str2));
    }

    public final void zza(zzaaq zzaaqVar, zzaem zzaemVar) {
        AbstractC3718s.m18083l(zzaaqVar);
        AbstractC3718s.m18083l(zzaemVar);
        String strM22013Y = zzaaqVar.zzb().m22013Y();
        zzael zzaelVar = new zzael(zzaemVar, zza);
        if (this.zzc.zzc(strM22013Y)) {
            if (zzaaqVar.zzh()) {
                this.zzc.zzb(strM22013Y);
            } else {
                this.zzc.zzb(zzaelVar, strM22013Y);
                return;
            }
        }
        long jZza = zzaaqVar.zza();
        boolean zZzi = zzaaqVar.zzi();
        zzaiq zzaiqVarZza = zzaiq.zza(zzaaqVar.zze(), zzaaqVar.zzb().mo21968W(), zzaaqVar.zzb().m22013Y(), zzaaqVar.zzd(), zzaaqVar.zzg(), zzaaqVar.zzf(), zzaaqVar.zzc());
        if (zza(jZza, zZzi)) {
            zzaiqVarZza.zza(new zzagm(this.zzc.zzb()));
        }
        this.zzc.zza(strM22013Y, zzaelVar, jZza, zZzi);
        this.zzb.zza(zzaiqVarZza, this.zzc.zza(zzaelVar, strM22013Y));
    }

    public final void zza(zzaiu zzaiuVar, zzaem zzaemVar) {
        this.zzb.zza(zzaiuVar, new zzael((zzaem) AbstractC3718s.m18083l(zzaemVar), zza));
    }

    public final void zza(String str, String str2, String str3, zzaem zzaemVar) {
        AbstractC3718s.m18078g(str, "cachedTokenState should not be empty.");
        AbstractC3718s.m18078g(str2, "uid should not be empty.");
        AbstractC3718s.m18083l(zzaemVar);
        this.zzb.zza(str, str2, str3, new zzael(zzaemVar, zza));
    }

    public final void zza(String str, C4833Q c4833q, zzaem zzaemVar) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18083l(c4833q);
        AbstractC3718s.m18083l(zzaemVar);
        this.zzb.zza(str, c4833q, new zzael(zzaemVar, zza));
    }

    private static boolean zza(long j7, boolean z7) {
        if (j7 > 0 && z7) {
            return true;
        }
        zza.m8620h("App hash will not be appended to the request.", new Object[0]);
        return false;
    }
}
