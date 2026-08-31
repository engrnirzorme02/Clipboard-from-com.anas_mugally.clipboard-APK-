package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.client.C3250D;
import java.util.concurrent.Callable;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeri implements zzeup {
    private final Context zza;
    private final zzgpd zzb;

    zzeri(Context context, zzgpd zzgpdVar) {
        this.zza = context;
        this.zzb = zzgpdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final InterfaceFutureC1673e zza() {
        return this.zzb.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzerh
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 18;
    }

    final /* synthetic */ zzerg zzc() {
        Bundle bundle;
        C7351t.m32349g();
        String string = !((Boolean) C3250D.m17200c().zzd(zzbci.zzgy)).booleanValue() ? "" : this.zza.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
        String string2 = ((Boolean) C3250D.m17200c().zzd(zzbci.zzgA)).booleanValue() ? this.zza.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
        C7351t.m32349g();
        Context context = this.zza;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzgz)).booleanValue()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i7 = 0; i7 < 4; i7++) {
                String str = strArr[i7];
                if (defaultSharedPreferences.contains(str)) {
                    bundle.putString(str, defaultSharedPreferences.getString(str, null));
                }
            }
        } else {
            bundle = null;
        }
        return new zzerg(string, string2, bundle, null);
    }
}
