package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3467d;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.InterfaceC3494q0;
import java.util.Objects;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbxg implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final Context zza;
    private final SharedPreferences zzb;
    private final InterfaceC3494q0 zzc;
    private String zzd = "-1";
    private int zze = -1;

    zzbxg(Context context, InterfaceC3494q0 interfaceC3494q0) {
        this.zzb = PreferenceManager.getDefaultSharedPreferences(context);
        this.zzc = interfaceC3494q0;
        this.zza = context;
    }

    private final void zzb(String str, int i7) {
        Context context;
        boolean z7 = true;
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzaO)).booleanValue() ? !(str.isEmpty() || str.charAt(0) != '1') : !(i7 == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1")))) {
            z7 = false;
        }
        this.zzc.zzw(z7);
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzgF)).booleanValue() && z7 && (context = this.zza) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    private final void zzc() {
        this.zzc.zzw(true);
        AbstractC3467d.m17522a(this.zza);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0081  */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        byte b7;
        try {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzaQ)).booleanValue()) {
                if (Objects.equals(str, "gad_has_consent_for_cookies")) {
                    int i7 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                    InterfaceC3494q0 interfaceC3494q0 = this.zzc;
                    if (i7 != interfaceC3494q0.zzD()) {
                        zzc();
                    }
                    interfaceC3494q0.mo17549b(i7);
                    return;
                }
                if (Objects.equals(str, "IABTCF_TCString")) {
                    String string = sharedPreferences.getString(str, "-1");
                    InterfaceC3494q0 interfaceC3494q1 = this.zzc;
                    if (!Objects.equals(string, interfaceC3494q1.zzB())) {
                        zzc();
                    }
                    interfaceC3494q1.mo17548a(string);
                    return;
                }
                return;
            }
            String string2 = sharedPreferences.getString("IABTCF_PurposeConsents", "-1");
            int i8 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
            String strValueOf = String.valueOf(str);
            int iHashCode = strValueOf.hashCode();
            if (iHashCode != -2004976699) {
                if (iHashCode == -527267622 && strValueOf.equals("gad_has_consent_for_cookies")) {
                    b7 = 1;
                } else {
                    b7 = -1;
                }
            } else if (strValueOf.equals("IABTCF_PurposeConsents")) {
                b7 = 0;
            } else {
                b7 = -1;
            }
            if (b7 == 0) {
                if (string2.equals("-1") || this.zzd.equals(string2)) {
                    return;
                }
                this.zzd = string2;
                zzb(string2, i8);
                return;
            }
            if (b7 != 1) {
                return;
            }
            if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzaO)).booleanValue() || i8 == -1 || this.zze == i8) {
                return;
            }
            this.zze = i8;
            zzb(string2, i8);
        } catch (Throwable th) {
            C7351t.m32354l().zzg(th, "AdMobPlusIdlessListener.onSharedPreferenceChanged");
            AbstractC3490o0.m17546l("onSharedPreferenceChanged, errorMessage = ", th);
        }
    }

    final void zza() {
        SharedPreferences sharedPreferences = this.zzb;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(sharedPreferences, "gad_has_consent_for_cookies");
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzaQ)).booleanValue()) {
            onSharedPreferenceChanged(sharedPreferences, "IABTCF_TCString");
        } else {
            onSharedPreferenceChanged(sharedPreferences, "IABTCF_PurposeConsents");
        }
    }
}
