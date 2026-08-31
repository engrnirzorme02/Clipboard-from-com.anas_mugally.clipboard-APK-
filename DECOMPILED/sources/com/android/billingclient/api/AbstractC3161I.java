package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzbj;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzhv;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzhz;
import com.google.android.gms.internal.play_billing.zzib;
import com.google.android.gms.internal.play_billing.zzic;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzig;
import com.google.android.gms.internal.play_billing.zzil;

/* JADX INFO: renamed from: com.android.billingclient.api.I */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3161I {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f13425a = 0;

    static {
        int i7 = InterfaceC3162J.f13426a;
    }

    /* JADX INFO: renamed from: a */
    public static String m16761a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String str = exc.getClass().getSimpleName() + ":" + zzbj.zzb(exc.getMessage());
            int i7 = zzc.zza;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static zzhx m16762b(zzie zzieVar, int i7, C3178d c3178d, String str, zzil zzilVar) {
        try {
            zzic zzicVarZzc = zzig.zzc();
            zzicVarZzc.zzo(c3178d.m16929c());
            zzicVarZzc.zzl(c3178d.m16927a());
            if (c3178d.m16928b() != 0) {
                zzicVarZzc.zzm(c3178d.m16928b());
            }
            if (zzieVar != null) {
                zzicVarZzc.zzn(zzieVar);
            }
            if (str != null) {
                zzicVarZzc.zza(str);
            }
            zzhv zzhvVarZzc = zzhx.zzc();
            zzhvVarZzc.zzl(zzicVarZzc);
            zzhvVarZzc.zzp(i7);
            if (!zzilVar.equals(zzil.BROADCAST_ACTION_UNSPECIFIED)) {
                zzhvVarZzc.zza(zzilVar);
            }
            return (zzhx) zzhvVarZzc.zze();
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static zzib m16763c(int i7, zzil zzilVar) {
        try {
            zzhz zzhzVarZzc = zzib.zzc();
            zzhzVarZzc.zzo(i7);
            if (!zzilVar.equals(zzil.BROADCAST_ACTION_UNSPECIFIED)) {
                zzhzVarZzc.zza(zzilVar);
            }
            return (zzib) zzhzVarZzc.zze();
        } catch (Exception e7) {
            zzc.zzo("BillingLogger", "Unable to create logging payload", e7);
            return null;
        }
    }
}
