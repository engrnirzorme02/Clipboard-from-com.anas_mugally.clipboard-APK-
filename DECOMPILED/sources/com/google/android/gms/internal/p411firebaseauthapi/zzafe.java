package com.google.android.gms.internal.p411firebaseauthapi;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.app.AbstractC2263x;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import java.net.URLConnection;
import java.util.concurrent.ExecutionException;
import p164V3.C1762g;
import p193Z4.InterfaceC2157i;

/* JADX INFO: loaded from: classes2.dex */
public final class zzafe {
    private Context zza;
    private zzafx zzb;
    private String zzc;
    private final C1762g zzd;
    private boolean zze;
    private String zzf;

    public zzafe(C1762g c1762g, String str) {
        this(c1762g.m7405l(), c1762g, str);
    }

    private static String zza(C1762g c1762g) {
        AbstractC2263x.m9328a(FirebaseAuth.getInstance(c1762g).m21983A().get());
        return null;
    }

    private static String zzb(C1762g c1762g) {
        InterfaceC2157i interfaceC2157i = (InterfaceC2157i) FirebaseAuth.getInstance(c1762g).m21985C().get();
        if (interfaceC2157i != null) {
            try {
                return (String) Tasks.await(interfaceC2157i.mo8761a());
            } catch (InterruptedException | ExecutionException e7) {
                Log.w("LocalRequestInterceptor", "Unable to get heartbeats: " + e7.getMessage());
            }
        }
        return null;
    }

    public zzafe(Context context, C1762g c1762g, String str) {
        this.zze = false;
        this.zza = (Context) AbstractC3718s.m18083l(context);
        this.zzd = (C1762g) AbstractC3718s.m18083l(c1762g);
        this.zzc = String.format("Android/%s/%s", "Fallback", str);
    }

    public final void zza(URLConnection uRLConnection) {
        String str;
        if (this.zze) {
            str = this.zzc + "/FirebaseUI-Android";
        } else {
            str = this.zzc + "/FirebaseCore-Android";
        }
        if (this.zzb == null) {
            this.zzb = new zzafx(this.zza);
        }
        uRLConnection.setRequestProperty("X-Android-Package", this.zzb.zzb());
        uRLConnection.setRequestProperty("X-Android-Cert", this.zzb.zza());
        uRLConnection.setRequestProperty("Accept-Language", zzafd.zza());
        uRLConnection.setRequestProperty("X-Client-Version", str);
        uRLConnection.setRequestProperty("X-Firebase-Locale", this.zzf);
        uRLConnection.setRequestProperty("X-Firebase-GMPID", this.zzd.m7407p().m7423c());
        uRLConnection.setRequestProperty("X-Firebase-Client", zzb(this.zzd));
        String strZza = zza(this.zzd);
        if (!TextUtils.isEmpty(strZza)) {
            uRLConnection.setRequestProperty("X-Firebase-AppCheck", strZza);
        }
        this.zzf = null;
    }

    public final void zzb(String str) {
        this.zzf = str;
    }

    public final void zza(String str) {
        this.zze = !TextUtils.isEmpty(str);
    }
}
