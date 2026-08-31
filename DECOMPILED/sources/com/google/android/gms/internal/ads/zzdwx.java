package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.C3431F0;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.PatternSyntaxException;
import org.json.JSONException;
import org.json.JSONObject;
import p380w2.C7351t;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdwx {
    private final Context zza;
    private final C7584a zzb;
    private final Executor zzc;
    private final AtomicReference zzd = new AtomicReference("");

    zzdwx(Context context, C7584a c7584a, Executor executor) {
        this.zza = context;
        this.zzb = c7584a;
        this.zzc = executor;
    }

    private final String zzc() {
        String name;
        C7584a c7584a = this.zzb;
        String strZzd = null;
        if (c7584a.f30229d) {
            name = zzcev.class.getName();
        } else {
            try {
                name = (String) new JSONObject(zzd((String) C3250D.m17200c().zzd(zzbci.zzoO))).get(Integer.toString(c7584a.f30228c));
            } catch (ClassCastException | IllegalArgumentException | NullPointerException | JSONException e7) {
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzoN)).booleanValue()) {
                    C7351t.m32354l().zzg(e7, "SdkIE");
                }
                name = null;
            }
        }
        if (TextUtils.isEmpty(name)) {
            return "2";
        }
        try {
            strZzd = zzd((String) C3250D.m17200c().zzd(zzbci.zzoP));
        } catch (IllegalArgumentException e8) {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzoN)).booleanValue()) {
                C7351t.m32354l().zzg(e8, "SdkIE");
            }
        }
        if (TextUtils.isEmpty(strZzd)) {
            return "3";
        }
        try {
            for (Method method : this.zza.getClassLoader().loadClass(name).getDeclaredMethods()) {
                if (method.getName().matches(strZzd)) {
                    return "1";
                }
            }
            return "0";
        } catch (ClassNotFoundException unused) {
            return "4";
        } catch (NoClassDefFoundError unused2) {
            return "6";
        } catch (SecurityException unused3) {
            return "7";
        } catch (PatternSyntaxException unused4) {
            return "5";
        }
    }

    private static final String zzd(String str) {
        return C3431F0.m17398V(new String(Base64.decode(str, 0)), new String(Base64.decode((String) C3250D.m17200c().zzd(zzbci.zzoQ), 10), StandardCharsets.UTF_8));
    }

    public final String zza() {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzoM)).booleanValue()) {
            if (!((String) C3250D.m17200c().zzd(zzbci.zzoO)).isEmpty()) {
                if (!((String) C3250D.m17200c().zzd(zzbci.zzoP)).isEmpty()) {
                    if (!((String) C3250D.m17200c().zzd(zzbci.zzoQ)).isEmpty()) {
                        String str = (String) this.zzd.get();
                        if (!str.isEmpty()) {
                            return str;
                        }
                        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdww
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zzb();
                            }
                        });
                        return null;
                    }
                }
            }
        }
        return null;
    }

    final /* synthetic */ void zzb() {
        AtomicReference atomicReference = this.zzd;
        synchronized (atomicReference) {
            try {
                if (((String) atomicReference.get()).isEmpty()) {
                    atomicReference.set(zzc());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
