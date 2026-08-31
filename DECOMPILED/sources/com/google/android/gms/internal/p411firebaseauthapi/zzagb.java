package com.google.android.gms.internal.p411firebaseauthapi;

import android.app.Activity;
import androidx.collection.C2390a;
import com.google.android.gms.common.util.C3753h;
import com.google.firebase.auth.AbstractC4825I;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzagb {
    private static final Map<String, zzagd> zza = new C2390a();

    public static AbstractC4825I zza(String str, AbstractC4825I abstractC4825I, zzaff zzaffVar) {
        zza(str, zzaffVar);
        return new zzaga(abstractC4825I, str);
    }

    public static void zza() {
        zza.clear();
    }

    private static void zza(String str, zzaff zzaffVar) {
        zza.put(str, new zzagd(zzaffVar, C3753h.m18171d().mo18159a()));
    }

    public static boolean zza(String str, AbstractC4825I abstractC4825I, Activity activity, Executor executor) {
        Map<String, zzagd> map = zza;
        if (map.containsKey(str)) {
            zzagd zzagdVar = map.get(str);
            if (C3753h.m18171d().mo18159a() - zzagdVar.zzb < 120000) {
                zzaff zzaffVar = zzagdVar.zza;
                if (zzaffVar == null) {
                    return true;
                }
                zzaffVar.zza(abstractC4825I, activity, executor, str);
                return true;
            }
            zza(str, null);
            return false;
        }
        zza(str, null);
        return false;
    }
}
