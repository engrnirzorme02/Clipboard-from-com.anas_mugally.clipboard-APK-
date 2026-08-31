package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzhv;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzhz;
import com.google.android.gms.internal.play_billing.zzib;
import com.google.android.gms.internal.play_billing.zzij;
import com.google.android.gms.internal.play_billing.zziq;
import com.google.android.gms.internal.play_billing.zzis;
import com.google.android.gms.internal.play_billing.zzja;
import com.google.android.gms.internal.play_billing.zzjg;
import com.google.android.gms.internal.play_billing.zzji;
import com.google.android.gms.internal.play_billing.zzjo;
import com.google.android.gms.internal.play_billing.zzjs;

/* JADX INFO: renamed from: com.android.billingclient.api.L */
/* JADX INFO: loaded from: classes.dex */
final class C3164L implements InterfaceC3162J {

    /* JADX INFO: renamed from: b */
    private zzis f13459b;

    /* JADX INFO: renamed from: c */
    private final C3165M f13460c;

    C3164L(Context context, zzis zzisVar) {
        this.f13460c = new C3165M(context);
        this.f13459b = zzisVar;
    }

    /* JADX INFO: renamed from: l */
    private final void m16776l(zzhx zzhxVar, zzis zzisVar) {
        if (zzhxVar == null) {
            return;
        }
        try {
            zzjg zzjgVarZzc = zzji.zzc();
            zzjgVarZzc.zzn(zzisVar);
            zzjgVarZzc.zza(zzhxVar);
            this.f13460c.m16778a((zzji) zzjgVarZzc.zze());
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    /* JADX INFO: renamed from: m */
    private final void m16777m(zzib zzibVar, zzis zzisVar) {
        if (zzibVar == null) {
            return;
        }
        try {
            zzjg zzjgVarZzc = zzji.zzc();
            zzjgVarZzc.zzn(zzisVar);
            zzjgVarZzc.zzl(zzibVar);
            this.f13460c.m16778a((zzji) zzjgVarZzc.zze());
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.InterfaceC3162J
    /* JADX INFO: renamed from: a */
    public final void mo16764a(zzhx zzhxVar, int i7, long j7, boolean z7) {
        zzis zzisVar;
        try {
            zziq zziqVar = (zziq) this.f13459b.zzm();
            zziqVar.zzm(i7);
            this.f13459b = (zzis) zziqVar.zze();
            zzhv zzhvVar = (zzhv) zzhxVar.zzm();
            zzja zzjaVar = (zzja) zzhxVar.zzB().zzm();
            zzjaVar.zza(z7);
            zzhvVar.zzn(zzjaVar);
            zzhx zzhxVar2 = (zzhx) zzhvVar.zze();
            if (j7 == 0) {
                zzisVar = this.f13459b;
            } else {
                zziq zziqVar2 = (zziq) this.f13459b.zzm();
                zziqVar2.zzo(j7);
                zzisVar = (zzis) zziqVar2.zze();
            }
            m16776l(zzhxVar2, zzisVar);
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.InterfaceC3162J
    /* JADX INFO: renamed from: b */
    public final void mo16765b(zzhx zzhxVar) {
        try {
            m16776l(zzhxVar, this.f13459b);
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.InterfaceC3162J
    /* JADX INFO: renamed from: c */
    public final void mo16766c(zzij zzijVar) {
        try {
            zzjg zzjgVarZzc = zzji.zzc();
            zzjgVarZzc.zzn(this.f13459b);
            zzjgVarZzc.zzm(zzijVar);
            this.f13460c.m16778a((zzji) zzjgVarZzc.zze());
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.InterfaceC3162J
    /* JADX INFO: renamed from: d */
    public final void mo16767d(zzib zzibVar, int i7) {
        try {
            zziq zziqVar = (zziq) this.f13459b.zzm();
            zziqVar.zzm(i7);
            this.f13459b = (zzis) zziqVar.zze();
            mo16771h(zzibVar);
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.InterfaceC3162J
    /* JADX INFO: renamed from: e */
    public final void mo16768e(zzjo zzjoVar) {
        try {
            C3165M c3165m = this.f13460c;
            zzjg zzjgVarZzc = zzji.zzc();
            zzjgVarZzc.zzn(this.f13459b);
            zzjgVarZzc.zzo(zzjoVar);
            c3165m.m16778a((zzji) zzjgVarZzc.zze());
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.InterfaceC3162J
    /* JADX INFO: renamed from: f */
    public final void mo16769f(zzib zzibVar, long j7, boolean z7) {
        zzis zzisVar;
        try {
            zzhz zzhzVar = (zzhz) zzibVar.zzm();
            zzja zzjaVar = (zzja) zzibVar.zzA().zzm();
            zzjaVar.zza(z7);
            zzhzVar.zzm(zzjaVar);
            zzib zzibVar2 = (zzib) zzhzVar.zze();
            if (j7 == 0) {
                zzisVar = this.f13459b;
            } else {
                zziq zziqVar = (zziq) this.f13459b.zzm();
                zziqVar.zzo(j7);
                zzisVar = (zzis) zziqVar.zze();
            }
            m16777m(zzibVar2, zzisVar);
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.InterfaceC3162J
    /* JADX INFO: renamed from: g */
    public final void mo16770g(zzhx zzhxVar, long j7, boolean z7) {
        zzis zzisVar;
        try {
            zzhv zzhvVar = (zzhv) zzhxVar.zzm();
            zzja zzjaVar = (zzja) zzhxVar.zzB().zzm();
            zzjaVar.zza(z7);
            zzhvVar.zzn(zzjaVar);
            zzhx zzhxVar2 = (zzhx) zzhvVar.zze();
            if (j7 == 0) {
                zzisVar = this.f13459b;
            } else {
                zziq zziqVar = (zziq) this.f13459b.zzm();
                zziqVar.zzo(j7);
                zzisVar = (zzis) zziqVar.zze();
            }
            m16776l(zzhxVar2, zzisVar);
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.InterfaceC3162J
    /* JADX INFO: renamed from: h */
    public final void mo16771h(zzib zzibVar) {
        try {
            m16777m(zzibVar, this.f13459b);
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.InterfaceC3162J
    /* JADX INFO: renamed from: i */
    public final void mo16772i(zzjs zzjsVar) {
        if (zzjsVar == null) {
            return;
        }
        try {
            zzjg zzjgVarZzc = zzji.zzc();
            zzjgVarZzc.zzn(this.f13459b);
            zzjgVarZzc.zzp(zzjsVar);
            this.f13460c.m16778a((zzji) zzjgVarZzc.zze());
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.InterfaceC3162J
    /* JADX INFO: renamed from: j */
    public final void mo16773j(zzhx zzhxVar, int i7, long j7) {
        try {
            zziq zziqVar = (zziq) this.f13459b.zzm();
            zziqVar.zzm(i7);
            zzis zzisVar = (zzis) zziqVar.zze();
            this.f13459b = zzisVar;
            if (j7 != 0) {
                zziq zziqVar2 = (zziq) zzisVar.zzm();
                zziqVar2.zzo(j7);
                zzisVar = (zzis) zziqVar2.zze();
            }
            m16776l(zzhxVar, zzisVar);
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.InterfaceC3162J
    /* JADX INFO: renamed from: k */
    public final void mo16774k(zzhx zzhxVar, int i7) {
        try {
            zziq zziqVar = (zziq) this.f13459b.zzm();
            zziqVar.zzm(i7);
            this.f13459b = (zzis) zziqVar.zze();
            mo16765b(zzhxVar);
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to log.", th);
        }
    }
}
