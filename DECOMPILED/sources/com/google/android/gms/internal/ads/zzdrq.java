package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.browser.customtabs.AbstractC2379b;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3324b1;
import com.google.android.gms.ads.internal.client.C3349h2;
import com.google.android.gms.ads.internal.client.InterfaceC3318a;
import com.google.android.gms.ads.internal.util.C3431F0;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import p036E2.AbstractC0335c;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdrq implements zzdau, InterfaceC3318a, zzcwm, zzcvw, zzcyn {
    private final Context zzc;
    private final zzfdv zzd;
    private final zzdsm zze;
    private final zzfcu zzf;
    private final zzfcj zzg;
    private final zzecn zzh;
    private final String zzi;
    private Boolean zzk;
    private long zzj = -1;
    final AtomicBoolean zza = new AtomicBoolean(false);
    final AtomicBoolean zzb = new AtomicBoolean(false);
    private final boolean zzl = ((Boolean) C3250D.m17200c().zzd(zzbci.zzhj)).booleanValue();

    public zzdrq(Context context, zzfdv zzfdvVar, zzdsm zzdsmVar, zzfcu zzfcuVar, zzfcj zzfcjVar, zzecn zzecnVar, String str) {
        this.zzc = context;
        this.zzd = zzfdvVar;
        this.zze = zzdsmVar;
        this.zzf = zzfcuVar;
        this.zzg = zzfcjVar;
        this.zzh = zzecnVar;
        this.zzi = str;
    }

    private final boolean zzf() {
        String strM17407d0;
        if (this.zzk == null) {
            synchronized (this) {
                if (this.zzk == null) {
                    String str = (String) C3250D.m17200c().zzd(zzbci.zzbG);
                    C7351t.m32349g();
                    try {
                        strM17407d0 = C3431F0.m17407d0(this.zzc);
                    } catch (RemoteException unused) {
                        strM17407d0 = null;
                    }
                    boolean zMatches = false;
                    if (str != null && strM17407d0 != null) {
                        try {
                            zMatches = Pattern.matches(str, strM17407d0);
                        } catch (RuntimeException e7) {
                            C7351t.m32354l().zzg(e7, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzk = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.zzk.booleanValue();
    }

    private final zzdsl zzg(String str) {
        zzfcu zzfcuVar = this.zzf;
        zzfct zzfctVar = zzfcuVar.zzb;
        zzdsl zzdslVarZza = this.zze.zza();
        zzdslVarZza.zza(zzfctVar.zzb);
        zzfcj zzfcjVar = this.zzg;
        zzdslVarZza.zzb(zzfcjVar);
        zzdslVarZza.zzc("action", str);
        zzdslVarZza.zzc("ad_format", this.zzi.toUpperCase(Locale.ROOT));
        List list = zzfcjVar.zzt;
        if (!list.isEmpty()) {
            zzdslVarZza.zzc("ancn", (String) list.get(0));
        }
        if (zzfcjVar.zzb()) {
            zzdslVarZza.zzc("device_connectivity", true != C7351t.m32354l().zzs(this.zzc) ? "offline" : AbstractC2379b.ONLINE_EXTRAS_KEY);
            zzdslVarZza.zzc("event_timestamp", String.valueOf(C7351t.m32357o().mo18159a()));
            zzdslVarZza.zzc("offline_ad", "1");
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzhq)).booleanValue()) {
            boolean zM1519a = AbstractC0335c.m1519a(zzfcuVar);
            zzdslVarZza.zzc("scar", String.valueOf(zM1519a));
            if (zM1519a) {
                C3349h2 c3349h2 = zzfcuVar.zza.zza.zzd;
                zzdslVarZza.zzc("ragent", c3349h2.f13936A);
                zzdslVarZza.zzc("rtype", AbstractC0335c.m1520b(AbstractC0335c.m1521c(c3349h2)));
            }
        }
        return zzdslVarZza;
    }

    private final void zzi(zzdsl zzdslVar) {
        if (!this.zzg.zzb()) {
            zzdslVar.zzd();
            return;
        }
        this.zzh.zze(new zzecp(C7351t.m32357o().mo18159a(), this.zzf.zzb.zzb.zzb, zzdslVar.zzg(), 2));
    }

    private final boolean zzj() {
        int i7 = this.zzg.zzb;
        return i7 == 2 || i7 == 5 || i7 == 6 || i7 == 7;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3318a
    public final void onAdClicked() {
        if (this.zzg.zzb()) {
            zzi(zzg("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void zzc(C3324b1 c3324b1) {
        C3324b1 c3324b2;
        if (this.zzl) {
            zzdsl zzdslVarZzg = zzg("ifts");
            zzdslVarZzg.zzc("reason", "adapter");
            int i7 = c3324b1.f13918a;
            String str = c3324b1.f13919b;
            if (c3324b1.f13920c.equals("com.google.android.gms.ads") && (c3324b2 = c3324b1.f13921d) != null && !c3324b2.f13920c.equals("com.google.android.gms.ads")) {
                C3324b1 c3324b3 = c3324b1.f13921d;
                i7 = c3324b3.f13918a;
                str = c3324b3.f13919b;
            }
            if (i7 >= 0) {
                zzdslVarZzg.zzc("arec", String.valueOf(i7));
            }
            String strZza = this.zzd.zza(str);
            if (strZza != null) {
                zzdslVarZzg.zzc("areec", strZza);
            }
            zzdslVarZzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void zzd(zzdgo zzdgoVar) {
        if (this.zzl) {
            zzdsl zzdslVarZzg = zzg("ifts");
            zzdslVarZzg.zzc("reason", "exception");
            if (!TextUtils.isEmpty(zzdgoVar.getMessage())) {
                zzdslVarZzg.zzc("msg", zzdgoVar.getMessage());
            }
            zzdslVarZzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdau
    public final void zzdL() {
        if (zzf()) {
            zzdsl zzdslVarZzg = zzg("adapter_impression");
            zzdslVarZzg.zzc("imp_type", String.valueOf(this.zzg.zze));
            if (this.zzb.get()) {
                zzdslVarZzg.zzc("po", "1");
                zzdslVarZzg.zzc("pil", String.valueOf(C7351t.m32357o().mo18159a() - this.zzj));
            } else {
                zzdslVarZzg.zzc("po", "0");
            }
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzok)).booleanValue() && zzj()) {
                C7351t.m32349g();
                zzdslVarZzg.zzc("foreground", true != C3431F0.m17420k(this.zzc) ? "1" : "0");
                zzdslVarZzg.zzc("fg_show", true != this.zza.get() ? "0" : "1");
            }
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzol)).booleanValue() && zzj()) {
                zzdslVarZzg.zzc("fg_al", true == C7351t.m32353k().zzf() ? "1" : "0");
            }
            zzdslVarZzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdau
    public final void zzdM() {
        if (zzf()) {
            zzg("adapter_shown").zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdw() {
        if (zzf() || this.zzg.zzb()) {
            zzdsl zzdslVarZzg = zzg("impression");
            zzdslVarZzg.zzc("imp_type", String.valueOf(this.zzg.zze));
            if (this.zzj > 0) {
                zzdslVarZzg.zzc("p_imp_l", String.valueOf(C7351t.m32357o().mo18159a() - this.zzj));
            }
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzok)).booleanValue() && zzj()) {
                C7351t.m32349g();
                zzdslVarZzg.zzc("foreground", true != C3431F0.m17420k(this.zzc) ? "1" : "0");
                zzdslVarZzg.zzc("fg_show", true == this.zza.get() ? "1" : "0");
            }
            zzi(zzdslVarZzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void zze() {
        if (this.zzl) {
            zzdsl zzdslVarZzg = zzg("ifts");
            zzdslVarZzg.zzc("reason", "blocked");
            zzdslVarZzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyn
    public final void zzk() {
        if (zzf()) {
            this.zzb.set(true);
            this.zzj = C7351t.m32357o().mo18159a();
            zzdsl zzdslVarZzg = zzg("presentation");
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzok)).booleanValue() && zzj()) {
                AtomicBoolean atomicBoolean = this.zza;
                C7351t.m32349g();
                atomicBoolean.set(!C3431F0.m17420k(this.zzc));
                zzdslVarZzg.zzc("foreground", true != atomicBoolean.get() ? "0" : "1");
            }
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzol)).booleanValue() && zzj()) {
                zzdslVarZzg.zzc("fg_al", true != C7351t.m32353k().zzf() ? "0" : "1");
            }
            zzdslVarZzg.zzd();
        }
    }
}
