package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.internal.ads.zzbci;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p380w2.C7351t;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3466c0 {

    /* JADX INFO: renamed from: a */
    private final Map f14232a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final List f14233b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private final Context f14234c;

    C3466c0(Context context) {
        this.f14234c = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m17518a() {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlj)).booleanValue()) {
            C7351t.m32349g();
            final Map mapM17419j0 = C3431F0.m17419j0((String) C3250D.m17200c().zzd(zzbci.zzlo));
            Iterator it = mapM17419j0.keySet().iterator();
            while (it.hasNext()) {
                m17520c((String) it.next());
            }
            m17519b(new InterfaceC3462a0() { // from class: com.google.android.gms.ads.internal.util.b0
                @Override // com.google.android.gms.ads.internal.util.InterfaceC3462a0
                public final /* synthetic */ void zza(SharedPreferences sharedPreferences, String str, String str2) {
                    Map map = mapM17419j0;
                    if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
                        C7351t.m32354l().zzo().mo17553f(false);
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: b */
    final synchronized void m17519b(InterfaceC3462a0 interfaceC3462a0) {
        this.f14233b.add(interfaceC3462a0);
    }

    /* JADX INFO: renamed from: c */
    final synchronized void m17520c(String str) {
        try {
            Map map = this.f14232a;
            if (map.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f14234c) : this.f14234c.getSharedPreferences(str, 0);
            SharedPreferencesOnSharedPreferenceChangeListenerC3460Z sharedPreferencesOnSharedPreferenceChangeListenerC3460Z = new SharedPreferencesOnSharedPreferenceChangeListenerC3460Z(this, str);
            map.put(str, sharedPreferencesOnSharedPreferenceChangeListenerC3460Z);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC3460Z);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    final /* synthetic */ List m17521d() {
        return this.f14233b;
    }
}
